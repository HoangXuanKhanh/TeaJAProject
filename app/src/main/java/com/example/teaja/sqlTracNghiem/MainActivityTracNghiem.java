package com.example.teaja.sqlTracNghiem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.teaja.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;

import javax.xml.transform.Result;

public class MainActivityTracNghiem extends AppCompatActivity {
    private Toolbar tlCataTracNghiem;

    private TextView tvViewScore;
    private TextView tvViewQuestionCount;
    private TextView tvViewQuestion;
    private TextView tvViewCatalory;
    private TextView tvViewCountDownt;

    private RadioGroup rbGroup;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;

    private Button btnConfirmNext;
    private CountDownTimer countDownTimer;
    private ArrayList<Question> questionList;

    private long timeLeftnMillis;
    private int questionCountter;
    private int questionSize;
    private Question currentQuestion;

    private int Score;
    private boolean answered;
    private int count = 0;

    private ImageButton imgLoa;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_trac_nghiem);
        tlCataTracNghiem = findViewById(R.id.Tool_ComeBackTracNghiem);
        tvViewScore = findViewById(R.id.text_view_score);
        tvViewQuestion = findViewById(R.id.text_view_Question);
        tvViewCatalory = findViewById(R.id.text_view_catalory);
        tvViewCountDownt = findViewById(R.id.text_view_countdown);
        tvViewQuestionCount = findViewById(R.id.text_view_question_count);
        rbGroup = findViewById(R.id.radio_group);
        rb1 = findViewById(R.id.radio_button1);
        rb2 = findViewById(R.id.radio_button2);
        rb3 = findViewById(R.id.radio_button3);
        rb4 = findViewById(R.id.radio_button4);
        btnConfirmNext = findViewById(R.id.button_confirm_next);
        imgLoa = findViewById(R.id.img_loaTracNghiem);
        Intent intent = getIntent();
        int cataloryID = intent.getIntExtra("inputID", 0);
        String cataloryName = intent.getStringExtra("inputName");

        tvViewCatalory.setText("Chủ đề: " +cataloryName);
        Database database = new Database(this);

        questionList = database.getQuestion(cataloryID);
        questionSize = questionList.size();

        Collections.shuffle(questionList);
        shownextQuestion();

        setSupportActionBar(tlCataTracNghiem);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        btnConfirmNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickAddXacNhan();
            }
        });
        mediaPlayer = MediaPlayer.create(MainActivityTracNghiem.this, R.raw.trchil);
        imgLoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    imgLoa.setImageResource(R.drawable.ic_loaoff);
                }else {
                    mediaPlayer.start();
                    imgLoa.setImageResource(R.drawable.ic_loa1);
                }
            }
        });
    }

    private void onClickAddXacNhan() {
        if ( !answered){// neu chua tra loi
            if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked()){
                checkAnswer();// kiem tra dap an
            }else {
                Toast.makeText(this, "Hãy chọn đáp án", Toast.LENGTH_SHORT).show();
            }
            }else {
            shownextQuestion();// neu da tra loi thuc hien chuyen cau
        }
    }

    private void shownextQuestion() {// hien thi cau hoi
        rb1.setTextColor(Color.BLACK);
        rb2.setTextColor(Color.BLACK);
        rb3.setTextColor(Color.BLACK);
        rb4.setTextColor(Color.BLACK);

        rbGroup.clearCheck();
        if (questionCountter < questionSize){
            currentQuestion = questionList.get(questionCountter);
            tvViewQuestion.setText(currentQuestion.getQuestion());

            rb1.setText(currentQuestion.getOption1());
            rb2.setText(currentQuestion.getOption2());
            rb3.setText(currentQuestion.getOption3());
            rb4.setText(currentQuestion.getOption4());

            questionCountter++;

            tvViewQuestionCount.setText("Câu hỏi: " + questionCountter + "/" +questionSize);
            answered = false;
            btnConfirmNext.setText("Xác nhận");

            timeLeftnMillis = 30000;
            //dem nguoc thoi gian
            startCountDown();
        }else {
            finishQuestion();
        }
    }
    private void finishQuestion() {
        Intent resultInten = new Intent();
        resultInten.putExtra("Score", Score);
        setResult(RESULT_OK, resultInten);
        finish();
    }

    @Override
    public void onBackPressed() {
        count++;
        if (count >= 1){
            finishQuestion();
        }
        count = 0;
    }

    private void startCountDown() {// dem thoi gian
        countDownTimer = new CountDownTimer(timeLeftnMillis, 1000) {
            @Override
            public void onTick(long l) {
                timeLeftnMillis = l;
                upDateCountDown(); // update time
            }

            @Override
            public void onFinish() {
                timeLeftnMillis = 0; // het gio
                upDateCountDown();
                checkAnswer();// kiem tra dap an
            }
        }.start();
    }
    private void upDateCountDown() {
        int minutes = (int) (timeLeftnMillis/1000/60);

        int seconds = (int) ((timeLeftnMillis/1000)%60);

        String timformated = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        tvViewCountDownt.setText(timformated);
        if (timeLeftnMillis < 10000){// newu thoi gian duoi 10s thi chuyen do
            tvViewCountDownt.setTextColor(Color.RED);
        }else {//neu ko thi mau den
            tvViewCountDownt.setTextColor(Color.BLACK);
        }
    }
    private void checkAnswer() {// kiem tra dap an
        answered = true;

        RadioButton rbSelect = findViewById(rbGroup.getCheckedRadioButtonId());
        int answer = rbGroup.indexOfChild(rbSelect) + 1; // vi tri cau da chon
        if (answer == currentQuestion.getAnswer()){//newu tra loi dung dap an
            Score = Score + 10; // thang 10 diem
            tvViewScore.setText("Điểm: " + Score);
        }
        showSolution();
    }

    private void showSolution() {// hien thi dap an
        // xet mau cho cau hoi
        rb1.setTextColor(Color.RED);
        rb2.setTextColor(Color.RED);
        rb3.setTextColor(Color.RED);
        rb4.setTextColor(Color.RED);
        switch (currentQuestion.getAnswer()){// kiem tra dap va hien thi dap an len man hinh
            case 1:
                rb1.setTextColor(Color.GREEN);
                tvViewQuestion.setText("Đáp án là A ");
                break;
            case 2:
                rb2.setTextColor(Color.GREEN);
                tvViewQuestion.setText("Đáp án là B ");
                break;
            case 3:
                rb3.setTextColor(Color.GREEN);
                tvViewQuestion.setText("Đáp án là C ");
                break;
            case 4:
                rb4.setTextColor(Color.GREEN);
                tvViewQuestion.setText("Đáp án là D ");
                break;
        }
        if (questionCountter < questionSize){// neu con cau ho thi tiep tuc
            btnConfirmNext.setText("Câu tiếp ");
        }else {
            btnConfirmNext.setText("Hoàn thành ");// het r thi hoan thanh
        }
        countDownTimer.cancel();// dung thoi gian lai
    }

}
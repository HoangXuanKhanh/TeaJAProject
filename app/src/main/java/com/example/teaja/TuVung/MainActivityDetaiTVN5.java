package com.example.teaja.TuVung;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.RelativeLayout;

import com.example.teaja.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivityDetaiTVN5 extends AppCompatActivity {
    private Toolbar tlBackTV1N5;
    private RecyclerView rc_Bai1N5;
    private Bai1N5Adapter mBai1N5Adapter;
    private ImageButton btnTuVung;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_detai_tvn5);
        tlBackTV1N5 = findViewById(R.id.Tool_BACKTV1N5);
        rc_Bai1N5 = findViewById(R.id.rcy_Bai1N5);
        btnTuVung = findViewById(R.id.btn_nghetuvung);

        setSupportActionBar(tlBackTV1N5);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        mBai1N5Adapter = new Bai1N5Adapter();
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 1, RecyclerView.VERTICAL, false);
        //rc_Bai1N5.setLayoutManager(layoutManager);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rc_Bai1N5.setLayoutManager(layoutManager);
        DividerItemDecoration decoration = new DividerItemDecoration(rc_Bai1N5.getContext(), layoutManager.getOrientation());
        rc_Bai1N5.addItemDecoration(decoration);
        rc_Bai1N5.setFocusable(false);
        rc_Bai1N5.setNestedScrollingEnabled(false);
        rc_Bai1N5.setAdapter(mBai1N5Adapter);
        mBai1N5Adapter.Bai1N5Adapter(getListN5());

        mediaPlayer = MediaPlayer.create(MainActivityDetaiTVN5.this, R.raw.ghi);
        btnTuVung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    btnTuVung.setImageResource(R.drawable.ic_loaoff);
                }else {
                    mediaPlayer.start();
                    btnTuVung.setImageResource(R.drawable.ic_loa1);
                }
            }
        });
    }

    private List<Bai1N5> getListN5() {
        List<Bai1N5> list = new ArrayList<>();
        list.add(new Bai1N5("わたし,私", "tôi"));
        list.add(new Bai1N5("わたしたち", "chúng tôi, chúng ta"));
        list.add(new Bai1N5("あんなた", "anh/chị, ông/bà, bạn"));
        list.add(new Bai1N5("あのひと", "người kia, người đó"));
        list.add(new Bai1N5("みなさん", "các anh chị, các ông bà"));
        list.add(new Bai1N5("せんせい,先生", "thầy cô, giáo viên"));
        list.add(new Bai1N5("きょうし", "giáo viên"));
        list.add(new Bai1N5("がくせい,学生", "học sinh, sinh viên"));
        list.add(new Bai1N5("かいしゃいん,会社員", "nhân viên công ty"));
        list.add(new Bai1N5("ぎんこういん,銀行員", "nhân viên ngân hàng"));
        list.add(new Bai1N5("いしゃ,医者", "bác sĩ"));
        list.add(new Bai1N5("けんきゅうしゃ,研究者", "nhà nghiên cứu"));
        list.add(new Bai1N5("エンジニア", "kỹ sư"));
        list.add(new Bai1N5("だいがく,大学", "đại học, trường đại học"));
        list.add(new Bai1N5("びょういん,病院", "bệnh viện"));
        list.add(new Bai1N5("でんき,電気", "điện, đèn điện"));
        list.add(new Bai1N5("だれ(どなた)", "ai, cách nói lịch sự"));
        list.add(new Bai1N5("-さい", "tuổi"));
        list.add(new Bai1N5("なんさい", "mấy tuổi, bao nhiêu tuổi"));
        list.add(new Bai1N5("はい", "vâng, dạ"));
        list.add(new Bai1N5("いいえ", "không"));
        list.add(new Bai1N5("しつれいですか?", "xin lỗi"));
        list.add(new Bai1N5("おなまいえは", "tên anh/chị là gì?"));
        list.add(new Bai1N5("はじめまして", "rất hân hạnh được gặp anh/chị"));
        list.add(new Bai1N5("アメリカ", "Mỹ"));
        list.add(new Bai1N5("イギリス", "Anh"));
        list.add(new Bai1N5("インド", "Ấn Độ"));
        list.add(new Bai1N5("かんこく,韓国", "Hàn Quốc"));
        list.add(new Bai1N5("にほん,", "Nhật Bản"));
        return list;
    }
}
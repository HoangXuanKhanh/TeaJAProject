package layoufavorite;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.teaja.R;
import com.example.teaja.sqlTracNghiem.Cataloties;
import com.example.teaja.sqlTracNghiem.Database;
import com.example.teaja.sqlTracNghiem.MainActivityTracNghiem;

import java.util.List;

public class DetaileCa1 extends AppCompatActivity {
    private Toolbar tlCata1;
    private TextView tvDiem;
    private Button btnDiem;
    private Spinner sp_Diem;
    private int highScore;
    private static final int REQUEST_CODE_QUESTION = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaile_ca1);
        tlCata1 = findViewById(R.id.Tool_ComeBackTL1);
        tvDiem = findViewById(R.id.tv_Diem);
        btnDiem = findViewById(R.id.btn_Diem);
        sp_Diem = findViewById(R.id.spin_Diem);
        loadCata();
        setSupportActionBar(tlCata1);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        LoadHigtScore();// load diem
        btnDiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickAddDiem();
            }
        });
    }

    private void LoadHigtScore() {// loat diem
        SharedPreferences preferences = getSharedPreferences("share", MODE_PRIVATE);
        highScore = preferences.getInt("highScore", 0);
        tvDiem.setText("Điểm cao: " + highScore);
    }

    private void onClickAddDiem() {// bat dau cau hoi
        Cataloties cataloties = (Cataloties) sp_Diem.getSelectedItem();// lay id, name, chu de da chon
        int cataloryID = cataloties.getId();
        String cataloryName = cataloties.getName();

        Intent intent = new Intent(DetaileCa1.this, MainActivityTracNghiem.class);

        intent.putExtra("inputID", cataloryID);
        intent.putExtra("inputName", cataloryName);

        startActivityForResult(intent, REQUEST_CODE_QUESTION);
    }

    private void loadCata(){
        Database database = new Database(this);
        // lay du lieu danh sach chu de
        List<Cataloties> list = database.getDataCatalotiesList();

        ArrayAdapter<Cataloties> catalotiesArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, list);
        //bo cuc hien thi chu de
        catalotiesArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // gan chu de len spine de hien
        sp_Diem.setAdapter(catalotiesArrayAdapter);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_QUESTION){
            if (resultCode == RESULT_OK){
                int score = data.getIntExtra("Score", 0);
                    if (score > highScore){
                        upDateHighScore(score);
                    }
                }
            }
        }

   private void upDateHighScore(int score) {// cap nhat diem cao
        highScore = score;// gan diem cao moi
        tvDiem.setText("Điểm cao: " + highScore); // hien thi diem
        SharedPreferences  preferences = getSharedPreferences("share", MODE_PRIVATE);// luu tru diem
        SharedPreferences.Editor editor = preferences.edit();

        editor.putInt("highScore",highScore);
        editor.apply();// hoan thanh
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.menu_set, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
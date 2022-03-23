package com.example.teaja.VideoN;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import com.example.teaja.R;

public class MainActivityVN5 extends AppCompatActivity {
    private Toolbar tlCataTN5;
    private Button btnVideoBai2;
    private VideoView videov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_vn5);
        tlCataTN5 = findViewById(R.id.Tool_ComeBackTN5);
        btnVideoBai2 = findViewById(R.id.btn_videoBai2);
        videov = findViewById(R.id.view_VideoBai2);

        setSupportActionBar(tlCataTN5);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        btnVideoBai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //videov.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.tieng));
                //videov.start();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.menu_set, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
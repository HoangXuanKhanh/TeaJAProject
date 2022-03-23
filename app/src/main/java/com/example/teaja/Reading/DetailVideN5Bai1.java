package com.example.teaja.Reading;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.example.teaja.R;

public class DetailVideN5Bai1 extends AppCompatActivity {
    private Toolbar tlBackBai1N5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_vide_n5_bai1);
        tlBackBai1N5 = findViewById(R.id.Tool_BACKBai1N5);

        setSupportActionBar(tlBackBai1N5);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}
package com.example.teaja.BaiTap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.example.teaja.R;

public class MainActivityBaiTapN5 extends AppCompatActivity {
    private Toolbar tlBacBaiTapN5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bai_tap_n5);
        tlBacBaiTapN5 = findViewById(R.id.Tool_BACKBaiTapN5);

        setSupportActionBar(tlBacBaiTapN5);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}
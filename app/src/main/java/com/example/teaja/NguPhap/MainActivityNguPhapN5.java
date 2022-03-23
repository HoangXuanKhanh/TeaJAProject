package com.example.teaja.NguPhap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.example.teaja.R;

public class MainActivityNguPhapN5 extends AppCompatActivity {
    private Toolbar tlBacNguPhapN5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ngu_phap_n5);
        tlBacNguPhapN5 = findViewById(R.id.Tool_BACKNguPhapN5);

        setSupportActionBar(tlBacNguPhapN5);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}
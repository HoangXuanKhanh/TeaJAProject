package com.example.teaja.FragmentTEAJA;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.example.teaja.R;

public class MainActivityTieuDe extends AppCompatActivity {
    private Toolbar tlTieuDe1;
    private WebView webTinTuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tieu_de);
        tlTieuDe1 = findViewById(R.id.Tool_ComeBackTieuDe);
        webTinTuc = findViewById(R.id.web_ListDuLieu);

        setSupportActionBar(tlTieuDe1);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        Intent intent = getIntent();
        String link = intent.getStringExtra("linkTinTuc");
        //Toast.makeText(this, link, Toast.LENGTH_SHORT).show();
        webTinTuc.loadUrl(link);

        webTinTuc.setWebViewClient(new WebViewClient());
    }
}
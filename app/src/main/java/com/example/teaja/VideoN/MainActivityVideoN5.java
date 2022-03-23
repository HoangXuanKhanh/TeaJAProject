package com.example.teaja.VideoN;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.teaja.R;


public class MainActivityVideoN5 extends AppCompatActivity {
    private Toolbar tlCataVN5;
    Button btnmp4;
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_video_n5);
        tlCataVN5 = findViewById(R.id.Tool_ComeBackVN5);
        btnmp4 = findViewById(R.id.btn_video);
        videoView = findViewById(R.id.view_Video);

        setSupportActionBar(tlCataVN5);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        btnmp4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video));
            videoView.start();
            MediaController mediaController = new MediaController(MainActivityVideoN5.this);
            mediaController.setMediaPlayer(videoView);
            videoView.setMediaController(mediaController);
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
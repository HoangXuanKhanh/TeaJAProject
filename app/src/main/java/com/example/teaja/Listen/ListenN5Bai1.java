package com.example.teaja.Listen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.teaja.API.APIClientServer;
import com.example.teaja.API.Product;
import com.example.teaja.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListenN5Bai1 extends AppCompatActivity {
    private Toolbar tlBackLis1N5;
    MediaPlayer mediaPlayer;

    private TextView tvTimeSong;
    private TextView tvTimeTotal;
    private SeekBar skSong;
    private ImageButton btnPrev;
    private ImageButton btnPlay;
    private ImageButton btnNext;
    private ImageButton btnStop;

    private Button btnClick;
    private TextView tvClick;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen_n5_bai1);
        tlBackLis1N5 = findViewById(R.id.Tool_BACKLis1N5);
        tvTimeSong = findViewById(R.id.tv_songtime);
        tvTimeTotal = findViewById(R.id.tv_title);
        skSong = findViewById(R.id.Seekbar_Song);
        btnPrev = findViewById(R.id.img_Prev);
        btnPlay = findViewById(R.id.img_playSong);
        btnNext = findViewById(R.id.img_Next);
        btnStop = findViewById(R.id.img_Stop);
        btnClick = findViewById(R.id.btn_Click);
        tvClick = findViewById(R.id.tv_Click);

        khoiTaoListen();
        setSupportActionBar(tlBackLis1N5);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickItemAPI();
            }
        });

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()){// dang phat -> pause -> doi hinh
                    mediaPlayer.pause();
                    btnPlay.setImageResource(R.drawable.ic_playlisten);
                }else {//dang ngung -> phat -> doi hinh
                    mediaPlayer.start();
                    btnPlay.setImageResource(R.drawable.ic_pauselist);
                }
                TimeTotal();
                updateSongTime();
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer.release();
                btnPlay.setImageResource(R.drawable.ic_playlisten);
                khoiTaoListen();
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        skSong.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                mediaPlayer.seekTo(skSong.getProgress());
            }
        });
    }

    private void TimeTotal(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("mm:ss");
        tvTimeTotal.setText(dateFormat.format(mediaPlayer.getDuration()));
        skSong.setMax(mediaPlayer.getDuration());
    }
    private void updateSongTime(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                SimpleDateFormat dateFormats = new SimpleDateFormat("mm:ss");
                tvTimeSong.setText(dateFormats.format(mediaPlayer.getCurrentPosition()));
                skSong.setProgress(mediaPlayer.getCurrentPosition());
                handler.postDelayed(this,500);

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {

                    }
                });
            }
        }, 100);
    }

    private void khoiTaoListen(){
        mediaPlayer = MediaPlayer.create(ListenN5Bai1.this, R.raw.sing);
    }
    private void onClickItemAPI() {
        Call<List<Product>> call = APIClientServer.getInstance().getProduct();

        call.enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                productList = response.body();
                tvClick.setText(productList.get(0).getTitle());
            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                Toast.makeText(getBaseContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
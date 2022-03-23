package com.example.teaja.HistoryDetail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;

import com.example.teaja.R;

import java.util.ArrayList;
import java.util.List;

public class DetaileTroChuyen extends AppCompatActivity {
    private Toolbar tlHis11;
    private RecyclerView rcyMessage;
    private MessageAdapter messageAdapter;
    private List<Message> messageList;
    private EditText edtMessage;
    private Button btngui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaile_tro_chuyen);
        tlHis11 = findViewById(R.id.Tool_his11);
        rcyMessage = findViewById(R.id.rcy_message);
        edtMessage = findViewById(R.id.edt_message);
        btngui = findViewById(R.id.btn_gui);

        setSupportActionBar(tlHis11);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rcyMessage.setLayoutManager(layoutManager);
        messageList = new ArrayList<>();
        messageAdapter = new MessageAdapter();
        messageAdapter.MessageAdapter(messageList);

        rcyMessage.setAdapter(messageAdapter);
        btngui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickGui();
            }
        });
        edtMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Keyboard();
            }
        });
    }

    private void onClickGui() {
        String strMessage = edtMessage.getText().toString().trim();
        if (TextUtils.isEmpty(strMessage)){
            return;
        }
        messageList.add(new Message(strMessage));
        messageAdapter.notifyDataSetChanged();
        rcyMessage.scrollToPosition(messageList.size() -1);
        edtMessage.setText("");
    }
    private void Keyboard(){
        final View activityView = findViewById(R.id.activityRoot);
        activityView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                Rect r = new Rect();
                activityView.getWindowVisibleDisplayFrame(r);

                int hightDiff = activityView.getRootView().getHeight() - r.height();
                if (hightDiff > 0.25*activityView.getRootView().getHeight());
                if (messageList.size() > 0){
                    rcyMessage.scrollToPosition(messageList.size() - 1);
                    activityView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
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
package com.example.teaja;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotPassWordMainActivity extends AppCompatActivity {

    TextView tv_Email_Pass;
    Button btn_SendW;
    ProgressDialog mkprogressDialog;
    private Toolbar tlBackPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass_word_main);
        tv_Email_Pass = findViewById(R.id.edt_Email_Word);
        btn_SendW = findViewById(R.id.btn_Send_Pass);
        tlBackPass = findViewById(R.id.Tool_BACKforgotPass);

        setSupportActionBar(tlBackPass);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        mkprogressDialog = new ProgressDialog(this);

        btn_SendW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mkprogressDialog.show();
                FirebaseAuth auth = FirebaseAuth.getInstance();
                String email = tv_Email_Pass.getText().toString().trim();

                auth.sendPasswordResetEmail(email)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                mkprogressDialog.dismiss();
                                if (task.isSuccessful()){
                                    Toast.makeText(getBaseContext(), "Email sent", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

    }
}
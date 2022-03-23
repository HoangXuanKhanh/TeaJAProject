package com.example.teaja;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.teaja.FragmentTEAJA.MainActivityHomeTEAJA;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SingInMainActivity extends AppCompatActivity {

    Button btn_Sign;
    TextView tvEmailVT;
    TextView tvPassVt;
    ProgressDialog progressDialog;
    private Toolbar tlBackSing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_in_main);
        btn_Sign = findViewById(R.id.btn_Logup_Up);
        tvEmailVT = findViewById(R.id.edt_EmailUser_tv);
        tvPassVt = findViewById(R.id.edt_PassUser_tv);
        tlBackSing = findViewById(R.id.Tool_BACKSing);

        inteneSig();
        setSupportActionBar(tlBackSing);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        progressDialog = new ProgressDialog(this);
    }

    private void inteneSig() {
        btn_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickSignUp();
            }
        });
    }
    private void onClickSignUp() {
        String strEmailS = tvEmailVT.getText().toString().trim();
        String strPasslS = tvPassVt.getText().toString().trim();
        FirebaseAuth auth = FirebaseAuth.getInstance();
        progressDialog.show();
        auth.createUserWithEmailAndPassword(strEmailS, strPasslS)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();
                        if(task.isSuccessful()){
                            Intent intent = new Intent(SingInMainActivity.this, MainActivityTJA.class);
                            startActivity(intent);
                            finishAffinity();
                        }else{
                            Toast.makeText(SingInMainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}
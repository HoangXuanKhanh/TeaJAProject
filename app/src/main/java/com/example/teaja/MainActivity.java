package com.example.teaja;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.teaja.FragmentTEAJA.MainActivityHeaderRing;
import com.example.teaja.FragmentTEAJA.MainActivityHomeTEAJA;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity  {

    private static final int MY_REQUES_CODE = 10;
    Button btnLog;
    EditText etName;
    EditText etEmail;
    EditText etPass;
    LinearLayout lnLayout_SignUp;
    LinearLayout lnLayout_Forgot_Password;
    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLog = findViewById(R.id.btn_Login);
        etName = findViewById(R.id.ed_NameV);
        etEmail = findViewById(R.id.ed_EmailV);
        etPass = findViewById(R.id.ed_PassV);
        lnLayout_SignUp = findViewById(R.id.Layou_SignUpV);
        lnLayout_Forgot_Password = findViewById(R.id.Layou_FogotPass);
        progressDialog = new ProgressDialog(this);

        LogMain();
        lnLayout_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SingInMainActivity.class);
                startActivity(intent);
            }
        });
        lnLayout_Forgot_Password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ForgotPassWordMainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void LogMain() {
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String StrName = etName.getText().toString().trim();
                AppUserName.eUserName = StrName;
                onClickMain();
            }
        });
    }
    //DC 8F 69 5D 2F DF 80 B2 C1 26 F9 A5 59 CE E1 2A 98 1A D7 D5
    private void onClickMain() {
        String strEmailV = etEmail.getText().toString().trim();
        String strPassV = etPass.getText().toString().trim();
        FirebaseAuth auth = FirebaseAuth.getInstance();
        progressDialog.show();
        auth.signInWithEmailAndPassword(strEmailV, strPassV)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();
                        if (task.isSuccessful()) {
                            Intent i = new Intent(MainActivity.this, MainActivityTJA.class);
                            startActivity(i);
                            finishAffinity();
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(MainActivity.this, "failed",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    @Override
    protected void onResume() {
        super.onResume();
        etName.setText(AppUserName.eUserName);
    }
}
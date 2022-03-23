package com.example.teaja.FragmentTEAJA;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.app.ProgressDialog;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.teaja.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivityPassword extends Fragment {

    View view;
    EditText edt_NamePassW;
    EditText edt_NewPassW;
    Button btn_UpdatePass;
    ProgressDialog mProgressDialog;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main_password,container,false);
        edt_NamePassW = view.findViewById(R.id.edt_NamePassW);
        edt_NewPassW = view.findViewById(R.id.edt_NewPassW);
        btn_UpdatePass = view.findViewById(R.id.btn_UpdatePassWord);

        mProgressDialog = new ProgressDialog(getActivity());
        inutPass();

        return view;
    }
    private void inutPass() {
        btn_UpdatePass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickChangeEmail();
            }
        });
    }

    private void onClickChangeEmail() {
        String strPassWord = edt_NewPassW.getText().toString().trim();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        mProgressDialog.show();

        user.updatePassword(strPassWord)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        mProgressDialog.dismiss();
                        if (task.isSuccessful()) {
                            Toast.makeText(getActivity(), "User password updated", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

}
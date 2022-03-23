package com.example.teaja.FragmentTEAJA;

import static com.example.teaja.MainActivityTJA.MY_REQUEST_CODE;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.teaja.MainActivityTJA;
import com.example.teaja.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;

import java.util.ArrayList;
import java.util.List;

public class MainActivityMyprofile extends Fragment {

    View view;
    ImageView img_Mypr;
    EditText edt_MyNamepr;
    EditText edt_MyEmailpr;
    Button btn_Update;
    Button btn_UpdateEmail;
    RecyclerView rcyProfile;
    ProfileAdapter mProfileAdapter;

    FragmentActivity MyprofileActivity;
    private MainActivityTJA mMainActivityTJA;
    private Uri mUriMy;
    private ProgressDialog mProgressDialog;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_main_myprofile,container,false);
        img_Mypr = view.findViewById(R.id.img_MyProfile);
        edt_MyNamepr = view.findViewById(R.id.edt_NameMyProfile);
        edt_MyEmailpr = view.findViewById(R.id.edt_EmailMyProfile);
        btn_Update = view.findViewById(R.id.btn_UpdateMyProflie);
        btn_UpdateEmail = view.findViewById(R.id.btn_UpdateEmailMyProflie);
        rcyProfile = view.findViewById(R.id.rcy_profile);
        MyprofileActivity = getActivity();
        mMainActivityTJA = (MainActivityTJA) getActivity();
        mProgressDialog = new ProgressDialog(getActivity());
        getUserInformation();
        inuitButton();
        inuitButtonEmail();
        onClickProfileUpdate();
        return view;
    }


    private void inuitButton() {
        img_Mypr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickPerquestion();
            }
        });
        btn_Update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonUpdateMyProfile();
            }
        });
    }

    public void setUriMy(Uri mUriMy) {
        this.mUriMy = mUriMy;
    }

    private void ButtonUpdateMyProfile() {
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if(user == null){
            return;
        }
        mProgressDialog.show();
        String strNameMyPr = edt_MyNamepr.getText().toString().trim();
        UserProfileChangeRequest profileUpdates = new UserProfileChangeRequest.Builder()
                .setDisplayName(strNameMyPr)
                .setPhotoUri(mUriMy)
                .build();

        user.updateProfile(profileUpdates)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        mProgressDialog.dismiss();
                        if (task.isSuccessful()) {
                            Toast.makeText(getActivity(), "User profile updated success", Toast.LENGTH_SHORT).show();
                            mMainActivityTJA.ShowInformation();
                        }
                    }
                });
    }
    private void onClickPerquestion() {
        if(mMainActivityTJA == null){
            return;
        }
        if(Build.VERSION.SDK_INT < Build.VERSION_CODES.M){
            mMainActivityTJA.openGallery();
            return;
        }
        if(getActivity().checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED){
            mMainActivityTJA.openGallery();
        }else{
            String[] permission = {Manifest.permission.READ_EXTERNAL_STORAGE};
            getActivity().requestPermissions(permission, MY_REQUEST_CODE);
        }
    }
    public void setBitmapImageView(Bitmap bitmapImageView){
        img_Mypr.setImageBitmap(bitmapImageView);
    }

    private void inuitButtonEmail() {
        btn_UpdateEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickUpdateEmail();
            }
        });
    }

    private void getUserInformation() {
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if(user == null){
            return;
        }
        edt_MyNamepr.setText(user.getDisplayName());
        edt_MyEmailpr.setText(user.getEmail());
        Glide.with(getActivity()).load(user.getPhotoUrl()).error(R.drawable.ic_user).into(img_Mypr);
    }

    private void onClickUpdateEmail() {
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        String strnewEmail = edt_MyEmailpr.getText().toString().trim();
        mProgressDialog.show();

        user.updateEmail(strnewEmail)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        mProgressDialog.dismiss();
                        if (task.isSuccessful()) {
                            Toast.makeText(getActivity(), "User email address updated", Toast.LENGTH_SHORT).show();
                            mMainActivityTJA.ShowInformation();
                        }
                    }
                });
    }

    private void onClickProfileUpdate() {
        mProfileAdapter = new ProfileAdapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(MyprofileActivity, 1, RecyclerView.VERTICAL, false);
        rcyProfile.setLayoutManager(layoutManager);
        rcyProfile.setAdapter(mProfileAdapter);
        mProfileAdapter.ProfileAdapter(getListProfile());
    }

    private List<Profile> getListProfile() {
        List<Profile> list = new ArrayList<>();
        list.add(new Profile("My stats", R.drawable.ic_japan5));
        list.add(new Profile("Invite a friend", R.drawable.ic_japan5));
        list.add(new Profile("Notification", R.drawable.ic_japan5));
        list.add(new Profile("Setting", R.drawable.ic_japan5));
        list.add(new Profile("Help", R.drawable.ic_japan5));

        return list;
    }

}
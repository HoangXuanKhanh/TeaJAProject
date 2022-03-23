package com.example.teaja;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.teaja.FragmentTEAJA.MainActivityFavoriteTEAJA;
import com.example.teaja.FragmentTEAJA.MainActivityHistoryTEAJA;
import com.example.teaja.FragmentTEAJA.MainActivityHomeTEAJA;
import com.example.teaja.FragmentTEAJA.MainActivityMyprofile;
import com.example.teaja.FragmentTEAJA.MainActivityPassword;
import com.example.teaja.FragmentTEAJA.MainActivitySetting;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.io.IOException;

public class MainActivityTJA extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    public static final int  MY_REQUEST_CODE = 10; //ben myprofile;
    private static final int FRAGMENT_HOME = 0;
    private static final int FRAGMENT_FIVORITE = 1;
    private static final int FRAGMENT_HISTORY = 2;
    private static final int FRAGMENT_MYPROFILE = 3;
    private static final int FRAGMENT_PASSWORD = 4;
    private static final int FRAGMENT_SETTING = 5;
    private int mCurrentFragment = FRAGMENT_HOME; // chạy vào màn hình là hiện thị luôn home
    final private MainActivityMyprofile mMyprofileActivity = new MainActivityMyprofile();

    final private ActivityResultLauncher<Intent> mActivityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
                @Override// ativity tra ve du lieu
                public void onActivityResult(ActivityResult result) {
                if(result.getResultCode() == RESULT_OK){
                    Intent intent = result.getData();
                    if(intent == null){
                        return;
                    }
                    Uri uri = intent.getData();
                    mMyprofileActivity.setUriMy(uri);
                    try {
                        Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                        mMyprofileActivity.setBitmapImageView(bitmap);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                }
            });
    private DrawerLayout drawerLayout;
    private TableLayout mtableLayout;
    Toolbar toolbar;
    NavigationView navigationView;
    BottomNavigationView bottomNavigationView;
    ImageView imageViewPer;
    TextView tvEmailNavPer;
    TextView tvNameNavPer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tja);
        drawerLayout = findViewById(R.id.Draw_LayoutTEAJA);
        toolbar = findViewById(R.id.Tool_BarTEAJA);
        navigationView = findViewById(R.id.Naviegation_View);
        bottomNavigationView = findViewById(R.id.bton_Navgation);
        imageViewPer = navigationView.getHeaderView(0).findViewById(R.id.img_PersenNavigation);
        tvEmailNavPer = navigationView.getHeaderView(0).findViewById(R.id.tv_PerNaviegationEmail);
        tvNameNavPer = navigationView.getHeaderView(0).findViewById(R.id.tv_PerNaviegationName);

        ShowInformation();
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                R.string.nav_draw_open, R.string.nav_draw_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
        replaceFragment(new MainActivityHomeTEAJA());
        navigationView.getMenu().findItem(R.id.home).setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.botton_home:
                        openHome();
                        navigationView.setCheckedItem(R.id.home);
                        Toast.makeText(getBaseContext(),"Home", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.botton_favorite:
                        openFavorite();
                        navigationView.setCheckedItem(R.id.favorite);
                        Toast.makeText(getBaseContext(),"Favorite", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.botton_History:
                        openHistory();
                        navigationView.setCheckedItem(R.id.History);
                        Toast.makeText(getBaseContext(),"History", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        replaceFragment(new MainActivityHistoryTEAJA());
        navigationView.setCheckedItem(R.id.History);
        bottomNavigationView.getMenu().findItem(R.id.botton_History).setChecked(true);

        replaceFragment(new MainActivityFavoriteTEAJA());
        navigationView.setCheckedItem(R.id.favorite);
        bottomNavigationView.getMenu().findItem(R.id.botton_favorite).setChecked(true);

        replaceFragment(new MainActivityHomeTEAJA());
        navigationView.setCheckedItem(R.id.home);
        bottomNavigationView.getMenu().findItem(R.id.botton_home).setChecked(true);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.home){
            openHome();
            bottomNavigationView.getMenu().findItem(R.id.botton_home).setChecked(true);
            Toast.makeText(getBaseContext(),"Home", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.favorite){
            openFavorite();
            bottomNavigationView.getMenu().findItem(R.id.botton_favorite).setChecked(true);
            Toast.makeText(getBaseContext(),"Favorite", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.History){
            openHistory();
            bottomNavigationView.getMenu().findItem(R.id.botton_History).setChecked(true);
            Toast.makeText(getBaseContext(),"History", Toast.LENGTH_SHORT).show();
        } else if(id == R.id.MyProfile){
            openMyProfile();
          //  bottomNavigationView.getMenu().findItem(R.id.botton_History).setChecked(true);
            Toast.makeText(getBaseContext(),"Myprofile", Toast.LENGTH_SHORT).show();
        } else if(id == R.id.PassWordd_Nav){
            openMyPassWord();
          //  bottomNavigationView.getMenu().findItem(R.id.botton_History).setChecked(true);
            Toast.makeText(getBaseContext(),"Password", Toast.LENGTH_SHORT).show();
        } else if(id == R.id.Setting){
            openSetting();
           // bottomNavigationView.getMenu().findItem(R.id.botton_History).setChecked(true);
            Toast.makeText(getBaseContext(),"Setting", Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.SigOut){
            FirebaseAuth.getInstance().signOut();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
            Toast.makeText(getBaseContext(),"Sign Out", Toast.LENGTH_SHORT).show();
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
        }
    private void openHome(){
        if(mCurrentFragment != FRAGMENT_HOME){
            replaceFragment(new MainActivityHomeTEAJA());
            mCurrentFragment = FRAGMENT_HOME;
        }
    }
    private void openFavorite(){
        if(mCurrentFragment != FRAGMENT_FIVORITE){
            replaceFragment(new MainActivityFavoriteTEAJA());
            mCurrentFragment = FRAGMENT_FIVORITE;
        }
    }
    private void openHistory(){
        if(mCurrentFragment != FRAGMENT_HISTORY){
            replaceFragment(new MainActivityHistoryTEAJA());
            mCurrentFragment = FRAGMENT_HISTORY;
        }
    }
    private void openMyProfile(){
        if(mCurrentFragment != FRAGMENT_MYPROFILE){
            replaceFragment(mMyprofileActivity);
            mCurrentFragment = FRAGMENT_MYPROFILE;
        }
    }
    private void openMyPassWord(){
        if(mCurrentFragment != FRAGMENT_PASSWORD){
            replaceFragment(new MainActivityPassword());
            mCurrentFragment = FRAGMENT_PASSWORD;
        }
    }
    private void openSetting(){
        if(mCurrentFragment != FRAGMENT_SETTING){
            replaceFragment(new MainActivitySetting());
            mCurrentFragment = FRAGMENT_SETTING;
        }
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }
    private void replaceFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.conten_FrameLayout,fragment);
        transaction.commit();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater= new MenuInflater(this);
        menuInflater.inflate(R.menu.menu_set, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.MyProfile:
                openMyProfile();
                Toast.makeText(getBaseContext(),"MyProfile", Toast.LENGTH_SHORT).show();
                break;
            case R.id.PassWordd_Nav:
                openMyPassWord();
                Toast.makeText(getBaseContext(),"Password",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Setting:
                openSetting();
                Toast.makeText(getBaseContext(),"Setting",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void ShowInformation() {//img anh person
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if(user == null){
            return;
        }
        String name = user.getDisplayName();
        String email = user.getEmail();
        Uri photoUrl = user.getPhotoUrl();

        if(name == null){
            tvNameNavPer.setVisibility(View.GONE);
        }else{
            tvNameNavPer.setVisibility(View.VISIBLE);
            tvNameNavPer.setText(name);
        }
        tvEmailNavPer.setText(email);
        Glide.with(this).load(photoUrl).error(R.drawable.ic_user).into(imageViewPer);
    }


    @Override // ham tra ve ng dung
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == MY_REQUEST_CODE){//la phan tu dau tien == permission
            if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                openGallery();
            }else{// nguoi dung tu choi
                Toast.makeText(getBaseContext(),"Vui Lòng Cho Phét Truy Cập!", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void openGallery() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);//chon anh xong
        mActivityResultLauncher.launch(Intent.createChooser(intent,"Select Picture"));
    }
}
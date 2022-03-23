package com.example.teaja;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import android.widget.Toast;
import com.example.teaja.FragmentTEAJA.MainActivityMyprofile;
import com.example.teaja.FragmentTEAJA.MainActivityPassword;
import com.example.teaja.FragmentTEAJA.MainActivitySetting;
import com.example.teaja.VideoN.ViewPagerViDeo;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DetaileABC extends AppCompatActivity{
    private BottomNavigationView bottomNavigationView;
    private ViewPager mPagerabc;
    private Toolbar tlBackabc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaile_abc);
        tlBackabc = findViewById(R.id.Tool_BACKABC);
        bottomNavigationView = findViewById(R.id.btn_Navgationabc);
        mPagerabc = findViewById(R.id.vpg_abc);
        setUpViewPagerABC();
        setSupportActionBar(tlBackabc);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.bt_hiragana:
                        mPagerabc.setCurrentItem(0);
                        Toast.makeText(getBaseContext(), "hiragana", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.bt_katakana:
                        mPagerabc.setCurrentItem(1);
                        Toast.makeText(getBaseContext(), "katakana", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
    }
    private void setUpViewPagerABC() {
        ViewPagerABC viewPagerABC = new ViewPagerABC(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mPagerabc.setAdapter(viewPagerABC);
        mPagerabc.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        bottomNavigationView.getMenu().findItem(R.id.bt_hiragana).setChecked(true);
                        break;
                    case 1:
                        bottomNavigationView.getMenu().findItem(R.id.bt_hiragana).setChecked(true);
                        break;
                }
            }
            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            MenuInflater menuInflater = new MenuInflater(this);
            menuInflater.inflate(R.menu.menu_set, menu);
            return super.onCreateOptionsMenu(menu);
        }
}

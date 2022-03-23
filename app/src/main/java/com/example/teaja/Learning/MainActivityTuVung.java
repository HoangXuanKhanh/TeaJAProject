package com.example.teaja.Learning;

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

import com.example.teaja.NguPhap.ViewPagerNGuPhap;
import com.example.teaja.R;
import com.example.teaja.TuVung.ViewPagerTuVung;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivityTuVung extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private ViewPager mPagerTuVung;
    private Toolbar tlTuVung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tu_vung);
        tlTuVung = findViewById(R.id.Tool_ComeBackTuVung);
        bottomNavigationView = findViewById(R.id.btn_NavgationTuVung);
        mPagerTuVung = findViewById(R.id.vpg_TuVung);

        setUpViewPagerVideo();
        setSupportActionBar(tlTuVung);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.N5:
                        mPagerTuVung.setCurrentItem(0);
                        Toast.makeText(getBaseContext(), "N5", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.N4:
                        mPagerTuVung.setCurrentItem(1);
                        Toast.makeText(getBaseContext(), "N4", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.N3:
                        mPagerTuVung.setCurrentItem(2);
                        Toast.makeText(getBaseContext(), "N3", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.N2:
                        mPagerTuVung.setCurrentItem(3);
                        Toast.makeText(getBaseContext(), "N2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.N1:
                        mPagerTuVung.setCurrentItem(4);
                        Toast.makeText(getBaseContext(), "N1", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
    }
    private void setUpViewPagerVideo() {
        ViewPagerTuVung viewPagerTuVung = new ViewPagerTuVung(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mPagerTuVung.setAdapter(viewPagerTuVung);
        mPagerTuVung.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        bottomNavigationView.getMenu().findItem(R.id.N5).setChecked(true);
                        break;
                    case 1:
                        bottomNavigationView.getMenu().findItem(R.id.N4).setChecked(true);
                        break;
                    case 2:
                        bottomNavigationView.getMenu().findItem(R.id.N3).setChecked(true);
                        break;
                    case 3:
                        bottomNavigationView.getMenu().findItem(R.id.N2).setChecked(true);
                        break;
                    case 4:
                        bottomNavigationView.getMenu().findItem(R.id.N1).setChecked(true);
                        break;
                }
            }
            @Override
            public void onPageScrollStateChanged(int state) {

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
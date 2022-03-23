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

import com.example.teaja.Listen.ViewPagerListen;
import com.example.teaja.Reading.ViewPagerReading;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DetailRead extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private ViewPager mPagerDoc;
    private Toolbar tlRead;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_read);
        tlRead = findViewById(R.id.Tool_ComeBackREAD);
        bottomNavigationView = findViewById(R.id.btn_NavgationReading);
        mPagerDoc = findViewById(R.id.vpg_Reading);

        setUpViewPagerDoc();
        setSupportActionBar(tlRead);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.N5:
                        mPagerDoc.setCurrentItem(0);
                        Toast.makeText(getBaseContext(), "N5", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.N4:
                        mPagerDoc.setCurrentItem(1);
                        Toast.makeText(getBaseContext(), "N4", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.N3:
                        mPagerDoc.setCurrentItem(2);
                        Toast.makeText(getBaseContext(), "N3", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.N2:
                        mPagerDoc.setCurrentItem(3);
                        Toast.makeText(getBaseContext(), "N2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.N1:
                        mPagerDoc.setCurrentItem(4);
                        Toast.makeText(getBaseContext(), "N1", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
    }
    private void setUpViewPagerDoc() {
        ViewPagerReading viewPagerDoc = new ViewPagerReading(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mPagerDoc.setAdapter(viewPagerDoc);
        mPagerDoc.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
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
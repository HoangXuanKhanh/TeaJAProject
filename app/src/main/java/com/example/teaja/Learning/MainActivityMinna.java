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

import com.example.teaja.Minnna.ViewPagerMina;
import com.example.teaja.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivityMinna extends AppCompatActivity {

    private Toolbar tlMinna;
    private ViewPager mViewPager;
    private BottomNavigationView mBottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_minna);
        tlMinna = findViewById(R.id.Tool_ComeBackMinna);
        mViewPager = findViewById(R.id.vpg_Minna);
        mBottomNavigationView = findViewById(R.id.btn_NavgationMinna);

        setSupportActionBar(tlMinna);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.N5:
                        mViewPager.setCurrentItem(0);
                        Toast.makeText(getBaseContext(), "N5", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.N4:
                        mViewPager.setCurrentItem(1);
                        Toast.makeText(getBaseContext(), "N4", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.N3:
                        mViewPager.setCurrentItem(2);
                        Toast.makeText(getBaseContext(), "N3", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.N2:
                        mViewPager.setCurrentItem(3);
                        Toast.makeText(getBaseContext(), "N2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.N1:
                        mViewPager.setCurrentItem(4);
                        Toast.makeText(getBaseContext(), "N1", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

        ViewPagerMina viewPagerMina = new ViewPagerMina(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager.setAdapter(viewPagerMina);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        mBottomNavigationView.getMenu().findItem(R.id.N5).setChecked(true);
                        break;
                    case 1:
                        mBottomNavigationView.getMenu().findItem(R.id.N4).setChecked(true);
                        break;
                    case 2:
                        mBottomNavigationView.getMenu().findItem(R.id.N3).setChecked(true);
                        break;
                    case 3:
                        mBottomNavigationView.getMenu().findItem(R.id.N2).setChecked(true);
                        break;
                    case 4:
                        mBottomNavigationView.getMenu().findItem(R.id.N1).setChecked(true);
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
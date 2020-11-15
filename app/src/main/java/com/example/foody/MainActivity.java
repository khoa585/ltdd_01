package com.example.foody;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;


import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;



public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNav;
    private ViewPager nViewPager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNav = findViewById(R.id.bottom_navigation);
        nViewPager = findViewById(R.id.ViewPager_container);

        setUpviewpager();
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.navigation_home:
                        nViewPager.setCurrentItem(0);
                        break;
                    case R.id.navigation_note:
                        nViewPager.setCurrentItem(1);
                        break;
                    case R.id.navigation_list:
                        nViewPager.setCurrentItem(2);
                        break;
                    case R.id.navigation_notifications:
                        nViewPager.setCurrentItem(3);
                        break;
                    case R.id.navigation_profile:
                        nViewPager.setCurrentItem(4);
                        break;
                }
                return true;
            }
        });
    }
    private void setUpviewpager(){
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        nViewPager.setAdapter(viewPagerAdapter);
        nViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        bottomNav.getMenu().findItem(R.id.navigation_home).setChecked(true);
                        break;
                    case 1:
                        bottomNav.getMenu().findItem(R.id.navigation_note).setChecked(true);
                        break;
                    case 2:
                        bottomNav.getMenu().findItem(R.id.navigation_list).setChecked(true);
                        break;
                    case 3:
                        bottomNav.getMenu().findItem(R.id.navigation_notifications).setChecked(true);
                        break;
                    case 4:
                        bottomNav.getMenu().findItem(R.id.navigation_profile).setChecked(true);
                        break;
                }
            }
            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

}
package com.example.foody.adapter.screen_notifi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionPagerAdapter extends FragmentPagerAdapter  {
    private List<Fragment> fragmentlist_ = new ArrayList<>();
    private List<String> fragmentTitle = new ArrayList<>();

    public SectionPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentlist_.get(position);
    }

    @Override
    public int getCount() {
        return fragmentlist_.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitle.get(position);
    }
    public void addFragment(Fragment fragment, String title) {
            fragmentlist_.add(fragment);
            fragmentTitle.add(title);
        }
}

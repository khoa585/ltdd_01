package com.example.foody;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.foody.ui.ListItem.ListItemFragment;
import com.example.foody.ui.home.HomeFragment;
import com.example.foody.ui.note.NoteFragment;
import com.example.foody.ui.notifications.NotificationsFragment;
import com.example.foody.ui.profile.ProfileFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    @Override
    public int getCount() {
        return 5;
    }

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new NoteFragment();
            case 2:
                return new ListItemFragment();
            case 3:
                return new NotificationsFragment();
            case 4:
                return new ProfileFragment();
            default:
                return new HomeFragment();
        }
    }
}

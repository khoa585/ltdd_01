package com.example.foody.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.foody.R;
import com.example.foody.adapter.screen_notifi.SectionPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.badge.BadgeDrawable;
import java.util.ArrayList;
import java.util.List;

public class NotificationsFragment extends Fragment {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private notifi_fragment_service frag1;
    private notifi_fragment_user frag2;
    private notifi_fragment_news frag3;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);

        viewPager = root.findViewById(R.id.view_pager_noti);
        tabLayout = root.findViewById(R.id.tab_layout_noti);

        frag1 = new notifi_fragment_service();
        frag2 = new notifi_fragment_user();
        frag3 = new notifi_fragment_news();

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setUp(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }
    public void setUp(ViewPager viewPager){
        SectionPagerAdapter adapter = new SectionPagerAdapter(getChildFragmentManager());
        adapter.addFragment(frag1, "Dịch vụ");
        adapter.addFragment(frag2, "Của tôi");
        adapter.addFragment(frag3, "Tin mới");
        viewPager.setAdapter(adapter);
    }
}
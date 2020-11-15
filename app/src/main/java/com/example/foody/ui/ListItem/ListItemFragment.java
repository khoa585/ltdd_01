package com.example.foody.ui.ListItem;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.foody.R;
import com.example.foody.adapter.screen_notifi.SectionPagerAdapter;
import com.example.foody.ui.ListItem.fragment_history_tab1;
import com.example.foody.ui.ListItem.fragment_history_tab2;
import com.example.foody.ui.ListItem.fragment_history_tab3;
import com.google.android.material.tabs.TabLayout;

public class ListItemFragment extends Fragment {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private fragment_history_tab1 frag1;
    private fragment_history_tab2 frag2;
    private fragment_history_tab3 frag3;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_listitem, container, false);

        viewPager = root.findViewById(R.id.view_pager_history);
        tabLayout = root.findViewById(R.id.tab_layout_history);

        frag1 = new fragment_history_tab1();
        frag2 = new fragment_history_tab2();
        frag3 = new fragment_history_tab3();

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
        adapter.addFragment(frag1, "Đang đến");
        adapter.addFragment(frag2, "Lịch sử");
        adapter.addFragment(frag3, "Đơn nhập");
        viewPager.setAdapter(adapter);
    }
}
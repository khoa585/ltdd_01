package com.example.foody.ui.note;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.foody.R;
import com.example.foody.adapter.screen_notifi.SectionPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class NoteFragment extends Fragment {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private fragment_note_tab1 frag1;
    private fragment_note_tab2 frag2;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_note, container, false);

        viewPager = root.findViewById(R.id.view_pager_note);
        tabLayout = root.findViewById(R.id.tab_layout_note);

        frag1 = new fragment_note_tab1();
        frag2 = new fragment_note_tab2();
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
        adapter.addFragment(frag1, "Tất cả");
        adapter.addFragment(frag2, "Địa điểm");
        viewPager.setAdapter(adapter);
    }
}
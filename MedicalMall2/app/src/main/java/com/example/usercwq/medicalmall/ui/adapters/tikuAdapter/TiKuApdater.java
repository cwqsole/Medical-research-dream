package com.example.usercwq.medicalmall.ui.adapters.tikuAdapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class TiKuApdater extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments=new ArrayList<>();
    public TiKuApdater(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;

    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {

        return fragments.size();

    }


}

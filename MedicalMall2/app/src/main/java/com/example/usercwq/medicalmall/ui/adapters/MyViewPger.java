package com.example.usercwq.medicalmall.ui.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import com.example.usercwq.medicalmall.ui.fragment.BaseFragment;

import java.util.ArrayList;

public class MyViewPger extends FragmentPagerAdapter {
    private ArrayList<BaseFragment> mFragments;
    private ArrayList<String> mStrings;

    public MyViewPger(FragmentManager fm, ArrayList<BaseFragment> fragments, ArrayList<String> strings) {
        super(fm);
        mFragments = fragments;
        mStrings = strings;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mStrings.get(position);
    }
}

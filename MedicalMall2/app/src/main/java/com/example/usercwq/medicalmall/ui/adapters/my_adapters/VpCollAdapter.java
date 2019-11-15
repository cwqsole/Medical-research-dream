package com.example.usercwq.medicalmall.ui.adapters.my_adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.usercwq.medicalmall.ui.fragment.BaseFragment;

import java.util.ArrayList;

public class VpCollAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private ArrayList<BaseFragment> mList;
    private ArrayList<String> mTitles;

    public VpCollAdapter(FragmentManager fm, Context context, ArrayList<BaseFragment> list, ArrayList<String> titles) {
        super(fm);
        mContext = context;
        mList = list;
        mTitles = titles;
    }

    public VpCollAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }
}

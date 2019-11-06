package com.example.usercwq.medicalmall.ui.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.mvp.view.presenter.SuoPresenter;
import com.example.usercwq.medicalmall.mvp.view.view.SuoView;


import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by usercwq on 2019/11/5.
 */

public class ForumFragment extends BaseFragment<SuoPresenter, SuoView> implements SuoView {
    @BindView(R.id.tv_school)
    TextView mTvSchool;
    @BindView(R.id.tv_luntan)
    TextView mTvLuntan;
    @BindView(R.id.rl_bg)
    RelativeLayout mRlBg;
    @BindView(R.id.image_release)
    ImageView mImageRelease;
    @BindView(R.id.image_right)
    ImageView mImageRight;
    @BindView(R.id.tab_channel)
    TabLayout mTabChannel;
    @BindView(R.id.tv_operation)
    TextView mTvOperation;
    @BindView(R.id.vp_forum)
    ViewPager mVpForum;

    private ArrayList<Fragment> fragments = new ArrayList<>();
    private ArrayList<String>   title = new ArrayList<>();
    public static ForumFragment getInstener() {
        ForumFragment tiKuFragment = new ForumFragment();
        Bundle bundle = new Bundle();
        tiKuFragment.setArguments(bundle);
        return tiKuFragment;
    }

    @Override
    protected SuoPresenter initPresenrer() {
        return new SuoPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_forum;
    }

    @Override
    public void initView() {
        initTab();


    }

    private void initTab() {

    }
}

package com.example.usercwq.medicalmall.ui.fragment_forum;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.mvp.view.presenter.forum_presenter.ForumPresenter;
import com.example.usercwq.medicalmall.mvp.view.view.forum_view.ForumView;
import com.example.usercwq.medicalmall.net.ForumTabBean;
import com.example.usercwq.medicalmall.ui.adapters.ForumTabAdapter;
import com.example.usercwq.medicalmall.ui.fragment.BaseFragment;


import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by usercwq on 2019/11/5.
 */

public class ForumFragment extends BaseFragment<ForumPresenter, ForumView> implements ForumView {
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
    protected ForumPresenter initPresenrer() {
        return new ForumPresenter();
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
        ForumTabAdapter forumTabAdapter = new ForumTabAdapter(getChildFragmentManager(), fragments, title);
        mVpForum.setAdapter(forumTabAdapter);
        mTabChannel.setupWithViewPager(mVpForum);
    }


    @Override
    public void setData(ForumTabBean dataBeans) {
        List<ForumTabBean.InfoBean> in = dataBeans.getInfo();
        for (int i = 0; i < in.size(); i++) {
            ForumAFragment forumAFragment = new ForumAFragment();
            forumAFragment.setId(in.get(i).getId());
        fragments.add(forumAFragment);
        title.add(in.get(i).getName());
        }
    }

    @Override
    public void showToast(String error) {

    }
}

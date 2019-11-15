package com.example.usercwq.medicalmall.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.tiku_bean.Bean;
import com.example.usercwq.medicalmall.bean.tiku_bean.TikuBean;
import com.example.usercwq.medicalmall.mvp.view.presenter.tiku_presenter.TiKuPresenter;
import com.example.usercwq.medicalmall.mvp.view.view.tiku_view.TiKuView;
import com.example.usercwq.medicalmall.ui.adapters.tikuAdapter.TiKuApdater;
import com.example.usercwq.medicalmall.ui.main.DaKaActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by usercwq on 2019/11/5.
 */

public class TiKuFragment extends BaseFragment<TiKuPresenter, TiKuView> implements TiKuView{
    private static final String TAG = "TiKuFragment";
    private  ArrayList<String> tab_title = new ArrayList<>();
    @BindView(R.id.tv_daojishi)
    TextView tvDaojishi;
    @BindView(R.id.tv_tian_1)
    TextView tvTian1;
    @BindView(R.id.ll_daojishi)
    LinearLayout llDaojishi;
    @BindView(R.id.rl_top)
    RelativeLayout rlTop;
    @BindView(R.id.tv_daka)
    TextView tvDaka;
    @BindView(R.id.toolbar_tiku)
    Toolbar toolbarTiku;
    @BindView(R.id.rb_3)
    RadioButton rb3;
    @BindView(R.id.rb_4)
    RadioButton rb4;
    @BindView(R.id.rb_6)
    RadioButton rb6;
    @BindView(R.id.rb_1)
    RadioButton rb1;
    @BindView(R.id.rb_2)
    RadioButton rb2;
    @BindView(R.id.rb_5)
    RadioButton rb5;
    @BindView(R.id.ll_center)
    LinearLayout llCenter;
    @BindView(R.id.tabla)
    TabLayout tabla;
    @BindView(R.id.view)
    View view;
    @BindView(R.id.appbar)
    AppBarLayout appbar;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    private   ArrayList<Fragment> fragments = new ArrayList<>();

    public static TiKuFragment getInstener() {
        TiKuFragment tiKuFragment = new TiKuFragment();
        Bundle bundle = new Bundle();
        tiKuFragment.setArguments(bundle);
        return tiKuFragment;

    }

    @Override
    protected TiKuPresenter initPresenrer() {
        return new TiKuPresenter();
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_tiku;
    }


    @Override
    public void initView() {

       initLenter();

    }

    private void initRclv(ArrayList<String> tab_title) {
        
        TiKuApdater tiKuApdater = new TiKuApdater(getChildFragmentManager(),fragments);

        viewPager.setAdapter(tiKuApdater);
        tabla.setupWithViewPager(viewPager);
        for (int i = 0; i < tab_title.size(); i++) {
            String text = tab_title.get(i);
            tabla.getTabAt(i).setText(text);
        }


    }

    @Override
    public void initData() {

        initTab();
    }

    private void initTab() {

        showLoading();
        SharedPreferences data = getContext().getSharedPreferences("data", getContext().MODE_PRIVATE);
        String access_token = data.getString("access_token", "000");
        mPresenter.loadData(access_token);
    }


    private void initLenter() {
        tvDaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),DaKaActivity.class));

            }
        });
    }


    @OnClick({R.id.rb_3, R.id.rb_4, R.id.rb_6, R.id.rb_1, R.id.rb_2, R.id.rb_5, R.id.tabla})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rb_3:

                break;
            case R.id.rb_4:
                break;
            case R.id.rb_6:


                break;
            case R.id.rb_1:

                break;
            case R.id.rb_2:

                break;
            case R.id.rb_5:

                break;
            case R.id.tabla:
                break;
        }
    }

    @Override
    public void setData(TikuBean tikuBean) {
        List<TikuBean.InfoBean.UTypeBean> u_type = tikuBean.getInfo().getU_type();

        for (int i = 0; i< u_type.size(); i++){
            TabFragment tabFragment = new TabFragment();
            String name = u_type.get(i).getName();
            String id = u_type.get(i).getId();
            List<TikuBean.InfoBean.UTypeBean.ZTypeBean> z_type = u_type.get(i).getZ_type();
            tabFragment.setlist_id(new Bean(id,z_type));
            Log.i(TAG, "setData: "+name);
            tab_title.add(name);
            fragments.add(tabFragment);
        }
        initRclv(tab_title);
    }

    @Override
    public void showToast(String error) {

    }
}

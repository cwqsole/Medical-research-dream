package com.example.usercwq.medicalmall.ui.fragment;





import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;


import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.mvp.view.presenter.SuoPresenter;
import com.example.usercwq.medicalmall.mvp.view.view.SuoView;
import com.example.usercwq.medicalmall.ui.adapters.MyViewPger;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.BooksFragment;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.CurriculumFragment;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.WholeFragment;

import java.util.ArrayList;

import javax.xml.transform.Source;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by usercwq on 2019/11/5.
 */

public class ShoppingFragment extends BaseFragment<SuoPresenter,SuoView> {
    public static ShoppingFragment getInstener(){
public class ShoppingFragment extends BaseFragment<SuoPresenter, SuoView> {
    @BindView(R.id.shop_title)
    TextView mShopTitle;
    @BindView(R.id.shop_toolbar)
    Toolbar mShopToolbar;
    @BindView(R.id.shop_tab)
    TabLayout mShopTab;
    @BindView(R.id.shop_viewpager)
    ViewPager mShopViewpager;
    private ArrayList<String> mTitles;


    public static ShoppingFragment getInstener() {
        ShoppingFragment tiKuFragment = new ShoppingFragment();
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
        return R.layout.fragment_shopping;
    }

    @Override
    public void initView() {
        initTitles();
      //  tab+viewpager;

        //适配器对象
        MyViewPger myViewPger = new MyViewPger(getChildFragmentManager(),initDatat(),mTitles);
        mShopViewpager.setAdapter(myViewPger);
        mShopTab.setupWithViewPager(mShopViewpager);


    }

    private ArrayList<BaseFragment> initDatat() {
        ArrayList<BaseFragment> fragments = new ArrayList<>();
        WholeFragment wholeFragment = new WholeFragment();
        BooksFragment booksFragment = new BooksFragment();
        CurriculumFragment curriculumFragment = new CurriculumFragment();
        fragments.add(wholeFragment);
        fragments.add(booksFragment);
        fragments.add(curriculumFragment);
        return fragments;
    }


    private void initTitles() {
        mTitles = new ArrayList<>();
        mTitles.add("全部");
        mTitles.add("图书");
        mTitles.add("课程");
    }




}

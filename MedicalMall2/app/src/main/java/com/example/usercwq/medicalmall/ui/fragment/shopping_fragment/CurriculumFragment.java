package com.example.usercwq.medicalmall.ui.fragment.shopping_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.shopping_bean.CurrBean;
import com.example.usercwq.medicalmall.mvp.view.presenter.shopping_presenter.CurriculumPresenter;
import com.example.usercwq.medicalmall.mvp.view.view.shopping_view.CurriculumView;
import com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.MyAdpterCurr;
import com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.MyAdpterWhole;
import com.example.usercwq.medicalmall.ui.fragment.BaseFragment;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class CurriculumFragment extends BaseFragment<CurriculumPresenter, CurriculumView>implements CurriculumView {

    @BindView(R.id.curr_recycler)
    RecyclerView mCurrRecycler;
    @BindView(R.id.curr_smart)
    SmartRefreshLayout mCurrSmart;
    Unbinder unbinder;
    private ArrayList<CurrBean.InfoBean> mList;
    private MyAdpterCurr mAdpterCurr;

    public static CurriculumFragment getInstener() {
        CurriculumFragment tiKuFragment = new CurriculumFragment();
        Bundle bundle = new Bundle();
        tiKuFragment.setArguments(bundle);
        return tiKuFragment;

    }

    @Override
    protected CurriculumPresenter initPresenrer() {
        return new CurriculumPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_curr;
    }

    @Override
    public void initView() {
        //管理器对象
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mCurrRecycler.setLayoutManager(linearLayoutManager);
        mList = new ArrayList<>();
        //适配器对象
        mAdpterCurr = new MyAdpterCurr(mList, getContext());
        mCurrRecycler.setAdapter(mAdpterCurr);
    }

    @Override
    public void initData() {
        mPresenter.getfyCodeView3();
    }

    @Override
    public void setData(CurrBean data) {
        CurrBean.InfoBean info = data.getInfo();
        mList.add(info);
        mAdpterCurr.notifyDataSetChanged();
    }
}

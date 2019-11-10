package com.example.usercwq.medicalmall.ui.fragment.shopping_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.shopping_bean.WholeBean;
import com.example.usercwq.medicalmall.mvp.view.presenter.shopping_presenter.WholePresenter;
import com.example.usercwq.medicalmall.mvp.view.view.shopping_view.WholeView;
import com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.MyAdpterWhole;
import com.example.usercwq.medicalmall.ui.fragment.BaseFragment;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class WholeFragment extends BaseFragment<WholePresenter, WholeView> implements WholeView {


    @BindView(R.id.whole_recycler)
    RecyclerView mWholeRecycler;
    @BindView(R.id.whole_smart)
    SmartRefreshLayout mWholeSmart;
    Unbinder unbinder;
    private ArrayList<WholeBean.InfoBean> mList;
    private MyAdpterWhole mMyAdpterWhole;

    public static WholeFragment getInstener() {
        WholeFragment tiKuFragment = new WholeFragment();
        Bundle bundle = new Bundle();
        tiKuFragment.setArguments(bundle);
        return tiKuFragment;

    }

    @Override
    protected WholePresenter initPresenrer() {
        return new WholePresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_whole;
    }

    @Override
    public void initView() {

        //管理器对象
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mWholeRecycler.setLayoutManager(linearLayoutManager);
        mList = new ArrayList<>();
        //适配器对象
        mMyAdpterWhole = new MyAdpterWhole(mList,getContext());
        mWholeRecycler.setAdapter(mMyAdpterWhole);

    }




    @Override
    public void initData() {
        mPresenter.getfyCodeView();
    }

    @Override
    public void setDataWhole(WholeBean data) {
       if(data!=null){
           List<WholeBean.InfoBean> info = data.getInfo();
           mList.addAll(info);
           mMyAdpterWhole.notifyDataSetChanged();
       }
    }
}

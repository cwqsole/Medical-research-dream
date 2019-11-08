package com.example.usercwq.medicalmall.ui.fragment.shopping_fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.shopping_bean.WholeBean;
import com.example.usercwq.medicalmall.mvp.view.presenter.shopping_presenter.WholePresenter;
import com.example.usercwq.medicalmall.mvp.view.view.shopping_view.WholeView;
import com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.MyAdpterWhole;
import com.example.usercwq.medicalmall.ui.fragment.BaseFragment;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_2.WholeCommodity2Activity;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import org.greenrobot.eventbus.EventBus;

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
    private ArrayList<WholeBean.InfoBean> mList;
    private MyAdpterWhole mMyAdpterWhole;
    private int page = 0;


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
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        mWholeRecycler.setLayoutManager(linearLayoutManager);
        mList = new ArrayList<>();
        //适配器对象
        mMyAdpterWhole = new MyAdpterWhole(mList,getActivity());
        mWholeRecycler.setAdapter(mMyAdpterWhole);

        //回调监听
        mMyAdpterWhole.setOnCreatLayout(new MyAdpterWhole.OnCreatLayout() {
            @Override
            public void onClick(int position) {
                WholeBean.InfoBean infoBean = mList.get(position);
                //跳转到商品详情页面
                 //Toast.makeText(getContext(), "全部", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), WholeCommodity2Activity.class);
                EventBus.getDefault().postSticky(infoBean);
                startActivity(intent);
            }
        });


    //上拉刷新,下拉加载
        mWholeSmart.setOnLoadMoreListener(new OnRefreshLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                    page++;
                mPresenter.getfyCodeView();
            }

            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                //清空旧数据
                mList.clear();
                page = 1;//page重置为1，第一页
                mPresenter.getfyCodeView();//调用方法加载数据
            }
        });
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
           mWholeSmart.finishRefresh().finishLoadMore();
           mMyAdpterWhole.notifyDataSetChanged();
       }
    }
}

package com.example.usercwq.medicalmall.ui.fragment.shopping_fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.app.MyLication;
import com.example.usercwq.medicalmall.bean.shopping_bean.WholeBean;
import com.example.usercwq.medicalmall.mvp.view.presenter.shopping_presenter.WholePresenter;
import com.example.usercwq.medicalmall.mvp.view.view.shopping_view.WholeView;
import com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.MyAdpterWhole;
import com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.MyAdpterWhole2;
import com.example.usercwq.medicalmall.ui.fragment.BaseFragment;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_2.Curr_Commodity2Activity;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_2.WholeCommodity2Activity;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import io.reactivex.annotations.NonNull;

/**
 * A simple {@link Fragment} subclass.
 */
public class WholeFragment extends BaseFragment<WholePresenter, WholeView> implements WholeView {

    @BindView(R.id.whole_recycler)
    RecyclerView mWholeRecycler;
    @BindView(R.id.whole_smart)
    SmartRefreshLayout mWholeSmart;
    private ArrayList<WholeBean.InfoBean.ShopBean> mList;
    private ArrayList<WholeBean.InfoBean.CourseBean> mList1;
    private MyAdpterWhole mMyAdpterWhole;
    private int start = 0;
    private int end = 0;
    private String mMAccess_token;
    private MyAdpterWhole2 mMyAdpterWhole2;


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
        mList1 = new ArrayList<>();
        //适配器对象 一个适配器
        mMyAdpterWhole = new MyAdpterWhole(mList,mList1,getActivity());
        mWholeRecycler.setAdapter(mMyAdpterWhole);


        //回调监听
        mMyAdpterWhole.setOnCreatLayout(new MyAdpterWhole.OnCreatLayout() {
            @Override
            public void onClick1(int position) {
                WholeBean.InfoBean.ShopBean shopBean = mList.get(position);
                //跳转到商品详情页面
                //Toast.makeText(getContext(), "全部", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), WholeCommodity2Activity.class);
                EventBus.getDefault().postSticky(shopBean);
                startActivity(intent);
            }

            @Override
            public void onClick2(int position) {
                //课程
                 Intent intent = new Intent(getContext(), Curr_Commodity2Activity.class);

                startActivity(intent);

            }
        });



        //上拉刷新,下拉加载
        mWholeSmart.setOnLoadMoreListener(new OnRefreshLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                //mPresenter.getfyCodeView(mMAccess_token, start, end);
            }

            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {

                start=0;
                end=0;
                //page重置为1，第一页
               // mPresenter.getfyCodeView(mMAccess_token, start, end);//调用方法加载数据
            }
        });
    }

    @Override
    public void initData() {

        mMAccess_token = MyLication.mAccess_token;
        mPresenter.getfyCodeView(mMAccess_token,start,end);
    }

    @Override
    public void setDataWhole(WholeBean data) {
        if(data!=null){
            List<WholeBean.InfoBean.ShopBean> shop = data.getInfo().getShop();
            List<WholeBean.InfoBean.CourseBean> course = data.getInfo().getCourse();
            mList.addAll(shop);
            mList1.addAll(course);
            mWholeSmart.finishRefresh().finishLoadMore();
            mMyAdpterWhole.notifyDataSetChanged();
        }
    }
}

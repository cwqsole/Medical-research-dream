package com.example.usercwq.medicalmall.ui.fragment.shopping_fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.app.MyLication;
import com.example.usercwq.medicalmall.bean.shopping_bean.CurrBean;
import com.example.usercwq.medicalmall.mvp.view.presenter.shopping_presenter.CurriculumPresenter;
import com.example.usercwq.medicalmall.mvp.view.view.shopping_view.CurriculumView;
import com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.MyAdpterCurr;
import com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.MyAdpterWhole;
import com.example.usercwq.medicalmall.ui.fragment.BaseFragment;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_2.Curr_Commodity2Activity;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.annotations.NonNull;

/**
 * A simple {@link Fragment} subclass.
 */
public class CurriculumFragment extends BaseFragment<CurriculumPresenter, CurriculumView>implements CurriculumView {

    @BindView(R.id.curr_recycler)
    RecyclerView mCurrRecycler;
    @BindView(R.id.curr_smart)
    SmartRefreshLayout mCurrSmart;
    Unbinder unbinder;
    private ArrayList<CurrBean.InfoBean.KechengBean> mList;
    private MyAdpterCurr mAdpterCurr;
    private int page= 11;
    private String mAccess_token;

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
        //上拉刷新,下拉加载
        mCurrSmart.setOnLoadMoreListener(new OnRefreshLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                page++;
                mPresenter.getfyCodeView3(mAccess_token,page);
            }

            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                //清空旧数据
                mList.clear();
                page = 1;//page重置为1，第一页
                mPresenter.getfyCodeView3(mAccess_token,page);//调用方法加载数据
            }
        });
        mAdpterCurr.setOnCreatLayout(new MyAdpterCurr.OnCreatLayout() {
            @Override
            public void OnCreatlayout(int position) {
                CurrBean.InfoBean.KechengBean kechengBean = mList.get(position);
                Toast.makeText(getContext(), "课程", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), Curr_Commodity2Activity.class);
                EventBus.getDefault().postSticky(kechengBean);
                startActivity(intent);
            }
        });
    }

    @Override
    public void initData() {
        mAccess_token = MyLication.mAccess_token;
        mPresenter.getfyCodeView3(mAccess_token,page);
    }

    @Override
    public void setData(CurrBean data) {
        List<CurrBean.InfoBean.KechengBean> kecheng = data.getInfo().getKecheng();
        mList.addAll(kecheng);
        mCurrSmart.finishLoadMore().finishRefresh();
        mAdpterCurr.notifyDataSetChanged();
    }
}

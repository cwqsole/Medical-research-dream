package com.example.usercwq.medicalmall.ui.fragment.shopping_fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.shopping_bean.WholeBean;
import com.example.usercwq.medicalmall.mvp.view.presenter.shopping_presenter.BooksPresenter;
import com.example.usercwq.medicalmall.mvp.view.view.shopping_view.BooksView;
import com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.MyAdpterBooks;
import com.example.usercwq.medicalmall.ui.fragment.BaseFragment;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_2.Books_Commodity2Activity;
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
public class BooksFragment extends BaseFragment<BooksPresenter, BooksView> implements BooksView {
    @BindView(R.id.books_recycler)
    RecyclerView mBooksRecycler;
    @BindView(R.id.books_smart)
    SmartRefreshLayout mBooksSmart;
    Unbinder unbinder;
    private ArrayList<WholeBean.InfoBean> mList;
    private MyAdpterBooks mAdpterBooks;
    private int page = 0;
    public static BooksFragment getInstener() {
        BooksFragment tiKuFragment = new BooksFragment();
        Bundle bundle = new Bundle();
        tiKuFragment.setArguments(bundle);
        return tiKuFragment;

    }

    @Override
    protected BooksPresenter initPresenrer() {
        return new BooksPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_books;
    }

    @Override
    public void initView() {
        //管理器对象
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mBooksRecycler.setLayoutManager(linearLayoutManager);
        mList = new ArrayList<>();
        //适配器对象
        mAdpterBooks = new MyAdpterBooks(mList, getContext());
        mBooksRecycler.setAdapter(mAdpterBooks);
        //回调监听
        mAdpterBooks.setOnCreatLayout(new MyAdpterBooks.OnCreatLayout() {
            @Override
            public void OnCreatlayout(int position) {

                //跳转到商品详情页面
               // Toast.makeText(getContext(), "图书", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), Books_Commodity2Activity.class);
                EventBus.getDefault().postSticky(mList);
                startActivity(intent);
            }
        });
        //上拉刷新,下拉加载
        mBooksSmart.setOnLoadMoreListener(new OnRefreshLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                page++;
                mPresenter.getfyCodeView2();
            }

            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                //清空旧数据
                mList.clear();
                page = 1;//page重置为1，第一页
                mPresenter.getfyCodeView2();//调用方法加载数据
            }
        });
    }

    @Override
    public void initData() {
        mPresenter.getfyCodeView2();
    }

    @Override
    public void setDataWhole(WholeBean data) {
        if (data!=null){
            List<WholeBean.InfoBean> info = data.getInfo();
            mList.addAll(info);
            mBooksSmart.finishLoadMore().finishRefresh();
            mAdpterBooks.notifyDataSetChanged();
        }
    }
}

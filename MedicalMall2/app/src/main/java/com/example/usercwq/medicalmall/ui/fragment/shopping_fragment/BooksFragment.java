package com.example.usercwq.medicalmall.ui.fragment.shopping_fragment;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.app.MyLication;
import com.example.usercwq.medicalmall.bean.shopping_bean.BookBean;
import com.example.usercwq.medicalmall.bean.shopping_bean.WholeBean;
import com.example.usercwq.medicalmall.mvp.view.presenter.shopping_presenter.BooksPresenter;
import com.example.usercwq.medicalmall.mvp.view.presenter.shopping_presenter.WholePresenter;
import com.example.usercwq.medicalmall.mvp.view.view.shopping_view.BooksView;
import com.example.usercwq.medicalmall.mvp.view.view.shopping_view.WholeView;
import com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.MyAdpterBooks;
import com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.MyAdpterWhole;
import com.example.usercwq.medicalmall.ui.fragment.BaseFragment;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_2.Books_Commodity2Activity;
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
public class BooksFragment extends BaseFragment<BooksPresenter, BooksView> implements BooksView {
    @BindView(R.id.books_recycler)
    RecyclerView mBooksRecycler;
    @BindView(R.id.books_smart)
    SmartRefreshLayout mBooksSmart;
    Unbinder unbinder;
    private ArrayList<BookBean.InfoBean> mList;
    private MyAdpterBooks mAdpterBooks;

    private String mAccess_token;
    private  int path = 0;
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

        SharedPreferences data = getActivity().getSharedPreferences("data", getActivity().MODE_PRIVATE);
        mAccess_token = data.getString("access_token", "000");
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
                BookBean.InfoBean infoBean = mList.get(position);
                //跳转到商品详情页面
                // Toast.makeText(getContext(), "图书", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), Books_Commodity2Activity.class);
                EventBus.getDefault().postSticky(infoBean);
                startActivity(intent);
            }
        });
        //上拉刷新,下拉加载
        mBooksSmart.setOnLoadMoreListener(new OnRefreshLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                path++;
                mPresenter.getfyCodeView2(mAccess_token,path);
            }

            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                //清空旧数据
                mList.clear();
                path = 11;//page重置为1，第一页
                mPresenter.getfyCodeView2(mAccess_token,path);//调用方法加载数据
            }
        });
    }

    @Override
    public void initData() {
        mPresenter.getfyCodeView2(mAccess_token,path);
    }


    @Override
    public void setDataBook(BookBean data) {
        if (data!=null){
            List<BookBean.InfoBean> info = data.getInfo();
            mList.addAll(info);
            mBooksSmart.finishLoadMore().finishRefresh();
            mAdpterBooks.notifyDataSetChanged();
        }
    }
}

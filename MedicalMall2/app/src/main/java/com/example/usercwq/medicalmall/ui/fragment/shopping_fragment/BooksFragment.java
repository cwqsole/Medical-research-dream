package com.example.usercwq.medicalmall.ui.fragment.shopping_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.shopping_bean.WholeBean;
import com.example.usercwq.medicalmall.mvp.view.presenter.shopping_presenter.BooksPresenter;
import com.example.usercwq.medicalmall.mvp.view.presenter.shopping_presenter.WholePresenter;
import com.example.usercwq.medicalmall.mvp.view.view.shopping_view.BooksView;
import com.example.usercwq.medicalmall.mvp.view.view.shopping_view.WholeView;
import com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.MyAdpterBooks;
import com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.MyAdpterWhole;
import com.example.usercwq.medicalmall.ui.fragment.BaseFragment;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
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
            mAdpterBooks.notifyDataSetChanged();
        }
    }
}

package com.example.usercwq.medicalmall.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.base.BasePresenter;
import com.example.usercwq.medicalmall.base.BaseView;
import com.example.usercwq.medicalmall.utils.LoadingDialog;

import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * A simple {@link Fragment} subclass.
 */
public abstract class BaseFragment<P extends BasePresenter,V extends BaseView> extends Fragment implements BaseView{

    private LoadingDialog loadingDialog;
    public P mPresenter;
    private Unbinder bind;

    public BaseFragment() {
        // Required empty public constructor
    }

    @Override
    public void showLoading() {
        if (loadingDialog==null){
            loadingDialog = new LoadingDialog(getContext());
        }
        loadingDialog.show();
    }

    @Override
    public void hideLoading() {
        if (loadingDialog==null){
            loadingDialog = new LoadingDialog(getContext());
        }
        loadingDialog.hide();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(getLayoutId(), container, false);
        bind = ButterKnife.bind(this, inflate);
        mPresenter = initPresenrer();
        if (mPresenter!=null){
            mPresenter.bindView(this);
        }
        initView();
        initData();

        return inflate;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }

    protected abstract P initPresenrer();

    public void initData() {

    }

    public void initView() {

    }

    protected abstract int getLayoutId();


}

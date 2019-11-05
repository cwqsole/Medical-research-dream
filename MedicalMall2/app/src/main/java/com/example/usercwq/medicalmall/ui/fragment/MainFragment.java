package com.example.usercwq.medicalmall.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.mvp.view.presenter.FragmentPresenter;
import com.example.usercwq.medicalmall.mvp.view.view.FragmentView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by usercwq on 2019/11/3.
 */

public class MainFragment extends BaseFragment<FragmentPresenter, FragmentView> implements
        FragmentView {


    @BindView(R.id.bt_dw)
    Button btDw;
    Unbinder unbinder;

    @Override
    protected FragmentPresenter initPresenrer() {
        return new FragmentPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_base;
    }

    @Override
    public void initView() {
        btDw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showLoading();
            }
        });

    }


}

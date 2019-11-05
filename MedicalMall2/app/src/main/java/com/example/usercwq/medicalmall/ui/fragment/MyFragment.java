package com.example.usercwq.medicalmall.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.mvp.view.presenter.SuoPresenter;
import com.example.usercwq.medicalmall.mvp.view.view.SuoView;

import butterknife.BindView;
import butterknife.Unbinder;

/**
 * Created by usercwq on 2019/11/5.
 */

public class MyFragment extends BaseFragment<SuoPresenter, SuoView> {
    @BindView(R.id.tongzhi_my)
    ImageView mTongzhiMy;
    Unbinder unbinder;

    public static MyFragment getInstener() {
        MyFragment tiKuFragment = new MyFragment();
        Bundle bundle = new Bundle();
        tiKuFragment.setArguments(bundle);
        return tiKuFragment;
    }

    @Override
    protected SuoPresenter initPresenrer() {
        return new SuoPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_my;
    }

    @Override
    public void initView() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}

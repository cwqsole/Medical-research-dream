package com.example.usercwq.medicalmall.ui.fragment.my_fragment;


import android.support.v4.app.Fragment;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.mvp.view.presenter.my_presenter.CollectShoopPresenter;
import com.example.usercwq.medicalmall.mvp.view.view.my_view.CollectShoopView;
import com.example.usercwq.medicalmall.ui.fragment.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyCollectShoopFragment extends BaseFragment<CollectShoopPresenter, CollectShoopView> implements CollectShoopView {

    @Override
    protected CollectShoopPresenter initPresenrer() {
        return new CollectShoopPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_my_collect;
    }

}

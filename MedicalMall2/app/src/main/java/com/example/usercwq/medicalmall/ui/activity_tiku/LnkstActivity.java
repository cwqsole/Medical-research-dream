package com.example.usercwq.medicalmall.ui.activity_tiku;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.base.BaseActivity;
import com.example.usercwq.medicalmall.mvp.view.presenter.tiku_presenter.LnkstPresenter;
import com.example.usercwq.medicalmall.mvp.view.view.tiku_view.LnkstView;

public class LnkstActivity extends BaseActivity<LnkstPresenter, LnkstView> implements LnkstView  {
    @Override
    protected LnkstPresenter initPresenter() {
        return  new LnkstPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_lnkst;
        
    }
}

package com.example.usercwq.medicalmall.mvp.view.presenter;

import android.content.Intent;

import com.example.usercwq.medicalmall.base.BasePresenter;
import com.example.usercwq.medicalmall.bean.tiku_bean.TiKuRclvBean;
import com.example.usercwq.medicalmall.mvp.view.model.ResultCallBack;
import com.example.usercwq.medicalmall.mvp.view.model.tiku_model.TabModel;
import com.example.usercwq.medicalmall.mvp.view.view.TabView;

public class TabPresenter extends BasePresenter<TabView> {

    private TabModel tabModel;

    @Override
    protected void initModel() {
        tabModel = new TabModel();
    }

    public void loadData(String id) {
        tabModel.loadData(id, new ResultCallBack<TiKuRclvBean>() {
            @Override
            public void onSussecc(TiKuRclvBean data) {
                if (mView!=null){
                    mView.hideLoading();
                    if (data!=null){
                        mView.setData(data);
                    }
                }
            }

            @Override
            public void onFiled(String error) {
                if (mView!=null){
                    mView.hideLoading();
                    mView.showToast(error);
                }
            }
        });
    }
}

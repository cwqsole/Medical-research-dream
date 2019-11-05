package com.example.usercwq.medicalmall.mvp.view.presenter;

import com.example.usercwq.medicalmall.base.BasePresenter;
import com.example.usercwq.medicalmall.base.BaseView;
import com.example.usercwq.medicalmall.bean.MainBean;
import com.example.usercwq.medicalmall.mvp.view.model.MainModel;
import com.example.usercwq.medicalmall.mvp.view.model.ResultCallBack;
import com.example.usercwq.medicalmall.mvp.view.view.MainView;

/**
 * Created by usercwq on 2019/10/31.
 */

public class MainPresneter extends BasePresenter<MainView>{


    private MainModel mainModel;

    @Override
    protected void initModel() {
        mainModel = new MainModel();
        addModel(mainModel);


    }


    public void loadData() {
        mainModel.loadData(new ResultCallBack<MainBean>() {

            @Override
            public void onSussecc(MainBean data) {
                if (mView!=null){
                    mView.setData(data);
                }
            }

            @Override
            public void onFiled(String error) {
                if (mView!=null)
                    mView.showToast(error);
            }
        });
    }

}

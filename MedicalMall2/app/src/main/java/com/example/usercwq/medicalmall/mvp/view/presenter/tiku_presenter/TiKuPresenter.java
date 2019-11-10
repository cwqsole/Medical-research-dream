package com.example.usercwq.medicalmall.mvp.view.presenter.tiku_presenter;

import com.example.usercwq.medicalmall.base.BasePresenter;
import com.example.usercwq.medicalmall.bean.tiku_bean.TikuBean;
import com.example.usercwq.medicalmall.mvp.view.model.ResultCallBack;
import com.example.usercwq.medicalmall.mvp.view.model.tiku_model.TiKuModel;
import com.example.usercwq.medicalmall.mvp.view.view.tiku_view.TiKuView;

public class TiKuPresenter extends BasePresenter<TiKuView> {

    private TiKuModel tiKuModel;

    @Override
    protected void initModel() {
        tiKuModel = new TiKuModel();
    }

    public void loadData(String access_token) {
        tiKuModel.loadData(new ResultCallBack<TikuBean>() {
            @Override
            public void onSussecc(TikuBean tikuBean) {
                if (mView != null) {
                    mView.hideLoading();
                    if (tikuBean!=null){
                        mView.setData(tikuBean);
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
        },access_token);
    }
}

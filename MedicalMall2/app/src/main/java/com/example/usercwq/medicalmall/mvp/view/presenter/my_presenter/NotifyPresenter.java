package com.example.usercwq.medicalmall.mvp.view.presenter.my_presenter;

import com.example.usercwq.medicalmall.base.BasePresenter;
import com.example.usercwq.medicalmall.bean.my_bean.MyNotifyBean;
import com.example.usercwq.medicalmall.mvp.view.model.ResultCallBack;
import com.example.usercwq.medicalmall.mvp.view.model.my_model.NotifyModel;
import com.example.usercwq.medicalmall.mvp.view.view.my_view.NotifyView;
import com.example.usercwq.medicalmall.utils.ToastUtil;

public class NotifyPresenter extends BasePresenter<NotifyView> {

    private NotifyModel mModel;

    @Override
    protected void initModel() {
        mModel = new NotifyModel();
        addModel(mModel);
    }

    public void getData(){
        mModel.getNotify(new ResultCallBack<MyNotifyBean>() {
            @Override
            public void onSussecc(MyNotifyBean data) {
                if(mView!=null){
                    if(data!=null){
                        mView.setData(data);
                    }
                }
            }

            @Override
            public void onFiled(String error) {
                ToastUtil.showLong(error);
            }
        });
    }
}

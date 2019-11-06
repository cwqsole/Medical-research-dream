package com.example.usercwq.medicalmall.mvp.view.presenter.shopping_presenter;

import com.example.usercwq.medicalmall.base.BasePresenter;
import com.example.usercwq.medicalmall.bean.shopping_bean.WholeBean;
import com.example.usercwq.medicalmall.mvp.view.model.ResultCallBack;
import com.example.usercwq.medicalmall.mvp.view.model.shopping_model.WholeModel;
import com.example.usercwq.medicalmall.mvp.view.view.shopping_view.WholeView;
import com.example.usercwq.medicalmall.utils.ToastUtil;

public class WholePresenter extends BasePresenter<WholeView> {

    private WholeModel mWholeModel;

    @Override
    protected void initModel() {
        mWholeModel = new WholeModel();
    }

    public void getfyCodeView() {
        mWholeModel.setfyCodeView(new ResultCallBack<WholeBean>() {
            @Override
            public void onSussecc(WholeBean data) {
                if (mWholeModel!=null){
                    if (data!=null){
                        mView.setDataWhole(data);
                    }
                }
            }

            @Override
            public void onFiled(String error) {
                ToastUtil.showShort(error);
            }
        });
    }
}

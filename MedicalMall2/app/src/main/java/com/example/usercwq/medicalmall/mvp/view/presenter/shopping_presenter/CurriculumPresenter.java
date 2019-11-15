package com.example.usercwq.medicalmall.mvp.view.presenter.shopping_presenter;

import com.example.usercwq.medicalmall.base.BasePresenter;
import com.example.usercwq.medicalmall.bean.shopping_bean.CurrBean;
import com.example.usercwq.medicalmall.mvp.view.model.ResultCallBack;
import com.example.usercwq.medicalmall.mvp.view.model.shopping_model.CurriculumModel;
import com.example.usercwq.medicalmall.mvp.view.view.shopping_view.CurriculumView;
import com.example.usercwq.medicalmall.mvp.view.view.shopping_view.WholeView;
import com.example.usercwq.medicalmall.utils.ToastUtil;

public class CurriculumPresenter extends BasePresenter<CurriculumView> {

    private CurriculumModel mCurriculumModel;

    @Override
    protected void initModel() {
        mCurriculumModel = new CurriculumModel();
    }

    public void getfyCodeView3(String mMAccess_token,int id) {
        mCurriculumModel.setFyCodeView(mMAccess_token,id,new ResultCallBack<CurrBean>() {
            @Override
            public void onSussecc(CurrBean data) {
                if (mCurriculumModel!=null){
                    if (data!=null){
                        mView.setData(data);
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

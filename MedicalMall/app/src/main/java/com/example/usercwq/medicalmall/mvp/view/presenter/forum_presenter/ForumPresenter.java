package com.example.usercwq.medicalmall.mvp.view.presenter.forum_presenter;

import com.example.usercwq.medicalmall.base.BasePresenter;
import com.example.usercwq.medicalmall.mvp.view.model.forummodel.ForumModel;
import com.example.usercwq.medicalmall.mvp.view.model.ResultCallBack;
import com.example.usercwq.medicalmall.mvp.view.view.forum_view.ForumView;
import com.example.usercwq.medicalmall.net.ForumTabBean;

public class ForumPresenter extends BasePresenter<ForumView> {

    private ForumModel forumModel;

    @Override
    protected void initModel() {
        forumModel = new ForumModel();
    }
    public void loadData(){
        forumModel.loadData(new ResultCallBack<ForumTabBean>() {
            @Override
            public void onSussecc(ForumTabBean data) {
                if (mView != null) {
                    if (data != null) {
mView.setData(data);
                    }
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

package com.example.usercwq.medicalmall.mvp.view.presenter.shopping_presenter;

import com.example.usercwq.medicalmall.base.BasePresenter;
import com.example.usercwq.medicalmall.bean.shopping_bean.BookBean;
import com.example.usercwq.medicalmall.bean.shopping_bean.WholeBean;
import com.example.usercwq.medicalmall.mvp.view.model.ResultCallBack;
import com.example.usercwq.medicalmall.mvp.view.model.shopping_model.BooksModel;
import com.example.usercwq.medicalmall.mvp.view.view.shopping_view.BooksView;
import com.example.usercwq.medicalmall.mvp.view.view.shopping_view.WholeView;
import com.example.usercwq.medicalmall.utils.ToastUtil;

public class BooksPresenter extends BasePresenter<BooksView> {

    private BooksModel mBooksModel;

    @Override
    protected void initModel() {
        mBooksModel = new BooksModel();
    }


    public void getfyCodeView2(String access_token, int path) {
        mBooksModel.setfyCodeView2(access_token,path,new ResultCallBack<BookBean>() {
            @Override
            public void onSussecc(BookBean data) {
                if (mBooksModel!=null){
                    if (data!=null){
                        mView.setDataBook(data);
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

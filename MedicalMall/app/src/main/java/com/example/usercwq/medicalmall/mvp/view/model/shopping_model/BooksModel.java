package com.example.usercwq.medicalmall.mvp.view.model.shopping_model;

import com.example.usercwq.medicalmall.base.BaseModel;
import com.example.usercwq.medicalmall.bean.shopping_bean.WholeBean;
import com.example.usercwq.medicalmall.http.HttpUtils;
import com.example.usercwq.medicalmall.mvp.view.model.ResultCallBack;
import com.example.usercwq.medicalmall.net.ApiService;
import com.example.usercwq.medicalmall.utils.RxUtils;
import com.example.usercwq.medicalmall.utils.ToastUtil;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by usercwq on 2019/11/5.
 */

public class BooksModel extends BaseModel {
    public void setfyCodeView2(final ResultCallBack<WholeBean> callBack2) {

        ApiService apiserver = HttpUtils.getInstance().getApiserver(ApiService.Uri, ApiService.class);
        apiserver.gettushu()
                .compose(RxUtils.<WholeBean>rxObserableSchedulerHelper())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<WholeBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(WholeBean wholeBean) {
                        if (wholeBean.getInfo()!=null){
                            callBack2.onSussecc(wholeBean);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        ToastUtil.showShort(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}

package com.example.usercwq.medicalmall.mvp.view.model.my_model;

import com.example.usercwq.medicalmall.base.BaseModel;
import com.example.usercwq.medicalmall.bean.my_bean.MyNotifyBean;
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

public class NotifyModel extends BaseModel {
    public void getNotify(final ResultCallBack<MyNotifyBean> callBack2) {

        ApiService apiserver = HttpUtils.getInstance().getApiserver(ApiService.Uri, ApiService.class);
        apiserver.getBean()
                .compose(RxUtils.<MyNotifyBean>rxObserableSchedulerHelper())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<MyNotifyBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(MyNotifyBean bean) {
                        if (bean.getInfo()!=null){
                            callBack2.onSussecc(bean);
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

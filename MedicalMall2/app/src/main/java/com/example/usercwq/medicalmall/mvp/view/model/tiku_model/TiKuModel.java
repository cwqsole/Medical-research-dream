package com.example.usercwq.medicalmall.mvp.view.model.tiku_model;

import com.example.usercwq.medicalmall.base.BaseModel;
import com.example.usercwq.medicalmall.bean.tiku_bean.TikuBean;
import com.example.usercwq.medicalmall.http.HttpUtils;
import com.example.usercwq.medicalmall.mvp.view.model.ResultCallBack;
import com.example.usercwq.medicalmall.net.ApiService;
import com.example.usercwq.medicalmall.utils.BaseObserver;
import com.example.usercwq.medicalmall.utils.RxUtils;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class TiKuModel extends BaseModel {

    public void loadData(final ResultCallBack resultCallBack,String access_token) {
        ApiService apiserver = HttpUtils.getInstance().getApiserver(ApiService.Uri,
                ApiService.class);
        final Observable<TikuBean> ti = apiserver.getTiKuBean("Bearer "+access_token);
        ti.compose(RxUtils.<TikuBean>rxObserableSchedulerHelper())
                .subscribe(new Observer<TikuBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onNext(TikuBean tikuBean) {

                        resultCallBack.onSussecc(tikuBean);

                    }

                    @Override
                    public void onError(Throwable e) {
                        resultCallBack.onFiled(e.getMessage()+"网络请求失败");
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}

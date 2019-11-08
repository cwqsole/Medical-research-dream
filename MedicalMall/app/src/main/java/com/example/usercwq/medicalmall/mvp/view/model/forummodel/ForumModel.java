package com.example.usercwq.medicalmall.mvp.view.model.forummodel;

import com.example.usercwq.medicalmall.base.BaseModel;
import com.example.usercwq.medicalmall.http.HttpUtils;
import com.example.usercwq.medicalmall.mvp.view.model.ResultCallBack;
import com.example.usercwq.medicalmall.net.ApiService;
import com.example.usercwq.medicalmall.net.ForumTabBean;
import com.example.usercwq.medicalmall.utils.RxUtils;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class ForumModel extends BaseModel {
    public void loadData(final ResultCallBack<ForumTabBean> forumTabBeanResultCallBack) {
        ApiService apiserver = HttpUtils.getInstance().getApiserver(ApiService.url, ApiService.class);
        apiserver.getTab()
                .compose(RxUtils.<ForumTabBean>rxObserableSchedulerHelper())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<ForumTabBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ForumTabBean forumTabBean) {forumTabBeanResultCallBack.onSussecc(forumTabBean);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}

package com.example.usercwq.medicalmall.mvp.view.model.course;

import com.example.usercwq.medicalmall.base.BaseModel;
import com.example.usercwq.medicalmall.bean.CourselvBean;
import com.example.usercwq.medicalmall.http.HttpUtils;
import com.example.usercwq.medicalmall.mvp.view.model.ResultCallBack;
import com.example.usercwq.medicalmall.net.ApiService;
import com.example.usercwq.medicalmall.utils.RxUtils;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class CourseModel extends BaseModel {
    public void getData(final ResultCallBack<CourselvBean> resultCallBack) {
        HttpUtils.getInstance().getApiserver(ApiService.Url_yym, ApiService.class)
                .getCourse()
                .compose(RxUtils.<CourselvBean>rxObserableSchedulerHelper())
                .subscribe(new Observer<CourselvBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(CourselvBean courselvBean) {
                        resultCallBack.onSussecc(courselvBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        resultCallBack.onFiled(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}

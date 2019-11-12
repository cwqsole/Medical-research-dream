package com.example.usercwq.medicalmall.mvp.view.model.course_model;

import com.example.usercwq.medicalmall.base.BaseModel;
import com.example.usercwq.medicalmall.bean.course.CourseBean;
import com.example.usercwq.medicalmall.http.HttpUtils;
import com.example.usercwq.medicalmall.mvp.view.model.ResultCallBack;
import com.example.usercwq.medicalmall.net.ApiService;
import com.example.usercwq.medicalmall.utils.RxUtils;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class CourseModel extends BaseModel {

    public void getCourseData(final ResultCallBack<CourseBean> resultCallBack) {
        HttpUtils.getInstance().getApiserver(ApiService.Url_zhengshi, ApiService.class)
                .getCourse()
                .compose(RxUtils.<CourseBean>rxObserableSchedulerHelper())
                .subscribe(new Observer<CourseBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(CourseBean courseBean) {
                        resultCallBack.onSussecc(courseBean);
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

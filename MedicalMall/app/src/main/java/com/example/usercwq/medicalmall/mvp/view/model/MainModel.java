package com.example.usercwq.medicalmall.mvp.view.model;

import com.example.usercwq.medicalmall.base.BaseModel;
import com.example.usercwq.medicalmall.base.BaseView;
import com.example.usercwq.medicalmall.bean.MainBean;
import com.example.usercwq.medicalmall.http.HttpUtils;
import com.example.usercwq.medicalmall.net.ApiService;
import com.example.usercwq.medicalmall.utils.BaseObserver;
import com.example.usercwq.medicalmall.utils.RxUtils;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by usercwq on 2019/11/1.
 */

public class MainModel extends BaseModel {


    public void loadData(final ResultCallBack resultCallBack) {
        ApiService apiserver = HttpUtils.getInstance().getApiserver(ApiService.url, ApiService
                .class);
        apiserver.getData()
                .compose(RxUtils.<MainBean>rxObserableSchedulerHelper())
                .subscribe(new BaseObserver<MainBean>(this) {
                    @Override
                    protected void onSussecc(MainBean mainBean) {
                        resultCallBack.onSussecc(mainBean);
                    }

                    @Override
                    protected void error(String err) {
                            resultCallBack.onFiled(err);
                    }
                });
    }
}

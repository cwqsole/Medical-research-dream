package com.example.usercwq.medicalmall.mvp.view.model.shopping_model;

import android.util.Log;
import android.widget.EditText;

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

public class WholeModel extends BaseModel {
    public void setfyCodeView(int start, int end, String access_token, final ResultCallBack<WholeBean> callBack) {
        ApiService apiserver = HttpUtils.getInstance().getApiserver(ApiService.Uri, ApiService.class);
        apiserver.getTuShu("Bearer "+access_token,start,end)
                .compose(RxUtils.<WholeBean>rxObserableSchedulerHelper())
                .subscribe(new Observer<WholeBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(WholeBean wholeBean) {
                        //Log.i("TAG", "onNext: "+wholeBean.toString());
                        if (wholeBean.getInfo()!=null){
                            callBack.onSussecc(wholeBean);
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

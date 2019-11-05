package com.example.usercwq.medicalmall.net;

import com.example.usercwq.medicalmall.bean.MainBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by usercwq on 2019/11/1.
 */

public interface ApiService {

    String url="http://gank.io/api/";
    @GET("data/%E7%A6%8F%E5%88%A9/20/1")
    Observable<MainBean> getData();
}

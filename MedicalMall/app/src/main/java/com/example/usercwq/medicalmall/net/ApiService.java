package com.example.usercwq.medicalmall.net;

import com.example.usercwq.medicalmall.bean.CourselvBean;
import com.example.usercwq.medicalmall.bean.MainBean;
import com.example.usercwq.medicalmall.bean.shopping_bean.CurrBean;
import com.example.usercwq.medicalmall.bean.shopping_bean.WholeBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by usercwq on 2019/11/1.
 */

public interface ApiService {

    String url = "http://gank.io/api/";
    public static final String Url_yym = "https://app.yiyanmeng.com/index.php/";//正式
    @GET("data/%E7%A6%8F%E5%88%A9/20/1")
    Observable<MainBean> getData();

    //全部   图书  课程
    String Uri = "https://app.yiyanmeng.com/";

    @GET("index.php/shop/get_shop_list")
    Observable<WholeBean> gettushu();  //全部 和图书通用

    //https://app.yiyanmeng.com/
    @GET("index.php/kecheng/ke_index_list")
    Observable<CurrBean> getCurr();
    //论坛 学校  tab栏分类数据
//https://app.yiyanmeng.com/index.php/forumsc/type_select
    @GET("index.php/forumsc/type_select")
    Observable<ForumTabBean>getTab();

    @GET("kecheng/ke_index_list")
    Observable<CourselvBean> getCourse();
}



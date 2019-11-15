package com.example.usercwq.medicalmall.net;

import com.example.usercwq.medicalmall.bean.MainBean;
import com.example.usercwq.medicalmall.bean.my_bean.MyNotifyBean;
import com.example.usercwq.medicalmall.bean.phone_bean.PhoineBean;
import com.example.usercwq.medicalmall.bean.register_bean.LoginBean;
import com.example.usercwq.medicalmall.bean.register_bean.Register2Bean;
import com.example.usercwq.medicalmall.bean.shopping_bean.BookBean;
import com.example.usercwq.medicalmall.bean.shopping_bean.CurrBean;
import com.example.usercwq.medicalmall.bean.shopping_bean.ParticularsBean;
import com.example.usercwq.medicalmall.bean.shopping_bean.WholeBean;
import com.example.usercwq.medicalmall.bean.tiku_bean.TikuBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by usercwq on 2019/11/1.
 */

public interface ApiService {

  String url = "http://gank.io/api/";

    @GET("data/%E7%A6%8F%E5%88%A9/20/1")
    Observable<MainBean> getData();

    //全部
    String Uri = "https://app.yiyanmeng.com/";

  //https://app.yiyanmeng.com/index.php/shop/get_shop_and_vedio_list
  //全部
    @POST("index.php/shop/get_shop_and_vedio_list")
    @FormUrlEncoded
    Observable<WholeBean> getTuShu(@Header("A-uthorization")String header,@Field("start")int start,@Field("end")int end);
    //详情
  //https://app.yiyanmeng.com/index.php/Shop/shop_xiang_qing
  @POST("index.php/Shop/shop_xiang_qing")
  @FormUrlEncoded
  Observable<ParticularsBean> getXiangQing(@Header("A-uthorization")String header, @Field("id")String id);

     //图书
  //https://app.yiyanmeng.com/index.php/shop/get_shop_list
  @POST("index.php/shop/get_shop_list")
  @FormUrlEncoded
  Observable<BookBean> getBook(@Header("A-uthorization")String header, @Field("p")int p);

  //课程
  //https://app.yiyanmeng.com/index.php/kecheng/ke_index_list
  @POST("index.php/kecheng/ke_index_list")
  @FormUrlEncoded
  Observable<CurrBean> getCurr(@Header("A-uthorization")String header,@Field("p")int p);

    //手机号  验证码
    @POST("index.php/paywx/massage")
    @FormUrlEncoded
    Observable<PhoineBean> getPhoneData(@Field("phnoe") String phone,@Field("type")String type);


    //手机号  注册   https://app.yiyanmeng.com/index.php/login/login_zhuce
    @POST("index.php/login/login_zhuce")
    @FormUrlEncoded
    Observable<Register2Bean> getRegisterData(@Field("type") int type,
                                              @Field("phnoe")String phnoe,
    @Field("code") String code, @Field("pass")String pass);


    //登录
    @POST("index.php/login/login")
    @FormUrlEncoded
  Observable<LoginBean> getLoginBeanData(@Field("name") String name,@Field("pass") String pass);


    //题库
    @GET("index.php/Shiti/ti_type_list")
    Observable<TikuBean> getTiKuBean(@Header("A-uthorization") String accout);

  //通知
    @GET("index.php/forum/notice_list")
    Observable<MyNotifyBean> getBean();

}



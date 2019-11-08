package com.example.usercwq.medicalmall.http;

import android.util.Log;

import com.example.usercwq.medicalmall.base.Constants;
import com.example.usercwq.medicalmall.utils.SystemUtil;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by usercwq on 2019/11/3.
 */

public class HttpUtils {

    private final Retrofit.Builder mRetrofitBuilder;

    private HttpUtils(){
        //获取一个OkHttpClient
        OkHttpClient mOkHttpClient = getOkHttpClient();
        //获取到一个Retrofit.Builder
        mRetrofitBuilder = getRetrofit(mOkHttpClient);
    }
    private static volatile HttpUtils instance;
    public  static HttpUtils getInstance(){
        if (instance==null){
            synchronized (HttpUtils.class){
                if (instance==null){
                    instance= new HttpUtils();
                }
            }
        }
        return instance;
    }
    private Retrofit.Builder getRetrofit(OkHttpClient okHttpClient){
        return new Retrofit.Builder()
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create());

    }
    /**
     * 固定模板
     * 创建带缓存的OkhttpClient
     * @return
     */
    private OkHttpClient getOkHttpClient() {
        //设置本地缓存文件
        File cacheFile = new File(Constants.PATH_CACHE);
        //设置缓存文件大小
        //1 M = 1024Kb = 1024 * 1024 byte
        Cache cache = new Cache(cacheFile, 1024 * 1024 * 100);
        OkHttpClient.Builder builder = new OkHttpClient.Builder().
                cache(cache)
                .addInterceptor(new MyCacheinterceptor())
                .addNetworkInterceptor(new MyCacheinterceptor())
                //设置写入时间
                .writeTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(10, TimeUnit.SECONDS)
                //设置错误重连
                .retryOnConnectionFailure(true);
        //如果是debug状态(码农调试应用),添加日志拦截器,
        // 如果是正式上线了isDebug该false,就不打印日志
        if (Constants.isDebug){
            builder.addInterceptor(new LoggingInterceptor());
        }
        return builder.build();
    }

    //创建Retrofit请求数据接口
    public synchronized  <T> T getApiserver(String baseUrl,Class<T> tClass){
        return mRetrofitBuilder.baseUrl(baseUrl).build().create(tClass);
    }

    //日志拦截器
    public class LoggingInterceptor implements Interceptor {
        private static final String TAG = "LoggingInterceptor";

        @Override
        public Response intercept(Chain chain) throws IOException {
            //拦截链对象
            Request request = chain.request();
            //Object...args ,...是可变参数,可以理解成数组
            //String.format()第一个参数是格式,后面的参数是替代参数,需要将里面的%s的位置使用
            //后面的参数给替代掉
            //"发送请求地址:"+request.url()+"%n请求头:"+request.header();
            Log.d(TAG, String.format("发送请求地址:%s%n请求头:%s",request.url(),
                    request.headers()));
            long startTime = System.currentTimeMillis();
            //递归+循环的方式把所有的拦截器串联起来,并获取响应结果
            Response response = chain.proceed(request);
            long endTime = System.currentTimeMillis();

            //这里不能直接使用response.body().string()的方式输出日志
            //因为response.body().string()之后，response中的流会被关闭，程序会报错，我们需要创建出一
            //个新的response给应用层处理
            ResponseBody responseBody = response.peekBody(1024 * 1024);

            Log.d(TAG, String.format("耗时:%s%n收到来自:%s的结果:%n%s",
                    (endTime-startTime)+"ms",response.request().url(),responseBody.string()));

            return response;
        }
    }

    /**
     * 固定模板
     */
    private class MyCacheinterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            //这里就是说判读我们的网络条件，要是有网络的话我么就直接获取网络上
            // 面的数据，要是没有网络的话我么就去缓存里面取数据
            if (!SystemUtil.isNetworkConnected()) {
                request = request
                        .newBuilder()
                        .cacheControl(CacheControl.FORCE_CACHE)
                        .build();
            }
            Response originalResponse = chain.proceed(request);
            if (SystemUtil.isNetworkConnected()) {
                int maxAge = 0;
                // 有网络时, 不缓存, 最大保存时长为0
                return originalResponse.newBuilder()
                        .removeHeader("Pragma")
                        .header("Cache-Control", "public ,max-age=" + maxAge)
                        .build();
            } else {
                //s秒
                int maxStale = 60 * 60 * 24*7;
                return originalResponse.newBuilder()
                        .removeHeader("Pragma")
                        //这里的设置的是我们的没有网络的缓存时间，
                        // 想设置多少就是多少。
                        .header("Cache-Control", "public, only-if-cached," +
                                " max-stale=" + maxStale)
                        .build();
            }

        }
    }
}

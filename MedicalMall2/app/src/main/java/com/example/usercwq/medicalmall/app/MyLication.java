package com.example.usercwq.medicalmall.app;

import android.app.Application;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;

/**
 * Created by usercwq on 2019/11/3.
 */

public class MyLication  extends Application {

    public static MyLication sContext;

    public static MyLication getBaseApp(){
        return sContext;
    }

    public static MyLication myLication;
    public  static  int widthPixels;
    public static int heightPixels;
    private static RefWatcher install;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;
        /**
         * 设置组件化的Log开关
         * 参数: boolean 默认为false，如需查看LOG设置为true
         */
        UMConfigure.setLogEnabled(true);
        install = LeakCanary.install(this);
        myLication = this;
        getWh();
        //  5dbfc4f30cafb2a066000ea4 友盟key
                // 初始化SDK
                UMConfigure.init(this, "5dbfc4f30cafb2a066000ea4", "Umeng", UMConfigure.DEVICE_TYPE_PHONE, null);
                // 选用AUTO页面采集模式
                MobclickAgent.setPageCollectionMode(MobclickAgent.PageMode.AUTO);

        PlatformConfig.setWeixin("wxdc1e388c3822c80b", "3baf1193c85774b3fd9d18447d76cab0");
        //豆瓣RENREN平台目前只能在服务器端配置
        PlatformConfig.setSinaWeibo("1362831852", "85935cbf880a087cae17d1dae401ab3d","http://sns.whalecloud.com");
        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");

        if (LeakCanary.isInAnalyzerProcess(this)) {
            //这个是在分析heap的进程中，监测进程不能和分析进程在同一个。
            return;
        }

    }
    public static Resources getRes(){
        return myLication.getResources();
    }
    /**
     *
     * 获取屏幕的宽高
     */
    private void getWh(){
        WindowManager systemService = (WindowManager) getSystemService(WINDOW_SERVICE);
        Display defaultDisplay = systemService.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        widthPixels = displayMetrics.widthPixels;
        heightPixels = displayMetrics.heightPixels;


    }
    public static RefWatcher getRefWatcher() {
        return install;
    }
}

package com.example.usercwq.medicalmall.app;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

import com.example.usercwq.medicalmall.db.DaoMaster;
import com.example.usercwq.medicalmall.db.DaoSession;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

/**
 * Created by usercwq on 2019/11/3.
 */

public class MyLication  extends Application {

    public static MyLication sContext;
    public static String mAccess_token;
    public JCVideoPlayerStandard VideoPlaying;

    private DaoMaster.DevOpenHelper mHelper;
    private DaoMaster mDaoMaster;
    private DaoSession mDaoSession;

    public static MyLication getInstance(){
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
        setDatabase();

        SharedPreferences data = getSharedPreferences("data", MODE_PRIVATE);
        mAccess_token = data.getString("access_token", "000");

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
    /**
     * 设置greenDao
     */
    private void setDatabase() {
        //通过DaoMaster内部类DevOpenHelper可以获取一个SQLiteOpenHelper 对象
        // 可能你已经注意到了，你并不需要去编写「CREATE TABLE」这样的 SQL 语句，因为 greenDAO 已经帮你做了。
        // 注意：默认的 DaoMaster.DevOpenHelper 会在数据库升级时，删除所有的表，意味着这将导致数据的丢失。
        // 所以，在正式的项目中，你还应该做一层封装，来实现数据库的安全升级。
        // 此处MyDb表示数据库名称 可以任意填写
        mHelper = new DaoMaster.DevOpenHelper(this, "MyDb", null);    // MyDb是数据库的名字，更具自己的情况修改
        SQLiteDatabase db = mHelper.getWritableDatabase();
        mDaoMaster = new DaoMaster(db);
        mDaoSession = mDaoMaster.newSession();
    }

    public DaoSession getDaoSession(){
        return mDaoSession;
    }

    /*设置全局的下拉刷新样式*/
//    static {
//        SmartRefreshLayout.setDefaultRefreshHeaderCreator(new DefaultRefreshHeaderCreator() {
//            @NonNull
//            @Override
//            public RefreshHeader createRefreshHeader(@NonNull Context context, @NonNull RefreshLayout layout) {
//
//                return new MyRefreshLottieHeader(sContext);
//            }
//        });
//    }



    public static MyLication getContext(){
        return MyLication.getContext();
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

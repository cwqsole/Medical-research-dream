package com.example.usercwq.medicalmall.base;

import android.os.Environment;

import com.example.usercwq.medicalmall.app.MyLication;

import java.io.File;

/**
 * Created by asus on 2019/3/5.
 */

public interface Constants {
    //是否为debug状态,正式上线版本需要改为false
    boolean isDebug = true;


    String PATH_SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath() +
            File.separator + "codeest" + File.separator + "GeekNews";

    String FILE_PROVIDER_AUTHORITY="com.baidu.geek.fileprovider";

    //网络缓存的地址
    String PATH_DATA = MyLication.myLication.getCacheDir().getAbsolutePath() +
            File.separator + "data";

    String PATH_CACHE = PATH_DATA + "/NetCache";
    String DATA = "data";


    String TOKEN = "token";
    String DESC = "description";
    String USERNAME = "userName";
    String GENDER = "gender";
    String EMAIL = "email";
    String PHOTO = "photo";
    String PHONE = "phone";
    String TYPE = "type";
    String VERIFY_CODE = "verifyCode";
    String MODE = "day_night_mode";
    String CURRENT_FRAG_TYPE = "current_frag_type";
}

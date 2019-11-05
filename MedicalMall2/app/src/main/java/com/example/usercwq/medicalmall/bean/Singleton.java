package com.example.usercwq.medicalmall.bean;

import android.content.Context;

public class Singleton {
    private static Singleton singleton;
    private Context context;
    private Singleton(Context context) {
        this.context = context;
    }

    public static Singleton newInstance(Context context) {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null){//双重检查锁定
                    singleton = new Singleton(context);
                }
            }
        }
        return singleton;
    }
}

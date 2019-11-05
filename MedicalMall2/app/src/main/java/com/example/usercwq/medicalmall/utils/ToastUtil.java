package com.example.usercwq.medicalmall.utils;

import android.widget.Toast;

import com.example.usercwq.medicalmall.app.MyLication;

/**
 * @author xts
 *         Created by asus on 2019/8/27.
 */

public class ToastUtil {
    public static void showShort(String msg){
        Toast.makeText(MyLication.myLication,msg,Toast.LENGTH_SHORT).show();
    }
    public static void showLong(String msg){
        Toast.makeText(MyLication.myLication,msg,Toast.LENGTH_LONG).show();
    }
}

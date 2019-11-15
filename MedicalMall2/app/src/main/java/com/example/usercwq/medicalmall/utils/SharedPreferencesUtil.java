package com.example.usercwq.medicalmall.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 类说明 SharedPreferences封装类
 * 1、用户id 字段 uId String类型
 * 2、 是否登陆 字段 isLogin boolean类型
 * 2.5 用户手机号，账号 phone String类型
 * 3、用户昵称 nickName String类型
 * 用户密码 pass String类型
 * 4、用户头像 userIcon String类型
 * 5 userType 0校长，1班主任，2任课老师，3学生
 * 6 boolean isFirst 是否第一次安装显示欢迎页
 * 7 boolean isFirstVideo  是否播放宣传视频
 */

public class SharedPreferencesUtil {

    public static String NAME = "LoanThrough";

    /**
     * @param mContext 上下文，来区别哪一个activity调用的
     *                 <p>
     *                 使用的SharedPreferences的名字
     * @param field    SharedPreferences的哪一个字段
     * @return
     */

    // 取出whichSp中field字段对应的string类型的值
    public static String getSharePreStr(Context mContext,
                                        String field) {
        SharedPreferences sp = mContext
                .getSharedPreferences(NAME, 0);
        String s = sp.getString(field, "");// 如果该字段没对应值，则取出字符串“”
        return s;
    }

    // 取出whichSp中field字段对应的int类型的值
    public static int getSharePreInt(Context mContext,
                                     String field) {
        SharedPreferences sp = mContext
                .getSharedPreferences(NAME, 0);
        int i = sp.getInt(field, 0);// 如果该字段没对应值，则取出0
        return i;
    }

    // 取出whichSp中field字段对应的boolean类型的值
    public static boolean getSharePreBoolean(Context mContext,
                                             String field) {
        SharedPreferences sp = mContext
                .getSharedPreferences(NAME, 0);
        boolean b = sp.getBoolean(field, false);// 如果该字段没对应值，则取出false
        return b;
    }

    // 保存string类型的value到whichSp中的field字段
    public static void putSharePre(Context mContext,
                                   String field, String value) {
        SharedPreferences sp = mContext
                .getSharedPreferences(NAME, 0);
        sp.edit().putString(field, value).commit();
    }

    // 保存int类型的value到whichSp中的field字段
    public static void putSharePre(Context mContext,
                                   String field, int value) {
        SharedPreferences sp = mContext
                .getSharedPreferences(NAME, 0);
        sp.edit().putInt(field, value).commit();
    }

    // 保存booble类型的value到whichSp中的field字段
    public static void putSharePre(Context mContext,
                                   String field, Boolean value) {
        SharedPreferences sp = mContext
                .getSharedPreferences(NAME, 0);
        sp.edit().putBoolean(field, value).commit();
    }

}

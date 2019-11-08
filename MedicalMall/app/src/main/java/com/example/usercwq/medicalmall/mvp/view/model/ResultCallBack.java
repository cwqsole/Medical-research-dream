package com.example.usercwq.medicalmall.mvp.view.model;

/**
 * Created by usercwq on 2019/11/1.
 */

public interface ResultCallBack<T> {
    void onSussecc(T data);
    void onFiled(String error);
}

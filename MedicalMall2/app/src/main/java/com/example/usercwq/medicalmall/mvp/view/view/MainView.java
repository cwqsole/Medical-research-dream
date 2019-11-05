package com.example.usercwq.medicalmall.mvp.view.view;

import com.example.usercwq.medicalmall.base.BaseView;
import com.example.usercwq.medicalmall.bean.MainBean;

/**
 * Created by usercwq on 2019/11/1.
 */

public interface MainView extends BaseView {
    void setData(MainBean data);

    void showToast(String error);
}

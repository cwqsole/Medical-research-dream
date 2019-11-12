package com.example.usercwq.medicalmall.mvp.view.view;

import com.example.usercwq.medicalmall.base.BaseView;
import com.example.usercwq.medicalmall.bean.tiku_bean.TiKuRclvBean;

public interface TabView extends BaseView {
    void setData(TiKuRclvBean data);

    void showToast(String error);

}

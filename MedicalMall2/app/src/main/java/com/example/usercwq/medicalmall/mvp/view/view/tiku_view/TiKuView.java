package com.example.usercwq.medicalmall.mvp.view.view.tiku_view;

import com.example.usercwq.medicalmall.base.BaseView;
import com.example.usercwq.medicalmall.bean.tiku_bean.TikuBean;

public interface TiKuView extends BaseView {
    void setData(TikuBean tikuBean);

    void showToast(String error);

}

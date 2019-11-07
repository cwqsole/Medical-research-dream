package com.example.usercwq.medicalmall.mvp.view.view.forum_view;

import com.example.usercwq.medicalmall.base.BaseView;
import com.example.usercwq.medicalmall.net.ForumTabBean;

public interface ForumView extends BaseView {
    void setData(ForumTabBean dataBeans);

    void showToast(String error);
}

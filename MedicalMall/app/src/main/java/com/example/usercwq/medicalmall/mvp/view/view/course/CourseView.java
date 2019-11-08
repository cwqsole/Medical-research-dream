package com.example.usercwq.medicalmall.mvp.view.view.course;

import com.example.usercwq.medicalmall.base.BaseView;
import com.example.usercwq.medicalmall.bean.CourselvBean;

public interface CourseView extends BaseView {
    void getData(CourselvBean courselvBean);
    void showToast(String string);
}

package com.example.usercwq.medicalmall.mvp.view.view.courseview;

import com.example.usercwq.medicalmall.base.BaseView;
import com.example.usercwq.medicalmall.bean.course.CourseBean;

public interface CoureView extends BaseView {
    void getCourse(CourseBean courseBean);
    void showToast(String str);
}

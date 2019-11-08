package com.example.usercwq.medicalmall.mvp.view.presenter.course;

import com.example.usercwq.medicalmall.base.BasePresenter;
import com.example.usercwq.medicalmall.bean.CourselvBean;
import com.example.usercwq.medicalmall.mvp.view.model.ResultCallBack;
import com.example.usercwq.medicalmall.mvp.view.model.course.CourseModel;
import com.example.usercwq.medicalmall.mvp.view.view.course.CourseView;

public class CoursePresenter extends BasePresenter<CourseView> {

    private CourseModel courseModel;

    @Override
    protected void initModel() {
        courseModel = new CourseModel();
    }

    public void getData() {
        courseModel.getData(new ResultCallBack<CourselvBean>() {
            @Override
            public void onSussecc(CourselvBean data) {
                mView.getData(data);
            }

            @Override
            public void onFiled(String error) {
                mView.showToast(error);
            }
        });
    }
}

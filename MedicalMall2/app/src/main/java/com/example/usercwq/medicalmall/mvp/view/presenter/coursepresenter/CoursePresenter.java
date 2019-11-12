package com.example.usercwq.medicalmall.mvp.view.presenter.coursepresenter;

import com.example.usercwq.medicalmall.base.BasePresenter;
import com.example.usercwq.medicalmall.bean.course.CourseBean;
import com.example.usercwq.medicalmall.mvp.view.model.ResultCallBack;
import com.example.usercwq.medicalmall.mvp.view.model.course_model.CourseModel;
import com.example.usercwq.medicalmall.mvp.view.view.courseview.CoureView;

public class CoursePresenter extends BasePresenter<CoureView> {

    private CourseModel courseModel;

    @Override
    protected void initModel() {
        courseModel = new CourseModel();
    }

    public void getCourse() {
        courseModel.getCourseData(new ResultCallBack<CourseBean>() {
            @Override
            public void onSussecc(CourseBean data) {
                mView.getCourse(data);
            }

            @Override
            public void onFiled(String error) {
                mView.showToast(error);
            }
        });
    }
}

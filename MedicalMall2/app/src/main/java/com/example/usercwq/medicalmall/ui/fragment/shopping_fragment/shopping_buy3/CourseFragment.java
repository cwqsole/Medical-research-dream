package com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_buy3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.mvp.view.presenter.SuoPresenter;
import com.example.usercwq.medicalmall.mvp.view.presenter.shopping_presenter.CoursePresenter;
import com.example.usercwq.medicalmall.mvp.view.view.SuoView;
import com.example.usercwq.medicalmall.mvp.view.view.shopping_view.CourseView;
import com.example.usercwq.medicalmall.ui.fragment.BaseFragment;

public class CourseFragment extends BaseFragment<CoursePresenter, CourseView> {


    @Override
    protected CoursePresenter initPresenrer() {
        return new CoursePresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_course;
    }
}

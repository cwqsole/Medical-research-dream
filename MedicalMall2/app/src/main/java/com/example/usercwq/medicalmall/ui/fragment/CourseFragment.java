package com.example.usercwq.medicalmall.ui.fragment;

import android.os.Bundle;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.mvp.view.presenter.SuoPresenter;
import com.example.usercwq.medicalmall.mvp.view.view.SuoView;

/**
 * Created by usercwq on 2019/11/5.
 */

public class CourseFragment extends BaseFragment<SuoPresenter,SuoView> {
    public static CourseFragment getInstener(){
        CourseFragment tiKuFragment = new CourseFragment();
        Bundle bundle=new Bundle();
        tiKuFragment.setArguments(bundle);
        return tiKuFragment;
    }
    @Override
    protected SuoPresenter initPresenrer() {
        return new SuoPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_course;
    }
}

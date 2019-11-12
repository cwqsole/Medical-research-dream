package com.example.usercwq.medicalmall.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.course.CourseBean;
import com.example.usercwq.medicalmall.mvp.view.presenter.coursepresenter.CoursePresenter;
import com.example.usercwq.medicalmall.mvp.view.view.courseview.CoureView;
import com.example.usercwq.medicalmall.ui.adapters.course.CourseRlvAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by usercwq on 2019/11/5.
 */

public class CourseFragment extends BaseFragment<CoursePresenter, CoureView> implements CoureView {
    @BindView(R.id.course_rlv)
    RecyclerView mCourseRlv;
    private View view;
    private Unbinder unbinder;
    private CourseBean courseBean;
    private List<CourseBean.InfoBean.GongGaoBean> gong_gao;
    private List<CourseBean.InfoBean.KechengBean> kecheng;
    private List<CourseBean.InfoBean.LunboBean> lunbo;

    public static CourseFragment getInstener() {
        CourseFragment tiKuFragment = new CourseFragment();
        Bundle bundle = new Bundle();
        tiKuFragment.setArguments(bundle);
        return tiKuFragment;
    }

    @Override
    protected CoursePresenter initPresenrer() {
        return new CoursePresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_course;
    }

    @Override
    public void initView() {
        super.initView();
        mCourseRlv.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    @Override
    public void initData() {
        super.initData();
        mPresenter.getCourse();
    }

    @OnClick(R.id.course_rlv)
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.course_rlv:
                break;
        }
    }

    @Override
    public void getCourse(CourseBean courseBean) {
        gong_gao = courseBean.getInfo().getGong_gao();
        kecheng = courseBean.getInfo().getKecheng();
        lunbo = courseBean.getInfo().getLunbo();
        CourseRlvAdapter courseRlvAdapter = new CourseRlvAdapter(getActivity(), gong_gao, kecheng, lunbo);
        mCourseRlv.setAdapter(courseRlvAdapter);
    }

    @Override
    public void showToast(String str) {
        Toast.makeText(getActivity(), ""+str, Toast.LENGTH_SHORT).show();
    }
}

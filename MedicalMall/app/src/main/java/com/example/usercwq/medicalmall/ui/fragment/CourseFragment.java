package com.example.usercwq.medicalmall.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.CourselvBean;
import com.example.usercwq.medicalmall.mvp.view.presenter.course.CoursePresenter;
import com.example.usercwq.medicalmall.mvp.view.view.course.CourseView;
import com.example.usercwq.medicalmall.ui.adapters.course.Course_RlvAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by usercwq on 2019/11/5.
 */
//课程界面
public class CourseFragment extends BaseFragment<CoursePresenter, CourseView> implements CourseView {
    @BindView(R.id.course_rlv)
    RecyclerView mCourseRlv;
    private View view;
    private Unbinder unbinder;
    private List<CourselvBean.InfoBean.GongGaoBean> gong_gao;
    private List<CourselvBean.InfoBean.KechengBean> kecheng;
    private List<CourselvBean.InfoBean.LunboBean> lunbo;

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
        mCourseRlv.setLayoutManager(new LinearLayoutManager(getContext()));

    }

    @Override
    public void initData() {
        super.initData();

        mPresenter.getData();

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
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
    public void getData(CourselvBean courselvBean) {
        gong_gao = courselvBean.getInfo().getGong_gao();
        kecheng = courselvBean.getInfo().getKecheng();
        lunbo = courselvBean.getInfo().getLunbo();
        Course_RlvAdapter course_rlvAdapter = new Course_RlvAdapter(getActivity(), gong_gao, kecheng, lunbo);
        mCourseRlv.setAdapter(course_rlvAdapter);
    }

    @Override
    public void showToast(String string) {
        Toast.makeText(getContext(), ""+string, Toast.LENGTH_SHORT).show();
    }
}

package com.example.usercwq.medicalmall.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.tiku_bean.Bean;
import com.example.usercwq.medicalmall.bean.tiku_bean.TiKuRclvBean;
import com.example.usercwq.medicalmall.bean.tiku_bean.TikuBean;
import com.example.usercwq.medicalmall.mvp.view.presenter.TabPresenter;
import com.example.usercwq.medicalmall.mvp.view.view.TabView;
import com.example.usercwq.medicalmall.ui.adapters.tikuAdapter.TiKuApdater;
import com.example.usercwq.medicalmall.ui.adapters.tikuAdapter.TiKuRclvApdater;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class TabFragment extends BaseFragment<TabPresenter, TabView> implements TabView {
    @BindView(R.id.rclv)
    RecyclerView rclv;
    @Override
    protected TabPresenter initPresenrer() {

        return new TabPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_tab;
    }

    @Override
    public void initView() {
        rclv.setLayoutManager(new LinearLayoutManager(getContext()));
        TiKuRclvApdater tabFragment = new TiKuRclvApdater((ArrayList<TikuBean.InfoBean.UTypeBean.ZTypeBean>) u_type,getContext());
        rclv.setAdapter(tabFragment);

    }

    @Override
    public void initData() {
    }


    @Override
    public void setData(TiKuRclvBean data) {

    }

    @Override
    public void showToast(String error) {

    }
    private String id;
    private   List<TikuBean.InfoBean.UTypeBean.ZTypeBean> u_type;
    public void setlist_id(Bean bean) {
        String id = bean.getId();
        List<TikuBean.InfoBean.UTypeBean.ZTypeBean> u_type = bean.getU_type();
        this.id=id;
        this.u_type=u_type;

    }
}

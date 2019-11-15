package com.example.usercwq.medicalmall.ui.acticitys_my;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.base.BaseActivity;
import com.example.usercwq.medicalmall.bean.my_bean.MyNotifyBean;
import com.example.usercwq.medicalmall.mvp.view.presenter.my_presenter.NotifyPresenter;
import com.example.usercwq.medicalmall.mvp.view.view.my_view.NotifyView;
import com.example.usercwq.medicalmall.ui.adapters.my_adapters.MyNotifyAdapter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

public class NotifyActivity extends BaseActivity<NotifyPresenter, NotifyView> implements NotifyView {

    @BindView(R.id.back_notify)
    ImageView mBackNotify;
    @BindView(R.id.back)
    RelativeLayout mBack;
    @BindView(R.id.rlv_notify)
    RecyclerView mRlvNotify;
    @BindView(R.id.smart_notify)
    SmartRefreshLayout mSmartNotify;
    private ArrayList<MyNotifyBean.InfoBean> mList = new ArrayList<>();
    private MyNotifyAdapter mAdapter;

    @Override
    protected NotifyPresenter initPresenter() {
        return new NotifyPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_notify;
    }

    @Override
    public void initData() {
        mPresenter.getData();
    }

    @Override
    public void initView() {
        mRlvNotify.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new MyNotifyAdapter(this, mList);
        mRlvNotify.setAdapter(mAdapter);

        mAdapter.setMyOnclick(new MyNotifyAdapter.MyOnclick() {
            @Override
            public Void onClick(int position) {
                Intent intent = new Intent(NotifyActivity.this, NotifyDateilActivity.class);
                intent.putExtra("notify",mList);
                startActivity(intent);

                return null;
            }
        });
    }

    @OnClick(R.id.back)
    public void onViewClicked() {
        finish();
    }

    @Override
    public void setData(MyNotifyBean data) {
        mList.addAll(data.getInfo());
        Log.i("tag", "onBindViewHolder: "+mList.size());
        mAdapter.notifyDataSetChanged();
    }
}

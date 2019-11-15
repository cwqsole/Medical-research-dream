package com.example.usercwq.medicalmall.ui.acticitys_my;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.my_bean.MyNotifyBean;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NotifyDateilActivity extends AppCompatActivity {

    @BindView(R.id.back)
    RelativeLayout mBack;
    @BindView(R.id.title_notify)
    TextView mTitleNotify;
    @BindView(R.id.time_notify)
    TextView mTimeNotify;
    @BindView(R.id.msg_notify)
    TextView mMsgNotify;
    @BindView(R.id.ads_notify)
    TextView mAdsNotify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify_dateil);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        Intent intent = getIntent();
        ArrayList<MyNotifyBean.InfoBean> notify = (ArrayList<MyNotifyBean.InfoBean>) intent.getSerializableExtra("notify");
        mTitleNotify.setText(notify.get(0).getTitle());
        mTimeNotify.setText("时间："+notify.get(0).getAddtime()+"    "+"作者："+notify.get(0).getAuthName());
        String content = notify.get(0).getContent();
        String[] split = content.split(";");
        mMsgNotify.setText(split[0]);
        mAdsNotify.setText(split[1]);
    }

    @OnClick(R.id.back)
    public void onViewClicked() {
        finish();
    }
}

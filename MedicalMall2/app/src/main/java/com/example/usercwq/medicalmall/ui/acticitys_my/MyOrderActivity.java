package com.example.usercwq.medicalmall.ui.acticitys_my;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyOrderActivity extends AppCompatActivity {

    @BindView(R.id.rlv_order)
    RecyclerView mRlvOrder;
    @BindView(R.id.title)
    TextView mTitle;
    @BindView(R.id.back)
    RelativeLayout mBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        mTitle.setText("我的订单");
    }

    @OnClick(R.id.back)
    public void onViewClicked() {
        finish();
    }
}

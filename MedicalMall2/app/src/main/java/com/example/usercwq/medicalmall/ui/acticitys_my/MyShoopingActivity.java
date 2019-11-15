package com.example.usercwq.medicalmall.ui.acticitys_my;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyShoopingActivity extends AppCompatActivity {

    @BindView(R.id.title)
    TextView mTitle;
    @BindView(R.id.set)
    TextView mSet;
    @BindView(R.id.back)
    RelativeLayout mBack;
    @BindView(R.id.rlv_shooping)
    RecyclerView mRlvShooping;
    @BindView(R.id.all_shooping)
    RadioButton mAllShooping;
    @BindView(R.id.price_shooping)
    TextView mPriceShooping;
    @BindView(R.id.pay_shooping)
    Button mPayShooping;
    @BindView(R.id.bottom_shooping)
    LinearLayout mBottomShooping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_shooping);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        mTitle.setText("购物车");
        mSet.setVisibility(View.VISIBLE);
    }

    @OnClick({R.id.set, R.id.back, R.id.all_shooping, R.id.price_shooping, R.id.pay_shooping})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.set:

                break;
            case R.id.back:
                finish();
                break;
            case R.id.all_shooping:
                break;
            case R.id.price_shooping:
                break;
            case R.id.pay_shooping:
                break;
        }
    }
}

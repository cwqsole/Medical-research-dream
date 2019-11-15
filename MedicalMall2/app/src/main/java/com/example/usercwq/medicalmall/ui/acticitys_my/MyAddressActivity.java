package com.example.usercwq.medicalmall.ui.acticitys_my;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyAddressActivity extends AppCompatActivity {

    @BindView(R.id.title)
    TextView mTitle;
    @BindView(R.id.back)
    RelativeLayout mBack;
    @BindView(R.id.rlv_address)
    RecyclerView mRlvAddress;
    @BindView(R.id.btn_address)
    Button mBtnAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_address);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        mTitle.setText("管理收获地址");
    }

    @OnClick({R.id.back, R.id.btn_address})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.btn_address:
                getaddress();
                break;
        }
    }

    private void getaddress() {
        Intent intent = new Intent(this, MyAddressActivity.class);
        startActivity(intent);
    }
}

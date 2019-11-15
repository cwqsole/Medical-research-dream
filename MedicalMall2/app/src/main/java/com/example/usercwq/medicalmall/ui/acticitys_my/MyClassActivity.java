package com.example.usercwq.medicalmall.ui.acticitys_my;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyClassActivity extends AppCompatActivity {

    @BindView(R.id.back)
    RelativeLayout mBack;
    @BindView(R.id.title)
    TextView mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_class);
        ButterKnife.bind(this);
        mTitle.setText("我的课程");

    }

    @OnClick(R.id.back)
    public void onViewClicked() {
        finish();
    }
}

package com.example.usercwq.medicalmall.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DaKaActivity extends AppCompatActivity {

    @BindView(R.id.iv_img)
    ImageView ivImg;
    @BindView(R.id.tv_tui)
    TextView tvTui;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.calendarView)
    MaterialCalendarView calendarView;
    @BindView(R.id.tv_ok)
    TextView tvOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_da_ka);
        ButterKnife.bind(this);


        initView();
    }

    private void initView() {

    }


    @OnClick({R.id.iv_img, R.id.tv_tui, R.id.toolbar, R.id.calendarView, R.id.tv_ok})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_img:
                finish();
                break;
            case R.id.tv_tui:
                finish();
                break;
            case R.id.toolbar:

                break;
            case R.id.calendarView:

                break;
            case R.id.tv_ok:
                finish();
                break;
        }
    }
}

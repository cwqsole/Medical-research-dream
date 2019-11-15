package com.example.usercwq.medicalmall.ui.acticitys_my;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.ui.main.MainActivity;

import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LeadActivity extends AppCompatActivity {

    int time = 2;

    Handler mHandler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            if (msg.what == 1){
                mTimeLead.setText(time+"s跳过");

                if(time == 0){
                    startActivity(new Intent(LeadActivity.this, MainActivity.class));
                    mTimerTask.cancel();
                }else {
                    time--;
                }
            }

            return false;
        }
    });
    @BindView(R.id.time_lead)
    Button mTimeLead;
    private TimerTask mTimerTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lead);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        Timer timer = new Timer();
        mTimerTask = new TimerTask() {
            @Override
            public void run() {
                mHandler.sendEmptyMessage(1);
            }
        };
        timer.schedule(mTimerTask,1000,1000);
    }

    @OnClick(R.id.time_lead)
    public void onViewClicked() {
        startActivity(new Intent(LeadActivity.this, MainActivity.class));
        mTimerTask.cancel();
    }
}

package com.example.usercwq.medicalmall.ui.acticitys_my;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.ui.adapters.my_adapters.MyPopupAdapter;
import com.example.usercwq.medicalmall.utils.ToastUtil;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MySchoolActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.back)
    RelativeLayout mBack;
    @BindView(R.id.time_select)
    TextView mTimeSelect;
    @BindView(R.id.school_select)
    TextView mSchoolSelect;
    @BindView(R.id.btn_select)
    Button mBtnSelect;
    @BindView(R.id.title)
    TextView mTitle;
    private View mView;
    private PopupWindow mPopupWindow;
    private int TYPE_TIME = 0;
    private int TYPE_SCHOOL = 1;
    private ArrayList<String> mSchools = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = LayoutInflater.from(this).inflate(R.layout.activity_my_school, null);
        setContentView(mView);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        mTitle.setText("完善信息");
        mSchools.add("北京大学");
        mSchools.add("清华大学");
        mSchools.add("南开大学");
        mSchools.add("北京协和医学院");
        mSchools.add("首都医科大学");
        mSchools.add("解放军医学院");
        mSchools.add("天津医科大学");
        mSchools.add("武警后勤学院");
        mSchools.add("河北大学");
        mSchools.add("河北工程大学");
        mSchools.add("河北理工大学");
    }

    @OnClick({R.id.back, R.id.time_select, R.id.school_select, R.id.btn_select})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.time_select:
                getMsg(TYPE_TIME);
                break;
            case R.id.school_select:
                getMsg(TYPE_SCHOOL);
                break;
            case R.id.btn_select:
                String time = mTimeSelect.getText().toString();
                String school = mSchoolSelect.getText().toString();
                if (!time.equals("我要报考的时间")){
                    if (!school.equals("我要报考的院校")){
                         ToastUtil.showShort("成功");
                         finish();
                    }else {
                        ToastUtil.showShort("请选择你要报考的院校");
                    }
                }else {
                    ToastUtil.showShort("请选择你要报考的时间");
                }
                break;
        }
    }

    private void getMsg(int type) {
        if(type == 0){
            View view = LayoutInflater.from(this).inflate(R.layout.item_popup, null);
            mPopupWindow = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, 800);

            ImageView close = view.findViewById(R.id.btn_popup);
            close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mPopupWindow.dismiss();
                }
            });

            TextView time1 = view.findViewById(R.id.time1_popup);
            time1.setOnClickListener(this);
            TextView time2 = view.findViewById(R.id.time2_popup);
            time2.setOnClickListener(this);
            TextView time3 = view.findViewById(R.id.time3_popup);
            time3.setOnClickListener(this);
            TextView time4 = view.findViewById(R.id.time4_popup);
            time4.setOnClickListener(this);
        }else {
            View view = LayoutInflater.from(this).inflate(R.layout.item_popup_school, null);
            mPopupWindow = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, 1000);

            ImageView close = view.findViewById(R.id.btn_popup);
            close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mPopupWindow.dismiss();
                }
            });

            RecyclerView rec = view.findViewById(R.id.rlv_popup);
            rec.setLayoutManager(new LinearLayoutManager(this));
            MyPopupAdapter myPopupAdapter = new MyPopupAdapter(this, mSchools);
            rec.setAdapter(myPopupAdapter);

            myPopupAdapter.setMyOnclick(new MyPopupAdapter.MyOnclick() {
                @Override
                public void Onclick(int position) {
                    mSchoolSelect.setText(mSchools.get(position));
                    mPopupWindow.dismiss();
                }
            });
        }

        mPopupWindow.setBackgroundDrawable(new ColorDrawable());
//2.设点击外部弹窗消失
        mPopupWindow.setOutsideTouchable(true);

        mPopupWindow.setAnimationStyle(R.style.dialogSlideAnim);

        mPopupWindow.showAtLocation(mView, Gravity.BOTTOM,0,0);

//设置阴影效果---点击弹窗设置一个阴影度
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.alpha = 0.3f;
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        getWindow().setAttributes(params);
//弹框消失阴影消失----弹窗消失后把阴影恢复正常
        mPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                WindowManager.LayoutParams params = getWindow().getAttributes();
                params.alpha = 1.0f;
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
                getWindow().setAttributes(params);
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.time1_popup:
                mTimeSelect.setText("2019");
                mPopupWindow.dismiss();
                break;
            case R.id.time2_popup:
                mTimeSelect.setText("2020");
                mPopupWindow.dismiss();
                break;
            case R.id.time3_popup:
                mTimeSelect.setText("2021");
                mPopupWindow.dismiss();
                break;
            case R.id.time4_popup:
                mTimeSelect.setText("2022");
                mPopupWindow.dismiss();
                break;
        }
    }
}

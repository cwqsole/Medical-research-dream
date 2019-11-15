package com.example.usercwq.medicalmall.ui.acticitys_my;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MySelfActivity extends AppCompatActivity {

    @BindView(R.id.name_self)
    RelativeLayout mNameSelf;
    @BindView(R.id.sex_self)
    RelativeLayout mSexSelf;
    @BindView(R.id.phone_self)
    RelativeLayout mPhoneSelf;
    @BindView(R.id.pass_self)
    RelativeLayout mPassSelf;
    @BindView(R.id.time_self)
    RelativeLayout mTimeSelf;
    @BindView(R.id.school_self)
    RelativeLayout mSchoolSelf;
    @BindView(R.id.title)
    TextView mTitle;
    @BindView(R.id.back)
    RelativeLayout mBack;
    @BindView(R.id.name)
    TextView mName;
    @BindView(R.id.sex)
    TextView mSex;
    private ImageView mBackUpdate;
    private EditText mNameUpdate;
    private final int TYPE_NAME = 0;
    private final int TYPE_SEW = 1;
    private View mView;
    private PopupWindow mPopupWindow;
    private boolean mKg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = LayoutInflater.from(this).inflate(R.layout.activity_my_self, null);
        setContentView(mView);
        ButterKnife.bind(this);
        initView();

    }

    private void initView() {
        mTitle.setText("个人资料");
    }

    @OnClick({R.id.name_self, R.id.sex_self, R.id.pass_self, R.id.back})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.name_self:
                namepopu(TYPE_NAME);
                break;
            case R.id.sex_self:
                namepopu(TYPE_SEW);
                break;
            case R.id.pass_self:
                startActivity(new Intent(this, MyPassUpActivity.class));
                break;
            case R.id.back:
                finish();
                break;
        }
    }

    private void namepopu(int type) {
        if (type == 0){
            View view = LayoutInflater.from(this).inflate(R.layout.name_update, null);
            mPopupWindow = new PopupWindow(view, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

            mBackUpdate = view.findViewById(R.id.back_update);
            mBackUpdate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mPopupWindow.dismiss();
                }
            });
            mNameUpdate = view.findViewById(R.id.username_update);
            Button save = view.findViewById(R.id.save_update);
            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = mNameUpdate.getText().toString();
                    if (name.isEmpty()) {
                        mPopupWindow.dismiss();
                    } else {
                        mName.setText(name);
                        mPopupWindow.dismiss();
                    }
                }
            });
        }else {
            View view = LayoutInflater.from(this).inflate(R.layout.sex_update, null);
            mPopupWindow = new PopupWindow(view, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            mBackUpdate = view.findViewById(R.id.back_update);
            mBackUpdate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mPopupWindow.dismiss();
                }
            });


            mKg = false;
            RadioGroup group = view.findViewById(R.id.group);
            group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    switch (checkedId){
                        case R.id.boy:
                            mKg = false;
                            break;
                        case R.id.girl:
                            mKg = true;
                            break;
                    }
                }
            });

            Button save = view.findViewById(R.id.save_update);
            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mKg == true){
                        mSex.setText("女");
                    }else {
                        mSex.setText("男");
                    }
                    mPopupWindow.dismiss();
                }
            });
        }

        // 设置背景
        mPopupWindow.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        // 外部点击事件
        mPopupWindow.setOutsideTouchable(true);
        // 允许输入信息
        mPopupWindow.setFocusable(true);

        mPopupWindow.setAnimationStyle(R.style.DialogOutAndInStyle);

        mPopupWindow.showAtLocation(mView, Gravity.CENTER,0,0);

        mPopupWindow.setBackgroundDrawable(new BitmapDrawable());
//2.设点击外部弹窗消失
        mPopupWindow.setOutsideTouchable(true);

//设置阴影效果---点击弹窗设置一个阴影度
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.alpha = 0.5f;
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

}

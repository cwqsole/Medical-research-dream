package com.example.usercwq.medicalmall.ui.activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.iv_back)
    ImageView mIvBack;
    @BindView(R.id.tv_quick_login)
    TextView mTvQuickLogin;
    @BindView(R.id.view_quick)
    View mViewQuick;
    @BindView(R.id.tv_pass_login)
    TextView mTvPassLogin;
    @BindView(R.id.view_pass)
    View mViewPass;
    @BindView(R.id.et_quick_phone)
    EditText mEtQuickPhone;
    @BindView(R.id.et_quick_code)
    EditText mEtQuickCode;
    @BindView(R.id.tv_quick_get_code)
    TextView mTvQuickGetCode;
    @BindView(R.id.tv_submit_quick_login)
    TextView mTvSubmitQuickLogin;
    @BindView(R.id.tv_quick_register)
    TextView mTvQuickRegister;
    @BindView(R.id.ll_quick)
    LinearLayout mLlQuick;
    @BindView(R.id.et_phone)
    EditText mEtPhone;
    @BindView(R.id.et_pass)
    EditText mEtPass;
    @BindView(R.id.tv_login)
    TextView mTvLogin;
    @BindView(R.id.tv_find_pass)
    TextView mTvFindPass;
    @BindView(R.id.tv_register)
    TextView mTvRegister;
    @BindView(R.id.ll_pass)
    LinearLayout mLlPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.iv_back, R.id.tv_quick_login, R.id.view_quick, R.id.tv_pass_login, R.id.tv_quick_get_code, R.id.tv_submit_quick_login, R.id.tv_quick_register, R.id.tv_login, R.id.tv_find_pass, R.id.tv_register})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.tv_quick_login:
                mLlQuick.setVisibility(View.VISIBLE);
                mViewQuick.setVisibility(View.VISIBLE);
                mLlPass.setVisibility(View.GONE);
                mViewPass.setVisibility(View.GONE);
                break;
            case R.id.view_quick:
                break;
            case R.id.tv_pass_login:
                mLlPass.setVisibility(View.VISIBLE);
                mViewPass.setVisibility(View.VISIBLE);
                mLlQuick.setVisibility(View.GONE);
                mViewQuick.setVisibility(View.GONE);
                break;
            case R.id.tv_quick_get_code:
                break;
            case R.id.tv_submit_quick_login:
                break;
            case R.id.tv_quick_register:
                break;
            case R.id.tv_login:
                break;
            case R.id.tv_find_pass:
                break;
            case R.id.tv_register:
                break;
        }
    }
}

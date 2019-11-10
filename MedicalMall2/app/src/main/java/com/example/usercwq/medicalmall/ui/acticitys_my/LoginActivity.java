package com.example.usercwq.medicalmall.ui.acticitys_my;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.register_bean.LoginBean;
import com.example.usercwq.medicalmall.http.HttpUtils;
import com.example.usercwq.medicalmall.net.ApiService;
import com.example.usercwq.medicalmall.ui.fragment.MyFragment;
import com.example.usercwq.medicalmall.ui.main.MainActivity;
import com.example.usercwq.medicalmall.utils.AbStrUtil;
import com.example.usercwq.medicalmall.utils.RxUtils;
import com.example.usercwq.medicalmall.utils.ToastUtil;
import com.squareup.haha.perflib.Main;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

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

                String phone = AbStrUtil.etTostr(mEtPhone);
                if (TextUtils.isEmpty(phone)) {
                    Toast.makeText(this, "手机号不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                String pass = AbStrUtil.etTostr(mEtPass);
                if (TextUtils.isEmpty(pass)) {
                    Toast.makeText(this, "密码不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                submit(phone, pass);


                break;
            case R.id.tv_find_pass:


                break;
            case R.id.tv_register:
                    startActivity(new Intent(LoginActivity.this,RegisterActivity.class));

                break;
        }
    }

    private void submit(String phone, String pass) {
        ApiService apiserver = HttpUtils.getInstance().getApiserver(ApiService.Uri,
                ApiService.class);
        apiserver.getLoginBeanData(phone,pass)
                .compose(RxUtils.<LoginBean>rxObserableSchedulerHelper())
                .subscribe(new Observer<LoginBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(LoginBean loginBean) {
                        if (loginBean.getRet().equals("200")){
                        //    login = "退出登录";
                            SharedPreferences data = getSharedPreferences("data", MODE_PRIVATE);
                            SharedPreferences.Editor edit = data.edit();
                            String  access_token = loginBean.getInfo().getToken().getAccess_token();
                            String  refresh_token = loginBean.getInfo().getToken().getRefresh_token();
                            String  u_name = loginBean.getInfo().getUser_info().getU_name();
                            String  u_pic = loginBean.getInfo().getUser_info().getU_pic();
                            String  phnoe = loginBean.getInfo().getUser_info().getPhnoe();
                            String  expires = loginBean.getInfo().getToken().getExpires();
                            edit.putBoolean("islogin",true);
                            edit.putString("access_token"
                                    , access_token);
                          edit.putString("refresh_token"
                                    , refresh_token);
                            edit.putString("u_name"
                                    , u_name);
                             edit.putString("u_pic"
                                    , u_pic);
                           edit.putString("phnoe"
                                    , phnoe);
                           edit.putString("expires"
                                    , expires);
                            edit.apply();

                            Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(LoginActivity.this, MainActivity.class));
                            finish();
                        }else{
                            String mas = loginBean.getMas();
                            Toast.makeText(LoginActivity.this, mas, Toast.LENGTH_SHORT).show();
                        }


                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}

package com.example.usercwq.medicalmall.ui.acticitys_my;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.phone_bean.PhoineBean;
import com.example.usercwq.medicalmall.bean.register_bean.Register2Bean;
import com.example.usercwq.medicalmall.http.HttpUtils;
import com.example.usercwq.medicalmall.net.ApiService;
import com.example.usercwq.medicalmall.utils.RxUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class RegisterActivity extends AppCompatActivity {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.txt1)
    TextView txt1;
    @BindView(R.id.view1)
    View view1;
    @BindView(R.id.et_phone)
    EditText etPhone;
    @BindView(R.id.et_code)
    EditText etCode;
    @BindView(R.id.view2)
    View view2;
    @BindView(R.id.tv_get_code)
    TextView tvGetCode;
    @BindView(R.id.et_pass)
    EditText etPass;
    @BindView(R.id.tv_submit)
    TextView tvSubmit;
    @BindView(R.id.checkbox_register)
    CheckBox checkboxRegister;
    @BindView(R.id.tv_agreement)
    TextView tvAgreement;
    @BindView(R.id.ll_quick)
    LinearLayout llQuick;

    private String phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.iv_back, R.id.tv_title, R.id.txt1, R.id.view1, R.id.et_phone, R.id.et_code,
            R.id.view2, R.id.tv_get_code, R.id.et_pass, R.id.tv_submit, R.id.checkbox_register,
            R.id.tv_agreement, R.id.ll_quick})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.tv_title:

                break;
            case R.id.txt1:

                break;
            case R.id.view1:

                break;
            case R.id.et_phone:  //请输入手机号

                break;
            case R.id.view2:
                break;
            case R.id.tv_get_code:  //获取验证码
                phone = etPhone.getText().toString();

                    goPhone(phone);


                break;
            case R.id.tv_submit:   //快速注册
                String phone1 = etPhone.getText().toString();
                String pass=etPass.getText().toString();
                String code = etCode.getText().toString();
                submit(phone1,code,pass);

                break;
            case R.id.checkbox_register:

                break;
            case R.id.tv_agreement:


                break;
            case R.id.ll_quick:

                break;
        }
    }

    private void submit(String phone, String code, String pass) {
        ApiService apiserver = HttpUtils.getInstance().getApiserver(ApiService.Uri,
                ApiService.class);
        apiserver.getRegisterData(1,phone,code,pass)
                .compose(RxUtils.<Register2Bean>rxObserableSchedulerHelper())
                .subscribe(new Observer<Register2Bean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Register2Bean register2Bean) {
                        if (register2Bean.getRet().equals("200")){
                            Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(RegisterActivity.this, register2Bean.getMas(), Toast.LENGTH_SHORT).show();
                        }

                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(RegisterActivity.this, e.getMessage()+"register====", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private void goPhone(String phone) {
        ApiService apiserver = HttpUtils.getInstance().getApiserver(ApiService.Uri,
                ApiService.class);
        apiserver.getPhoneData(phone,"1")
                .compose(RxUtils.<PhoineBean>rxObserableSchedulerHelper())
                .subscribe(new Observer<PhoineBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(PhoineBean phoineBean) {
                        String ret = phoineBean.getRet();
                        if (ret.equals("200")){

                            Toast.makeText(RegisterActivity.this, "验证码发送成功", Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(RegisterActivity.this, phoineBean.getMas(), Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(RegisterActivity.this, e.getMessage()+"=======", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}

package com.example.usercwq.medicalmall.ui.acticitys_my;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.utils.ToastUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyPassUpActivity extends AppCompatActivity {

    @BindView(R.id.old_pass)
    EditText mOldPass;
    @BindView(R.id.new_pass)
    EditText mNewPass;
    @BindView(R.id.next_pass)
    Button mNextPass;
    @BindView(R.id.title)
    TextView mTitle;
    @BindView(R.id.back)
    RelativeLayout mBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_pass_up);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.back, R.id.next_pass})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.next_pass:
                String pass1 = mOldPass.getText().toString();
                String pass2 = mNewPass.getText().toString();
                if (pass1.isEmpty() || pass2.isEmpty()) {
                    ToastUtil.showShort("密码不能为空");
                } else {
                    if (!pass1.equals(pass2)) {
                        ToastUtil.showShort("修改成功");
                        finish();
                    } else {
                        ToastUtil.showShort("两个密码不能一样");
                    }
                }
                break;
        }
    }
}

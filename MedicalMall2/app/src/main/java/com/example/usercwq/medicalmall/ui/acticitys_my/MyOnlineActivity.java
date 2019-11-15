package com.example.usercwq.medicalmall.ui.acticitys_my;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyOnlineActivity extends AppCompatActivity {

    @BindView(R.id.web)
    WebView mWeb;
    @BindView(R.id.title)
    TextView mTitle;
    @BindView(R.id.back)
    RelativeLayout mBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_online);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        mTitle.setText("在线咨询");
        mWeb.loadUrl("http://yx.kfzmt.cn/index.php/index/meiqia_liaotian");
        mWeb.setWebViewClient(new WebViewClient());
    }

    @OnClick(R.id.back)
    public void onViewClicked() {
        finish();
    }
}

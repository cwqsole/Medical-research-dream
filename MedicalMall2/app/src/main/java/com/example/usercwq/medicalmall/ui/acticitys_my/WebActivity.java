package com.example.usercwq.medicalmall.ui.acticitys_my;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.usercwq.medicalmall.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WebActivity extends AppCompatActivity {

    @BindView(R.id.web)
    WebView mWeb;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        ButterKnife.bind(this);
        url = getIntent().getStringExtra("url");

        mWeb.loadUrl(url);
        mWeb.setWebViewClient(new WebViewClient());
    }

    @OnClick(R.id.web)
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.web:
                break;
        }
    }
}

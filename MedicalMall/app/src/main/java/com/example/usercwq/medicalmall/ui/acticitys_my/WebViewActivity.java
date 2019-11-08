package com.example.usercwq.medicalmall.ui.acticitys_my;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;

public class WebViewActivity extends AppCompatActivity implements View.OnClickListener {

    private WebView mWeb;
    private String url;
    private ImageView mImg;
    /**
     * 返回
     */
    private TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        Intent intent = getIntent();
        url = intent.getStringExtra("url");
        initView();
    }

    private void initView() {
        mWeb = (WebView) findViewById(R.id.web);
        mWeb.loadUrl(url);
        mWeb.setWebViewClient(new WebViewClient());
        mImg = (ImageView) findViewById(R.id.img);
        mImg.setOnClickListener(this);
        mTv = (TextView) findViewById(R.id.tv);
        mTv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.img:
                finish();
                break;
            case R.id.tv:
                finish();
                break;
        }
    }
}

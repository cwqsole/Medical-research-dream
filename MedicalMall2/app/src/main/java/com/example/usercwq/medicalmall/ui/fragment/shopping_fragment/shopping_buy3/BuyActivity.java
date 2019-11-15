package com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_buy3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.shopping_bean.Adress;
import com.example.usercwq.medicalmall.bean.shopping_bean.GatherBean;
import com.example.usercwq.medicalmall.bean.shopping_bean.WholeBean;
import com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.MyApterBuy;
import com.umeng.commonsdk.debug.E;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;

public class BuyActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mImageBack;
    private TextView mTvTitle;
    private ImageView mImageRight;
    private TextView mName;
    private RecyclerView mRecyclerView;
    private TextView mTxtPeisong;
    private TextView mTxt2;
    private EditText mEtContent;
    private TextView mTvShuliang;
    private TextView mTxt3;
    private TextView mTvTotal;
    private TextView mTvTotalMoney;
    private TextView mTvSubmitOrder;
    private TextView mPhone;
    private TextView mSite;
    private RelativeLayout mViewById;
    private String mName1;
    private String mPhone1;
    private String mAddress;
    private String mDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        EventBus.getDefault().register(this);
        //立即购买页面
        initview(); //初始化布局
        intivises();

    }

    private void intivises() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
    //接收数据
    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void getMog2(GatherBean gatherBean) {
        if (gatherBean != null) {
            String name = gatherBean.getName();
            String yuanPrice = gatherBean.getYuanPrice();
            String price = gatherBean.getPrice();
            Log.i("TAG", "getMog: 名字："+name+"价格:"+yuanPrice+"图片"+price);
            MyApterBuy myApterBuy = new MyApterBuy(name, yuanPrice, price, this);
            mRecyclerView.setAdapter(myApterBuy);

        }

    }
    //使用功能

    private void initview() {
        mImageBack = findViewById(R.id.image_back);
        mImageBack.setOnClickListener(this);
        mTvTitle = findViewById(R.id.tv_title);
        mImageRight = findViewById(R.id.image_right);
        mRecyclerView = findViewById(R.id.recyclerView);
        mTxtPeisong = findViewById(R.id.txt_peisong);
        mTxt2 = findViewById(R.id.txt2);
        mEtContent = findViewById(R.id.et_content);
        mTvShuliang = findViewById(R.id.tv_shuliang);
        mTxt3 = findViewById(R.id.txt3);
        mTvTotal = findViewById(R.id.tv_total);
        mTvTotalMoney = findViewById(R.id.tv_total_money);
        mTvSubmitOrder = findViewById(R.id.tv_submit_order);
        // 整个布局
        mViewById = findViewById(R.id.re3);
        mViewById.setOnClickListener(this);
        //名字
        mName = findViewById(R.id.name);
        //手机号
        mPhone = findViewById(R.id.phone);
        //地址

    }
    //接收数据
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void getMog(Adress adress) {
        mName1 = adress.getName();
        mPhone1 = adress.getPhone();
        mAddress = adress.getAddress();
        mDetails = adress.getDetails();
        mSite = findViewById(R.id.site);
        mName.setText("收件人"+mName1);
        mPhone.setText(mPhone1);
        mSite.setText(mAddress+""+mDetails);
        Log.i("getMog","====="+adress.getPhone());


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.image_back:  //回退
                finish();
                break;
            case R.id.re3:  //跳转到  添加页面
                Intent intent = new Intent(this, SiteActivity.class);
                startActivity(intent);
                break;
        }
    }

}

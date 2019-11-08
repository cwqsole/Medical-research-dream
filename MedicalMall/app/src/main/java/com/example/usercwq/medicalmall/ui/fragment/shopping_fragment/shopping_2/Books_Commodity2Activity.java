package com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.shopping_bean.WholeBean;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class Books_Commodity2Activity extends AppCompatActivity implements View.OnClickListener {


    private WholeBean.InfoBean mInfoBean;
    private TextView mImageBack;
    private TextView mTvTitle;
    private ImageView mImageRight;
    private RecyclerView mRecyclerView;
    private ImageView mIvInshop;
    private TextView mTvInshop;
    private ImageView mIvFollow2;
    private TextView mTvFollow2;
    private TextView mTvAddCart;
    private TextView mTvQuickBuy;
    private ImageView mBanner;
    private TextView mTvName;
    private TextView mTvPrice;
    private TextView mTvYuanPrice;
    private TextView mTvYunPrice;
    private TextView mTvYueShou;
    private TextView mTvFaHuoDi;
    private TextView mTv1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books_commodity2);
        EventBus.getDefault().register(this);
        initview();
        initData();



    }

    private void initview() {
        mImageBack = findViewById(R.id.image_back);
        mImageBack.setOnClickListener(this);
        mTvTitle = findViewById(R.id.tv_title);
        mImageRight = findViewById(R.id.image_right);
        mRecyclerView = findViewById(R.id.recyclerView);
        mIvInshop = findViewById(R.id.iv_inshop);
        mTvInshop = findViewById(R.id.tv_inshop);
        mIvFollow2 = findViewById(R.id.iv_follow2);
        mTvFollow2 = findViewById(R.id.tv_follow2);
        mTvAddCart = findViewById(R.id.tv_add_cart);
        mTvQuickBuy = findViewById(R.id.tv_quick_buy);


    }

    private void initData() {
        //View view = LayoutInflater.from(this).inflate(R.layout.item_books, null);
        //图片
        mBanner = findViewById(R.id.banner);
        //名字
        mTvName = findViewById(R.id.tv_name);
        //价钱
        mTvPrice = findViewById(R.id.tv_price);

        mTvName.setText(mInfoBean.getName());

        mTvYuanPrice = findViewById(R.id.tv_yuan_price);
        mTvPrice.setText("￥" + mInfoBean.getXian_price());
        //价格
        mTvYuanPrice.setText("价格 ￥" +mInfoBean.getXian_price());

        Glide.with(this).load(mInfoBean.getPic()).into(mBanner);

    }

    //接收数据
    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void getMog(WholeBean.InfoBean infoBean) {
        if (infoBean != null) {
            mInfoBean = infoBean;

        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.image_back:
                finish();
                break;

        }
    }
}

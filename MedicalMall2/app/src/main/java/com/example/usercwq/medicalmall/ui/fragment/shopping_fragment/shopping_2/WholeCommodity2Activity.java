package com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.shopping_bean.WholeBean;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shoppin_detailed.AddShoppingActivity;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shoppin_detailed.CollectActivity;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shoppin_detailed.ShoppingActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class WholeCommodity2Activity extends AppCompatActivity implements View.OnClickListener {
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

    //全部
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whole_commodity2);
        //商品详情页面
        EventBus.getDefault().register(this);
        initview();
        initData();
        initttt();


    }

    private void initttt() {
        mImageBack.setOnClickListener(this); //退出
//        mTvInshop     //购物车
        mTvInshop.setOnClickListener(this);
//        mTvFollow2  //收藏
        mTvFollow2.setOnClickListener(this);
//        mTvAddCart   //添加
        mTvAddCart.setOnClickListener(this);
//        mTvQuickBuy    // 立即购买
        mTvQuickBuy.setOnClickListener(this);
    }

    //找控件
    private void initview() {
        mImageBack = findViewById(R.id.image_back);
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
    //详情价格
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
        switch (v.getId()){
            case R.id.image_back:
                finish();
                break;
            case R.id.tv_inshop:  //购物车
                Toast.makeText(this, "购物车", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(this, ShoppingActivity.class);
                startActivity(intent1);
                break;
            case R.id.tv_follow2:   //收藏
                Toast.makeText(this, "收藏", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(this, CollectActivity.class);
                startActivity(intent2); 
                break;
                
            case R.id.tv_add_cart:  //加入购物车
                Toast.makeText(this, "加入购物车", Toast.LENGTH_SHORT).show();
//                Intent intent3 = new Intent(this, AddShoppingActivity.class);
//                startActivity(intent3);
                break;
                
            case R.id.tv_quick_buy: // 立即购买
                Toast.makeText(this, "立即购买", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(this, CollectActivity.class);
                startActivity(intent4);
                break;
        }
    }
}

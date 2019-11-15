package com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.app.MyLication;
import com.example.usercwq.medicalmall.bean.shopping_bean.BookBean;
import com.example.usercwq.medicalmall.bean.shopping_bean.GatherBean;
import com.example.usercwq.medicalmall.bean.shopping_bean.ParticularsBean;
import com.example.usercwq.medicalmall.bean.shopping_bean.ShopBean;
import com.example.usercwq.medicalmall.db.ShopBeanDao;
import com.example.usercwq.medicalmall.http.HttpUtils;
import com.example.usercwq.medicalmall.net.ApiService;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_buy3.BuyActivity;
import com.example.usercwq.medicalmall.ui.acticitys_my.CollectActivity;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_buy3.ShoppingActivity;
import com.example.usercwq.medicalmall.utils.RxUtils;
import com.example.usercwq.medicalmall.utils.ToastUtil;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class Books_Commodity2Activity extends AppCompatActivity implements View.OnClickListener {
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
    // private TextView mTvYunPrice;
    private TextView mTvYueShou;
    private TextView mTvFaHuoDi;
    private TextView mTv1;
    private TextView mTvNoData;
    private TextView mTvMore;
    private RelativeLayout mLl;
    private WebView mWebView;
    private String mMAccess_token;


    private String mPic;
    private String mId;
    private ShopBean mPar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books__commodity2);
        EventBus.getDefault().register(this);
        initview();
        initttt();
        initData();



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

    private void initview() {
        mImageBack = findViewById(R.id.image_back);
        mTvTitle = findViewById(R.id.tv_title);
        mImageRight = findViewById(R.id.image_right);
        // mRecyclerView = findViewById(R.id.recyclerView);
        mIvInshop = findViewById(R.id.iv_inshop);
        mTvInshop = findViewById(R.id.tv_inshop);
        mIvFollow2 = findViewById(R.id.iv_follow2);
        mTvFollow2 = findViewById(R.id.tv_follow2);
        mTvAddCart = findViewById(R.id.tv_add_cart);
        mTvQuickBuy = findViewById(R.id.tv_quick_buy);

        //-------------------

        mTvNoData = findViewById(R.id.tv_no_data);
        mTvMore = findViewById(R.id.tv_more);
        mTv1 = findViewById(R.id.tv1);
        mLl = findViewById(R.id.ll);

        mTvYueShou = findViewById(R.id.tv_yue_shou);
        mTvFaHuoDi = findViewById(R.id.tv_fa_huo_di);
        mWebView = findViewById(R.id.webView);

    }

    private void initData() {
        //View view = LayoutInflater.from(this).inflate(R.layout.item_books, null);
        //图片
        mBanner = findViewById(R.id.banner);
        //名字
        mTvName = findViewById(R.id.tv_name);
        //价钱
        mTvPrice = findViewById(R.id.tv_price);

        Glide.with(this).load(mPic).into(mBanner);
    }

    //接收数据
    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void getMog(BookBean.InfoBean infoBean) {
        if (infoBean != null) {
            mId = infoBean.getId();
            mPic = infoBean.getPic();
            initid(mId);



        }
    }



    private void initid(String id) {
        mMAccess_token = MyLication.mAccess_token;
        ApiService apiserver = HttpUtils.getInstance().getApiserver(ApiService.Uri, ApiService.class);
        apiserver.getXiangQing("Bearer " + mMAccess_token, id)
                .compose(RxUtils.<ParticularsBean>rxObserableSchedulerHelper())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<ParticularsBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ParticularsBean particularsBean) {
                        if (particularsBean.getInfo() != null) {
                            mPar = particularsBean.getInfo().getShop();
                            mTvName.setText(mPar.getName());
                            mTvYuanPrice = findViewById(R.id.tv_yuan_price);
                            mTvPrice.setText("￥" + mPar.getXian_price());
                            //价格
                            mTvYuanPrice.setText("价格 ￥" + mPar.getYuan_price());
                            //月销
                            mTvYueShou.setText("月销"+mPar.getYue_shou()+"笔");
                            //地址
                            mTvFaHuoDi.setText(mPar.getFa_huo_di());

                            mWebView.loadUrl(mPar.getXiang_qing());
                            mWebView.setWebViewClient(new WebViewClient());


                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        ToastUtil.showShort(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
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
               // EventBus.getDefault().postSticky(mPar);
                Log.i("TAG", "onClick-----------: "+mPar.getName());
                startActivity(intent2);
                break;

            case R.id.tv_add_cart:  //加入购物车
                Toast.makeText(this, "加入购物车", Toast.LENGTH_SHORT).show();
//                Intent intent3 = new Intent(this, AddShoppingActicty.class);
//                startActivity(intent3);
                ShopBeanDao shopBeanDao = MyLication.getInstance().getDaoSession().getShopBeanDao();

                break;

            case R.id.tv_quick_buy: // 立即购买
                Toast.makeText(this, "立即购买", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(this, BuyActivity.class);
                String name = mPar.getName();  //名字
                String xian_price = mPar.getXian_price();  //价格
                String pic = mPar.getPic();  //图片
                GatherBean gatherBean = new GatherBean(name,pic,xian_price,"x1","卖家发货:七天内到达");
                EventBus.getDefault().postSticky(gatherBean);
                startActivity(intent4);
                break;
        }
    }
}

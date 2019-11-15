package com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_2;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.app.MyLication;
import com.example.usercwq.medicalmall.bean.shopping_bean.CurrBean;
import com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.MyviewPter;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_buy3.CourseFragment;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_buy3.CurriculumFragment;
import com.example.usercwq.medicalmall.ui.main.MainActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

public class Curr_Commodity2Activity extends AppCompatActivity {


    private TextView mTvNameBig;
    private TextView mTvSaleNum;
    private TextView mTvPriceBig;
    private TextView mTvPriceBig2;
    private TextView mTvTip1;
    private TextView mTvName;
    private ImageView mTvDown;
    private TextView mTvPrice;
    private TabLayout mTab;
    private ViewPager mViewPager;
    private NestedScrollView mScrollView;
    private TextView mTvAmountDesc;
    private TextView mTvTotalPrice;
    private TextView mTvStudy;
    private RelativeLayout mRl3;
    private CurrBean.InfoBean.KechengBean mKechengBean;
    private String name;
    private String mClass_hour;
    private String mJia_ge;
    private String mYuan_jia_ge;
    private ArrayList<String> mTitles;
    private JCVideoPlayerStandard mVideoplayer;
    private int firstVisible;
    private int visibleCount;
    private int totalCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curr__commodity2);
        EventBus.getDefault().register(this);
        initview();
        intshiping();
        initTitles();
        inittab();
    }

    //视频
    private void intshiping() {
        boolean setUp = mVideoplayer.setUp("http://ips.ifeng.com/video19.ifeng.com/video09/2014/06/16/1989823-102-086-0009.mp4", JCVideoPlayer.SCREEN_LAYOUT_LIST, "");

        if (setUp) {
            Glide.with(this).load("http://a4.att.hudong.com/05/71/01300000057455120185716259013.jpg").into(mVideoplayer.thumbImageView);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        try {
            JCVideoPlayer.releaseAllVideos();
        } catch (Exception e) {
        }
    }




//    @Override
//    protected void onPause() {
//        super.onPause();
//        if(MyLication.sContext.VideoPlaying!=null)
//        {
//            if(MyLication.sContext.VideoPlaying.currentState== JCVideoPlayer.CURRENT_STATE_PLAYING)
//            {
//                MyLication.sContext.VideoPlaying.startButton.performClick();
//            }else if (MyLication.sContext.VideoPlaying.currentState== JCVideoPlayer.CURRENT_STATE_PREPAREING)
//            {
//                JCVideoPlayer.releaseAllVideos();
//            }
//        }
//    }
    private void inittab() {
        MyviewPter myviewPter = new MyviewPter(getSupportFragmentManager(), initDatat(), mTitles);
        mViewPager.setAdapter(myviewPter);
        mTab.setupWithViewPager(mViewPager);

    }

    private ArrayList<Fragment> initDatat() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        CurriculumFragment curriculumActivity = new CurriculumFragment();
        CourseFragment courseActivity = new CourseFragment();
        fragments.add(curriculumActivity);
        fragments.add(courseActivity);
        return fragments;
    }

    private void initTitles() {
        mTitles = new ArrayList<>();
        mTitles.add("课程目录");
        mTitles.add("课程介绍");

    }


    private void initview() {
        mVideoplayer = findViewById(R.id.videoplayer);
        mTvNameBig = findViewById(R.id.tv_name_big);
        mTvSaleNum = findViewById(R.id.tv_sale_num);
        mTvPriceBig = findViewById(R.id.tv_price_big);
        mTvPriceBig2 = findViewById(R.id.tv_price_big2);
        mTvTip1 = findViewById(R.id.tv_tip1);
        mTvName = findViewById(R.id.tv_name);
        mTvDown = findViewById(R.id.tv_down);
        mTvPrice = findViewById(R.id.tv_price);
        mTab = findViewById(R.id.tab);
        mViewPager = findViewById(R.id.viewPager);
        mScrollView = findViewById(R.id.scrollView);
        mTvAmountDesc = findViewById(R.id.tv_amount_desc);
        mTvTotalPrice = findViewById(R.id.tv_total_price);
        mTvStudy = findViewById(R.id.tv_study);
        // mRl3 = findViewById(R.id.rl3);
        //赋值
        mTvNameBig.setText(name);
        mTvSaleNum.setText("已销售" + mClass_hour);
        mTvPriceBig.setText(mJia_ge);
        mTvPriceBig2.setText(mYuan_jia_ge);
        mTvName.setText(name);
        mTvTotalPrice.setText(mJia_ge);
        mTvPriceBig2.setText(mYuan_jia_ge);


    }

    //接收数据
    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void getMog(CurrBean.InfoBean.KechengBean infoBean) {
        if (infoBean != null) {
            name = infoBean.getName();
            mClass_hour = infoBean.getClass_hour();
            mJia_ge = infoBean.getJia_ge();
            mYuan_jia_ge = infoBean.getYuan_jia_ge();
            Log.d("TAG", "getMog: " + infoBean.getName());

        }
    }

}

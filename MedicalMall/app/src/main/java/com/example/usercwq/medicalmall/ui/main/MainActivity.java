package com.example.usercwq.medicalmall.ui.main;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.app.MyLication;
import com.example.usercwq.medicalmall.base.BaseActivity;
import com.example.usercwq.medicalmall.bean.MainBean;
import com.example.usercwq.medicalmall.bean.Singleton;
import com.example.usercwq.medicalmall.mvp.view.presenter.MainPresneter;
import com.example.usercwq.medicalmall.mvp.view.view.MainView;
import com.example.usercwq.medicalmall.ui.fragment.CourseFragment;
import com.example.usercwq.medicalmall.ui.fragment_forum.ForumFragment;
import com.example.usercwq.medicalmall.ui.fragment.MyFragment;
import com.example.usercwq.medicalmall.ui.fragment.ShoppingFragment;
import com.example.usercwq.medicalmall.ui.fragment.TiKuFragment;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity<MainPresneter, MainView> implements MainView {


    Button btWeixin;
    @BindView(R.id.fl)
    FrameLayout fl;
    @BindView(R.id.rb_tiku)
    RadioButton rbTiku;
    @BindView(R.id.rb_sharpping)
    RadioButton rbSharpping;
    @BindView(R.id.rb_kecheng)
    RadioButton rbKecheng;
    @BindView(R.id.rb_luntan)
    RadioButton rbLuntan;
    @BindView(R.id.rb_my)
    RadioButton rbMy;
    @BindView(R.id.rg)
    RadioGroup rg;
    private String TAG = "tag";
    private UMShareAPI umShareAPI;
    private ArrayList<Fragment> fragments;
    private int TYPE_TIKU=0;
    private int TYPE_SHOPPING=1;   //商城
    private int TYPE_COURSE=2;  //课程
    private int TYPE_FORUM=3;  //论坛
    private int TYPE_MY=4;  //我
    private FragmentManager manager;
    private int old_postion;

    @Override
    protected MainPresneter initPresenter() {
        return new MainPresneter();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        getFenXiang();
        getFragment();
        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fl,fragments.get(TYPE_TIKU));
        transaction.show(fragments.get(TYPE_TIKU));
        transaction.commit();
    }

    private void getFragment() {
        fragments = new ArrayList<>();
        fragments.add(TiKuFragment.getInstener());
        fragments.add(ShoppingFragment.getInstener());
        fragments.add(CourseFragment.getInstener());
        fragments.add(ForumFragment.getInstener());
        fragments.add(MyFragment.getInstener());
    }

    private void getFenXiang() {
        MyLication.getRefWatcher().watch(this);
        Singleton singleton = Singleton.newInstance(this);
        umShareAPI = UMShareAPI.get(this);
        final UMImage image = new UMImage(MainActivity.this, "http://ww1.sinaimg" +
                ".cn/large/0065oQSqly1fsb0lh7vl0j30go0ligni.jpg");//网络图片


    }

    private UMShareListener shareListener = new UMShareListener() {
        /**
         * @descrption 分享开始的回调
         * @param platform 平台类型
         */
        @Override
        public void onStart(SHARE_MEDIA platform) {


        }

        /**
         * @descrption 分享成功的回调
         * @param platform 平台类型
         */
        @Override
        public void onResult(SHARE_MEDIA platform) {
            Toast.makeText(MainActivity.this, "成功了", Toast.LENGTH_LONG).show();
        }

        /**
         * @descrption 分享失败的回调
         * @param platform 平台类型
         * @param t 错误原因
         */
        @Override
        public void onError(SHARE_MEDIA platform, Throwable t) {
            Toast.makeText(MainActivity.this, "失败" + t.getMessage(), Toast.LENGTH_LONG).show();
        }

        /**
         * @descrption 分享取消的回调
         * @param platform 平台类型
         */
        @Override
        public void onCancel(SHARE_MEDIA platform) {
            Toast.makeText(MainActivity.this, "取消了", Toast.LENGTH_LONG).show();

        }
    };

    @Override
    public void initData() {
        mPresenter.loadData();

    }

    @Override
    public void setData(MainBean data) {
        Log.i(TAG, "setData: " + data.toString());
    }


    @Override
    public void showToast(String error) {
        Log.i(TAG, "showToast: " + error);
    }



    @OnClick({R.id.rb_tiku, R.id.rb_sharpping, R.id.rb_kecheng, R.id.rb_luntan, R.id.rb_my})
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.rb_tiku:  //题库
                addFragment(TYPE_TIKU);
                break;
            case R.id.rb_sharpping: //商城
                addFragment(TYPE_SHOPPING);
                break;
            case R.id.rb_kecheng:  //课程
                addFragment(TYPE_COURSE);
                break;
            case R.id.rb_luntan://论坛
                addFragment(TYPE_FORUM);
                break;
            case R.id.rb_my://我
                addFragment(TYPE_MY);
                break;
        }
    }

    private void addFragment(int type) {
        Fragment fragment = fragments.get(type);
        Fragment oldpostion = fragments.get(old_postion);
        FragmentTransaction transaction = manager.beginTransaction();
        if (!fragment.isAdded()){
            transaction.add(R.id.fl,fragment);
        }
        transaction.hide(oldpostion);
        transaction.show(fragment);
        transaction.commit();
        old_postion = type;
        findViewById(R.id.fl).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.e("liangxq", "onTouch:1111 " );
                return false;
            }
        });
    }

    public void onClick1(View view){
        Log.e("liangxq", "onClick1: " );
    }
}

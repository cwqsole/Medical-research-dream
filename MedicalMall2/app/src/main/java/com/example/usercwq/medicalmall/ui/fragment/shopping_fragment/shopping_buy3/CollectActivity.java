package com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_buy3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.androidkun.xtablayout.XTabLayout;
import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.app.MyLication;
import com.example.usercwq.medicalmall.bean.shopping_bean.BookBean;
import com.example.usercwq.medicalmall.bean.shopping_bean.ParticularsBean;
import com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.MyFragmentPagerAdapter;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_4.ArticleCollectFragment;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_4.ShopCollectFragment;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

public class CollectActivity extends AppCompatActivity {



    private TextView mImageBack;
    private XTabLayout mTabs;
    private ViewPager mViewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect);
        initview();
        inituse();


    }



    private void inituse() {
        List<String> tabList = new ArrayList<>();
        tabList.add("商品收藏");
        tabList.add("文章收藏");

        List<Fragment> fragmentList = new ArrayList<>();
        ShopCollectFragment f1 = new ShopCollectFragment();
        ArticleCollectFragment f2 = new ArticleCollectFragment();
        fragmentList.add(f1);
        fragmentList.add(f2);
        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), fragmentList, tabList);
        mViewpager.setAdapter(adapter);
        mTabs.setupWithViewPager(mViewpager);
        mTabs.setTabsFromPagerAdapter(adapter);
    }

    private void initview() {

        mImageBack = findViewById(R.id.image_back);
        mTabs = findViewById(R.id.tabs);
        mViewpager = findViewById(R.id.viewpager);

                mImageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

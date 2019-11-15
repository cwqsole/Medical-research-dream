package com.example.usercwq.medicalmall.ui.acticitys_my;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.ui.adapters.my_adapters.VpCollAdapter;
import com.example.usercwq.medicalmall.ui.fragment.BaseFragment;
import com.example.usercwq.medicalmall.ui.fragment.my_fragment.MyCollectArticleFragment;
import com.example.usercwq.medicalmall.ui.fragment.my_fragment.MyCollectShoopFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyCollectActivity extends AppCompatActivity {

    @BindView(R.id.title)
    TextView mTitle;
    @BindView(R.id.back)
    RelativeLayout mBack;
    @BindView(R.id.tab_collect)
    TabLayout mTabCollect;
    @BindView(R.id.vp_collect)
    ViewPager mVpCollect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_collect);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        mTitle.setText("我的收藏");
        ArrayList<String> titles = new ArrayList<>();
        titles.add("商业收藏");
        titles.add("文章收藏");
        ArrayList<BaseFragment> fragments = new ArrayList<>();
        fragments.add(new MyCollectShoopFragment());
        fragments.add(new MyCollectArticleFragment());

        VpCollAdapter vpCollAdapter = new VpCollAdapter(getSupportFragmentManager(), this, fragments, titles);
        mVpCollect.setAdapter(vpCollAdapter);
        mTabCollect.setupWithViewPager(mVpCollect);

    }

    @OnClick(R.id.back)
    public void onViewClicked() {
        finish();
    }
}

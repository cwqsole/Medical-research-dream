package com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.shopping_bean.WholeBean;
import com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.shopping_2.MyAdpter2Books;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Books_Commodity2Activity extends AppCompatActivity {


    @BindView(R.id.tv_left)
    TextView mTvLeft;
    @BindView(R.id.image_back)
    TextView mImageBack;
    @BindView(R.id.tv_title)
    TextView mTvTitle;
    @BindView(R.id.tv_right)
    TextView mTvRight;
    @BindView(R.id.image_right)
    ImageView mImageRight;
    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;
    @BindView(R.id.iv_inshop)
    ImageView mIvInshop;
    @BindView(R.id.tv_inshop)
    TextView mTvInshop;
    @BindView(R.id.iv_follow2)
    ImageView mIvFollow2;
    @BindView(R.id.tv_follow2)
    TextView mTvFollow2;
    @BindView(R.id.tv_add_cart)
    TextView mTvAddCart;
    @BindView(R.id.tv_quick_buy)
    TextView mTvQuickBuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books_commodity2);
        ButterKnife.bind(this);
        EventBus.getDefault().register(this);
        initview();


    }
    @Subscribe(threadMode = ThreadMode.MAIN,sticky = true)
    public void getMog(ArrayList<WholeBean.InfoBean> mList) {
        Log.i("TAG", "getMog: "+mList);
        if (mList!=null){
            MyAdpter2Books myAdpter2Books = new MyAdpter2Books(this,mList);
            mRecyclerView.setAdapter(myAdpter2Books);
        }
    }

    private void initview() {
        //初始化布局   表头东西
        LinearLayoutManager manager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(manager);


    }


}

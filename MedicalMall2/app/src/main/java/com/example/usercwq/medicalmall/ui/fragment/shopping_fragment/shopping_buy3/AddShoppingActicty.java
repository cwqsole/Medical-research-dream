package com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_buy3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.app.MyLication;
import com.example.usercwq.medicalmall.bean.shopping_bean.ShopBean;
import com.example.usercwq.medicalmall.db.ShopBeanDao;
import com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.AddCarAdapter;

import java.util.ArrayList;
import java.util.List;

public class AddShoppingActicty extends AppCompatActivity implements View.OnClickListener {

    private TextView mImageBack;
    private TextView mTvTitle;
    private TextView mTvRight;
    private TextView mImageRight;
    private RelativeLayout mRl;
    private TextView mTvDel;
    private TextView mTvCollect;
    private RelativeLayout mView;
    private RecyclerView mRecyclerView;
    private CheckBox mCheckbox;
    private TextView mPrice;
    private TextView mTvPrice;
    private TextView mTvPlaceOrder;
    private RelativeLayout mRl3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_shopping);
        initview();
        inituse();

    }

    private void inituse() {
        ShopBeanDao shopBeanDao = MyLication.getInstance().getDaoSession().getShopBeanDao();
        List<ShopBean> shopBeans = shopBeanDao.loadAll();

        //管理器对象
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //适配器对象
        AddCarAdapter addCarAdapter = new AddCarAdapter((ArrayList<ShopBean>) shopBeans,this);
        mRecyclerView.setAdapter(addCarAdapter);

    }

    private void initview() {
        mImageBack = findViewById(R.id.image_back);
        mImageBack.setOnClickListener(this);
        mTvTitle = findViewById(R.id.tv_title);
        mTvRight = findViewById(R.id.tv_right);
        mImageRight = findViewById(R.id.image_right);
        mRl = findViewById(R.id.rl);
        mTvDel = findViewById(R.id.tv_del);
        mTvCollect = findViewById(R.id.tv_collect);
        mView = findViewById(R.id.view);
        mRecyclerView = findViewById(R.id.recyclerView);
        mCheckbox = findViewById(R.id.checkbox);
        mPrice = findViewById(R.id.price);
        mTvPrice = findViewById(R.id.tv_price);
        mTvPlaceOrder = findViewById(R.id.tv_place_order);
        mRl3 = findViewById(R.id.rl3);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.image_back:
                finish();
                break;
        }
    }
}

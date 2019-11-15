package com.example.usercwq.medicalmall.ui.adapters.shopping_adpter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.shopping_bean.GatherBean;

public class MyApterBuy extends RecyclerView.Adapter {
    private String name;
    private String  yuanPrice;
    private String price;
    private Context mContext;

    public MyApterBuy(String name, String yuanPrice, String price, Context context) {
        this.name = name;
        this.yuanPrice = yuanPrice;
        this.price = price;
        mContext = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_dingdao, null);
        return  new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyHolder myHolder = (MyHolder) holder;
        myHolder.mName.setText(name);
        myHolder.mTvPrice.setText("￥"+yuanPrice);
        Glide.with(mContext).load(price).into(myHolder.mImage);

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    class MyHolder extends RecyclerView.ViewHolder {
        private ImageView mImage;
        private TextView mName;
        private TextView mTvPrice;
        private TextView mGoods;
        public MyHolder(View itemView) {
            super(itemView);
            mImage =itemView. findViewById(R.id.image);
            mName = itemView.findViewById(R.id.name);
            mTvPrice = itemView.findViewById(R.id.tv_price);
            mGoods = itemView.findViewById(R.id.goods);
        }
    }
}

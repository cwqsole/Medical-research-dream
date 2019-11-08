package com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.shopping_2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.shopping_bean.WholeBean;
import com.youth.banner.Banner;

import java.util.ArrayList;

public class MyAdpter2Books extends RecyclerView.Adapter {
    private Context mContext;
    private WholeBean.InfoBean mInfoBean;

    public MyAdpter2Books(Context context, WholeBean.InfoBean infoBean) {
        mContext = context;
        mInfoBean = infoBean;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_books, null);
        return new MyHolderBooks(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyHolderBooks myHolderBooks = (MyHolderBooks) holder;
        myHolderBooks.mTvName.setText(mInfoBean.getName());
        myHolderBooks.mTvPrice.setText(mInfoBean.getXian_price());

    }

    @Override
    public int getItemCount() {
        return mInfoBean.hashCode();
    }

    class MyHolderBooks extends RecyclerView.ViewHolder {
        private Banner mBanner;
        private TextView mTvName;
        private TextView mTvPrice;
        private TextView mTvYuanPrice;
        private TextView mTvYunPrice;
        private TextView mTvYueShou;
        private TextView mTvFaHuoDi;
        private TextView mTv1;
        public MyHolderBooks(View itemView) {
            super(itemView);
            mBanner = itemView.findViewById(R.id.banner);
            mTvName = itemView.findViewById(R.id.tv_name);
            mTvPrice = itemView.findViewById(R.id.tv_price);
            mTvYuanPrice = itemView.findViewById(R.id.tv_yuan_price);
            mTvYunPrice = itemView.findViewById(R.id.tv_yun_price);
            mTvYueShou = itemView.findViewById(R.id.tv_yue_shou);
            mTvFaHuoDi = itemView.findViewById(R.id.tv_fa_huo_di);
            mTv1 = itemView.findViewById(R.id.tv1);
        }
    }
}

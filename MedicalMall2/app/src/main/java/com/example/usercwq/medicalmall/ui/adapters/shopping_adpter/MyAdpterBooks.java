package com.example.usercwq.medicalmall.ui.adapters.shopping_adpter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.shopping_bean.WholeBean;

import java.util.ArrayList;

public class MyAdpterBooks extends RecyclerView.Adapter {
    private ArrayList<WholeBean.InfoBean> mList;
    private Context mContext;


    public MyAdpterBooks(ArrayList<WholeBean.InfoBean> list, Context context) {
        mList = list;
        mContext = context;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_whole1, null);
        return new MyHolderBooks(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyHolderBooks myHolderBooks = (MyHolderBooks) holder;
        Glide.with(mContext).load(mList.get(position).getPic()).into(myHolderBooks.mImage);
        myHolderBooks.mName.setText(mList.get(position).getName());
        myHolderBooks.mTvPrice.setText(mList.get(position).getXian_price());
        myHolderBooks.mRatingBar.setMax(5);

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class MyHolderBooks extends RecyclerView.ViewHolder {
        private ImageView mImage;
        private TextView mTvHot;
        private TextView mName;
        private RatingBar mRatingBar;
        private TextView mTvPrice;
        public MyHolderBooks(View itemView) {
            super(itemView);
            mImage = itemView.findViewById(R.id.image);
            mTvHot = itemView.findViewById(R.id.tv_hot);
            mName = itemView.findViewById(R.id.name);
            mRatingBar = itemView.findViewById(R.id.ratingBar);
            mTvPrice = itemView.findViewById(R.id.tv_price);
        }
    }
}
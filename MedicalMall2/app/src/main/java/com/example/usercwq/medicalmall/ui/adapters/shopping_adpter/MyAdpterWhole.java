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

public class MyAdpterWhole extends RecyclerView.Adapter {
    private ArrayList<WholeBean.InfoBean> mList;
    private Context mContext;



    public MyAdpterWhole(ArrayList<WholeBean.InfoBean> list, Context context) {
        mList = list;
        mContext = context;



    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 1) {
            View view = LayoutInflater.from(mContext).inflate(R.layout.item_whole1, null);
            return new MyHolderWhole1(view);
        } else {
            View view = LayoutInflater.from(mContext).inflate(R.layout.item_whole2, null);
            return new MyHolderWhole2(view);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        int viewType = getItemViewType(position);
        if (viewType == 1) {
            MyHolderWhole1 myHolderWhole = (MyHolderWhole1) holder;
            Glide.with(mContext).load(mList.get(position).getPic()).into(myHolderWhole.mImage);
            myHolderWhole.mName.setText(mList.get(position).getName());
            myHolderWhole.mTvHot.setText("热门");
            myHolderWhole.mTvPrice.setText("￥"+mList.get(position).getXian_price());
            myHolderWhole.mRatingBar.setMax(5);
        } else {
            MyHolderWhole2 myHolderWhole2 = (MyHolderWhole2) holder;
            Glide.with(mContext).load(mList.get(position).getPic()).into(myHolderWhole2.mImage);
            myHolderWhole2.mTvName2.setText(mList.get(position).getName());
            myHolderWhole2.mTvKecheng.setText(mList.get(position).getRe_mai()+"课时");
            myHolderWhole2.mTvYuan.setText("￥"+mList.get(position).getXian_price());

        }


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCreatLayout.onClick(position);
            }
        });


    }


    @Override
    public int getItemCount() {
        return mList.size();
    }

    class MyHolderWhole1 extends RecyclerView.ViewHolder {
        private ImageView mImage;
        private TextView mTvHot;
        private TextView mName;
        private RatingBar mRatingBar;
        private TextView mTvPrice;

        public MyHolderWhole1(View itemView) {
            super(itemView);
            mImage = itemView.findViewById(R.id.image);
            mTvHot = itemView.findViewById(R.id.tv_hot);
            mName = itemView.findViewById(R.id.name);
            mRatingBar = itemView.findViewById(R.id.ratingBar);
            mTvPrice = itemView.findViewById(R.id.tv_price);
        }
    }
    //接口回调
    private   OnCreatLayout onCreatLayout;

    public void setOnCreatLayout(OnCreatLayout onCreatLayout) {
        this.onCreatLayout = onCreatLayout;
    }

    public interface OnCreatLayout{
        void onClick(int position);

    }


    class MyHolderWhole2 extends RecyclerView.ViewHolder {
        private ImageView mImage;
        private TextView mTvName2;
        private TextView mTvTip1;
        private TextView mTvTip2;
        private TextView mTvTip3;
        private TextView mTvKecheng;
        private TextView mTvYuanDesc;
        private TextView mTvYuan;
        public MyHolderWhole2(View itemView) {
            super(itemView);
            mImage = itemView.findViewById(R.id.image);
            mTvName2 = itemView.findViewById(R.id.tv_name2);
            mTvTip1 = itemView.findViewById(R.id.tv_tip1);
            mTvTip2 = itemView.findViewById(R.id.tv_tip2);
            mTvTip3 = itemView.findViewById(R.id.tv_tip3);
            mTvKecheng = itemView.findViewById(R.id.tv_kecheng);
            mTvYuanDesc = itemView.findViewById(R.id.tv_yuan_desc);
            mTvYuan = itemView.findViewById(R.id.tv_yuan);


        }
    }


}

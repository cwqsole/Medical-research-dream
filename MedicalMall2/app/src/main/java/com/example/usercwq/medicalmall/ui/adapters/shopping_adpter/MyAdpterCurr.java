package com.example.usercwq.medicalmall.ui.adapters.shopping_adpter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.shopping_bean.CurrBean;

import java.util.ArrayList;
import java.util.List;

public class MyAdpterCurr extends RecyclerView.Adapter {
    private ArrayList<CurrBean.InfoBean> mList;
    private Context mContext;


    public MyAdpterCurr(ArrayList<CurrBean.InfoBean> list, Context context) {
        mList = list;
        mContext = context;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_whole2, null);
        return new MyHolderCurr(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyHolderCurr myHolderCurr = (MyHolderCurr) holder;
        List<CurrBean.InfoBean.GongGaoBean> gong_gao = mList.get(position).getGong_gao();
        List<CurrBean.InfoBean.KechengBean> kecheng = mList.get(position).getKecheng();
        List<CurrBean.InfoBean.LunboBean> lunbo = mList.get(position).getLunbo();
        Glide.with(mContext).load(kecheng.get(position).getPic()).into(myHolderCurr.mImage);
        myHolderCurr.mTvName2.setText(kecheng.get(position).getName());
        myHolderCurr.mTvTip1.setText(kecheng.get(position).getType_str().toString());
        myHolderCurr.mTvYuan.setText(kecheng.get(position).getJia_ge());
        myHolderCurr.mTvKecheng.setText(kecheng.get(position).getClass_hour());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class MyHolderCurr extends RecyclerView.ViewHolder {
        private ImageView mImage;
        private TextView mTvName2;
        private TextView mTvTip1;
        private TextView mTvTip2;
        private TextView mTvTip3;
        private TextView mTvKecheng;
        private TextView mTvYuanDesc;
        private TextView mTvYuan;
        public MyHolderCurr(View itemView) {
            super(itemView);
            mImage = itemView.findViewById(R.id.image);
            mTvName2 =itemView. findViewById(R.id.tv_name2);
            mTvTip1 = itemView.findViewById(R.id.tv_tip1);
            mTvTip2 = itemView.findViewById(R.id.tv_tip2);
            mTvTip3 = itemView.findViewById(R.id.tv_tip3);
            mTvKecheng = itemView.findViewById(R.id.tv_kecheng);
            mTvYuanDesc = itemView.findViewById(R.id.tv_yuan_desc);
            mTvYuan = itemView.findViewById(R.id.tv_yuan);
        }
    }
}

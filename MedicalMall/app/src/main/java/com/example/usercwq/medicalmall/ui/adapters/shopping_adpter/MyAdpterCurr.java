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
    private ArrayList<CurrBean.InfoBean.KechengBean> mList;
    private Context mContext;


    public MyAdpterCurr(ArrayList<CurrBean.InfoBean.KechengBean> list, Context context) {
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
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        MyHolderCurr myHolderCurr = (MyHolderCurr) holder;

        Glide.with(mContext).load(mList.get(position).getPic()).into(myHolderCurr.mImage);
        myHolderCurr.mTvName2.setText(mList.get(position).getName());

        myHolderCurr.mTvTip1.setText(mList.get(position).getType_str().toString());
        myHolderCurr.mTvYuan.setText("￥"+mList.get(position).getJia_ge());
        myHolderCurr.mTvKecheng.setText(mList.get(position).getClass_hour()+"课时");
        myHolderCurr.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnCreatLayout.OnCreatlayout(position);
            }
        });
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
    //接口回调
    public OnCreatLayout OnCreatLayout;

    public void setOnCreatLayout(OnCreatLayout onCreatLayout) {
        OnCreatLayout = onCreatLayout;
    }

    public interface OnCreatLayout{
        void OnCreatlayout(int position);

    }
}

package com.example.usercwq.medicalmall.ui.adapters.shopping_adpter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.shopping_bean.WholeBean;

import java.util.ArrayList;

public class MyAdpterWhole2 extends RecyclerView.Adapter{
    private ArrayList<WholeBean.InfoBean.CourseBean> mList;
    private Context mContext;

    public MyAdpterWhole2(ArrayList<WholeBean.InfoBean.CourseBean> courseBean, Context context) {
        mList = courseBean;
        mContext = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_whole2, parent,false);
        return new MyHolderWhole2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        MyHolderWhole2 myHolderWhole2 = (MyHolderWhole2) holder;
        Glide.with(mContext).load(mList.get(position).getPic()).into(myHolderWhole2.mImage);
        myHolderWhole2.mTvName2.setText(mList.get(position).getName());
        myHolderWhole2.mTvKecheng.setText(mList.get(position).getClass_hour()+"课时");
        myHolderWhole2.mTvYuan.setText("￥"+mList.get(position).getJia_ge());
        myHolderWhole2.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(mContext, "全部2", Toast.LENGTH_SHORT).show();
                onCreatLayout.onClick(position);
            }
        });
    }
    public interface OnCreatLayout{
        void onClick(int position);


    }
    private  OnCreatLayout onCreatLayout;

    public void setOnCreatLayout(OnCreatLayout onCreatLayout) {
        this.onCreatLayout = onCreatLayout;
    }

    @Override
    public int getItemCount() {
        return mList.size();
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
        private RelativeLayout mRelativeLayout;
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
            mRelativeLayout=itemView.findViewById(R.id.rl);

        }
    }
}

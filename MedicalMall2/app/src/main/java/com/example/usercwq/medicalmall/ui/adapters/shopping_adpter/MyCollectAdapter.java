package com.example.usercwq.medicalmall.ui.adapters.shopping_adpter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.shopping_bean.ParticularsBean;
import com.example.usercwq.medicalmall.bean.shopping_bean.ShopBean;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_2.WholeCommodity2Activity;
import com.youth.banner.loader.ImageLoader;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;

public class MyCollectAdapter extends RecyclerView.Adapter<MyCollectAdapter.MyViewHolder>  {
    private ArrayList<ShopBean> mList;
    private Context mContext;

    public MyCollectAdapter(ArrayList<ShopBean> list, Context context) {
        mList = list;
        mContext = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_my_collect, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        if (position % 2 == 0) {
            layoutParams.setMargins(0, 0, 15, 0);//左上右下
        } else {
            layoutParams.setMargins(15, 0, 0, 0);
        }
        holder.rl.setLayoutParams(layoutParams);


        holder.tv_name.setText(mList.get(position).getName());
        holder.tv_yuan.setText("￥"+mList.get(position).getXian_price());
        Glide.with(mContext).load(mList.get(position).getPic()).into(holder.image);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShopBean shopBean = mList.get(position);
                Intent intent = new Intent(mContext, WholeCommodity2Activity.class);
                EventBus.getDefault().postSticky(shopBean);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView tv_name, tv_yuan;
        RelativeLayout rl;

        public MyViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image);
            tv_name = (TextView) itemView.findViewById(R.id.tv_name);
            tv_yuan = (TextView) itemView.findViewById(R.id.tv_yuan);
            rl = (RelativeLayout) itemView.findViewById(R.id.rl);
        }
    }
    private  OnCreatLayout OnCreatLayout;

    public void setOnCreatLayout(MyCollectAdapter.OnCreatLayout onCreatLayout) {
        OnCreatLayout = onCreatLayout;
    }

    public interface OnCreatLayout{
        void OnCreackLayout(int position);
    }
}

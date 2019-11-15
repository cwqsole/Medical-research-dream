package com.example.usercwq.medicalmall.ui.adapters.shopping_adpter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.shopping_bean.ShopBean;

import java.math.BigDecimal;
import java.util.ArrayList;

public class AddCarAdapter extends RecyclerView.Adapter {
    private ArrayList<ShopBean> mlist;
    private Context mContext;

    public AddCarAdapter(ArrayList<ShopBean> mlist, Context context) {
        this.mlist = mlist;
        mContext = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_booking_car, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ShopBean shopBean = mlist.get(position);
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.tv_name.setText(mlist.get(position).getName());
        myViewHolder.tv_totalPrice.setText(mlist.get(position).getXian_price());
        Glide.with(mContext).load(mlist.get(position).getPic()).into(myViewHolder.image);
//        //判断选择状态
//        if (shopBean.getName().equals("")) {
//            myViewHolder.checkbox.setChecked(true);
//        } else {
//            myViewHolder.checkbox.setChecked(false);
//        }


    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout rl_cart;
        CheckBox checkbox;
        ImageView image;
        TextView tv_name, tv_occupation, tv_del, tv_price, tv_info;
        TextView tv_reduce, tv_num, tv_plus, tv_totalPrice;

        public MyViewHolder(View itemView) {
            super(itemView);
            rl_cart=itemView.findViewById(R.id.rl_cart);
            checkbox = (CheckBox) itemView.findViewById(R.id.checkbox);
            image = (ImageView) itemView.findViewById(R.id.image);
            tv_name = (TextView) itemView.findViewById(R.id.tv_name);
            tv_del = (TextView) itemView.findViewById(R.id.tv_del);
            tv_price = (TextView) itemView.findViewById(R.id.tv_price);
            tv_info = (TextView) itemView.findViewById(R.id.tv_info);
            tv_num = (TextView) itemView.findViewById(R.id.tv_num);
            tv_plus = (TextView) itemView.findViewById(R.id.tv_plus);
            tv_reduce = (TextView) itemView.findViewById(R.id.tv_reduce);
            tv_totalPrice = (TextView) itemView.findViewById(R.id.tv_totalPrice);

        }
    }
}

package com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.shopping_2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.shopping_bean.WholeBean;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_2.Books_Commodity2Activity;

import java.util.ArrayList;

public class MyAdpter2Books extends RecyclerView.Adapter {
    private Context mContext;
    private ArrayList<WholeBean.InfoBean> mInfoBean;

    public MyAdpter2Books(Context context, ArrayList<WholeBean.InfoBean> infoBean) {
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

    }

    @Override
    public int getItemCount() {
        return mInfoBean.size();
    }
    class MyHolderBooks extends RecyclerView.ViewHolder{

        public MyHolderBooks(View itemView) {
            super(itemView);
        }
    }
}

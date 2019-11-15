package com.example.usercwq.medicalmall.ui.adapters.shopping_adpter;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.shopping_bean.Adress;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_manage.ReceivingActivity;

import java.util.ArrayList;

import io.reactivex.annotations.NonNull;

public class MyadpterAdd extends RecyclerView.Adapter {
    private ArrayList<Adress> mStrings;
    private Context mContext;

    public MyadpterAdd(ArrayList<Adress> strings, Context context) {
        mStrings = strings;
        mContext = context;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_add, null);

        return new MyHolderadd(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        MyHolderadd myHolderadd = (MyHolderadd) holder;
        myHolderadd.mTvName.setText(mStrings.get(position).getName());
        myHolderadd.mTvTel.setText(mStrings.get(position).getPhone());
        myHolderadd.mTvContent.setText(mStrings.get(position).getAddress()+mStrings.get(position).getDetails());
        myHolderadd.mTvEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCreateLayout.OnCratek1(position);
            }


        });
        myHolderadd.mTvDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCreateLayout.OnCratek2(position);

            }
        });
        myHolderadd.mRlAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCreateLayout.OnCratek3(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mStrings.size();
    }
    class MyHolderadd extends RecyclerView.ViewHolder{

        private TextView mImageBack;
        private TextView mTvTitle;
        private RelativeLayout mFrl;
        private TextView mTvName;
        private TextView mTvTel;
        private TextView mTvContent;
        private CheckBox mCheckbox;
        private TextView mTvEdit;
        private TextView mTvDel;
        private ImageView mIvRight;
        private RelativeLayout mRlAddress;
        public MyHolderadd(View itemView) {
            super(itemView);
            mImageBack = itemView.findViewById(R.id.image_back);
            mTvTitle = itemView.findViewById(R.id.tv_title);
            mFrl = itemView.findViewById(R.id.frl);
            mTvName = itemView.findViewById(R.id.tv_name);
            mTvTel = itemView.findViewById(R.id.tv_tel);
            mTvContent = itemView.findViewById(R.id.tv_content);
            mCheckbox =itemView. findViewById(R.id.checkbox);
            mTvEdit =itemView. findViewById(R.id.tv_edit);
            mTvDel =itemView. findViewById(R.id.tv_del);
            mIvRight = itemView.findViewById(R.id.iv_right);
            mRlAddress = itemView.findViewById(R.id.rl_address);
        }
    }
   private OnCreateLayout onCreateLayout;

    public void setOnCreateLayout(OnCreateLayout onCreateLayout) {
        this.onCreateLayout = onCreateLayout;
    }

    public interface OnCreateLayout{
        void OnCratek1(int position);
        void OnCratek2(int position);
        void OnCratek3(int position);


    }
}

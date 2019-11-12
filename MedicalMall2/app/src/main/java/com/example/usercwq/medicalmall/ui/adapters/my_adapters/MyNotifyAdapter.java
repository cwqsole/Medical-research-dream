package com.example.usercwq.medicalmall.ui.adapters.my_adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.my_bean.MyNotifyBean;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyNotifyAdapter extends RecyclerView.Adapter<MyNotifyAdapter.MyHolder> {

    private Context mContext;
    private ArrayList<MyNotifyBean.InfoBean> mList = new ArrayList<>();

    public MyNotifyAdapter(Context context, ArrayList<MyNotifyBean.InfoBean> list) {
        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public MyNotifyAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.item_mynotify, null);
        return new MyHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyNotifyAdapter.MyHolder holder, final int position) {

            MyHolder myHolder = (MyHolder) holder;
            Glide.with(mContext).load(R.mipmap.ic_dream)
                    .apply(new RequestOptions().circleCrop())
                    .into(myHolder.mIvItem);

            myHolder.mTitleItem.setText(mList.get(position).getAuthName());
            myHolder.mDate.setText(mList.get(position).getAddtime());
            myHolder.mMsgItem.setText(mList.get(position).getTitle());

            myHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MyOnclick.onClick(position);
                }
            });
    }

    @Override
    public int getItemCount() {
        return mList.size() ;
    }

    class MyHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_item)
        ImageView mIvItem;
        @BindView(R.id.title_item)
        TextView mTitleItem;
        @BindView(R.id.date)
        TextView mDate;
        @BindView(R.id.msg_item)
        TextView mMsgItem;

        public MyHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public MyOnclick MyOnclick;

    public void setMyOnclick(MyNotifyAdapter.MyOnclick myOnclick) {
        MyOnclick = myOnclick;
    }

    public interface MyOnclick{
        Void onClick(int position);
    }
}

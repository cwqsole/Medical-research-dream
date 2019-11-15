package com.example.usercwq.medicalmall.ui.adapters.shopping_adpter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.app.MyLication;
import com.example.usercwq.medicalmall.bean.shopping_bean.WholeBean;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

public class MyAdpterWhole extends RecyclerView.Adapter {
    private ArrayList<WholeBean.InfoBean.ShopBean> mList;
    private ArrayList<WholeBean.InfoBean.CourseBean> mCourseBean;
    private Context mContext;

    private static int smaafafa = 1;
    private static int smaafaf = 2;


    public MyAdpterWhole(ArrayList<WholeBean.InfoBean.ShopBean> list, ArrayList<WholeBean.InfoBean.CourseBean> courseBean, Context context) {
        mList = list;
        mCourseBean = courseBean;
        mContext = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == smaafafa) {
            View view = LayoutInflater.from(mContext).inflate(R.layout.item_whole1, parent, false);
            return new ShopViewHolder(view);

        } else  {
            View view = LayoutInflater.from(mContext).inflate(R.layout.item_whole2, parent, false);
            return new CourseViewHolder(view);
        }


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
       // List<WholeBean.InfoBean.ShopBean> shop = mList.get(position).getShop();
        int viewType = getItemViewType(position);
        if (viewType==smaafafa){
            ShopViewHolder holder1 = (ShopViewHolder) holder;
            Glide.with(mContext).load(mList.get(position).getPic()).into(holder1.image);
            holder1.name.setText("      "+mList.get(position).getName());
            holder1.ratingBar.setRating(Float.valueOf(mList.get(position).getHao_ping()));
            holder1.tv_price.setText("￥"+mList.get(position).getXian_price());
            holder1.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onCreatLayout.onClick1(position);
                }
            });
        }else {
            CourseViewHolder holder2 = (CourseViewHolder) holder;
            Glide.with(mContext).load(mCourseBean.get(position-mList.size()).getPic()).into(holder2.mImage);
            holder2.mTvName2.setText(mCourseBean.get(position-mList.size()).getName());
            holder2.mTvKecheng.setText(mCourseBean.get(position-mList.size()).getClass_hour()+"课时");
            holder2.mTvYuan.setText("￥"+mCourseBean.get(position-mList.size()).getJia_ge());
            Glide.with(mContext).load(mCourseBean.get(position-mList.size()).getPic()).into(holder2.mImage);
            holder2.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onCreatLayout.onClick2(position);
                }
            });
        }
    }



    @Override
    public int getItemCount() {
        return mList.size()+mCourseBean.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position<=mList.size()-1){
            return smaafafa;
        }else {
            return smaafaf;
        }
    }

    public class ShopViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name,tv_price,tv_hot;
        RelativeLayout rl;
        RatingBar ratingBar;

        public ShopViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image);
            name=(TextView)itemView.findViewById(R.id.name) ;
            rl = (RelativeLayout) itemView.findViewById(R.id.rl);
            ratingBar=(RatingBar)itemView.findViewById(R.id.ratingBar);
            tv_hot =itemView.findViewById(R.id.tv_hot);
            tv_price=(TextView)itemView.findViewById(R.id.tv_price);
        }
    }


    public interface OnCreatLayout{
        void onClick1(int position);
        void onClick2(int position);

    }
    OnCreatLayout onCreatLayout;

    public void setOnCreatLayout(OnCreatLayout onCreatLayout) {
        this.onCreatLayout = onCreatLayout;
    }


    public class CourseViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImage;
        private TextView mTvName2;
        private TextView mTvTip1;
        private TextView mTvTip2;
        private TextView mTvTip3;
        private TextView mTvKecheng;
        private TextView mTvYuanDesc;
        private TextView mTvYuan;
        private RelativeLayout mRelativeLayout;

        public CourseViewHolder(View itemView) {
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

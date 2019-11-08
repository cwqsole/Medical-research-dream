package com.example.usercwq.medicalmall.ui.adapters.course;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.CourselvBean;
import com.example.usercwq.medicalmall.ui.acticitys_my.WebViewActivity;
import com.youth.banner.Banner;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Course_RlvAdapter extends RecyclerView.Adapter {
    private Context context;
    private List<CourselvBean.InfoBean.GongGaoBean> gong_gao;
    private List<CourselvBean.InfoBean.KechengBean> kecheng;
    private List<CourselvBean.InfoBean.LunboBean> lunbo;
    private ArrayList<String> strings;

    public Course_RlvAdapter(Context context, List<CourselvBean.InfoBean.GongGaoBean> gong_gao, List<CourselvBean.InfoBean.KechengBean> kecheng, List<CourselvBean.InfoBean.LunboBean> lunbo) {
        this.context = context;
        this.gong_gao = gong_gao;
        this.kecheng = kecheng;
        this.lunbo = lunbo;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 0) {
            View banner = View.inflate(context, R.layout.courserlv_item_banner, null);

            return new ViewHolderbanner(banner);
        } else if (viewType == 1) {
            View gongao = View.inflate(context, R.layout.courserlv_item_gonggao, null);

            return new ViewHoldergonggao(gongao);
        } else if (viewType == 2) {
            View tv = View.inflate(context, R.layout.courselv_itemtv, null);
            return new ViewHoldertv(tv);
        }else if(viewType==1+1+1+kecheng.size()){
            View view = View.inflate(context, R.layout.course_item_jiazai, null);
            return new ViewHolderjiazai(view);
        } else {
            View item = View.inflate(context, R.layout.courselv_item, null);
            return new ViewHolderitem(item);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int itemViewType = getItemViewType(position);
        if (itemViewType == 0) {
            ViewHolderbanner viewHolderbanner = (ViewHolderbanner) holder;
            strings = new ArrayList<>();
            for (int i =0;i<lunbo.size();i++){
                strings.add(lunbo.get(i).getPic());
            }
            viewHolderbanner.mCourseRlvItembanner.setImages(strings).setImageLoader(new ImageLoader() {
                @Override
                public void displayImage(Context context, Object path, ImageView imageView) {
                    Glide.with(context).load(path).into(imageView);
                }
            }).start();
            viewHolderbanner.mCourseRlvItembanner.setOnBannerListener(new OnBannerListener() {
                @Override
                public void OnBannerClick(int position) {
                    Intent intent = new Intent(context, WebViewActivity.class);
                    intent.putExtra("url",lunbo.get(position).getUrl());
                    context.startActivity(intent);
                }
            });


        } else if (itemViewType == 1) {
            ViewHoldergonggao viewHoldergonggao = (ViewHoldergonggao) holder;
            viewHoldergonggao.mCourseRlvItemgonggao.setText(gong_gao.get(0).getName());


        } else if (itemViewType == 2) {


        }else if (itemViewType==1+1+1+kecheng.size()){

        }else {
            ViewHolderitem viewHolderitem = (ViewHolderitem) holder;
            viewHolderitem.mTitle.setText(kecheng.get(position-3).getName());
            viewHolderitem.mKeshi.setText(kecheng.get(position-3).getClass_hour()+"课时");
            viewHolderitem.mTvYuan.setText(kecheng.get(position-3).getJia_ge());
            Glide.with(context)
                    .load(kecheng.get(position-3).getPic())
                    .into(viewHolderitem.mImage);
            viewHolderitem.mTvTip1.setText(kecheng.get(position-3).getType_str().get(0));
        }
    }

    @Override
    public int getItemCount() {
        return kecheng.size() + 1 + 1 + 1+1;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 0;
        } else if (position == 1) {
            return 1;
        } else if (position == 2) {
            return 2;
        }else if(position==1+1+1+kecheng.size()){
            return 1+1+1+kecheng.size();
        } else {
            return 3;
        }
    }

    static
    class ViewHolderbanner extends RecyclerView.ViewHolder {
        @BindView(R.id.course_rlv_itembanner)
        Banner mCourseRlvItembanner;

        ViewHolderbanner(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    static
    class ViewHoldergonggao extends RecyclerView.ViewHolder {
        @BindView(R.id.course_rlv_itemgonggao)
        TextView mCourseRlvItemgonggao;

        ViewHoldergonggao(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    static
    class ViewHoldertv extends RecyclerView.ViewHolder {
        ViewHoldertv(View view) {
            super(view);
        }
    }
    static
    class ViewHolderjiazai extends RecyclerView.ViewHolder {
        ViewHolderjiazai(View view) {
            super(view);
        }
    }

    static
    class ViewHolderitem extends RecyclerView.ViewHolder{
        @BindView(R.id.image)
        ImageView mImage;
        @BindView(R.id.title)
        TextView mTitle;
        @BindView(R.id.tv_tip1)
        TextView mTvTip1;
//        @BindView(R.id.tv_tip2)
//        TextView mTvTip2;
        @BindView(R.id.keshi)
        TextView mKeshi;
        @BindView(R.id.tv_yuan)
        TextView mTvYuan;
        @BindView(R.id.rl)
        RelativeLayout mRl;

        ViewHolderitem(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}

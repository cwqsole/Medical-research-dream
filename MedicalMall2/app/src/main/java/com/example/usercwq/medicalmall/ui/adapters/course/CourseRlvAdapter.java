package com.example.usercwq.medicalmall.ui.adapters.course;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.course.CourseBean;
import com.example.usercwq.medicalmall.net.ScrollTextView;
import com.example.usercwq.medicalmall.ui.acticitys_my.WebActivity;
import com.youth.banner.Banner;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoader;


import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CourseRlvAdapter extends RecyclerView.Adapter {
    private Context context;
    private List<CourseBean.InfoBean.GongGaoBean> gong_gao;
    private List<CourseBean.InfoBean.KechengBean> kecheng;
    private List<CourseBean.InfoBean.LunboBean> lunbo;
    private ArrayList<String> strings;

    public CourseRlvAdapter(Context context, List<CourseBean.InfoBean.GongGaoBean> gong_gao, List<CourseBean.InfoBean.KechengBean> kecheng, List<CourseBean.InfoBean.LunboBean> lunbo) {
        this.context = context;
        this.gong_gao = gong_gao;
        this.kecheng = kecheng;
        this.lunbo = lunbo;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 0) {
            View view1 = View.inflate(context, R.layout.course_rlvitem_banner, null);
            return new ViewHolderBanner(view1);
        } else if (viewType == 1) {
            View view2 = View.inflate(context, R.layout.course_rlvitem_gonggao, null);
            return new ViewHoldergonggao(view2);
        } else if (viewType == 2) {
            View view3 = View.inflate(context, R.layout.course_rlvitem_jingpin, null);
            return new ViewHoldertv(view3);
        } else if (viewType == 4) {
            View view4 = View.inflate(context, R.layout.course_rlvitem_quanbu, null);
            return new ViewHoldertv2(view4);
        } else {
            View view5 = View.inflate(context, R.layout.course_rlvitem, null);
            return new ViewHolderItem(view5);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Log.i("===", "onBindViewHolder.size: "+kecheng.size());
        int itemViewType = getItemViewType(position);
        if (itemViewType == 0) {
            ViewHolderBanner viewHolderBanner = (ViewHolderBanner) holder;
            strings = new ArrayList<>();
            for (int i = 0; i < lunbo.size(); i++) {
                strings.add(lunbo.get(i).getPic());
            }
            viewHolderBanner.mCourseRlvItembanner.setImages(strings).setImageLoader(new ImageLoader() {
                @Override
                public void displayImage(Context context, Object path, ImageView imageView) {
                    Glide.with(context).load(path).into(imageView);
                }
            }).start();
            viewHolderBanner.mCourseRlvItembanner.setOnBannerListener(new OnBannerListener() {
                @Override
                public void OnBannerClick(int position) {
                    Intent intent = new Intent(context, WebActivity.class);
                    intent.putExtra("url",lunbo.get(position).getUrl());
                    context.startActivity(intent);
                }
            });
        } else if (itemViewType == 1) {
            final ViewHoldergonggao viewHoldergonggao = (ViewHoldergonggao) holder;
            ArrayList<String> strings = new ArrayList<>();
            for (int i = 0; i < gong_gao.size(); i++) {
                strings.add(gong_gao.get(i).getName());
            }
            viewHoldergonggao.mCourseScrolltv.setList(strings);
            viewHoldergonggao.mCourseScrolltv.startScroll();
            viewHoldergonggao.mCourseScrolltv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, WebActivity.class);
                    intent.putExtra("url",gong_gao.get(viewHoldergonggao.mCourseScrolltv.position).getUrl());
                    context.startActivity(intent);
                }
            });
        } else if (itemViewType == 2) {

        }

        else if (itemViewType == 3) {

            ViewHolderItem viewHolderItem = (ViewHolderItem) holder;
            viewHolderItem.mCourseRlvTitle.setText(kecheng.get(position - 3).getName());
            Log.i("===", "onBindViewHolder: "+position);
            viewHolderItem.mCourseRlvJiage.setText(kecheng.get(position - 3).getJia_ge());
            viewHolderItem.mCourseRlvKeshi.setText(kecheng.get(position - 3).getClass_hour());
            Glide.with(context).load(kecheng.get(position - 3).getPic()).into(viewHolderItem.mImage);
            viewHolderItem.mTvTip1.setText(kecheng.get(position - 3).getType_str().get(0));

        }else if (itemViewType == 4) {

        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 0;
        } else if (position == 1) {
            return 1;
        } else if (position == 2) {
            return 2;
        } else if (position == kecheng.size() + 3) {
            return 4;
        } else {
            return 3;
        }
    }

    @Override
    public int getItemCount() {
        return kecheng.size() + 4;
    }

    static
    class ViewHolderBanner extends RecyclerView.ViewHolder {
        @BindView(R.id.course_rlv_itembanner)
        Banner mCourseRlvItembanner;

        ViewHolderBanner(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    static
    class ViewHoldertv extends RecyclerView.ViewHolder {
        ViewHoldertv(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
    static
    class ViewHoldertv2 extends RecyclerView.ViewHolder {
        ViewHoldertv2(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }


    static
    class ViewHolderItem extends RecyclerView.ViewHolder {
        @BindView(R.id.image)
        ImageView mImage;
        @BindView(R.id.course_rlv_title)
        TextView mCourseRlvTitle;
        @BindView(R.id.tv_tip1)
        TextView mTvTip1;
        @BindView(R.id.course_rlv_keshi)
        TextView mCourseRlvKeshi;
        @BindView(R.id.fuhao)
        TextView mFuhao;
        @BindView(R.id.course_rlv_jiage)
        TextView mCourseRlvJiage;
        @BindView(R.id.rl)
        RelativeLayout mRl;

        ViewHolderItem(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    static
    class ViewHoldergonggao extends RecyclerView.ViewHolder {
        @BindView(R.id.gg)
        ImageView mGg;
        @BindView(R.id.course_scrolltv)
        ScrollTextView mCourseScrolltv;



        public ViewHoldergonggao(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

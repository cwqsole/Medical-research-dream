package com.example.usercwq.medicalmall.ui.adapters.tikuAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.bean.tiku_bean.TikuBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TiKuRclvApdater extends RecyclerView.Adapter<TiKuRclvApdater.MyItem> {
    private ArrayList<TikuBean.InfoBean.UTypeBean.ZTypeBean> uTypeBeans = new ArrayList<>();
    private Context context;

    public TiKuRclvApdater(ArrayList<TikuBean.InfoBean.UTypeBean.ZTypeBean> uTypeBeans, Context context) {
        this.uTypeBeans = uTypeBeans;
        this.context = context;
    }

    @NonNull
    @Override
    public MyItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.fragment_rclv_tiku, parent,
                false);
        MyItem myItem = new MyItem(inflate);

        return myItem;
    }

    @Override
    public void onBindViewHolder(@NonNull MyItem holder, int position) {
       holder.tvMessage.setText(uTypeBeans.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return uTypeBeans.size();
    }

    public class MyItem extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_message)
        TextView tvMessage;
        public MyItem(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

package com.example.usercwq.medicalmall.ui.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.mvp.view.presenter.SuoPresenter;
import com.example.usercwq.medicalmall.mvp.view.view.SuoView;
import com.example.usercwq.medicalmall.ui.acticitys_my.LoginActivity;
import com.example.usercwq.medicalmall.ui.acticitys_my.MyAboutActivity;
import com.example.usercwq.medicalmall.ui.acticitys_my.MyClassActivity;
import com.example.usercwq.medicalmall.ui.acticitys_my.MyOrderActivity;
import com.example.usercwq.medicalmall.ui.acticitys_my.MySchoolActivity;
import com.example.usercwq.medicalmall.ui.acticitys_my.MySelfActivity;
import com.example.usercwq.medicalmall.ui.acticitys_my.NotifyActivity;
import com.example.usercwq.medicalmall.ui.acticitys_my.MyOnlineActivity;
import com.example.usercwq.medicalmall.ui.acticitys_my.AddShoppingActicty;
import com.example.usercwq.medicalmall.ui.acticitys_my.CollectActivity;
import com.example.usercwq.medicalmall.ui.acticitys_my.SiteActivity;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by usercwq on 2019/11/5.
 */

public class MyFragment extends BaseFragment<SuoPresenter, SuoView> {

    @BindView(R.id.tongzhi_my)
    ImageView mTongzhiMy;
    Unbinder unbinder;
    @BindView(R.id.iv_head)
    ImageView mIvHead;
    @BindView(R.id.user_head)
    TextView mUserHead;
    @BindView(R.id.tv_school)
    TextView mTvSchool;
    @BindView(R.id.tv_modify)
    TextView mTvModify;
    @BindView(R.id.img1)
    ImageView mImg1;
    @BindView(R.id.txt1)
    TextView mTxt1;
    @BindView(R.id.rel_person)
    RelativeLayout mRelPerson;
    @BindView(R.id.rl_cart)
    RelativeLayout mRlCart;
    @BindView(R.id.rl_my_order)
    RelativeLayout mRlMyOrder;
    @BindView(R.id.rl_address)
    RelativeLayout mRlAddress;
    @BindView(R.id.rl_my_class)
    RelativeLayout mRlMyClass;
    @BindView(R.id.rl_mycollect)
    RelativeLayout mRlMycollect;
    @BindView(R.id.rl_online_ask)
    RelativeLayout mRlOnlineAsk;
    @BindView(R.id.rl_call_custom)
    RelativeLayout mRlCallCustom;
    @BindView(R.id.rl_about_us)
    RelativeLayout mRlAboutUs;
    @BindView(R.id.tv_exit)
    TextView mTvExit;
    @BindView(R.id.sv_my)
    ScrollView mSvMy;
    @BindView(R.id.img2)
    ImageView mImg2;
    @BindView(R.id.txt2)
    TextView mTxt2;
    @BindView(R.id.img3)
    ImageView mImg3;
    @BindView(R.id.txt3)
    TextView mTxt3;
    @BindView(R.id.img4)
    ImageView mImg4;
    @BindView(R.id.txt4)
    TextView mTxt4;
    @BindView(R.id.img5)
    ImageView mImg5;
    @BindView(R.id.txt5)
    TextView mTxt5;
    @BindView(R.id.img6)
    ImageView mImg6;
    @BindView(R.id.txt6)
    TextView mTxt6;
    @BindView(R.id.img8)
    ImageView mImg8;
    @BindView(R.id.txt8)
    TextView mTxt8;
    @BindView(R.id.img9)
    ImageView mImg9;
    @BindView(R.id.txt9)
    TextView mTxt9;
    @BindView(R.id.img10)
    ImageView mImg10;
    @BindView(R.id.txt10)
    TextView mTxt10;
    private Uri mUri;

    public static MyFragment getInstener() {
        MyFragment tiKuFragment = new MyFragment();
        Bundle bundle = new Bundle();
        tiKuFragment.setArguments(bundle);
        return tiKuFragment;
    }

    @Override
    protected SuoPresenter initPresenrer() {
        return new SuoPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_my;
    }

    @Override
    public void initView() {

        Glide.with(getActivity())
                .applyDefaultRequestOptions(new RequestOptions().circleCrop())
                .load(R.mipmap.ic_dream)
                .into(mIvHead);
        mUserHead.setText("Long");

    }

    @OnClick({R.id.iv_head, R.id.rel_person, R.id.rl_cart, R.id.rl_my_order, R.id.rl_address,
            R.id.rl_my_class, R.id.rl_mycollect, R.id.rl_online_ask, R.id.rl_call_custom,
            R.id.rl_about_us, R.id.tv_exit, R.id.tv_modify})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_head://切换头像并上传
                Intent intent1 = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent1,100);
                break;
            case R.id.rel_person://个人资料
                startActivity(new Intent(getActivity(), MySelfActivity.class));
                break;
            case R.id.rl_cart://购物车
                startActivity(new Intent(getActivity(), AddShoppingActicty.class));
                break;
            case R.id.rl_my_order://我的订单
                startActivity(new Intent(getActivity(), MyOrderActivity.class));
                break;
            case R.id.rl_address://收货地址
                startActivity(new Intent(getActivity(), SiteActivity.class));
                break;
            case R.id.rl_my_class://我的课程
                startActivity(new Intent(getActivity(), MyClassActivity.class));
                break;
            case R.id.rl_mycollect://我的收藏
                startActivity(new Intent(getActivity(), CollectActivity.class));
                break;
            case R.id.rl_online_ask://在线咨询
                startActivity(new Intent(getActivity(), MyOnlineActivity.class));
                break;
            case R.id.rl_call_custom://联系客服
                Intent call = new Intent(Intent.ACTION_DIAL);
                Uri data = Uri.parse("tel:400-838-3813");
                call.setData(data);
                startActivity(call);
                break;
            case R.id.rl_about_us://关于我们
                startActivity(new Intent(getActivity(), MyAboutActivity.class));
                break;
            case R.id.tv_exit://退出登录
                String s = mTvExit.getText().toString();
                if (s.equals("登录")) {
                    mTvExit.setText("退出登录");
                    Intent intent = new Intent(getActivity(), LoginActivity.class);
                    startActivity(intent);
                }
                break;
            case R.id.tv_modify://预报名
                startActivity(new Intent(getActivity(), MySchoolActivity.class));
                break;
        }
    }

    //回传的头像
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 100){
            mUri = data.getData();
            Glide.with(getActivity())
                    .applyDefaultRequestOptions(new RequestOptions().circleCrop())
                    .load(mUri).into(mIvHead);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.tongzhi_my)//通知
    public void onViewClicked() {
        startActivity(new Intent(getActivity(), NotifyActivity.class));
    }

}

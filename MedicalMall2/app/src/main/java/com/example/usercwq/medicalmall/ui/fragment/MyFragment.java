package com.example.usercwq.medicalmall.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.mvp.view.presenter.SuoPresenter;
import com.example.usercwq.medicalmall.mvp.view.view.SuoView;
import com.example.usercwq.medicalmall.ui.acticitys_my.LoginActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
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
    Unbinder unbinder1;

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

    @OnClick({R.id.iv_head, R.id.rel_person, R.id.rl_cart, R.id.rl_my_order, R.id.rl_address,
            R.id.rl_my_class, R.id.rl_mycollect, R.id.rl_online_ask, R.id.rl_call_custom,
            R.id.rl_about_us, R.id.tv_exit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_head:
                startActivity(new Intent(getActivity(), LoginActivity.class));
                break;
            case R.id.rel_person:
                startActivity(new Intent(getActivity(), LoginActivity.class));
                break;
            case R.id.rl_cart:
                startActivity(new Intent(getActivity(), LoginActivity.class));
                break;
            case R.id.rl_my_order:
                startActivity(new Intent(getActivity(), LoginActivity.class));
                break;
            case R.id.rl_address:
                startActivity(new Intent(getActivity(), LoginActivity.class));
                break;
            case R.id.rl_my_class:
                startActivity(new Intent(getActivity(), LoginActivity.class));
                break;
            case R.id.rl_mycollect:
                startActivity(new Intent(getActivity(), LoginActivity.class));
                break;
            case R.id.rl_online_ask:
                startActivity(new Intent(getActivity(), LoginActivity.class));
                break;
            case R.id.rl_call_custom:
                startActivity(new Intent(getActivity(), LoginActivity.class));
                break;
            case R.id.rl_about_us:
                startActivity(new Intent(getActivity(), LoginActivity.class));
                break;
            case R.id.tv_exit:
                String s = mTvExit.getText().toString();
                if (s.equals("登录")){
                    mTvExit.setText("退出登录");
                    Intent intent = new Intent(getActivity(), LoginActivity.class);
                    startActivity(intent);

                }

                break;
        }
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder1.unbind();
    }
}

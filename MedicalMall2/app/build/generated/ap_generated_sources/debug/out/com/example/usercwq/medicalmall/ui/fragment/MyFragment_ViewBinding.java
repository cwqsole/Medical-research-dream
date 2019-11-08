// Generated code from Butter Knife. Do not modify!
package com.example.usercwq.medicalmall.ui.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.usercwq.medicalmall.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyFragment_ViewBinding implements Unbinder {
  private MyFragment target;

  private View view2131230858;

  private View view2131230915;

  private View view2131230927;

  private View view2131230930;

  private View view2131230924;

  private View view2131230929;

  private View view2131230931;

  private View view2131230932;

  private View view2131230926;

  private View view2131230923;

  private View view2131231008;

  @UiThread
  public MyFragment_ViewBinding(final MyFragment target, View source) {
    this.target = target;

    View view;
    target.mTongzhiMy = Utils.findRequiredViewAsType(source, R.id.tongzhi_my, "field 'mTongzhiMy'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.iv_head, "field 'mIvHead' and method 'onViewClicked'");
    target.mIvHead = Utils.castView(view, R.id.iv_head, "field 'mIvHead'", ImageView.class);
    view2131230858 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.mUserHead = Utils.findRequiredViewAsType(source, R.id.user_head, "field 'mUserHead'", TextView.class);
    target.mTvSchool = Utils.findRequiredViewAsType(source, R.id.tv_school, "field 'mTvSchool'", TextView.class);
    target.mTvModify = Utils.findRequiredViewAsType(source, R.id.tv_modify, "field 'mTvModify'", TextView.class);
    target.mImg1 = Utils.findRequiredViewAsType(source, R.id.img1, "field 'mImg1'", ImageView.class);
    target.mTxt1 = Utils.findRequiredViewAsType(source, R.id.txt1, "field 'mTxt1'", TextView.class);
    view = Utils.findRequiredView(source, R.id.rel_person, "field 'mRelPerson' and method 'onViewClicked'");
    target.mRelPerson = Utils.castView(view, R.id.rel_person, "field 'mRelPerson'", RelativeLayout.class);
    view2131230915 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rl_cart, "field 'mRlCart' and method 'onViewClicked'");
    target.mRlCart = Utils.castView(view, R.id.rl_cart, "field 'mRlCart'", RelativeLayout.class);
    view2131230927 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rl_my_order, "field 'mRlMyOrder' and method 'onViewClicked'");
    target.mRlMyOrder = Utils.castView(view, R.id.rl_my_order, "field 'mRlMyOrder'", RelativeLayout.class);
    view2131230930 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rl_address, "field 'mRlAddress' and method 'onViewClicked'");
    target.mRlAddress = Utils.castView(view, R.id.rl_address, "field 'mRlAddress'", RelativeLayout.class);
    view2131230924 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rl_my_class, "field 'mRlMyClass' and method 'onViewClicked'");
    target.mRlMyClass = Utils.castView(view, R.id.rl_my_class, "field 'mRlMyClass'", RelativeLayout.class);
    view2131230929 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rl_mycollect, "field 'mRlMycollect' and method 'onViewClicked'");
    target.mRlMycollect = Utils.castView(view, R.id.rl_mycollect, "field 'mRlMycollect'", RelativeLayout.class);
    view2131230931 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rl_online_ask, "field 'mRlOnlineAsk' and method 'onViewClicked'");
    target.mRlOnlineAsk = Utils.castView(view, R.id.rl_online_ask, "field 'mRlOnlineAsk'", RelativeLayout.class);
    view2131230932 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rl_call_custom, "field 'mRlCallCustom' and method 'onViewClicked'");
    target.mRlCallCustom = Utils.castView(view, R.id.rl_call_custom, "field 'mRlCallCustom'", RelativeLayout.class);
    view2131230926 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rl_about_us, "field 'mRlAboutUs' and method 'onViewClicked'");
    target.mRlAboutUs = Utils.castView(view, R.id.rl_about_us, "field 'mRlAboutUs'", RelativeLayout.class);
    view2131230923 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_exit, "field 'mTvExit' and method 'onViewClicked'");
    target.mTvExit = Utils.castView(view, R.id.tv_exit, "field 'mTvExit'", TextView.class);
    view2131231008 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.mSvMy = Utils.findRequiredViewAsType(source, R.id.sv_my, "field 'mSvMy'", ScrollView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTongzhiMy = null;
    target.mIvHead = null;
    target.mUserHead = null;
    target.mTvSchool = null;
    target.mTvModify = null;
    target.mImg1 = null;
    target.mTxt1 = null;
    target.mRelPerson = null;
    target.mRlCart = null;
    target.mRlMyOrder = null;
    target.mRlAddress = null;
    target.mRlMyClass = null;
    target.mRlMycollect = null;
    target.mRlOnlineAsk = null;
    target.mRlCallCustom = null;
    target.mRlAboutUs = null;
    target.mTvExit = null;
    target.mSvMy = null;

    view2131230858.setOnClickListener(null);
    view2131230858 = null;
    view2131230915.setOnClickListener(null);
    view2131230915 = null;
    view2131230927.setOnClickListener(null);
    view2131230927 = null;
    view2131230930.setOnClickListener(null);
    view2131230930 = null;
    view2131230924.setOnClickListener(null);
    view2131230924 = null;
    view2131230929.setOnClickListener(null);
    view2131230929 = null;
    view2131230931.setOnClickListener(null);
    view2131230931 = null;
    view2131230932.setOnClickListener(null);
    view2131230932 = null;
    view2131230926.setOnClickListener(null);
    view2131230926 = null;
    view2131230923.setOnClickListener(null);
    view2131230923 = null;
    view2131231008.setOnClickListener(null);
    view2131231008 = null;
  }
}

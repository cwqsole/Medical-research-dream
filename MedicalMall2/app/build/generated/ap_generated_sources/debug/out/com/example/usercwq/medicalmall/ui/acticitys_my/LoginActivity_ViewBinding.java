// Generated code from Butter Knife. Do not modify!
package com.example.usercwq.medicalmall.ui.acticitys_my;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.usercwq.medicalmall.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  private View view2131230856;

  private View view2131231028;

  private View view2131231075;

  private View view2131231024;

  private View view2131231027;

  private View view2131231033;

  private View view2131231029;

  private View view2131231017;

  private View view2131231010;

  private View view2131231030;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(final LoginActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.iv_back, "field 'mIvBack' and method 'onViewClicked'");
    target.mIvBack = Utils.castView(view, R.id.iv_back, "field 'mIvBack'", ImageView.class);
    view2131230856 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_quick_login, "field 'mTvQuickLogin' and method 'onViewClicked'");
    target.mTvQuickLogin = Utils.castView(view, R.id.tv_quick_login, "field 'mTvQuickLogin'", TextView.class);
    view2131231028 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.view_quick, "field 'mViewQuick' and method 'onViewClicked'");
    target.mViewQuick = view;
    view2131231075 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_pass_login, "field 'mTvPassLogin' and method 'onViewClicked'");
    target.mTvPassLogin = Utils.castView(view, R.id.tv_pass_login, "field 'mTvPassLogin'", TextView.class);
    view2131231024 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.mViewPass = Utils.findRequiredView(source, R.id.view_pass, "field 'mViewPass'");
    target.mEtQuickPhone = Utils.findRequiredViewAsType(source, R.id.et_quick_phone, "field 'mEtQuickPhone'", EditText.class);
    target.mEtQuickCode = Utils.findRequiredViewAsType(source, R.id.et_quick_code, "field 'mEtQuickCode'", EditText.class);
    view = Utils.findRequiredView(source, R.id.tv_quick_get_code, "field 'mTvQuickGetCode' and method 'onViewClicked'");
    target.mTvQuickGetCode = Utils.castView(view, R.id.tv_quick_get_code, "field 'mTvQuickGetCode'", TextView.class);
    view2131231027 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_submit_quick_login, "field 'mTvSubmitQuickLogin' and method 'onViewClicked'");
    target.mTvSubmitQuickLogin = Utils.castView(view, R.id.tv_submit_quick_login, "field 'mTvSubmitQuickLogin'", TextView.class);
    view2131231033 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_quick_register, "field 'mTvQuickRegister' and method 'onViewClicked'");
    target.mTvQuickRegister = Utils.castView(view, R.id.tv_quick_register, "field 'mTvQuickRegister'", TextView.class);
    view2131231029 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.mLlQuick = Utils.findRequiredViewAsType(source, R.id.ll_quick, "field 'mLlQuick'", LinearLayout.class);
    target.mEtPhone = Utils.findRequiredViewAsType(source, R.id.et_phone, "field 'mEtPhone'", EditText.class);
    target.mEtPass = Utils.findRequiredViewAsType(source, R.id.et_pass, "field 'mEtPass'", EditText.class);
    view = Utils.findRequiredView(source, R.id.tv_login, "field 'mTvLogin' and method 'onViewClicked'");
    target.mTvLogin = Utils.castView(view, R.id.tv_login, "field 'mTvLogin'", TextView.class);
    view2131231017 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_find_pass, "field 'mTvFindPass' and method 'onViewClicked'");
    target.mTvFindPass = Utils.castView(view, R.id.tv_find_pass, "field 'mTvFindPass'", TextView.class);
    view2131231010 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_register, "field 'mTvRegister' and method 'onViewClicked'");
    target.mTvRegister = Utils.castView(view, R.id.tv_register, "field 'mTvRegister'", TextView.class);
    view2131231030 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.mLlPass = Utils.findRequiredViewAsType(source, R.id.ll_pass, "field 'mLlPass'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mIvBack = null;
    target.mTvQuickLogin = null;
    target.mViewQuick = null;
    target.mTvPassLogin = null;
    target.mViewPass = null;
    target.mEtQuickPhone = null;
    target.mEtQuickCode = null;
    target.mTvQuickGetCode = null;
    target.mTvSubmitQuickLogin = null;
    target.mTvQuickRegister = null;
    target.mLlQuick = null;
    target.mEtPhone = null;
    target.mEtPass = null;
    target.mTvLogin = null;
    target.mTvFindPass = null;
    target.mTvRegister = null;
    target.mLlPass = null;

    view2131230856.setOnClickListener(null);
    view2131230856 = null;
    view2131231028.setOnClickListener(null);
    view2131231028 = null;
    view2131231075.setOnClickListener(null);
    view2131231075 = null;
    view2131231024.setOnClickListener(null);
    view2131231024 = null;
    view2131231027.setOnClickListener(null);
    view2131231027 = null;
    view2131231033.setOnClickListener(null);
    view2131231033 = null;
    view2131231029.setOnClickListener(null);
    view2131231029 = null;
    view2131231017.setOnClickListener(null);
    view2131231017 = null;
    view2131231010.setOnClickListener(null);
    view2131231010 = null;
    view2131231030.setOnClickListener(null);
    view2131231030 = null;
  }
}

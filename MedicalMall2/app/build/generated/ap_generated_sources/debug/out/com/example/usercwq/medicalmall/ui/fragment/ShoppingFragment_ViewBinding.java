// Generated code from Butter Knife. Do not modify!
package com.example.usercwq.medicalmall.ui.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.usercwq.medicalmall.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ShoppingFragment_ViewBinding implements Unbinder {
  private ShoppingFragment target;

  @UiThread
  public ShoppingFragment_ViewBinding(ShoppingFragment target, View source) {
    this.target = target;

    target.mShopTitle = Utils.findRequiredViewAsType(source, R.id.shop_title, "field 'mShopTitle'", TextView.class);
    target.mShopToolbar = Utils.findRequiredViewAsType(source, R.id.shop_toolbar, "field 'mShopToolbar'", Toolbar.class);
    target.mShopTab = Utils.findRequiredViewAsType(source, R.id.shop_tab, "field 'mShopTab'", TabLayout.class);
    target.mShopViewpager = Utils.findRequiredViewAsType(source, R.id.shop_viewpager, "field 'mShopViewpager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ShoppingFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mShopTitle = null;
    target.mShopToolbar = null;
    target.mShopTab = null;
    target.mShopViewpager = null;
  }
}

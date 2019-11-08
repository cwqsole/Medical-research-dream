// Generated code from Butter Knife. Do not modify!
package com.example.usercwq.medicalmall.ui.fragment_forum;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.usercwq.medicalmall.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ForumFragment_ViewBinding implements Unbinder {
  private ForumFragment target;

  @UiThread
  public ForumFragment_ViewBinding(ForumFragment target, View source) {
    this.target = target;

    target.mTvSchool = Utils.findRequiredViewAsType(source, R.id.tv_school, "field 'mTvSchool'", TextView.class);
    target.mTvLuntan = Utils.findRequiredViewAsType(source, R.id.tv_luntan, "field 'mTvLuntan'", TextView.class);
    target.mRlBg = Utils.findRequiredViewAsType(source, R.id.rl_bg, "field 'mRlBg'", RelativeLayout.class);
    target.mImageRelease = Utils.findRequiredViewAsType(source, R.id.image_release, "field 'mImageRelease'", ImageView.class);
    target.mImageRight = Utils.findRequiredViewAsType(source, R.id.image_right, "field 'mImageRight'", ImageView.class);
    target.mTabChannel = Utils.findRequiredViewAsType(source, R.id.tab_channel, "field 'mTabChannel'", TabLayout.class);
    target.mTvOperation = Utils.findRequiredViewAsType(source, R.id.tv_operation, "field 'mTvOperation'", TextView.class);
    target.mVpForum = Utils.findRequiredViewAsType(source, R.id.vp_forum, "field 'mVpForum'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ForumFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTvSchool = null;
    target.mTvLuntan = null;
    target.mRlBg = null;
    target.mImageRelease = null;
    target.mImageRight = null;
    target.mTabChannel = null;
    target.mTvOperation = null;
    target.mVpForum = null;
  }
}

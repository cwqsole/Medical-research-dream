// Generated code from Butter Knife. Do not modify!
package com.example.usercwq.medicalmall.ui.main;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.usercwq.medicalmall.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131230912;

  private View view2131230911;

  private View view2131230908;

  private View view2131230909;

  private View view2131230910;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.fl = Utils.findRequiredViewAsType(source, R.id.fl, "field 'fl'", FrameLayout.class);
    view = Utils.findRequiredView(source, R.id.rb_tiku, "field 'rbTiku' and method 'onClick'");
    target.rbTiku = Utils.castView(view, R.id.rb_tiku, "field 'rbTiku'", RadioButton.class);
    view2131230912 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rb_sharpping, "field 'rbSharpping' and method 'onClick'");
    target.rbSharpping = Utils.castView(view, R.id.rb_sharpping, "field 'rbSharpping'", RadioButton.class);
    view2131230911 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rb_kecheng, "field 'rbKecheng' and method 'onClick'");
    target.rbKecheng = Utils.castView(view, R.id.rb_kecheng, "field 'rbKecheng'", RadioButton.class);
    view2131230908 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rb_luntan, "field 'rbLuntan' and method 'onClick'");
    target.rbLuntan = Utils.castView(view, R.id.rb_luntan, "field 'rbLuntan'", RadioButton.class);
    view2131230909 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rb_my, "field 'rbMy' and method 'onClick'");
    target.rbMy = Utils.castView(view, R.id.rb_my, "field 'rbMy'", RadioButton.class);
    view2131230910 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.rg = Utils.findRequiredViewAsType(source, R.id.rg, "field 'rg'", RadioGroup.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.fl = null;
    target.rbTiku = null;
    target.rbSharpping = null;
    target.rbKecheng = null;
    target.rbLuntan = null;
    target.rbMy = null;
    target.rg = null;

    view2131230912.setOnClickListener(null);
    view2131230912 = null;
    view2131230911.setOnClickListener(null);
    view2131230911 = null;
    view2131230908.setOnClickListener(null);
    view2131230908 = null;
    view2131230909.setOnClickListener(null);
    view2131230909 = null;
    view2131230910.setOnClickListener(null);
    view2131230910 = null;
  }
}

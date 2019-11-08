// Generated code from Butter Knife. Do not modify!
package com.example.usercwq.medicalmall.ui.fragment.shopping_fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.usercwq.medicalmall.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WholeFragment_ViewBinding implements Unbinder {
  private WholeFragment target;

  @UiThread
  public WholeFragment_ViewBinding(WholeFragment target, View source) {
    this.target = target;

    target.mWholeRecycler = Utils.findRequiredViewAsType(source, R.id.whole_recycler, "field 'mWholeRecycler'", RecyclerView.class);
    target.mWholeSmart = Utils.findRequiredViewAsType(source, R.id.whole_smart, "field 'mWholeSmart'", SmartRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WholeFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mWholeRecycler = null;
    target.mWholeSmart = null;
  }
}

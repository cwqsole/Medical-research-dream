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

public class CurriculumFragment_ViewBinding implements Unbinder {
  private CurriculumFragment target;

  @UiThread
  public CurriculumFragment_ViewBinding(CurriculumFragment target, View source) {
    this.target = target;

    target.mCurrRecycler = Utils.findRequiredViewAsType(source, R.id.curr_recycler, "field 'mCurrRecycler'", RecyclerView.class);
    target.mCurrSmart = Utils.findRequiredViewAsType(source, R.id.curr_smart, "field 'mCurrSmart'", SmartRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CurriculumFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mCurrRecycler = null;
    target.mCurrSmart = null;
  }
}

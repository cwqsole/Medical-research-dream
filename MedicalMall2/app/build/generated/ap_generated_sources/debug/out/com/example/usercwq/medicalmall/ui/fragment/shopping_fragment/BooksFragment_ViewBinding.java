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

public class BooksFragment_ViewBinding implements Unbinder {
  private BooksFragment target;

  @UiThread
  public BooksFragment_ViewBinding(BooksFragment target, View source) {
    this.target = target;

    target.mBooksRecycler = Utils.findRequiredViewAsType(source, R.id.books_recycler, "field 'mBooksRecycler'", RecyclerView.class);
    target.mBooksSmart = Utils.findRequiredViewAsType(source, R.id.books_smart, "field 'mBooksSmart'", SmartRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BooksFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mBooksRecycler = null;
    target.mBooksSmart = null;
  }
}

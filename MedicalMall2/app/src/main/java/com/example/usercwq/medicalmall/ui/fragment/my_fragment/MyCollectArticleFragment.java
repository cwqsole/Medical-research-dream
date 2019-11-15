package com.example.usercwq.medicalmall.ui.fragment.my_fragment;


import android.support.v4.app.Fragment;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.mvp.view.presenter.my_presenter.CollectArticlePresenter;
import com.example.usercwq.medicalmall.mvp.view.view.my_view.CollectArticleView;
import com.example.usercwq.medicalmall.ui.fragment.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyCollectArticleFragment extends BaseFragment<CollectArticlePresenter, CollectArticleView> implements CollectArticleView {

    @Override
    protected CollectArticlePresenter initPresenrer() {
        return new CollectArticlePresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_my_collect_article;
    }

}

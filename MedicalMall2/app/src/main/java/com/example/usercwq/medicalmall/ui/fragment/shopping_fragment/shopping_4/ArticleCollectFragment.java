package com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_4;


import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.mvp.view.presenter.shopping_presenter.shopping_4.ArticleCollectPresenter;
import com.example.usercwq.medicalmall.mvp.view.view.shopping_view.shooping_4.ArticleCollectView;
import com.example.usercwq.medicalmall.ui.fragment.BaseFragment;

public class ArticleCollectFragment extends BaseFragment<ArticleCollectPresenter, ArticleCollectView> implements ArticleCollectView {

    @Override
    protected ArticleCollectPresenter initPresenrer() {
        return new ArticleCollectPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.article_collect;
    }
}

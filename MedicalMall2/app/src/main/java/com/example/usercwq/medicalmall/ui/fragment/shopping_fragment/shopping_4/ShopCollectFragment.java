package com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.app.MyLication;
import com.example.usercwq.medicalmall.bean.shopping_bean.ShopBean;
import com.example.usercwq.medicalmall.db.ShopBeanDao;
import com.example.usercwq.medicalmall.mvp.view.presenter.shopping_presenter.shopping_4.ShopCollectPresenter;
import com.example.usercwq.medicalmall.mvp.view.view.shopping_view.shooping_4.ShopCollectView;
import com.example.usercwq.medicalmall.ui.adapters.shopping_adpter.MyCollectAdapter;
import com.example.usercwq.medicalmall.ui.fragment.BaseFragment;
import com.example.usercwq.medicalmall.ui.fragment.shopping_fragment.shopping_2.WholeCommodity2Activity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class ShopCollectFragment extends BaseFragment<ShopCollectPresenter, ShopCollectView> implements ShopCollectView {


    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;
    @BindView(R.id.ll_container)
    LinearLayout mLlContainer;
    Unbinder unbinder;
    private MyCollectAdapter mMyCollectAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.article_shop;

    }


    @Override
    public void initView() {

        ShopBeanDao shopBeanDao = MyLication.getInstance().getDaoSession().getShopBeanDao();
        List<ShopBean> shopBeans = shopBeanDao.loadAll();
        Log.i("1111", "initView: " + shopBeans.size());
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        mMyCollectAdapter = new MyCollectAdapter((ArrayList<ShopBean>) shopBeans, getContext());
        mRecyclerView.setAdapter(mMyCollectAdapter);

//        //接口回调
//        mMyCollectAdapter.setOnCreatLayout(new MyCollectAdapter.OnCreatLayout() {
//            @Override
//            public void OnCreackLayout(int position) {
//                Intent intent = new Intent(getActivity(), WholeCommodity2Activity.class);
//                startActivity(intent);
//            }
//        });
    }

    @Override
    protected ShopCollectPresenter initPresenrer() {
        return new ShopCollectPresenter();
    }

}

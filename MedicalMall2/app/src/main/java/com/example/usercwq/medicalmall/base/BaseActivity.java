package com.example.usercwq.medicalmall.base;

import android.Manifest;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;

import com.example.usercwq.medicalmall.utils.LoadingDialog;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by usercwq on 2019/10/31.
 */

public abstract class BaseActivity<P extends BasePresenter,V extends BaseView>
        extends AppCompatActivity implements BaseView{

    public P mPresenter;
    private Unbinder bind;
    private LoadingDialog loadingDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        if(Build.VERSION.SDK_INT>=23){
            String[] mPermissionList = new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.READ_PHONE_STATE, Manifest.permission.READ_EXTERNAL_STORAGE};
            ActivityCompat.requestPermissions(this,mPermissionList,123);
        }
        bind = ButterKnife.bind(this);
        mPresenter = initPresenter();
        if (mPresenter!=null){
            mPresenter.bindView((V)this);
        }

        initView();
        initData();
        initListener();
    }

    @Override
    public void showLoading() {
        if (loadingDialog==null){
            loadingDialog = new LoadingDialog(this);
        }
        loadingDialog.show();
    }

    @Override
    public void hideLoading() {
        if (loadingDialog==null){
            loadingDialog = new LoadingDialog(this);
        }
        loadingDialog.hide();
    }

    public void initData() {

    }

    public void initListener() {

    }

    public void initView() {

    }

    protected abstract P initPresenter();

    protected abstract int getLayoutId();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
        if (mPresenter!=null){
            mPresenter.destroy();
            mPresenter=null;
        }

    }
}

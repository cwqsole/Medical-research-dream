package com.example.usercwq.medicalmall.base;

import java.util.ArrayList;

/**
 * Created by usercwq on 2019/10/31.
 */

public abstract class BasePresenter<V extends BaseView> {
    public V mView;
    private ArrayList<BaseModel> baseModels=new ArrayList<>();
    public BasePresenter(){

        initModel();
    }

    protected abstract void initModel();


    public void bindView(V view) {
        this.mView=view;
    }

    public void addModel(BaseModel baseModel){
        baseModels.add(baseModel);

    }


    public void destroy() {
        mView=null;
        for (int i=0;i<baseModels.size();i++){

            BaseModel baseModel = baseModels.get(i);

            baseModel.destory();

        }
    }

}

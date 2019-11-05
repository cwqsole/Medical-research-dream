package com.example.usercwq.medicalmall.base;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by usercwq on 2019/10/31.
 */

public class BaseModel {

    private CompositeDisposable compositeDisposable=null;
    public void destory() {
        if (compositeDisposable!=null){
            compositeDisposable.dispose();
        }
    }



    public void addDisposable(Disposable d) {
        if (compositeDisposable==null){
            compositeDisposable= new CompositeDisposable();
        }
        compositeDisposable.add(d);
    }

    public void removeDisposable(Disposable mDisposable) {
        if (compositeDisposable!=null){
            compositeDisposable.remove(mDisposable);
        }
    }
}

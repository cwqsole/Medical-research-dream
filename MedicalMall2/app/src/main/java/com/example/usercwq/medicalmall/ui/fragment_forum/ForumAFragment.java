package com.example.usercwq.medicalmall.ui.fragment_forum;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.usercwq.medicalmall.R;
import com.example.usercwq.medicalmall.mvp.view.presenter.forum_presenter.ForumAPrenseter;
import com.example.usercwq.medicalmall.mvp.view.view.forum_view.ForumAView;
import com.example.usercwq.medicalmall.ui.fragment.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class ForumAFragment extends BaseFragment<ForumAPrenseter, ForumAView>implements ForumAView {
private String id;
    public void setId(String id) {
        this.id=id;
    }
    public ForumAFragment() {
        // Required empty public constructor
    }



    @Override
    protected ForumAPrenseter initPresenrer() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return 0;
    }

}

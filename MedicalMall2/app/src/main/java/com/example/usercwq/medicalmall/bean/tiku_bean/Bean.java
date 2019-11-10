package com.example.usercwq.medicalmall.bean.tiku_bean;

import java.util.ArrayList;
import java.util.List;

public class Bean {
    private String id;
    private  List<TikuBean.InfoBean.UTypeBean.ZTypeBean> u_type;

    public Bean(String id, List<TikuBean.InfoBean.UTypeBean.ZTypeBean> u_type) {
        this.id = id;
        this.u_type = u_type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public  List<TikuBean.InfoBean.UTypeBean.ZTypeBean> getU_type() {
        return u_type;
    }

    public void setU_type( List<TikuBean.InfoBean.UTypeBean.ZTypeBean> u_type) {
        this.u_type = u_type;
    }
}

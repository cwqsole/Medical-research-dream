package com.example.usercwq.medicalmall.bean.my_bean;

import java.io.Serializable;
import java.util.List;

public class MyNotifyBean implements Serializable {


    /**
     * ret : 200
     * info : [{"id":"25","title":"这个医研梦的最新更新推送","addtime":"2018-11-24 11:49:34","content":"这是一段测试公告;爱迪生发生大发","authName":"admin"}]
     * mas : 成功
     */

    private String ret;
    private String mas;
    private List<InfoBean> info;

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getMas() {
        return mas;
    }

    public void setMas(String mas) {
        this.mas = mas;
    }

    public List<InfoBean> getInfo() {
        return info;
    }

    public void setInfo(List<InfoBean> info) {
        this.info = info;
    }

    public static class InfoBean implements Serializable{
        /**
         * id : 25
         * title : 这个医研梦的最新更新推送
         * addtime : 2018-11-24 11:49:34
         * content : 这是一段测试公告;爱迪生发生大发
         * authName : admin
         */

        private String id;
        private String title;
        private String addtime;
        private String content;
        private String authName;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthName() {
            return authName;
        }

        public void setAuthName(String authName) {
            this.authName = authName;
        }
    }
}

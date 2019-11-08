package com.example.usercwq.medicalmall.net;

import java.util.List;

public class ForumTabBean {

    /**
     * ret : 200
     * info : [{"id":"68","name":"医学英语缩写","image":"https://app.yiyanmeng.com:443/Upload/article/2019-07-10/5d2593be20739.jpg","type":"2"},{"id":"32","name":"历年复试真题","image":"https://app.yiyanmeng.com:443/Upload/article/2019-01-12/5c38d309b6f40.jpg","type":"2"},{"id":"66","name":"推免研究生资格","image":null,"type":"2"}]
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

    public static class InfoBean {
        /**
         * id : 68
         * name : 医学英语缩写
         * image : https://app.yiyanmeng.com:443/Upload/article/2019-07-10/5d2593be20739.jpg
         * type : 2
         */

        private String id;
        private String name;
        private String image;
        private String type;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}

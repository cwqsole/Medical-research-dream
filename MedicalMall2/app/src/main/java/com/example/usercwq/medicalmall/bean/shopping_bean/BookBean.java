package com.example.usercwq.medicalmall.bean.shopping_bean;

import java.util.List;

public class BookBean {

    /**
     * ret : 200
     * info : [{"id":"56","name":"全套押题三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/e5f0fbf1916f3aa646d2749b72f7688c.jpg","hao_ping":"5","xian_price":"580.00","re_mai":"1"},{"id":"57","name":"内 外 人文套餐","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/39a35ec6110fe0fb26b83605c8f57c5c.jpg","hao_ping":"5","xian_price":"300.00","re_mai":"1"},{"id":"55","name":"小三门套餐","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/4e00edfd89206f054b13fedc43f09218.jpg","hao_ping":"5","xian_price":"280.00","re_mai":"1"},{"id":"59","name":"外科三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/276d87c91096e7e6fedd52bde25fbaa6.jpg","hao_ping":"5","xian_price":"109.00","re_mai":"1"},{"id":"58","name":"内科三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/f0e97cc2ad56d9eba055523ad0f46af9.jpg","hao_ping":"5","xian_price":"109.00","re_mai":"1"},{"id":"54","name":"生化三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/64e9e546d43df67eab17b0e0f9ee21ca.jpg","hao_ping":"5","xian_price":"99.00","re_mai":"1"},{"id":"53","name":"生理三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/8c3cd864cf18c7d015ba8627e770d55c.jpg","hao_ping":"5","xian_price":"99.00","re_mai":"1"},{"id":"52","name":"病理三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/0f4dcd8a79ef610dafa6b2b2b5f13bab.jpg","hao_ping":"5","xian_price":"99.00","re_mai":"1"},{"id":"51","name":"十天玩转内科","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/9ee3ce397e80bf2912772b4b6d55e7aa.jpg","hao_ping":"5","xian_price":"79.00","re_mai":"1"},{"id":"42","name":"2020马上爱内科","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/440bf4d06388b777c127257716783ad5.jpg","hao_ping":"5","xian_price":"109.00","re_mai":"1"},{"id":"35","name":"外科强化满分秘籍","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/309fcde7a5650b175dd3f7fe827f274e.jpg","hao_ping":"5","xian_price":"109.00","re_mai":"1"},{"id":"49","name":"2020内科题库","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/0e8ded47faf07df91cc2dbc9582e8b28.jpg","hao_ping":"5","xian_price":"119.00","re_mai":"1"},{"id":"48","name":"2020外科题库","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/606a05b8a439325c0ff68e13b7c484e4.jpg","hao_ping":"5","xian_price":"119.00","re_mai":"1"},{"id":"44","name":"生化学零笔记","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/23e5d7dd89bc4e41f76086bc86595aa2.jpg","hao_ping":"5","xian_price":"99.00","re_mai":"1"},{"id":"43","name":"生理学零笔记","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/a03766cf2d7f0a3a9c9ddb3160e87927.jpg","hao_ping":"5","xian_price":"99.00","re_mai":"1"},{"id":"11","name":"2020年西综","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/1ac0cb20e2bd4e2c96eb2b7a03c517d8.jpg","hao_ping":"5","xian_price":"179.00","re_mai":"1"}]
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
         * id : 56
         * name : 全套押题三套卷
         * pic : https://app.yiyanmeng.com:443/Public/shop_xiang_qing/e5f0fbf1916f3aa646d2749b72f7688c.jpg
         * hao_ping : 5
         * xian_price : 580.00
         * re_mai : 1
         */

        private String id;
        private String name;
        private String pic;
        private String hao_ping;
        private String xian_price;
        private String re_mai;

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

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getHao_ping() {
            return hao_ping;
        }

        public void setHao_ping(String hao_ping) {
            this.hao_ping = hao_ping;
        }

        public String getXian_price() {
            return xian_price;
        }

        public void setXian_price(String xian_price) {
            this.xian_price = xian_price;
        }

        public String getRe_mai() {
            return re_mai;
        }

        public void setRe_mai(String re_mai) {
            this.re_mai = re_mai;
        }
    }
}

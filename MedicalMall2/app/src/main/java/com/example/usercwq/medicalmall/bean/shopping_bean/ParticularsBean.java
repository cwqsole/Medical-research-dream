package com.example.usercwq.medicalmall.bean.shopping_bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ParticularsBean {

    /**
     * ret : 200
     * info : {"shop":{"name":"全套押题三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/e5f0fbf1916f3aa646d2749b72f7688c.jpg","yuan_price":"614.00","xian_price":"580.00","feng_pic":["https://app.yiyanmeng.com:443/Public/shop_xiang_qing/afde9bac4cf15f858cfe35780230fc3a.jpg"],"ding":"1","wu_li_you":"1","new":"1","fa_huo_time":"1","yun_price":"0.00","yue_shou":"102","fa_huo_di":"辽宁省大连市","type_id":"9","re_mai":"1","zhekou":"8","desc":"","shop_desc":"","is_sp":"0","xiang_qing":"https://app.yiyanmeng.com:443/index.php/index/shop_xiang_qing/id/56"},"shop_ping":null,"cid":"56"}
     * mas : 成功!
     */

    private String ret;
    private InfoBean info;
    private String mas;

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public String getMas() {
        return mas;
    }

    public void setMas(String mas) {
        this.mas = mas;
    }

    public static class InfoBean {
        /**
         * shop : {"name":"全套押题三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/e5f0fbf1916f3aa646d2749b72f7688c.jpg","yuan_price":"614.00","xian_price":"580.00","feng_pic":["https://app.yiyanmeng.com:443/Public/shop_xiang_qing/afde9bac4cf15f858cfe35780230fc3a.jpg"],"ding":"1","wu_li_you":"1","new":"1","fa_huo_time":"1","yun_price":"0.00","yue_shou":"102","fa_huo_di":"辽宁省大连市","type_id":"9","re_mai":"1","zhekou":"8","desc":"","shop_desc":"","is_sp":"0","xiang_qing":"https://app.yiyanmeng.com:443/index.php/index/shop_xiang_qing/id/56"}
         * shop_ping : null
         * cid : 56
         */

        private ShopBean shop;
        private Object shop_ping;
        private String cid;

        public ShopBean getShop() {
            return shop;
        }

        public void setShop(ShopBean shop) {
            this.shop = shop;
        }

        public Object getShop_ping() {
            return shop_ping;
        }

        public void setShop_ping(Object shop_ping) {
            this.shop_ping = shop_ping;
        }

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }


    }

}

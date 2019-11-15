package com.example.usercwq.medicalmall.bean.shopping_bean;

import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.List;
import org.greenrobot.greendao.annotation.Generated;
@Entity
public  class ShopBean {
    /**
     * name : 全套押题三套卷
     * pic : https://app.yiyanmeng.com:443/Public/shop_xiang_qing/e5f0fbf1916f3aa646d2749b72f7688c.jpg
     * yuan_price : 614.00
     * xian_price : 580.00
     * feng_pic : ["https://app.yiyanmeng.com:443/Public/shop_xiang_qing/afde9bac4cf15f858cfe35780230fc3a.jpg"]
     * ding : 1
     * wu_li_you : 1
     * new : 1
     * fa_huo_time : 1
     * yun_price : 0.00
     * yue_shou : 102
     * fa_huo_di : 辽宁省大连市
     * type_id : 9
     * re_mai : 1
     * zhekou : 8
     * desc :
     * shop_desc :
     * is_sp : 0
     * xiang_qing : https://app.yiyanmeng.com:443/index.php/index/shop_xiang_qing/id/56
     */
    @Id(autoincrement = true)
    private Long id;
    private String name;
    private String pic;
    private String yuan_price;
    private String xian_price;
    private String ding;
    private String wu_li_you;
    private String newX;
    private String fa_huo_time;
    private String yun_price;
    private String yue_shou;
    private String fa_huo_di;
    private String type_id;
    private String re_mai;
    private String zhekou;
    private String desc;
    private String shop_desc;
    private String is_sp;
    private String xiang_qing;
    @Generated(hash = 967274510)
    public ShopBean(Long id, String name, String pic, String yuan_price, String xian_price, String ding,
            String wu_li_you, String newX, String fa_huo_time, String yun_price, String yue_shou,
            String fa_huo_di, String type_id, String re_mai, String zhekou, String desc, String shop_desc,
            String is_sp, String xiang_qing) {
        this.id = id;
        this.name = name;
        this.pic = pic;
        this.yuan_price = yuan_price;
        this.xian_price = xian_price;
        this.ding = ding;
        this.wu_li_you = wu_li_you;
        this.newX = newX;
        this.fa_huo_time = fa_huo_time;
        this.yun_price = yun_price;
        this.yue_shou = yue_shou;
        this.fa_huo_di = fa_huo_di;
        this.type_id = type_id;
        this.re_mai = re_mai;
        this.zhekou = zhekou;
        this.desc = desc;
        this.shop_desc = shop_desc;
        this.is_sp = is_sp;
        this.xiang_qing = xiang_qing;
    }
    @Generated(hash = 748345971)
    public ShopBean() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPic() {
        return this.pic;
    }
    public void setPic(String pic) {
        this.pic = pic;
    }
    public String getYuan_price() {
        return this.yuan_price;
    }
    public void setYuan_price(String yuan_price) {
        this.yuan_price = yuan_price;
    }
    public String getXian_price() {
        return this.xian_price;
    }
    public void setXian_price(String xian_price) {
        this.xian_price = xian_price;
    }
    public String getDing() {
        return this.ding;
    }
    public void setDing(String ding) {
        this.ding = ding;
    }
    public String getWu_li_you() {
        return this.wu_li_you;
    }
    public void setWu_li_you(String wu_li_you) {
        this.wu_li_you = wu_li_you;
    }
    public String getNewX() {
        return this.newX;
    }
    public void setNewX(String newX) {
        this.newX = newX;
    }
    public String getFa_huo_time() {
        return this.fa_huo_time;
    }
    public void setFa_huo_time(String fa_huo_time) {
        this.fa_huo_time = fa_huo_time;
    }
    public String getYun_price() {
        return this.yun_price;
    }
    public void setYun_price(String yun_price) {
        this.yun_price = yun_price;
    }
    public String getYue_shou() {
        return this.yue_shou;
    }
    public void setYue_shou(String yue_shou) {
        this.yue_shou = yue_shou;
    }
    public String getFa_huo_di() {
        return this.fa_huo_di;
    }
    public void setFa_huo_di(String fa_huo_di) {
        this.fa_huo_di = fa_huo_di;
    }
    public String getType_id() {
        return this.type_id;
    }
    public void setType_id(String type_id) {
        this.type_id = type_id;
    }
    public String getRe_mai() {
        return this.re_mai;
    }
    public void setRe_mai(String re_mai) {
        this.re_mai = re_mai;
    }
    public String getZhekou() {
        return this.zhekou;
    }
    public void setZhekou(String zhekou) {
        this.zhekou = zhekou;
    }
    public String getDesc() {
        return this.desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getShop_desc() {
        return this.shop_desc;
    }
    public void setShop_desc(String shop_desc) {
        this.shop_desc = shop_desc;
    }
    public String getIs_sp() {
        return this.is_sp;
    }
    public void setIs_sp(String is_sp) {
        this.is_sp = is_sp;
    }
    public String getXiang_qing() {
        return this.xiang_qing;
    }
    public void setXiang_qing(String xiang_qing) {
        this.xiang_qing = xiang_qing;
    }
   
    
}
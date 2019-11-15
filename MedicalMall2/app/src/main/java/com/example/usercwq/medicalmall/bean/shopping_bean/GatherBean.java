package com.example.usercwq.medicalmall.bean.shopping_bean;

public class GatherBean {
    private  String name; //名字

    private  String price;   //图片

    private  String YuanPrice; //价格

    private  String goods;  //放货

    private  String quantity;   //地址

    public GatherBean(String name, String price, String yuanPrice, String tvYueShou, String quantity) {
        this.name = name;
        this.price = price;
        YuanPrice = yuanPrice;
        goods = tvYueShou;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getYuanPrice() {
        return YuanPrice;
    }

    public void setYuanPrice(String yuanPrice) {
        YuanPrice = yuanPrice;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "GatherBean{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", YuanPrice='" + YuanPrice + '\'' +
                ", goods='" + goods + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}

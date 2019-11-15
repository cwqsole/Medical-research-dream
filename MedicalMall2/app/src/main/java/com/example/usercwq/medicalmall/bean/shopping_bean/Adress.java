package com.example.usercwq.medicalmall.bean.shopping_bean;

public class Adress {
    private  String name;
    private  String phone;
    private String address;
    private String details;

    public Adress(String name, String phone, String address, String details) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}

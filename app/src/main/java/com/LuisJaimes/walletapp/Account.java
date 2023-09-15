package com.LuisJaimes.walletapp;

public class Account {
    private String name;
    private String type;
    private Double currentValue;
    private String imgUrl;
    public Account(String name, String type, Double currentValue, String imgUrl) {
        this.name = name;
        this.type = type;
        this.currentValue = currentValue;
        this.imgUrl=imgUrl;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}

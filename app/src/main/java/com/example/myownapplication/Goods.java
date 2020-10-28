package com.example.myownapplication;

import java.io.Serializable;

public class Goods implements Serializable {
    private String title;
    private String price;
    private int icon;

    public Goods(String title, String price, int icon) {
        this.title = title;
        this.price = price;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "分类='" + title + '\'' +
                ", 作者='" + price + '\'' +
                ", 图片来源=" + icon +
                '}';
    }
}

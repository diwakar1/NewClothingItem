package com.example.java.module;

public abstract class ClothingItem implements Product {
    private String type;
    private int price;
    private  String size;

    public ClothingItem(String type, int price, String size) {
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract int getPrice() ;



    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "ClothingItem{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}

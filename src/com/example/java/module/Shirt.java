package com.example.java.module;

public class Shirt extends ClothingItem {

    private String pattern;


    public Shirt( int price, String size) {
        super("Messi", price, size);
    }



    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public int getPrice() {
        return 22;
    }
}

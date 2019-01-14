package com.example.java;

import com.example.java.module.ClothingItem;
import com.example.java.module.Product;
import com.example.java.module.Shirt;

public class Main {

    public static void main(String[] args) {


        Shirt  shirt = new Shirt(300,"big");
        displayProduct(shirt);
        shirt.setPattern("flat");
        System.out.println("the pattern is "+ shirt.getPattern());

        ClothingItem item1 = new Shirt(23,"small");
        displayProduct(item1);

        Shirt shirt1 = (Shirt) item1;

        shirt1.setPattern("wide");
        System.out.println("pattern = "+ shirt1.getPattern());

    }
    private static void displayProduct(Product product){
        String output = product.getClass().getSimpleName()+ "ClothingItem{" +
                "type='" + product.getType() + '\'' +
                ", price=" +product.getPrice() +
                ", size='" + product.getSize() + '\'' +
                '}';
        System.out.println(output);
    }


}

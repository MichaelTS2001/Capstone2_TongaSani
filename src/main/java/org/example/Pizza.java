package org.example;

import java.math.BigDecimal;

public class Pizza {

    //properties for a pizza
    private int size;
    private int crustType;
    private double price;
    private String topping;
    private String others;


    public Pizza(int size, int crustType, double price, String topping, String others) {

        this.size = size;
        this.crustType = crustType;
        this.price = price;
        this.topping = topping;
        this.others = others;
    }

    public int getSize() {
        if(size == 1){
           return size = 8;
        }
        else if(size == 2){
            return size = 12;
        }
        else{
            return size = 16;
        }
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCrustType() {
        return crustType;
    }

    public void setCrustType(int crustType) {
        this.crustType = crustType;
    }

    public BigDecimal getPrice() {

        if(size == 1){
           return BigDecimal.valueOf(8.50);
        }
        else if(size == 2){
            return BigDecimal.valueOf(12);
        }
        else{
            return BigDecimal.valueOf(16.50);
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    @Override
    public String toString() {
        return "size=" + size +
                '}';
    }
}

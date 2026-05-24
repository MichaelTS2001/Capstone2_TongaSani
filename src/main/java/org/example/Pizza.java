package org.example;

import java.math.BigDecimal;

public class Pizza {

    //properties for a pizza
    private double price;
    private String topping;
    private String others;

    //empty constructor
    public Pizza(){

    }

    public Pizza(double price, String topping, String others) {
        this.price = price;
        this.topping = topping;
        this.others = others;
    }

    public double getPrice() {
        return price;
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


}

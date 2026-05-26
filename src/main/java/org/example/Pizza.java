package org.example;

import java.math.BigDecimal;
import java.util.List;

public class Pizza {

    //properties for a pizza
    private int size;
    private String crustType;
    private double price;
    private List<Toppings> topping;
    private String others;

    public Pizza(){

    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCrustType() {

        return crustType;
    }

    public void setCrustType(String crustType) {
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

    public List<Toppings> getTopping() {
        return topping;
    }

    public void setTopping(List<Toppings> topping) {
        this.topping = topping;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

}

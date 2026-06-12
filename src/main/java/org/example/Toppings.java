package org.example;

import java.math.BigDecimal;

public class Toppings {
    private String name; //name of topping
    private String type; //type of topping (meat / cheese)
    private boolean premium;
    private BigDecimal price;

    public Toppings(String name, String type, boolean premium) {
        this.name = name;
        this.type = type;
        this.premium = premium;
        this.price = price;
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

    public BigDecimal getPrice(int size) {
        if(type.equalsIgnoreCase("Regular")){ //if the topping is not a premium(you don't have to pay for it), return $0 (already included / free)
            return new BigDecimal("0");
        }
        else if(type.equalsIgnoreCase("Meat")){
            if(size == 1) {
                return new BigDecimal("1");
            }
            else if(size == 2){
                return new BigDecimal("2"); //mismatch info
            }
            else{
                return new BigDecimal("3");
            }
        }
        else if(type.equalsIgnoreCase("Extra Meat")){
            if(size == 1) {
                return new BigDecimal("0.50");
            }
            else if(size == 2){
                return new BigDecimal("1");
            }
            else{
                return new BigDecimal("1.50");
            }
        }
        else if (type.equalsIgnoreCase("Extra Cheese")) {
            if(size == 1) {
                return new BigDecimal("0.30");
            }
            else if(size == 2){
                return new BigDecimal("0.60");
            }
            else{
                return new BigDecimal("0.90");
            }
        }
        else{
            if(size == 1) {
                return new BigDecimal("0.75");
            }
            else if(size == 2){
                return new BigDecimal("1.50");
            }
            else{
                return new BigDecimal("2.25");
            }
        }
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

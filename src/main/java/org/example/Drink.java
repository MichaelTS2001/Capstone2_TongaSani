package org.example;

import java.math.BigDecimal;

public class Drink extends MenuItem{
    private int size;


    public Drink(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public BigDecimal getPrice(int size) {

        BigDecimal sum = new BigDecimal("0");

        if(this.size == 1){
            sum = sum.add(new BigDecimal("2"));
        }
        else if(this.size == 2){
            sum = sum.add(new BigDecimal("2.50"));
        }
        else{
            sum = sum.add(new BigDecimal("3"));
        }
        return sum;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

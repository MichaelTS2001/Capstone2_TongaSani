package org.example;

import java.math.BigDecimal;
import java.util.List;

public class Pizza {

    //properties for a pizza
    private int size;
    private int crustType;
    private BigDecimal price;
    private int multiplier; //multiplies the cost of a topping based off the size of the pizza
    private List<Toppings> topping;

    public Pizza(int size, int crustType, List<Toppings> topping) {
        this.size = size;
        this.crustType = crustType;
        this.topping = topping;

    }

    public int getSize() {
        return size;
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


        BigDecimal sum = new BigDecimal(0);

        for(Toppings topping : topping){
            sum.add(topping.getPrice(size));
        }

        if(crustType == 1 || crustType == 2 || crustType == 3 || crustType == 4){
            if(size == 1){
                sum.add(new BigDecimal(8.50));
            }
            else if(size == 2){
                sum.add(new BigDecimal(12));
            }
            else{
                sum.add(new BigDecimal(16.50));
            }
        }

        return sum;
    }

    public void addTopping(Toppings topping){
        this.topping.add(topping);

        //clear list once an order is done before starting another
    }


}

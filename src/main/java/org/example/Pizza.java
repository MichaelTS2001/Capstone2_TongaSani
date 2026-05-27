package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pizza {

    //properties for a pizza
    private int size;
    private String crustType;
    private BigDecimal price;
    private List<Toppings> topping;

    public Pizza(int size, String crustType) {
        this.size = size;
        this.crustType = crustType;
        this.topping = new ArrayList<>();

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

    public List<Toppings> getTopping() {
        return topping;
    }

    public void setTopping(List<Toppings> topping) {
        this.topping = topping;
    }

    public BigDecimal getPrice() {


        BigDecimal sum = new BigDecimal(0);

        for(Toppings topping : topping){
            sum.add(topping.getPrice(size));
        }

        if(crustType.equalsIgnoreCase("Thin") || crustType.equalsIgnoreCase("Regular")
            || crustType.equalsIgnoreCase("Thick") || crustType.equalsIgnoreCase("Cauliflower")){
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

        //empty list of user's chosen toppings

       // topping.add(toppingsList);

        this.topping.add(topping);

        //clear list once an order is done before starting another
    }


}

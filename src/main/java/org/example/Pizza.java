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

    public Pizza(){
        this.topping = new ArrayList<>();
    }

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

        for(Toppings top : this.topping){
           sum = sum.add(top.getPrice(this.size));
        }

        if(this.crustType.equalsIgnoreCase("Thin") || this.crustType.equalsIgnoreCase("Regular")
            || this.crustType.equalsIgnoreCase("Thick") || this.crustType.equalsIgnoreCase("Cauliflower")){
            if(this.size == 1){
                sum = sum.add(new BigDecimal("8.50"));
            }
            else if(this.size == 2){
                sum = sum.add(new BigDecimal("12.00"));
            }
            else{
               sum=  sum.add(new BigDecimal("16.50"));
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

package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {

    public List<MenuItem> cart = new ArrayList<>();

    public void addToCart(Pizza pizza){
        cart.add(pizza);
    }

    public void addToCart(Drink drink){
        cart.add(drink);
    }

    public void addToCart(GarlicKnots knots){
        cart.add(knots);
    }

    public Pizza displayPizza(){
        for(MenuItem s : cart){
            if(s.getName().equalsIgnoreCase("Pizza")){
                return s;
            }
            else{

            }
        }
        return null;
    }

    public BigDecimal getCartTotal(){
        BigDecimal total = null;
        for(MenuItem item : cart){
            total =  total.add(item.getPrice());
        }

        return total;
    }

    public List<MenuItem> getCart(){
        return cart;
    }
}

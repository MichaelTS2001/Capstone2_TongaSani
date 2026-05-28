package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    public List<MenuItem> cart = new ArrayList<>();

    public void addToCart(Pizza pizza){
        cart.add(pizza);
    }

    public void addToCart(Drink drink){
        cart.add(drink);
    }

    public void removeFromCart(Pizza pizza){
        cart.remove(pizza);
    }

    public void removeFromCart(Drink drink){
        cart.remove(drink);
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

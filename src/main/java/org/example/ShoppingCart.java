package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {

    public List<MenuItem> cart = new ArrayList<>();

    public void addToCart(Pizza pizza){
        System.out.println(pizza);
        this.cart.add(pizza);
        System.out.println(this.cart);
    }

    public void addToCart(Drink drink){
        cart.add(drink);
    }

    public void addToCart(GarlicKnots knots){
        cart.add(knots);
    }

    public BigDecimal getCartTotal(){
        BigDecimal total = null;
        for(MenuItem item : this.cart){
            total = total.add(item.getPrice());
        }

        return total;
    }

    public List<MenuItem> getCart(){
        return this.cart;
    }
}

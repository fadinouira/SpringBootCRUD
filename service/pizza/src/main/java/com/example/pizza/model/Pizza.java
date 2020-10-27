package com.example.pizza.model;

public class Pizza {
    private String pizzaName ;
    private String ownerId ;
    private double price ;

    public Pizza(String pizzaType, String ownerId, double price) {
        this.pizzaName = pizzaType;
        this.ownerId = ownerId;
        this.price = price;
    }

    public String getPizzaType() {
        return pizzaName;
    }

    public void setPizzaType(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
}

package com.trading.Simulator.model;

public class Order {
    public enum Type {
        BUY, SELL
    }

    private Type type;
    private String user;
    private int price;
    private int quantity;

    public Order() {}

    public Order(Type type, String user, int price, int quantity) {
        this.type = type;
        this.user = user;
        this.price = price;
        this.quantity = quantity;
    }

    public Type getType() { return type; }
    public void setType(Type type) { this.type = type; }

    public String getUser() { return user; }
    public void setUser(String user) { this.user = user; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}


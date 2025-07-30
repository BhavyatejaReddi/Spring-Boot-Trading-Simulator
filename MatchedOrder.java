package com.trading.Simulator.model;

public class MatchedOrder {
    private String buyer;
    private String seller;
    private int price;
    private int quantity;

    public MatchedOrder(String buyer, String seller, int price, int quantity) {
        this.buyer = buyer;
        this.seller = seller;
        this.price = price;
        this.quantity = quantity;
    }

    public String getBuyer() { return buyer; }
    public String getSeller() { return seller; }
    public int getPrice() { return price; }
    public int getQuantity() { return quantity; }
}




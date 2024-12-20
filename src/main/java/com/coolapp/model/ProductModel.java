package com.coolapp.model;

public class ProductModel {
    private String name;
    private int quantity;
    private double price;

    public ProductModel() {
        name = "";
        quantity = 0;
        price = 0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "Nome: " + name +
                "\nQunatidade:" + quantity +
                "\nPreco: " + price;
    }
}

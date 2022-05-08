package com.example.itwebshop;

public class CartModel {

    private String itemName;
    private String itemPrice;
    private String itemImage;

    public CartModel(String itemName, String itemPrice, String itemImage) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemImage = itemImage;

    }

    public String getItemName() {
        return itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }
}

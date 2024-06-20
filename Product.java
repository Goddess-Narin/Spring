package com.exercise.springexercise.model;

public class Product
{
    private int productId;
    private String productName;
    private double pricePerUnit;

    public Product()
    {

    }
    public boolean isActiveForSell() {
        return activeForSell;
    }

    public void setActiveForSell(boolean activeForSell) {
        this.activeForSell = activeForSell;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    private boolean activeForSell;

    public Product(int productId, String productName, double pricePerUnit, boolean activeForSell) {
        this.productId = productId;
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.activeForSell = activeForSell;
    }



}

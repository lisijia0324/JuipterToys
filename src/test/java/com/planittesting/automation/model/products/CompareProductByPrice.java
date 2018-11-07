package com.planittesting.automation.model.products;

public class CompareProductByPrice implements CompareProduct {
    private double price;

    public CompareProductByPrice(Double price){
        this.price = price;
    }

    @Override
    public boolean compare(Product product) {
        return product.getPrice() == price;
    }
}

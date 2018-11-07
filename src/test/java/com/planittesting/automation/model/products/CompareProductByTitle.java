package com.planittesting.automation.model.products;

public class CompareProductByTitle implements CompareProduct{

    private String title;

    public CompareProductByTitle(String title){
        this.title = title;
    }

    @Override
    public boolean compare(Product product) {
        return product.getTitle().equals(title);
    }
}

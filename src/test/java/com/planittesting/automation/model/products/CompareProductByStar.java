package com.planittesting.automation.model.products;

public class CompareProductByStar implements CompareProduct {

    private Integer rate;

    public CompareProductByStar(Integer rate){
        this.rate = rate;
    }
    @Override
    public boolean compare(Product product) {
        return product.getStar() == rate;
    }
}

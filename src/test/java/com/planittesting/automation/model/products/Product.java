package com.planittesting.automation.model.products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Product {
    private WebElement rootElement;

    public Product(WebElement rootElement){
        this.rootElement = rootElement;
    }

    public String getTitle(){
        return rootElement.findElement(By.className("product-title")).getText();
    }

    public Double getPrice(){
        return Double.parseDouble(rootElement.findElement(By.className("product-price")).getText()
                .replace("$",""));
    }

    public Integer getStar(){
        return Integer.parseInt(rootElement.findElement(By.className("star-level")).getText());
    }

    public Product clickBuyButton(){
        rootElement.findElement(By.className("btn")).click();
        return this;
    }

}

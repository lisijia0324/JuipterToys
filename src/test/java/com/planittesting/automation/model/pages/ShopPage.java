package com.planittesting.automation.model.pages;

import com.planittesting.automation.model.products.CompareProduct;
import com.planittesting.automation.model.products.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;

public class ShopPage extends BasePage {
    public ShopPage(WebDriver driver) {
        super(driver);
    }

    public String getProductPrice(String product) {
        return getProductDetails().get(product);
    }

    private HashMap<String, String> getProductDetails() {
        List<WebElement> productElements = driver.findElements(By.className("product"));
        HashMap<String, String> productDetails = new HashMap<>();
        if (!productElements.isEmpty()) {
            for (WebElement pl : productElements) {
                productDetails.put(pl.findElement(By.className("product-title")).getText(),
                        pl.findElement(By.className("product-price")).getText().replace("$",""));
            }
        }
        return productDetails;
    }

    // Find product with required title
    public Product getProductByTitle(String title) throws Exception {
        List<WebElement> elements = driver.findElements(By.className("product"));

        for(WebElement pl:elements){
            Product product = new Product(pl);
            if(product.getTitle().equals(title)){
                return product;
            }
        }
        throw new Exception("Product not found!");
    }

    public Product getProduct(CompareProduct compareProduct) throws Exception {
        List<WebElement> elements = driver.findElements(By.className("product"));
        for (WebElement pl:elements){
            Product product = new Product(pl);
            if (compareProduct.compare(product)){
                return product;
            }
        }
        throw new Exception("Product not found!");
    }


}
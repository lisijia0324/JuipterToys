package com.planittesting.automation.JUnitTests;

import com.planittesting.automation.model.pages.HomePage;
import com.planittesting.automation.model.pages.ShopPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ShopTestSuit extends BaseTestSuit {

    //This is the test for version one
    public void verifyProductPrice() throws Exception {
        HomePage homePage = new HomePage(driver);
        homePage.clickShopMenu();

        ShopPage shopPage = new ShopPage(driver);
//        assertEquals("12.99", shopPage.getProductPrice("Teddy Bear"));    //HashMap method
//        assertEquals(12.99,shopPage.getProductByTitle("Teddy Bear").getPrice(),0.001);

        assertEquals(12.99, shopPage.getProduct(p -> p.getTitle().equals("Teddy Bear")).getPrice(),0.001);
    }

    @Test
    public void buyProductByPrice() throws Exception {
        HomePage homePage = new HomePage(driver);
        homePage.clickShopMenu();

        ShopPage shopPage = new ShopPage(driver);
        shopPage.getProduct(p->p.getPrice()==10.99).clickBuyButton();

        assertEquals(1, shopPage.getCartCount());
    }

    @Test
    public void buyProductByStar() throws Exception{
        HomePage homePage = new HomePage(driver);
        homePage.clickShopMenu();

        ShopPage shopPage = new ShopPage(driver);

        shopPage.getProduct(p->p.getStar()==2).clickBuyButton();
        assertEquals(1, shopPage.getCartCount());
    }
}

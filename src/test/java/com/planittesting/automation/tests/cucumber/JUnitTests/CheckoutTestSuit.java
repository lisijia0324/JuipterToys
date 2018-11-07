package com.planittesting.automation.tests.cucumber.JUnitTests;


import com.planittesting.automation.model.pages.CartPage;
import com.planittesting.automation.model.pages.HomePage;
import com.planittesting.automation.model.pages.ShopPage;
import com.planittesting.automation.model.products.Product;
import org.junit.jupiter.api.Test;

public class CheckoutTestSuit extends BaseTestSuit {

    @Test
    public void verifyCheckOut() throws Exception {
        HomePage homePage = new HomePage(driver);
        homePage.clickShopMenu();

        ShopPage shopPage = new ShopPage(driver);

        Product itemOne = shopPage.getProduct(p -> p.getTitle().equals("Handmade Doll"));
        itemOne.clickBuyButton().clickBuyButton().clickBuyButton();

        Product itemTwo = shopPage.getProduct(p -> p.getTitle().equals("Fluffy Bunny"));
        itemTwo.clickBuyButton().clickBuyButton();

        shopPage.clickCartMenu();
        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckOutButton();



    }
}

package com.planittesting.automation.tests.cucumber.JUnitTests;

import com.planittesting.automation.model.dialogs.RemoveItemDialog;
import com.planittesting.automation.model.pages.CartPage;
import com.planittesting.automation.model.pages.HomePage;
import com.planittesting.automation.model.pages.ShopPage;
import com.planittesting.automation.model.products.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTestSuit extends BaseTestSuit {
    @Test
    public void validateCartValue() throws Exception {
        HomePage homePage = new HomePage(driver);
        homePage.clickShopMenu();

        ShopPage shopPage = new ShopPage(driver);
        Product itemOne = shopPage.getProduct(p -> p.getTitle().equals("Handmade Doll"));
        double itemOnePrice = itemOne.getPrice();
        itemOne.clickBuyButton().clickBuyButton().clickBuyButton();

        Product itemTwo = shopPage.getProduct(p -> p.getTitle().equals("Fluffy Bunny"));
        double itemTwoPrice = itemTwo.getPrice();
        itemTwo.clickBuyButton().clickBuyButton();

        Product itemThree = shopPage.getProduct(p -> p.getTitle().equals("Smiley Face"));
        double itemThreePrice = itemThree.getPrice();
        itemThree.clickBuyButton();

        assertEquals(6, shopPage.getCartCount());

        shopPage.clickCartMenu();
        CartPage cartPage = new CartPage(driver);

        assertEquals(itemOnePrice, cartPage.getPrice("Handmade Doll"));
        assertEquals(itemTwoPrice, cartPage.getPrice("Fluffy Bunny"));
        assertEquals(itemThreePrice, cartPage.getPrice("Smiley Face"));

        assertEquals(3, cartPage.getQuantity("Handmade Doll"));
        assertEquals(2, cartPage.getQuantity("Fluffy Bunny"));
        assertEquals(1,cartPage.getQuantity("Smiley Face"));

        assertEquals(3*itemOnePrice, cartPage.getSubtotal("Handmade Doll"));
        assertEquals(2*itemTwoPrice, cartPage.getSubtotal("Fluffy Bunny"));
        assertEquals(1*itemThreePrice, cartPage.getSubtotal("Smiley Face"));

        assertEquals(3*itemOnePrice + 2*itemTwoPrice +1*itemThreePrice, cartPage.getTotal(),0.001);

        RemoveItemDialog removeItemDialog = cartPage.deleteItem("Smiley Face");
        removeItemDialog.clickYesToConfirm();

        assertEquals(3*itemOnePrice + 2*itemTwoPrice , cartPage.getTotal(),0.001);

        cartPage.updateQuantity("Handmade Doll", 2);
        assertEquals(2*itemOnePrice + 2*itemTwoPrice , cartPage.getTotal(),0.001);
    }
}

package com.planittesting.automation.tests.cucumber.steps;

import com.planittesting.automation.model.pages.HomePage;
import com.planittesting.automation.model.pages.ShopPage;
import com.planittesting.automation.tests.cucumber.World;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopSteps {
    private WebDriver driver;

    public ShopSteps(World world){
        this.driver = world.getDriver();
    }

    @When("^the user put order for selected product$")
    public void theUserPutOrderForSelectedProduct() throws Throwable {

        HomePage homePage = new HomePage(driver);
        homePage.clickShopMenu();

        ShopPage shopPage = new ShopPage(driver);
        shopPage.getProduct(p->p.getTitle().equals("Stuffed Frog")).clickBuyButton().clickBuyButton();

        assertEquals(2, shopPage.getCartCount());
    }

    @And("^the user checkout and submit order$")
    public void theUserCheckoutAndSubmitOrder() throws Throwable {

        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}

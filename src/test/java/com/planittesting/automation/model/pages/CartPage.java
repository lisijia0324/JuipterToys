package com.planittesting.automation.model.pages;

import com.planittesting.automation.model.dialogs.RemoveItemDialog;
import com.planittesting.automation.model.ui.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CartPage extends BasePage{

    private Table table;

    //Constructor
    public CartPage(WebDriver driver) {
        super(driver);
        table = new Table(driver.findElement(By.tagName("table")));
    }

    public double getPrice(String item) throws Exception {
        return Double.parseDouble(table.getValue("Item",item,"Price").
                replace("$",""));
    }

    public double getSubtotal(String item) throws Exception {
        return Double.parseDouble(table.getValue("Item",item,"Subtotal")
                .replace("$",""));
    }

    public int getQuantity(String item) throws Exception {
        return Integer.parseInt(table.getValue("Item", item,"Quantity"));
    }

    public double getTotal(){
        return Double.parseDouble(driver.findElement(By.tagName("tfoot")).findElement(By.className("total")).getText()
                .replace("Total: ",""));
    }

    public RemoveItemDialog deleteItem(String item) throws Exception {
        table.deleteItem("Item",item,"Actions");
        return new RemoveItemDialog(driver.findElement(By.className("popup")));
    }

    public void updateQuantity(String item, int quantity) throws Exception{
        table.setValue("Item", item, "Quantity" ,String.valueOf(quantity));
    }

    public void clickCheckOutButton() {
        driver.findElement(By.className("btn-success")).click();
    }
}

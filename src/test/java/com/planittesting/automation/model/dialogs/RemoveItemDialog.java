package com.planittesting.automation.model.dialogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RemoveItemDialog {
    private WebElement rootElement;

    public RemoveItemDialog(WebElement rootElement){
        this.rootElement = rootElement;
    }

    public void clickYesToConfirm(){
        rootElement.findElement(By.className("btn-success")).click();
    }

}

package com.planittesting.automation.model.ui;

import com.planittesting.automation.model.dialogs.RemoveItemDialog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Table {
    public WebElement rootElement;

    public Table(WebElement rootElement){
        this.rootElement = rootElement;
    }

    private Integer getTableIndex(String columnName) throws Exception {
        int index =0;
        List<WebElement> headers = rootElement.findElements(By.tagName("th"));
        for(WebElement th:headers){
            if(th.getText().equals(columnName)){
                  return index;
            }
            index ++;
        }
        throw new Exception("Can not find table header!");
    }

    private WebElement getWebElement(String searchColumnName, String searchColumnValue, String returnColumnName)
            throws Exception {
        List<WebElement> rows = rootElement.findElements(By.cssSelector("tbody tr"));

        int searchColumnIndex = getTableIndex(searchColumnName);
        int returnColumnIndex = getTableIndex(returnColumnName);

        for (WebElement row:rows){
            List<WebElement> cellsValue = row.findElements(By.tagName("td"));
            if (cellsValue.get(searchColumnIndex).getText().equals(searchColumnValue)){
                return cellsValue.get(returnColumnIndex);
            }
        }
        throw new Exception("No matched value found!");
    }

    public String getValue(String searchColumnName, String searchColumnValue, String returnColumnName)
            throws Exception {

        WebElement webElement = getWebElement(searchColumnName,searchColumnValue,returnColumnName);
        if (webElement.findElements(By.tagName("input")).isEmpty()){
            return webElement.getText();
        }else{
            return webElement.findElement(By.tagName("input")).getAttribute("value");
        }
    }

    public void setValue(String searchColumnName, String searchColumnValue, String returnColumnName, String value)
            throws Exception {

        WebElement webElement = getWebElement(searchColumnName,searchColumnValue,returnColumnName);
        if(!webElement.findElements(By.tagName("input")).isEmpty()){
            webElement.findElement(By.tagName("input")).clear();
            webElement.findElement(By.tagName("input")).sendKeys(value);
            return;
        }

    }

    public RemoveItemDialog deleteItem(String searchColumnName, String searchColumnValue, String returnColumnName)
            throws Exception {

        WebElement webElement = getWebElement(searchColumnName,searchColumnValue,returnColumnName);
        webElement.findElement(By.className("remove-item")).click();
        return new RemoveItemDialog(rootElement);
    }


}

package com.qascript.Utills;

import com.qascript.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class BrowserUtills extends BaseClass {

    static Properties properties = PropertiesUtil.loadUserProperties();

    public static void clickElement(String element){
       findAndWaitForElement(element).click();
    }

    public static void enterText(String element,String text){

        findAndWaitForElement(element).clear();
        driver.findElement(By.xpath(element)).sendKeys(text);
    }

    public static WebElement findAndWaitForElement(String xpath){

        String timeout = properties.getProperty("timeout.maimum");
        WebElement element= null;

        try {
            WebDriverWait wait = new WebDriverWait(driver, Long.parseLong(timeout));
            element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath))));

        }catch (Exception e){
            System.out.println("Element not found");

        }
        return element;
    }
}

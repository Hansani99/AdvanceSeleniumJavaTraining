package com.qascript.PageObjects;

import com.qascript.BaseClass;
import com.qascript.Utills.BrowserUtills;
import org.openqa.selenium.By;

public class LoginPage extends BaseClass {
    private static String txtEmail="//input[@id='input-email']";
    private static String txtPassword = "//input[@id='input-password']";
    private static String btnLogin ="//input[@value='Login']";
    private static String linkForgottenPassword ="(//a[text()='Forgotten Password'])[1]";

    public static void  enterUsername(String  email){
       BrowserUtills.enterText(txtEmail,email);
    }

    public static void  enterPassword(String  password){
       BrowserUtills.enterText(txtPassword,password);
    }

    public static void clickLogin(){
        BrowserUtills.clickElement(btnLogin);
    }

    public static void clickForgottenPassword(){
        driver.findElement(By.xpath(linkForgottenPassword)).click();
    }
}

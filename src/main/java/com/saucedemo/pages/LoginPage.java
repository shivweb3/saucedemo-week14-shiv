package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNameField = By.id("user-name");
    By passwordField = By.name("password");
    By loginInButton = By.id("login-button");
    By titleText = By.xpath("//span[contains(text(),'Products')]");
    By listOfProducts = By.xpath("//div[@class='inventory_item_name']");

    public void enterUserName(String username) {
        sendTextToElement(userNameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginInButton);
    }

    public String getTitleText() {
        return getTextFromElement(titleText);
    }

    public String getListOfProducts() {
        return getTextFromElement(listOfProducts);
    }

}

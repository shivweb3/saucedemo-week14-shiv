package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getTitleText(), "PRODUCTS", "Text not matched");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(6, 6, loginPage.getListOfProducts());

    }
}

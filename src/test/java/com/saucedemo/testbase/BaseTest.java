package com.saucedemo.testbase;

import com.saucedemo.propertyreader.PropertyReader;
import com.saucedemo.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = "Chrome";

    @BeforeMethod

    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }

    private void closeBrowser() {
    }


}

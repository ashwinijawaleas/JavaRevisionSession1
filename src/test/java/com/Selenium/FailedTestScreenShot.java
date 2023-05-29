package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners (OverrideListener.class)
public class FailedTestScreenShot extends FbGeneral{
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver=driverInit();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }
    @Test
    public void takeScreenShotTest(){
        Assert.assertEquals("true","false");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }




}

package com.Selenium;
import org.openqa.selenium.WebDriver;
import com.Zerodha.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class FbTestClass {
    WebDriver driver;
    FbGeneral base;
    FbUtilClass utilObj;
    FbSignUpPOM element;

  

    @BeforeClass
    public void BrowserSetUP() {
      System.setProperty("webdriver.chrome.driver", ConfigFile.ChromedirverPath);
      driver = new ChromeDriver();
      element=new FbSignUpPOM(driver);
      utilObj=new FbUtilClass();

    }

    @BeforeMethod
    public void appLogin(){
        driver.navigate().to(ConfigFile.appURL);
        driver.manage().window().maximize();
    }
    @Test
    public void FbLoginTest() throws IOException {

        element.setfName(utilObj.DataDrivenFb(0,0));
        element.setSurname(utilObj.DataDrivenFb(0,1));
        element.setMobileNo(utilObj.DataDrivenFb(0,2));
        element.setPasswordS(utilObj.DataDrivenFb(0,3));
        element.setDob_day("25");
        element.setDob_month("May");
        element.setDob_year("1995");
        element.setGender_Male();
        element.setSign_up();
    }
    @AfterMethod
    public void logOut() throws InterruptedException {
        Thread.sleep(5000);
    }
    @AfterClass
    public void tearDown(){
        driver.manage().deleteAllCookies();
        driver.quit();

    }

}

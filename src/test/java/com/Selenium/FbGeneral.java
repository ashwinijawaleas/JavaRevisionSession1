package com.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import java.io.File;
import java.io.IOException;
import java.util.Date;



public class FbGeneral {
    static WebDriver driver;
    public static WebDriver driverInit(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
         return driver;
    }

    public static void TakeFailedScreenShot(ITestResult result) throws IOException {
        Date d = new Date();
        String name=result.getMethod().getMethodName()+d.getTime();

        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest=new File("D:\\Ys Akshay\\Java Programs\\Zerodha\\FailedTestScreenShots\\"+name+".png");
        FileHandler.copy(src,dest);




    }
}

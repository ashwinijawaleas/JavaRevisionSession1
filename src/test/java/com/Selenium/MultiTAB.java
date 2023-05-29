package com.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiTAB {
    @Test
    public void tabTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://www.google.com/");
        int windowNum =driver.getWindowHandles().size();
        System.out.println("Window Numbers before "+windowNum);

        windowNum=driver.getWindowHandles().size();


        System.out.println("Window Numbers after "+windowNum);
    }
}

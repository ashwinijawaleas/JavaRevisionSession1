package com.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaits {

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
       // driver.manage().timeouts().implicitlyWait(60, TimeUnit.DAYS);
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement e = driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='gNO89b'])[1]")));
        String s = e.getCssValue("color");
        System.out.println(s);
        driver.quit();

        }
    }


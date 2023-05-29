package com.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecutorTest {

    @Test
    public void ScrollTest() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        ////p//a[text()='About Selenium']
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.navigate().to("https://www.selenium.dev/");
        driver.manage().window().maximize();

        // WebElement
        WebElement element = driver.findElement(By.xpath("//p//a[text()='About Selenium']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView[true];",element);
        element.click();
        Thread.sleep(5000);
        driver.quit();

    }
}

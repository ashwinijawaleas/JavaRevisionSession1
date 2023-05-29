package com.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class Synchronization {
    @Test
    public void testing() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
        // Page Load Timeout
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        // Implicit wait
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver,5);
        WebElement link = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p//a[text()='About Selenium']")));
        link.click();
        Thread.sleep(5000);

    }


}

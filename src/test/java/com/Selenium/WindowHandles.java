package com.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandles{

    @Test
    public void multiWindowHandles() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("https://secure.indeed.com/auth");
        driver.manage().window().maximize();

        WebElement googleSignIn = driver.findElement(By.xpath("//button[@id='login-google-button']"));
        String ParentId=driver.getWindowHandle();
        googleSignIn.click();
        Set<String> Ids = driver.getWindowHandles();

        for(String id:Ids){
            if(id.equalsIgnoreCase(ParentId)){
                continue;
            }
            else
            {
                driver.switchTo().window(id);
                driver.manage().window().maximize();
                //driver.findElement(By.xpath("//div[text()='Use another account']")).click();
                Thread.sleep(5000);
                driver.close();

            }

        }
        driver.switchTo().window(ParentId);
        driver.manage().window().fullscreen();
        driver.close();
    }
}

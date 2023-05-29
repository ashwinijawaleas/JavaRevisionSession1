package com.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class RobotClassTest {

    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/"); // sample url
        driver.manage().window().maximize();
        String ParentId=driver.getWindowHandle();
        Robot bt=new Robot();
        bt.keyPress(KeyEvent.VK_CONTROL);
        bt.keyPress(KeyEvent.VK_T);
        bt.keyRelease(KeyEvent.VK_CONTROL);
        bt.keyRelease(KeyEvent.VK_T);
        Thread.sleep(5000);
        Set<String> id = driver.getWindowHandles();
        for(String tId:id){
            if(!tId.equalsIgnoreCase(String.valueOf(ParentId))){
                driver.switchTo().window(String.valueOf(tId));
                driver.navigate().to("https://www.facebook.com/");
                driver.findElement(By.xpath("//input[@name='email']")).click();
                JavascriptExecutor js = ((JavascriptExecutor) driver);
                js.executeScript("document.getElementById('email').value='ekurge@gmail.com'");
                Thread.sleep(5000);
                driver.close();
            }
        }

        driver.switchTo().window(ParentId);
        Thread.sleep(5000);
        driver.close();



    }
}
package com.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableHandlining {
    @Test
    public void webTable() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.guru99.com/test/web-table-element.php");
        driver.manage().window().maximize();
        int col = driver.findElements(By.xpath("//table//thead//tr//th")).size();
        int row = driver.findElements(By.xpath("//table//tbody//tr")).size();

        for (int i = 1; i <=row; i++) {
            String beforeXpath="//div[@id='leftcontainer']/table/tbody/tr["+i+"]/td[";
            String afterXpath="]";
            for(int j=1;j<col;j++){
               String Xpath=beforeXpath+j+afterXpath;
                String value = driver.findElement(By.xpath(Xpath)).getText();
                System.out.print(value+" ");
            }
            System.out.println();

        }

    }
}

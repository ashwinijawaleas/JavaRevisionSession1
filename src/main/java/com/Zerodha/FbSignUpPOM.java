package com.Zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FbSignUpPOM {
    @FindBy(xpath = " //input[@name='firstname']")
    private WebElement fName;
    @FindBy(xpath = "//input[@aria-label='Surname']")
    private WebElement surname;
    @FindBy(xpath = "//input[@aria-label='Mobile number or email address']")
    private WebElement mobileNo;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement password;
    @FindBy(xpath = "//select[@id='day']")
    private WebElement dob_day;
    @FindBy(xpath = "//select[@id='month']")
    private WebElement dob_month;
    @FindBy(xpath = "//select[@id='year']")
    private WebElement dob_year;
    @FindBy(xpath = "//input[@value='1' and @name='sex']")
    private WebElement gender_Female;
    @FindBy(xpath = "//input[@value='2' and @name='sex']")
    private WebElement gender_Male;
    @FindBy(xpath = "//input[@value='-1' and @name='sex']")
    private WebElement gender_Custom;
    @FindBy(xpath = "//div[@class='_1lch']//button[text()='Sign Up']")
    private WebElement sign_up;

    @FindBy(css = "body")
    public WebElement elementBody;

    @FindBy(css = "body")
    public WebElement elementBody2;

    @FindBy(css = "body")
    public WebElement elementBody3;
    @FindBy(css = "body")
    public WebElement elementBody4;
    public FbSignUpPOM(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void setfName(String name) {
        fName.sendKeys(name);
    }
    public void setSurname(String lastName) {
        surname.sendKeys(lastName);
    }
    public void setMobileNo(String mobNo) {
        mobileNo.sendKeys(mobNo);
    }
    public void setPasswordS(String passcode) {
        password.sendKeys(passcode);
    }
    public void setDob_day(String day) {
        Select dbDay = new Select(dob_day);
        dbDay.selectByVisibleText(day);
    }
    public void setDob_month(String month) {
        Select dbMonth = new Select(dob_month);
        dbMonth.selectByVisibleText(month);
    }
    public void setDob_year(String year) {
        Select dbYear = new Select(dob_year);
        dbYear.selectByVisibleText(year);
    }
    public void setGender_Female() {
        gender_Female.click();
    }
    public void setGender_Male() {
        gender_Male.click();
    }
    public void setGender_Custom() {
        gender_Custom.click();
    }
    public void setSign_up() {
        sign_up.click();
    }
}


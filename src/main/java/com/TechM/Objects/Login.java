package com.TechM.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    @FindBy(id = "userID")
    public WebElement userId;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(id = "signin")
    public WebElement SignIn;


    public void loginIntoPage(String userName, String passwordTxt) {
        userId.sendKeys(userName);
        password.sendKeys(passwordTxt);
        SignIn.click();
    }

    WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}

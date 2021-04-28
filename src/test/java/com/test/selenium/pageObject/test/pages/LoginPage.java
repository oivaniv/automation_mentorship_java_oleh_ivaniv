package com.test.selenium.pageObject.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends HomePage {
    public LoginPage(WebDriver driver){
        //PageFactory.initElements(driver,this);
    }


    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(css = "login")
    private WebElement loginButton;

    public LoginPage loginIntoSystem(String username, String password){
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
        //return new HomePage(); - error is shown :(
        return null;
    }
}

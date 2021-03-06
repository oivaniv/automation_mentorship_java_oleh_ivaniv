package com.test.selenium.pageObject.avenga.lessons.tests;

import com.test.selenium.pageObject.avenga.lessons.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;

    public LoginPage openLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        return new LoginPage(driver);
    }
}

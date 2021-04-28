package com.test.selenium.pageObject.seleniumPractice.tests;

import com.test.selenium.pageObject.seleniumPractice.pages.HomePage;
import com.test.selenium.pageObject.seleniumPractice.pages.SearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;

    public HomePage openHomePage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return new HomePage(driver);
    }

    public SearchPage openSearchPage(){
        return new SearchPage(driver);
    }
}

package com.test.selenium.pageObject.tests;

import com.test.selenium.pageObject.pages.HomePage;
import com.test.selenium.pageObject.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    private LoginPage loginPage;

    @BeforeClass
    public void beforeClass() {
        loginPage = openLoginPage();
    }

    @Test
    public void verifyLoginTest() {
        HomePage homePage = loginPage.loginIntoSystem("test", "123test");

        Assert.assertTrue(homePage.isOpened(), "Home page should be opened after login");
    }


}

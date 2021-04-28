package com.test.selenium.pageObject.seleniumPractice.tests;

import com.test.selenium.pageObject.seleniumPractice.pages.HomePage;
import com.test.selenium.pageObject.seleniumPractice.pages.SearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static com.test.selenium.pageObject.seleniumPractice.helpers.TestData.*;

public class HomePageTest extends BaseTest {
    private HomePage homePage;
    private SearchPage searchPage;

    @BeforeMethod
    public void beforeClass() {
        homePage = openHomePage();
        searchPage = openSearchPage();
    }

    @Test
    public void verifyHomePageTitleTest() {
        Assert.assertEquals(driver.getTitle(),homePageTitle);
    }

    @Test
    public void verifyHomePageTabsTest() {
        Assert.assertTrue(homePage.isWomenTabButtonDisplayed());
        Assert.assertEquals(homePage.womenTabTitleText(),womenTabTitle);
    }

    @Test
    public void verifyItemSearchFunctionality() {
        homePage.searchItem();
        Assert.assertEquals(searchPage.searchResultTitleValue().replaceAll("\\W",""), textToSearch);
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}

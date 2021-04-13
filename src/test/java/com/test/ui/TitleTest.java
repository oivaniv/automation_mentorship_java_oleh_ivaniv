package com.test.ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

public class TitleTest {
    WebDriver driver;

    @BeforeMethod
    public void setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
    }

    //alwaysRun - use to run this after method always
    @AfterMethod (alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }

    @Test
    @Description("Test to check search page title")
    public void testTitle() {
        WebElement searchInput = driver.findElement(By.xpath("//input[@id='search_query_top']"));
        searchInput.sendKeys("dress");
        searchInput.sendKeys(Keys.ENTER);
        assertTrue(driver.getTitle().equals("Search - My Store"));
    }

    @Test
    @Description("Test to check results to contain t-shirt item")
    public void testSearchPage() {

        WebElement searchInput = driver.findElement(By.xpath("//input[@id='search_query_top']"));
        searchInput.sendKeys("dress");
        searchInput.sendKeys(Keys.ENTER);

        List<WebElement> searchResult = driver.findElements(By.xpath("//li[contains(@class, 'ajax_block_product')]"));

        //To find one element from list by stream
        WebElement tShirt = searchResult
                .stream()
                .filter(element -> element.getText().contains("T-shirts"))
                .findAny()
                .orElseThrow();

        assertTrue(tShirt.getText().contains("$16.51"));
    }
}

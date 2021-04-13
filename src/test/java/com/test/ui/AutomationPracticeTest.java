package com.test.ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutomationPracticeTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");

        WebElement searchInput = driver.findElement(By.xpath("//input[@id='search_query_top']"));
        searchInput.sendKeys("dress");

        WebElement searchButton = driver.findElement(By.name("submit_search"));
        searchButton.click();

        WebElement itemPlaceholder = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[6]/div/div[2]/div[2]/a[1]"));
        itemPlaceholder.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement proceedCheckoutButton = driver.findElement(By.xpath("//a[@class=\"btn btn-default button button-medium\"]"));
        proceedCheckoutButton.click();

        WebElement continueShopping = driver.findElement(By.xpath("//a[@class=\"button-exclusive btn btn-default\"]"));
        continueShopping.click();

        driver.close();
    }
}


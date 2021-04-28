package com.test.selenium.pageObject.seleniumPractice.tests;

import com.google.common.io.Files;
import com.test.selenium.pageObject.seleniumPractice.pages.HomePage;
import com.test.selenium.pageObject.seleniumPractice.pages.SearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;

    public SearchPage openSearchPage() {
        return new SearchPage(driver);
    }

    public HomePage openHomePage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return new HomePage(driver);
    }


    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                int filenameCounter = 1;
                Files.move(screenshot, new File("resources/screenshots/FiledScreenshots/failScreenshot"+filenameCounter+".png"));
                filenameCounter++;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Screenshot taken: " + screenshot.getAbsolutePath());
        }
    }

    @AfterMethod
    public void takeScreenshot(){
        var camera = (TakesScreenshot) driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        try {
            int filenameCounter = 1;
            Files.move(screenshot, new File("resources/screenshots/AllScreenshot/passScreenshot"+filenameCounter+".png"));
            filenameCounter++;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}

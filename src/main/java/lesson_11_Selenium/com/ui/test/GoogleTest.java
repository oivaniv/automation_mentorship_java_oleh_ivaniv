package lesson_11_Selenium.com.ui.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("Avenga");
        searchField.sendKeys(Keys.ENTER);

        driver.quit();
    }
}

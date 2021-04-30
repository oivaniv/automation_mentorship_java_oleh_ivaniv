package lesson_12.herokyApp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EntryAdPage {
    private WebDriver driver;
    By modalAlertTitle = By.className("modal-title");
    By modalAlertBody = By.className("modal-body");
    By modalAlertCloseButton = By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p");

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }

    public void closeModalAlert(){
        driver.findElement(modalAlertCloseButton).click();
    }

    public String getModalAlertText(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(modalAlertTitle));
        return driver.findElement(modalAlertTitle).getText();
    }
}

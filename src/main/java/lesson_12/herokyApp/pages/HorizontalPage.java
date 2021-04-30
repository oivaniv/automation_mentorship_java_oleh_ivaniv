package lesson_12.herokyApp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalPage {
    private WebDriver driver;

    private By horizontalSlider = By.xpath("//*[@id=\"content\"]/div/div/input");
    private By sliderValue = By.id("range");

    public HorizontalPage(WebDriver driver) {
        this.driver = driver;
    }

    public void moveHorizontalSliderRight(){
        driver.findElement(horizontalSlider).sendKeys(Keys.ARROW_RIGHT);
    }

    public void moveHorizontalSlider(Keys keyToSend){
        driver.findElement(horizontalSlider).sendKeys(keyToSend);
    }

    public void moveHorizontalSliderToValue(Keys keyToSend, double expectedValue){
        while (getSliderValueDouble()<expectedValue){
            driver.findElement(horizontalSlider).sendKeys(keyToSend);
        }
    }

    public String getSliderValueText(){
        return driver.findElement(sliderValue).getText();
    }

    public double getSliderValueDouble(){
        return Double.parseDouble(getSliderValueText());
    }

}

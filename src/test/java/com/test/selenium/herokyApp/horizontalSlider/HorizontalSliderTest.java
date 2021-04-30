package com.test.selenium.herokyApp.horizontalSlider;

import com.test.selenium.herokyApp.base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTest extends BaseTest {

    @Test
    public void testHorizontalSliderMoveRight(){
        var horizontalPage = homePage.clickHorizontalSlider();
        horizontalPage.moveHorizontalSliderRight();
    }

    @Test
    public void testHorizontalSliderMove(){
        var horizontalPage = homePage.clickHorizontalSlider();
        horizontalPage.moveHorizontalSlider(Keys.ARROW_RIGHT);
    }

    @Test
    public void testHorizontalSliderMoveToValue(){
        var horizontalPage = homePage.clickHorizontalSlider();
        horizontalPage.moveHorizontalSliderToValue(Keys.ARROW_RIGHT,4.0);
        assertEquals(horizontalPage.getSliderValueText(), "4.0");
    }
}

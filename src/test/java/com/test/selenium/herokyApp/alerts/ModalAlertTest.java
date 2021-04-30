package com.test.selenium.herokyApp.alerts;

import com.test.selenium.herokyApp.base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ModalAlertTest extends BaseTest {

    @Test
    public void testModalAlert() throws InterruptedException {
        var modalAlertPage = homePage.clickEntryAd();
        assertEquals(modalAlertPage.getModalAlertText(),"THIS IS A MODAL WINDOW","Modal alert is incorrect");
        modalAlertPage.closeModalAlert();
    }

}

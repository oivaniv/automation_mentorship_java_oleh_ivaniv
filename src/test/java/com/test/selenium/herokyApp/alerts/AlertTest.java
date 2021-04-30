package com.test.selenium.herokyApp.alerts;

import com.test.selenium.herokyApp.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTest {

    @Test
    public void testAccessAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Result text is incorrect");
    }

    @Test
    public void testGetTextFromAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void tesSetInputAlert() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();

        String text = "Oleh Oleh";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: " + text, "Results text incorrect");
    }

}

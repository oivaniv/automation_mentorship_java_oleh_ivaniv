package com.test.selenium.herokyApp.contextMenu;

import com.test.selenium.herokyApp.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTest {

    @Test
    public void testContextMenu(){
        var contextMenuPage=homePage.clickContextMenu();
        contextMenuPage.rightClickOnField();
        assertEquals(contextMenuPage.alert_getText(), "You selected a context menu", "Alert message is incorrect");
        contextMenuPage.alert_clickToAccept();
    }
}

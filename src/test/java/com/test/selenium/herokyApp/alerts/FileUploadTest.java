package com.test.selenium.herokyApp.alerts;

import com.test.selenium.herokyApp.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {

    @Test
    public void testFileUpload(){
        var uploadFilePage = homePage.clickFileUpload();
        uploadFilePage.uploadFile("C:\\Users\\oivaniv\\IdeaProjects\\AutomationNiX\\resources\\screenshots\\test.png");
        assertEquals(uploadFilePage.getUploadedFile(), "test.png", "Uploaded file is incorrect");
    }
}

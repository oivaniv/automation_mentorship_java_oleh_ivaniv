package com.test.selenium.pageObject.seleniumPractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage{
    protected WebDriver driver;

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[1]")
    private WebElement searchResultTitle;

    public String searchResultTitleValue(){
        return searchResultTitle.getText();
    }
}

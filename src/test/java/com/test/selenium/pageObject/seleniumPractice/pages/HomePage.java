package com.test.selenium.pageObject.seleniumPractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    private WebElement womenTabButton;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    private WebElement dressesTabButton;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]")
    private WebElement tShirtsTabButton;

    @FindBy(xpath = "//input[@id='search_query_top']")
    private WebElement searchFieldInput;

    @FindBy(xpath = "//*[@id=\"searchbox\"]/button")
    private WebElement searchFieldButton;


    public void searchItem (){
        searchFieldInput.sendKeys("dress");
        searchFieldButton.click();
    }

    public boolean isWomenTabButtonDisplayed(){
        return womenTabButton.isDisplayed();
    }

    public String womenTabTitleText(){
        return womenTabButton.getText();
    }




}

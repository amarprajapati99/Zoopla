package com.bridgelabz.selenium.zoopla.pages;

import com.bridgelabz.selenium.zoopla.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard extends BaseClass{

    @FindBy (xpath = "//a[normalize-space()='To rent']")
    WebElement toRent;

    @FindBy(id = "search-input-location")
    WebElement searchBox;


    public Dashboard(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void searchLocation() throws InterruptedException {

        Thread.sleep (1500);
        toRent.click();

        Thread.sleep(3000);
        searchBox.sendKeys("London");

        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }
}

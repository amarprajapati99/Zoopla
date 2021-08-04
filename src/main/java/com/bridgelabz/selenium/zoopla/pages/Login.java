package com.bridgelabz.selenium.zoopla.pages;

import com.bridgelabz.selenium.zoopla.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass{

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[5]/a[1]")
    WebElement clickSignIn;
    @FindBy(xpath = "//input[@id='input-email-address']")
    WebElement email;
    @FindBy(xpath = "//input[@id='input-password']")
    WebElement pass;
    @FindBy(xpath = "//button[normalize-space()='Sign in']")
    WebElement signIn;

    public Login(WebDriver driver){
        PageFactory.initElements (driver,this);

    }

    public void setLoginCredentials() throws InterruptedException {

        clickSignIn.click ();
        email.sendKeys ("prajapatiprahlad91@gmail.com");
        Thread.sleep (1000);
        pass.sendKeys ("amarprajapati91");
        Thread.sleep (1000);
        signIn.click ();

    }
}

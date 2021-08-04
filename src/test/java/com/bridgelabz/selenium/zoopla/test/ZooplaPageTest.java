package com.bridgelabz.selenium.zoopla.test;

import com.bridgelabz.selenium.zoopla.base.BaseClass;
import com.bridgelabz.selenium.zoopla.pages.AgentPage;
import com.bridgelabz.selenium.zoopla.pages.Dashboard;
import com.bridgelabz.selenium.zoopla.pages.PropertyForSale;
import com.bridgelabz.selenium.zoopla.pages.Login;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZooplaPageTest extends BaseClass{

    @Test(priority = 1)
    public void Login_To_Application() throws InterruptedException {
        Login login = new Login (driver);
        login.setLoginCredentials ();
    }

    @Test(priority = 2)
    public void search_Details_for_location() throws InterruptedException {

        Login login= new Login(driver);
        login.setLoginCredentials ();
        Dashboard dashBoard=new Dashboard(driver);

        dashBoard.searchLocation ();
        PropertyForSale propertyForSale = new PropertyForSale (driver);

        propertyForSale.propertiesList ();
        AgentPage agentsPage = new AgentPage(driver);

        boolean bool = agentsPage.checkAllProperty();
        Assert.assertTrue(bool);
    }
}


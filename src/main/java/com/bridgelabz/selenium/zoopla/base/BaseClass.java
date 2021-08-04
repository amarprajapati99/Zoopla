package com.bridgelabz.selenium.zoopla.base;

import com.bridgelabz.selenium.zoopla.utility.Log;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class BaseClass{

    public static WebDriver driver;

    @BeforeTest
    public static void setup() {
        try {
            URL url = new URL("http://www.google.com");
            URLConnection connection = url.openConnection();

            connection.connect();
            Log.info ("Internet is connected");
        } catch (IOException e) {
            e.printStackTrace ();
        }

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver ();

        driver.manage().window().maximize();
        driver.get("https://www.zoopla.co.uk/");
    }
    @AfterTest
    public void tearDown(){
        driver.close ();
    }
}


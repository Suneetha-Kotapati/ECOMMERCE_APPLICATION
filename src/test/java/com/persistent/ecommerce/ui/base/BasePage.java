package com.persistent.ecommerce.ui.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

/**
 * This class contains common elements and methods used across multiple pages of an application, all pages that inherit from it
 */
public class BasePage {
    public static WebDriver driver;

    /**
     * Initialize the WebDriver instance
     * This method will run before each test method
     */
    @BeforeMethod(alwaysRun = true)
    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    /**
     * Closing the web browser
     * this method will run after each test method
     */
    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}

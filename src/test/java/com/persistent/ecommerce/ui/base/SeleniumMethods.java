package com.persistent.ecommerce.ui.base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

/**
 * This class contains all selenium methods
 */
public class SeleniumMethods extends SeleniumWaits {
    /**
     * This method is used to interact with text-based elements on a web page
     * @param by used to locate elements on a web page
     * @param text sending text to text boxes
     */
    public void sendKeys(By by, String text) {
        waitForVisibilityElement(by);
        waitForPresentElement(by);
        WebElement element = driver.findElement(by);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        element.clear();
        element.sendKeys(text);
    }

    /**
     * method is used to interact with web elements on a web page, such as clicking on buttons, links, checkboxes, and radio buttons
     * @param by used to locate elements on a web page
     */

    public void click(By by) {
        waitForVisibilityElement(by);
        waitForClickElement(by);
        WebElement element = driver.findElement(by);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    /**
     * This method is used to click on My cart present in magento eCommerce website
     * @param by used to locate elements on a web page
     */
    public void clickShowCart(By by) {
        WebElement element = driver.findElement(by);
        waitForClickElement(by);
        element.click();
    }

    /**
     * This method is used to wait for clicking on button.
     * @param by used to locate elements on a web page
     */
    public void waitForButton(By by) {
        WebElement element = driver.findElement(by);
        waitForClickElement(by);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    /**
     *This method is used to select the data from the dropdown present in magento eCommerce website
     * @param by used to locate elements on a web page
     * @param text select by visible text.
     */
    public void selectFromDropdown(By by, String text) {
        WebElement element = driver.findElement(by);
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText(text);
    }

    /**
     * This method is used to send the data to searchbar present in magento eCommerce website
     * @param by used to locate elements on a web page
     * @param text  sending text to text boxes
     */
    public void sendData(By by, String text) {
        WebElement element = driver.findElement(by);
        element.sendKeys(text);
        element.sendKeys(Keys.ENTER);
    }

    /**
     *This method is used to Retrieve the text of a web element on a web page
     * @param by used to locate elements on a web page
     * @param text sending text to text boxes
     * @return the text of the web element as a String
     */
    public boolean getText(By by, String text) {
        WebElement element = driver.findElement(by);
        String ConfirmationText = element.getText();
        System.out.println(ConfirmationText);
        if (ConfirmationText.contains(text)) {
            System.out.println("Order Completed: Test Case Passed");
            return true;
        } else {
            System.out.println("Order Not Successfull: Test Case Failed");
            return false;
        }
    }

    /**
     * This method is used to find the price of web element
     * @param by used to locate elements on a web page
     * @return the text of the web element as a String
     */
    public String findPrice(By by) {
        WebElement element = driver.findElement(by);
        return element.getText();
    }

    /**
     * This method searches weather provided web element is present or not.
     * @param element is the locator of the element
     * @return true if the size > 0 else false
     */
    public Boolean checkPresenceOfElement(By element) {
        int size = driver.findElements(element).size();
        return size > 0;
    }

}


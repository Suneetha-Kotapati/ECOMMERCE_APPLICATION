package com.persistent.ecommerce.ui.tests;

import com.persistent.ecommerce.common.enums.DataFile;
import com.persistent.ecommerce.ui.base.SeleniumMethods;
import com.persistent.ecommerce.ui.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class is used to run the all the Test cases
 */
public class EcommerceTests extends SeleniumMethods {
    LoginPage lg = new LoginPage(driver);

    /**
     * This method is for creating account in Magento eCommerce website
     */
    @Test
    public void createAccount() {
        driver.get(DataFile.LOGIN_URL.data);
        lg.clickCreateAccountLink();
        lg.setFirstName(DataFile.FIRST_NAME.data);
        lg.setLastName(DataFile.LAST_NAME.data);
        lg.setEmail(DataFile.EMAIL.data);
        lg.setPassword(DataFile.PASSWORD.data);
        lg.setPasswordConfirmation(DataFile.CONFIRM_PASSWORD.data);
        lg.clickCreateAnAccount();
        boolean checkName = lg.getTextForAssert(DataFile.EXPECTED_TEXT.data);
        boolean checkEmail = lg.getTextForAssert(DataFile.EMAIL.data);
        Assert.assertTrue(checkName, "Both are not equal");
        Assert.assertTrue(checkEmail, "Both are not equal");
    }

    /**
     * log-In to the eCommerce website
     * placing the order in Magento eCommerce website
     * Asserting subtotal, shipping & handling and Grand total
     */
    @Test
    public void createOrder() {
        driver.get(DataFile.LOGIN_URL.data);
        lg.clickSignInButton();
        lg.setLoginEmail(DataFile.LOGIN_EMAIL.data);
        lg.setLoginPassword(DataFile.LOGIN_PASSWORD.data);
        lg.clickLoginSignInButton();
        lg.clickFusionBackpack();
        lg.setQuantity(DataFile.QUANTITY.data);
        lg.clickAddToCartButton1();
        lg.clickShowCart();
        float itemPrice = lg.getItemPrice();
        System.out.println("itemprice:" + itemPrice);
        lg.clickProceedToCheckOutButton();
        lg.shipping();
        float shippingPrice = lg.getShippingPrice();
        System.out.println("shipping price :" + shippingPrice);
        lg.clickNextButton();
        lg.clickPlaceOrderButton();
        lg.clickOrderNumber();
        float Expected_subtotal = lg.getSubTotal();
        System.out.println("subtotal:" + Expected_subtotal);
        float discount = lg.discountPrice();
        System.out.println("discount:" + discount);
        float Expected_shipping = lg.getShippingAndHandling();
        System.out.println("shipping:" + Expected_shipping);
        float Expected_grandtotal = lg.getGrandTotal();
        float actual_grandtotal = (itemPrice + shippingPrice) + discount;
        System.out.println("grandtotal:" + Expected_grandtotal);
        Assert.assertEquals(itemPrice, Expected_subtotal);
        Assert.assertEquals(shippingPrice, Expected_shipping);
        Assert.assertEquals(actual_grandtotal, Expected_grandtotal);
        System.out.println("testcase passes");
    }

    /**
     * log-In to the eCommerce website
     * Ordering the Affirm Water Bottle in eCommerce Magento website
     * Applying discount code to Affirm Water bottle
     * Asserting subtotal, Discount ,shipping & handling and Grand total
     */
    @Test
    public void orderingWaterBottle() {
        driver.get(DataFile.LOGIN_URL.data);
        lg.clickSignInButton();
        lg.setLoginEmail(DataFile.LOGIN_EMAIL.data);
        lg.setLoginPassword(DataFile.LOGIN_PASSWORD.data);
        lg.clickLoginSignInButton();
        lg.clickSearchBar();
        lg.setWaterBottle(DataFile.WATER_BOTTLE.data);
        lg.clickAffirmWaterBottle();
        lg.setQuantity(DataFile.QUANTITY.data);
        lg.clickAddToCartButton1();
        lg.clickShowCart();
        float itemPrice = lg.getItemPrice();
        System.out.println("itemprice:" + itemPrice);
        lg.clickProceedToCheckOutButton();
        lg.shipping();
        float shippingPrice = lg.getShippingPrice();
        lg.clickNextButton();
        lg.clickToggleButton();
        lg.setDiscountCode(DataFile.DISCOUNT_CODE.data);
        lg.clickApplyDiscount();
        lg.clickPlaceOrderButton();
        lg.clickOrderNumber();
        float Expected_subtotal = lg.getSubTotal();
        System.out.println("subtotal:" + Expected_subtotal);
        float discount = lg.discountPrice();
        System.out.println("discount:" + discount);
        float Expected_shipping = lg.getShippingAndHandling();
        System.out.println("shipping:" + Expected_shipping);
        float Expected_grandtotal = lg.getGrandTotal();
        float actual_grandtotal = (itemPrice + shippingPrice) + discount;
        System.out.println("grandtotal:" + Expected_grandtotal);
        Assert.assertEquals(itemPrice, Expected_subtotal);
        Assert.assertEquals(shippingPrice, Expected_shipping);
        Assert.assertEquals(actual_grandtotal, Expected_grandtotal);
        System.out.println("testcase passes");
    }
}

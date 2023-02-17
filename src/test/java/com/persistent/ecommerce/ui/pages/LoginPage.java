package com.persistent.ecommerce.ui.pages;

import com.persistent.ecommerce.common.enums.DataFile;
import com.persistent.ecommerce.ui.base.SeleniumMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * This class is used to encapsulate all the page elements and methods related to the functionality.
 */
public class LoginPage extends SeleniumMethods {
    WebDriver driver;
    public By createAccountLink = By.linkText("Create an Account");
    public By firstNameBox = By.id("firstname");
    public By lastNameBox = By.id("lastname");
    public By emailBox = By.id("email_address");
    public By passwordBox = By.id("password");
    public By passwordConfirmationBox = By.id("password-confirmation");
    public By clickCreateAnAccountButton = By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]");
    public By signInButton = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
    public By login_email = By.id("email");
    public By login_password = By.id("pass");
    public By login_signIn = By.xpath("//button[@class='action login primary']");
    public By fusionBackpack = By.xpath("//a[contains(text(),'Fusion Backpack ')]");
    public By qty = By.id("qty");
    public By addToCart1 = By.id("product-addtocart-button");
    public By myCart = By.xpath("//span[@class='counter-number']");
    public By proceedToCheckout = By.xpath("//button[contains(text(),'Proceed to Checkout')]");
    public By shippingAddress_street = By.xpath("//input[@name='street[0]']");
    public By shippingAddress_city = By.xpath("//input[@name='city']");
    public By shippingAddress_state = By.xpath("//select[@name='region_id']");
    public By shippingAddressZipcode = By.xpath("//input[@name='postcode']");
    public By shippingAddress_country = By.xpath("//select[@name='country_id']");
    public By shippingAddressPhoneNumber = By.xpath("//input[@name='telephone']");
    public By nextButton = By.xpath("//button/span[contains(text(),'Next')]");
    public By placeOrder = By.xpath("//button/span[contains(text(),'Place Order')]");
    public By orderNumber = By.xpath("//a[@class='order-number']/strong");
    public By searchBar = By.id("search");
    public By affirmWaterBottle = By.xpath("//a[contains(text(),'Affirm Water Bottle ')]");
    public By toggleButton = By.xpath("//div/span[@id='block-discount-heading']");
    public By discountCode = By.id("discount-code");
    public By applyDiscount = By.xpath("//button[@value='Apply Discount']//span//span[contains(text(),'Apply Discount')]");
    public By textPresent = By.xpath("//div[@class='box box-information']");
    public By itemPrice = By.xpath("//div[@class='amount price-container']");
    public By shippingPrice = By.xpath("//span[@class='price']/span");
    public By subtotal = By.xpath("//tr[@class='subtotal']//td[@class='amount']//span");
    public By discount = By.xpath("//tr[@class='discount']/td[@class='amount']/span");
    public By shippingAndHandling = By.xpath("//tr[@class='shipping']//td[@class='amount']//span");
    public By grandTotal = By.xpath("//tr[@class='grand_total']//td[@class='amount']//span");
    public By filledBox = By.xpath("//div[@class='shipping-address-item selected-item']");
    public By waitForContainer = By.xpath("//div[@class='subtotal']");
    public By successMessage = By.xpath("//div[@class='message-success success message']");
    public By spinner = By.id("checkout-loader");
    public By loader = By.className("loading-mask");
    public By extraShippingRadioButton = By.xpath("//input[@name='ko_unique_2']");

    /**
     * Parameterized constructor of the class
     *
     * @param d of WebDriver
     */
    public LoginPage(WebDriver d) {
        driver = d;


    }

    /**
     * using getters and setters methods for variables that represent web elements
     * This method is used to click create account link which is present in the Magento eCommerce website.
     * it will wait for visibility and presence of element before clicking it.
     */

    public void clickCreateAccountLink() {
        waitForVisibilityElement(createAccountLink);
        waitForPresentElement(createAccountLink);
        click(createAccountLink);
    }

    /**
     * Sets the value of the "Firstname" input field on the eCommerce website
     *
     * @param firstName the value to be entered in the "Firstname" field
     */
    public void setFirstName(String firstName) {
        waitForPresentElement(createAccountLink);
        waitForVisibilityElement(createAccountLink);
        sendKeys(firstNameBox, firstName);
    }

    /**
     * Sets the value of the "Lastname" input field on the eCommerce website
     *
     * @param lastName the value to be entered in the "Lastname" field
     */
    public void setLastName(String lastName) {
        waitForPresentElement(lastNameBox);
        waitForVisibilityElement(lastNameBox);
        sendKeys(lastNameBox, lastName);
    }

    /**
     * Sets the value of the "Email" input field on the eCommerce website
     *
     * @param mail the value to be entered in the "Email" field
     */
    public void setEmail(String mail) {
        waitForPresentElement(emailBox);
        waitForVisibilityElement(emailBox);
        sendKeys(emailBox, mail);
    }

    /**
     * Sets the value of the "Password" input field on the eCommerce website
     *
     * @param password the value to be entered in the "Password" field
     */
    public void setPassword(String password) {
        waitForPresentElement(passwordBox);
        waitForVisibilityElement(passwordBox);
        sendKeys(passwordBox, password);
    }

    /**
     * Sets the value of the "Confirm Password" input field on the eCommerce website
     *
     * @param password the value to be entered in the "Confirm Password" field
     */
    public void setPasswordConfirmation(String password) {
        waitForVisibilityElement(passwordConfirmationBox);
        waitForPresentElement(passwordConfirmationBox);
        sendKeys(passwordConfirmationBox, password);
    }

    /**
     * Clicks the "Create Account" button on the eCommerce website
     */
    public void clickCreateAnAccount() {
        waitForPresentElement(clickCreateAnAccountButton);
        waitForVisibilityElement(clickCreateAnAccountButton);
        click(clickCreateAnAccountButton);
    }

    /**
     * Gets the text of the specified element
     *
     * @param txt whose text is to be returned
     * @return the text of the specified element
     */
    public boolean getTextForAssert(String txt) {
        waitForPresentElement(textPresent);
        waitForVisibilityElement(textPresent);
        return getText(textPresent, txt);
    }

    /**
     * Clicks the "Sign In" button on the eCommerce website
     */
    public void clickSignInButton() {
        waitForPresentElement(signInButton);
        waitForVisibilityElement(signInButton);
        click(signInButton);
        waitForPresentElement(signInButton);
        waitForVisibilityElement(signInButton);
    }

    /**
     * Sets the value of the "Email" input field on the eCommerce login page
     *
     * @param email the value to be entered in the "Email" field
     */
    public void setLoginEmail(String email) {

        waitForPresentElement(login_email);
        waitForVisibilityElement(login_email);
        sendKeys(login_email, email);
        waitForPresentElement(login_email);
        waitForVisibilityElement(login_email);
    }

    /**
     * Sets the value of the "Password" input field on the eCommerce login page
     *
     * @param password the value to be entered in the "Password" field
     */

    public void setLoginPassword(String password) {
        waitForPresentElement(login_password);
        waitForVisibilityElement(login_password);
        sendKeys(login_password, password);
        waitForPresentElement(login_password);
        waitForVisibilityElement(login_password);
    }

    /**
     * Clicks the "Sign In" button on the eCommerce login page
     */
    public void clickLoginSignInButton() {
        waitForPresentElement(login_signIn);
        waitForVisibilityElement(login_signIn);
        click(login_signIn);
    }

    /**
     * Clicks the "Fusion Backpack" link on the home page
     */
    public void clickFusionBackpack() {
        waitForVisibilityElement(fusionBackpack);
        waitForPresentElement(fusionBackpack);
        waitForClickElement(fusionBackpack);
        click(fusionBackpack);
    }

    /**
     * Clicks the "Show Cart" button on the page
     */
    public void clickShowCart() {
        waitForPresentElement(successMessage);
        clickShowCart(myCart);
    }

    /**
     * Sets the quantity of a product to be added to the shopping cart
     *
     * @param quantity the desired quantity of the product
     */
    public void setQuantity(String quantity) {
        waitForPresentElement(qty);
        sendKeys(qty, quantity);
        waitForVisibilityElement(qty);
        waitForPresentElement(qty);
    }

    /**
     * Clicks the "Add to Cart" button for a product on the page
     */
    public void clickAddToCartButton1() {
        waitForPresentElement(addToCart1);
        waitForVisibilityElement(addToCart1);
        click(addToCart1);
    }

    /**
     * Clicks the "Proceed to Checkout" button on the shopping cart page.
     */
    public void clickProceedToCheckOutButton() {
        waitForPresentElement(proceedToCheckout);
        waitForVisibilityElement(proceedToCheckout);
        click(proceedToCheckout);
    }

    /**
     * Sets the street address for the shipping address on the checkout page
     *
     * @param street the street address to set for the shipping address
     */
    public void setShippingAddressStreet(String street) {
        waitForPresentElement(shippingAddress_street);
        waitForVisibilityElement(shippingAddress_city);
        sendKeys(shippingAddress_street, street);
    }

    /**
     * Sets the city address for the shipping address on the checkout page
     *
     * @param city the city address to set for the shipping address
     */
    public void setShippingAddressCity(String city) {
        waitForVisibilityElement(shippingAddress_city);
        waitForPresentElement(shippingAddress_city);
        sendKeys(shippingAddress_city, city);
    }

    /**
     * Clicks the shipping address state dropdown on the checkout page, displaying the available options
     */
    public void clickShippingAddressState() {
        waitForPresentElement(shippingAddress_state);
        waitForVisibilityElement(shippingAddress_state);
        click(shippingAddress_state);
    }

    /**
     * Selects the specified state for the shipping address on the checkout page
     *
     * @param state the state to select for the shipping address
     */
    public void selectShippingAddressState(String state) {
        waitForVisibilityElement(shippingAddress_state);
        waitForPresentElement(shippingAddress_state);
        selectFromDropdown(shippingAddress_state, state);
    }

    /**
     * Sets the pin_code for the shipping address on the checkout page
     *
     * @param pin_code the pin_code to set for the shipping address
     */
    public void setShippingAddressPin_code(String pin_code) {
        waitForPresentElement(shippingAddressZipcode);
        waitForVisibilityElement(shippingAddressZipcode);
        sendKeys(shippingAddressZipcode, pin_code);
    }

    /**
     * Clicks the shipping address city dropdown on the checkout page, displaying the available options
     */
    public void clickShippingAddressCountry() {
        waitForPresentElement(shippingAddress_country);
        waitForVisibilityElement(shippingAddress_country);
        click(shippingAddress_country);
    }

    /**
     * Selects the specified state for the shipping address on the checkout page
     *
     * @param country the country to select for the shipping address
     */
    public void selectShippingAddressCountry(String country) {
        waitForPresentElement(shippingAddress_country);
        waitForVisibilityElement(shippingAddress_country);
        selectFromDropdown(shippingAddress_country, country);
    }

    /**
     * Sets the phone number for the shipping address on the checkout page
     *
     * @param phoneNumber the phone number to set for the shipping address
     */
    public void setShippingAddressPhoneNumber(String phoneNumber) {
        waitForPresentElement(shippingAddressPhoneNumber);
        sendKeys(shippingAddressPhoneNumber, phoneNumber);
    }

    /**
     * Clicks the "Next" button on the checkout page
     */
    public void clickNextButton() {
        waitForPresentElement(nextButton);
        waitForVisibilityElement(nextButton);
        waitForClickElement(nextButton);
        waitForInvisibilityOfElement(spinner);
        waitForButton(nextButton);
    }

    /**
     * Clicks the "Place Order" button on the checkout page
     */
    public void clickPlaceOrderButton() {
        waitForInvisibilityOfElement(loader);
        waitForPresentElement(placeOrder);
        waitForButton(placeOrder);
    }

    /**
     * Clicks the order number link on the order confirmation page
     */
    public void clickOrderNumber() {
        waitForPresentElement(orderNumber);
        waitForVisibilityElement(orderNumber);
        waitForButton(orderNumber);
    }

    /**
     * Clicks the search bar on the home page
     */
    public void clickSearchBar() {
        waitForVisibilityElement(searchBar);
        waitForPresentElement(searchBar);
        click(searchBar);
    }

    /**
     * Sets the name of water bottle to the search bar
     *
     * @param Bottle the bottle name to set the water bottle
     */
    public void setWaterBottle(String Bottle) {
        waitForPresentElement(searchBar);
        waitForVisibilityElement(searchBar);
        sendData(searchBar, Bottle);
    }

    /**
     * Clicks the 'Affirm Water Bottle' button for the water bottle in the product list
     */
    public void clickAffirmWaterBottle() {
        waitForVisibilityElement(affirmWaterBottle);
        click(affirmWaterBottle);
    }

    /**
     * Clicks the toggle button of apply discount code which opens a text field to enter discount
     */
    public void clickToggleButton() {
        waitForInvisibilityOfElement(loader);
        waitForButton(toggleButton);
    }

    /**
     * Sets the discount code in the discount code field
     *
     * @param discount_code The discount code to enter
     */
    public void setDiscountCode(String discount_code) {
        waitForPresentElement(discountCode);
        waitForVisibilityElement(discountCode);
        sendKeys(discountCode, discount_code);
    }

    /**
     * Clicks the apply discount button
     */
    public void clickApplyDiscount() {
        waitForPresentElement(applyDiscount);
        click(applyDiscount);
    }

    /**
     * This method is used to convert String currency to float and removes dollar symbol
     *
     * @param strCurrency is the String type currency
     * @return returns the float type currency converted from sting type currency
     */
    public float convertToFloat(String strCurrency) {
        strCurrency = strCurrency.replace("$", "");
        return Float.parseFloat(strCurrency);
    }

    /**
     * Retrieving the Item price from cart before clicking checkout
     *
     * @return it calls and passes the retrieved price to convertToFloat method which returns the float type currency
     */
    public float getItemPrice() {
        waitForVisibilityElement(waitForContainer);
        String price = findPrice(itemPrice);
        return convertToFloat(price);
    }

    /**
     * Retrieving the shipping price from the shipping methods before Review and payments
     *
     * @return it calls and passes the retrieved price to convertToFloat method which returns the float type currency
     */

    public float getShippingPrice() {
        waitForPresentElement(shippingPrice);
        waitForVisibilityElement(shippingPrice);
        String price = findPrice(shippingPrice);
        return convertToFloat(price);
    }

    /**
     * Retrieving the subtotal of the order placed
     *
     * @return it calls and passes the retrieved subtotal to convertToFloat method which returns the float type currency
     */

    public float getSubTotal() {
        String subTotal = findPrice(subtotal);
        return convertToFloat(subTotal);
    }

    /**
     * Retrieving the shippingAndHandling of the order placed
     *
     * @return it calls and passes the retrieved shipping and handling to convertToFloat method which returns the float type currency
     */
    public float getShippingAndHandling() {
        String shippingAndHandling = findPrice(this.shippingAndHandling);
        return convertToFloat(shippingAndHandling);
    }

    /**
     * Retrieving the GrandTotal of the order placed
     *
     * @return it calls and passes the retrieved shipping and handling to convertToFloat method which returns the float type currency
     */
    public float getGrandTotal() {
        String grand_total = findPrice(grandTotal);
        return convertToFloat(grand_total);
    }

    /**
     * This method calls shippingAddress method to check whether a pre-Saved address box is present or not
     * if shippingAddress returns true then no need to fill the address form, so we are failing the if condition by ! symbol
     * else it fills the form
     */
    public void shipping() {
        if (!checkPresenceOfElement(filledBox)) {
            setShippingAddressStreet(DataFile.STREET_ADDRESS.data);
            setShippingAddressCity(DataFile.CITY.data);
            clickShippingAddressCountry();
            selectShippingAddressCountry(DataFile.SHIPPINGADDRESS_COUNTRY.data);
            clickShippingAddressState();
            selectShippingAddressState(DataFile.SHIPPINGADDRESS_STATE.data);
            setShippingAddressPin_code(DataFile.PIN_CODE.data);
            setShippingAddressPhoneNumber(DataFile.PHONE_NUMBER.data);
            waitForInvisibilityOfElement(extraShippingRadioButton);
        }
    }

    /**
     * This method will check whether discount has applied to the order or not
     *
     * @return returns discount amount if discount applied else returns 0
     */
    public float discountPrice() {
        if (checkPresenceOfElement(discount)) {
            String discountAmount = findPrice(discount);
            return convertToFloat(discountAmount);
        }
        return 0;
    }
}






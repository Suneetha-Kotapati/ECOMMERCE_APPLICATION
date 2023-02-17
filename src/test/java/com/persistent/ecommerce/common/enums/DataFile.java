package com.persistent.ecommerce.common.enums;

/**
 * Enum data file is used to store and organize the locators (i.e., identifiers) for web elements on a web page
 */
public enum DataFile {
    LOGIN_URL("https://magento.softwaretestingboard.com/"), FIRST_NAME("Suneetha"), LAST_NAME("Kotapati"), EMAIL("demoemail6@gmail.com"), PASSWORD("Suni@9876"), CONFIRM_PASSWORD("Suni@9876"), EXPECTED_TEXT("Suneetha Kotapati"), LOGIN_EMAIL("demoemail6@gmail.com"), LOGIN_PASSWORD("Suni@9876"), SHIPPINGADDRESS_STATE("Andhra Pradesh"), SHIPPINGADDRESS_COUNTRY("India"), STREET_ADDRESS("Indira nagar"), CITY("HYDERABAD"), PIN_CODE("516434"), PHONE_NUMBER("6305597254"), QUANTITY("1"), WATER_BOTTLE("Affirm Water Bottle"), DISCOUNT_CODE("H20");
    /**
     * Fields
     */

    public final String data;

    /**
     * Constructor
     *
     * @param data to send data.
     */
    DataFile(String data) {
        this.data = data;
    }
}


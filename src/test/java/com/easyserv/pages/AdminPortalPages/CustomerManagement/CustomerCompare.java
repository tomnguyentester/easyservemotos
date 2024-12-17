package com.easyserv.pages.AdminPortalPages.CustomerManagement;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerCompare {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By emailText = By.xpath("//input[@id='email']");
    private By continueBt = By.xpath("//button[@type='submit']");
    private By passwordText = By.xpath("//input[@id='password']");
    private By signinButton = By.xpath("//span[contains(text(),'Sign In')]");
    private By storeDropdown = By.xpath("//input[@id='serviceCentre']");
    private By nextButton = By.xpath("//button[@type='submit']");
    private By CustomerMana = By.xpath("//a[contains(text(),'Customer Management')]");
    private By searchText = By.xpath("//input[@placeholder='Search']");
    private By searchBt = By.xpath("//span[@aria-label='search']//*[name()='svg']");
    private By firstName = By.xpath("//input[@id='firstName']");
    private By lastName = By.xpath("//input[@id='lastName']");
    private By phone = By.xpath("//input[@id='phoneNumber']");
    private By address = By.xpath("//input[@id='addressLine1']");
    private By chooseRow = By.xpath("//tr[@class='ant-table-row ant-table-row-level-0 ant-table-row--cursor-pointer']//td[1]");
    private By adminIcon = By.xpath("//span[contains(text(),'Administrator')]");
    private By logout = By.xpath("//div[contains(text(),'Logout')]");

    public CustomerCompare(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void loginPage(){
        validateHelper.setText(emailText,"admin@example.com");
        validateHelper.clickElement(continueBt);
        validateHelper.setText(passwordText, "12345678!!");
        validateHelper.clickElement(signinButton);
        validateHelper.clickDropdown(storeDropdown);
        validateHelper.chooseStore(storeDropdown, 0);
        validateHelper.clickElement(nextButton);
        validateHelper.clickElement(CustomerMana);
    }

    public void logoutPage(){
        validateHelper.clickElement(adminIcon);
        validateHelper.clickElement(logout);
    }
    public void CustComp_TC001(String emailSearch) {
        loginPage();
        validateHelper.setText(searchText,emailSearch);
        validateHelper.clickElement(searchBt);
        validateHelper.clickElement(chooseRow);
        validateHelper.delay(2);
    }
    public String VerifyFirstName(){
        String name = validateHelper.getAttribute(firstName);
        System.out.println(name);
        return name;
    }

    public String VerifyLastName(){
        String name = validateHelper.getAttribute(lastName);
        System.out.println(name);
        return name;
    }

    public String VerifyPhoneNumber(){
        String phoneNum = validateHelper.getAttribute(phone);
        System.out.println(phoneNum);
        return phoneNum;
    }

    public String VerifyAddress(){
        String add = validateHelper.getAttribute(address);
        System.out.println(add);
        return add;
    }

}

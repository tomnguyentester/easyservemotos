package com.easyserv.pages.WeCRMPages;

import com.easyserv.common.ValidateHelper;
import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.file.WatchEvent;
import java.util.List;

public class CustomerPM {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By email = By.xpath("//input[@placeholder='Enter your email']");
    private By pass = By.xpath("//input[@placeholder='Enter your password']");
    private By continueBt = By.xpath("//button[@type='button']");
    private By loginBt = By.xpath("//button[@class='ant-btn ant-btn-primary']");
    private By CustLink = By.xpath("//div[contains(text(),'Customers')]");
    private By OrgSelect = By.xpath("//div[@class='ant-select-selector']");
    private By customerMenu = By.xpath("//li[@role='menuitem']//span[@aria-label='team']//*[name()='svg']");
    private By CustomerMana = By.xpath("//body/div[@id='single-spa-application:@crm/navbar']/div[1]/section[1]/aside[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[2]");
    private By searchText = By.xpath("//input[@placeholder='Enter a keyword']");
    private By chooseRow = By.xpath("//td[@class='ant-table-column-has-actions ant-table-column-has-sorters ant-table-row-cell-break-word']//div[@class='ant-space ant-space-horizontal ant-space-align-center']");
    private By detailTab = By.xpath("//div[normalize-space()='Details']");
    //private By bussinessName = By.xpath("//body/div[@id='single-spa-application:@crm/navbar']/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/form[1]/div[1]/div[2]/div[1]/span[1]/span[1]/input[1]");
    private By firstName = By.xpath("//body/div[@id='single-spa-application:@crm/navbar']/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/span[1]/span[1]/input[1]");
    private By lastName = By.xpath("//body/div[@id='single-spa-application:@crm/navbar']/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/span[1]/span[1]/input[1]");
    private By dms = By.xpath("//body/div[@id='single-spa-application:@crm/navbar']/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[1]/span[1]/span[1]/input[1]");
    private By businessName = By.xpath("//body/div[@id='single-spa-application:@crm/navbar']/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/form[1]/div[1]/div[2]/div[1]/span[1]/span[1]/input[1]");
    private By address = By.xpath("//body/div[@id='single-spa-application:@crm/navbar']/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[15]/div[1]/form[1]/div[1]/div[2]/div[1]/span[1]/span[1]/input[1]");
    private By searchBt = By.xpath("//button[@class='ant-btn ant-btn-primary']");
    private By cusCol = By.xpath("//th[@class='ant-table-row-cell-ellipsis ant-table-row-cell-break-word']//span[@class='ant-table-column-title'][normalize-space()='Customer']");
    private By DMSCol = By.xpath("//th[@class='ant-table-row-cell-break-word ant-table-row-cell-last']//span[@class='ant-table-column-title'][normalize-space()='DMS ID']");
    private By keyword = By.xpath("//input[@placeholder='Enter a keyword']");
    private By cusResult = By.xpath("//td[@class='ant-table-row-cell-ellipsis ant-table-row-cell-break-word']//a[@title='Allan Cox'][normalize-space()='Allan Cox']");
    private By emailResult = By.xpath("//td[@class='ant-table-row-cell-ellipsis ant-table-row-cell-break-word']//a[@title='Hitech Automotive Centre'][normalize-space()='Hitech Automotive Centre']");
    private By phoneResult = By.xpath("//td[@class='ant-table-row-cell-ellipsis ant-table-row-cell-break-word']//a[contains(@title,'Fadz Automotive')][normalize-space()='Fadz Automotive']");
    private By selOption = By.xpath("//span[@title='By Name, Email or Phone']");
    private By icon = By.xpath("//span[contains(text(),'tom nguyen')]");
    private By logOut = By.xpath("//div[@class='d-flex align-items-center error-6--text']");
    private By DMSOption = By.xpath("//div[contains(@class,'ant-select-item-option-content')][normalize-space()='By DMS ID']");
    private By dmsResult = By.xpath("//td[@class='ant-table-row-cell-ellipsis ant-table-row-cell-break-word']//a[contains(@title,'Sydney City Volkswagen')][normalize-space()='Sydney City Volkswagen']");
    private By VINOption = By.xpath("//div[contains(@class,'ant-select-item-option-content')][normalize-space()='By VIN']");
    private By vinResult = By.xpath("//td[@class='ant-table-row-cell-ellipsis ant-table-row-cell-break-word']//a[contains(@title,'Raymond Kong')][normalize-space()='Raymond Kong']");

    private By Nodata = By.xpath("//p[normalize-space()='No Data']");

    public CustomerPM(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void LoginFunction() {
        validateHelper.setText(email, "tom.nguyen@siliconstack.com.au");
        validateHelper.clickElement(continueBt);
        validateHelper.setText(pass, "Testing12345678@");
        validateHelper.clickElement(loginBt);
        validateHelper.clickElement(OrgSelect);
        validateHelper.actionSetText("Purnell Motors");
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(CustomerMana);
        validateHelper.clickElement(selOption);
        validateHelper.clickElement(DMSOption);
    }

    public void BackToCusSearch() {
        validateHelper.clickElement(icon);
        validateHelper.clickElement(logOut);
    }

    public void CompareDataCus(String DMSSearch) {
        LoginFunction();
        validateHelper.setText(searchText, DMSSearch);
        validateHelper.clickElement(searchBt);
    }

    public void CheckDMS() {
        List<WebElement> record = driver.findElements(By.xpath("//td[@class='ant-table-column-has-actions ant-table-column-has-sorters ant-table-row-cell-break-word']//div[@class='ant-space ant-space-horizontal ant-space-align-center']"));
        if (record.isEmpty()) {
            BackToCusSearch();
        } else {
            validateHelper.clickElement(chooseRow);
            validateHelper.delay(2);
            validateHelper.clickElement(detailTab);
            validateHelper.delay(2);
        }
    }

    public void SelectCusDetail() {
        validateHelper.clickElement(chooseRow);
        validateHelper.delay(2);
        validateHelper.clickElement(detailTab);
        validateHelper.delay(2);
    }

    public String NodataDisplay() {
        String data = validateHelper.getText(Nodata);
        System.out.println("Print data :" + data);
        return data;
    }

    public String VerifyFirstName() {
        String name = validateHelper.getAttribute(firstName);
        System.out.println("Print FirstName : " + name);
        return name;
    }

    public String VerifyLastName() {
        String name = validateHelper.getAttribute(lastName);
        System.out.println("Printer LastName " + name);
        return name;
    }

    public String VerifyBusinessName() {
        String name = validateHelper.getAttribute(businessName);
        System.out.println("Printer BusinessName " + name);
        return name;
    }

    public String VerifyAddress1() {
        String name = validateHelper.getAttribute(address);
        System.out.println("Printer Address 1: " + name);
        return name;
    }
//
//    public String VerifyPhoneNumber(){
//        String phoneNum = validateHelper.getAttribute(phone);
//        System.out.println(phoneNum);
//        return phoneNum;
//    }
//
//    public String VerifyAddress(){
//        String add = validateHelper.getAttribute(address);
//        System.out.println(add);
//        return add;
//    }
}

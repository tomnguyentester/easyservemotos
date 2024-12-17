package com.easyserv.pages.WeCRMPages;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class CustomerSearchPages {

    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By email = By.xpath("//input[@placeholder='Enter your email']");
    private By pass = By.xpath("//input[@placeholder='Enter your password']");
    private By continueBt = By.xpath("//button[@type='button']");
    private By loginBt = By.xpath("//button[@class='ant-btn ant-btn-primary']");
    private By OrgSelect = By.xpath("//span[@title='Adelaide BMW']");
    private By customerMenu = By.xpath("//li[@role='menuitem']//span[@aria-label='team']//*[name()='svg']");
    private By searchBt = By.xpath("//button[@class='ant-btn']");
    private By cusCol = By.xpath("//th[@class='ant-table-row-cell-ellipsis ant-table-row-cell-break-word']//span[@class='ant-table-column-title'][normalize-space()='Customer']");
    private By DMSCol = By.xpath("//th[@class='ant-table-row-cell-break-word ant-table-row-cell-last']//span[@class='ant-table-column-title'][normalize-space()='DMS ID']");
    private By keyword = By.xpath("//input[@placeholder='Enter a keyword']");
    private By cusResult = By.xpath("//td[@class='ant-table-row-cell-ellipsis ant-table-row-cell-break-word']//a[@title='Allan Cox'][normalize-space()='Allan Cox']");
    private By emailResult = By.xpath("//td[@class='ant-table-row-cell-ellipsis ant-table-row-cell-break-word']//a[@title='Hitech Automotive Centre'][normalize-space()='Hitech Automotive Centre']");
    private By phoneResult = By.xpath("//td[@class='ant-table-row-cell-ellipsis ant-table-row-cell-break-word']//a[contains(@title,'Fadz Automotive')][normalize-space()='Fadz Automotive']");
    private By selOption = By.xpath("//span[@title='By Name, Email or Phone']");
    private By DMSOption = By.xpath("//div[contains(@class,'ant-select-item-option-content')][normalize-space()='By DMS ID']");
    private By dmsResult = By.xpath("//td[@class='ant-table-row-cell-ellipsis ant-table-row-cell-break-word']//a[contains(@title,'Sydney City Volkswagen')][normalize-space()='Sydney City Volkswagen']");
    private By VINOption = By.xpath("//div[contains(@class,'ant-select-item-option-content')][normalize-space()='By VIN']");
    private By vinResult = By.xpath("//td[@class='ant-table-row-cell-ellipsis ant-table-row-cell-break-word']//a[contains(@title,'Raymond Kong')][normalize-space()='Raymond Kong']");


    public CustomerSearchPages(WebDriver driver){
        this.driver= driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void LinkTC(){
        validateHelper.LinkTC("https://siliconstackcomau.sharepoint.com/:x:/r/sites/SiliconStack-SSCRM/_layouts/15/Doc.aspx?sourcedoc=%7B58C9903A-7ECA-4C5B-9877-712DF41A5D7F%7D&file=Search%20customer.xlsx&action=default&mobileredirect=true");
    }

    public void LoginFunction() {
        validateHelper.setText(email,"tom.nguyen@siliconstack.com.au");
        validateHelper.clickElement(continueBt);
        validateHelper.setText(pass,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.clickElement(OrgSelect);
        validateHelper.actionSetText("Purnell Motors");
        validateHelper.waitForPageLoaded();
    }

    public void CusSearch_TC001(){
        LoginFunction();
        validateHelper.clickElement(customerMenu);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(searchBt);
        validateHelper.delay(3);
    }

    public void CusSearch_TC002(){
        LoginFunction();
        validateHelper.clickElement(customerMenu);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(searchBt);
        validateHelper.delay(3);
        validateHelper.setText(keyword,"Allan Cox");
        validateHelper.clickElement(searchBt);
        validateHelper.delay(2);
    }

    public void CusSearch_TC003(){
        LoginFunction();
        validateHelper.clickElement(customerMenu);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(searchBt);
        validateHelper.delay(3);
        validateHelper.setText(keyword,"reception@hitechautoservices.com.au");
        validateHelper.clickElement(searchBt);
        validateHelper.delay(2);
    }

    public void CusSearch_TC004(){
        LoginFunction();
        validateHelper.clickElement(customerMenu);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(searchBt);
        validateHelper.delay(3);
        validateHelper.setText(keyword,"0426881882");
        validateHelper.clickElement(searchBt);
        validateHelper.delay(2);
    }

    public void CusSearch_TC005(){
        LoginFunction();
        validateHelper.clickElement(customerMenu);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(selOption);
        validateHelper.clickElement(DMSOption);
        validateHelper.setText(keyword,"42903");
        validateHelper.clickElement(searchBt);
        validateHelper.delay(2);
    }

    public void CusSearch_TC006(){
        LoginFunction();
        validateHelper.clickElement(customerMenu);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(selOption);
        validateHelper.clickElement(VINOption);
        validateHelper.setText(keyword,"SALRA2AN7K2414242");
        validateHelper.clickElement(searchBt);
        validateHelper.delay(2);
    }



    public String VerifyVINResult(){
        String cus = validateHelper.checkText(vinResult);
        return cus;
    }

    public String VerifyDMSResult(){
        String cus = validateHelper.checkText(dmsResult);
        return cus;
    }
    public String VerifyPhoneResult(){
        String cus = validateHelper.checkText(phoneResult);
        return cus;
    }
    public String VerifyEmailResult(){
        String cus = validateHelper.checkText(emailResult);
        return cus;
    }

    public String VerifyCustomerResult(){
        String cus = validateHelper.checkText(cusResult);
        return cus;
    }

    public String VerifyCustomerCol(){
        String title = validateHelper.checkText(cusCol);
        return title;
    }

    public String VerifyDMSCol(){
        String title = validateHelper.checkText(DMSCol);
        return title;
    }
}

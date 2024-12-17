package com.easyserv.pages.Motoserve_BookingApp_UAT;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutPages {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By userIcon = By.xpath("//*[name()='path' and contains(@d,'M20.1212 1')]");
    private By emailText = By.xpath("//input[@id='email']");
    private By passwordText = By.xpath("//input[@id='password']");
    private By loginBt = By.xpath("//button[@type='submit']");
    private By userLogin = By.xpath("//strong[normalize-space()='TN']");
    private By logOutOption = By.xpath("//span[contains(text(),'Log out')]");
    private By loginHeader = By.xpath("//span[contains(text(),'Login To Your Account')]");
    private By toyotaVehicle = By.xpath("//body/div[@id='__next']/section[@id='main-layout']/main[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
    private By confirmButton = By.xpath("//span[contains(text(),'Confirm and Proceed')]");
    private By yesBt = By.xpath("//span[contains(text(),'YES')]");
    private By backBt = By.xpath("//span[contains(text(),'Back')]");
    private By selectVehicleHeader = By.xpath("//span[contains(text(),'Select your vehicle')]");
    private By storeSelect = By.xpath("//u[contains(text(),'No store currently selected')]");
    private By viewstoreBt = By.xpath("//span[contains(text(),'View all stores')]");
    private By setStore = By.xpath("//span[contains(text(),'Set As My Store')]");
    private By NoBt = By.xpath("//span[contains(text(),'NO')]");
    private By selectServiceHeader = By.xpath("//span[contains(text(),'Select Your Services')]");


    public LogOutPages(WebDriver driver){
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void LinkTC(){
        validateHelper.LinkTC("https://siliconstackcomau.sharepoint.com/:x:/r/sites/EasyServ/_layouts/15/Doc.aspx?sourcedoc=%7B2BE085A0-6580-4930-9D19-3CEE6C899F5A%7D&file=Test%20Case%20Log%20Out.xlsx&action=default&mobileredirect=true");
    }

    public void LoginPage(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
    }

    public void LogOut_TC001(){
        LoginPage();
        validateHelper.clickElement(userLogin);
    }

    public void LogOut_TC002(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(logOutOption);
    }

    public void LogOut_TC003(){
        LoginPage();
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        validateHelper.clickElement(toyotaVehicle);
        validateHelper.clickElement(confirmButton);
        validateHelper.delay(2);
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(logOutOption);
        validateHelper.clickElement(yesBt);
    }

    public void LogOut_TC004(){
        LoginPage();
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        validateHelper.clickElement(toyotaVehicle);
        validateHelper.clickElement(confirmButton);
        validateHelper.delay(2);
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(logOutOption);
        validateHelper.clickElement(yesBt);
        validateHelper.clickElement(backBt);
    }

    public void LogOut_TC005(){
        LoginPage();
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        validateHelper.clickElement(toyotaVehicle);
        validateHelper.clickElement(confirmButton);
        validateHelper.delay(2);
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(logOutOption);
        validateHelper.clickElement(NoBt);

    }

    public String VerifySelectServiceHeader(){
        String header = validateHelper.checkText(selectServiceHeader);
        return header;
    }
    public String VerifyVehicleHeader(){
        String header = validateHelper.checkText(selectVehicleHeader);
        return header;
    }

    public String VerifyLoginHeader(){
        String header = validateHelper.checkText(loginHeader);
        return header;
    }

    public String VerifyLogOutOption(){
        String logOut = validateHelper.checkText(logOutOption);
        return logOut;
    }
}

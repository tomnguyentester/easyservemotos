package com.easyserv.pages.Motoserve_BookingApp_UAT;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchVehicleManuallyPages {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By selectVehicleHeader = By.xpath("//span[contains(text(),'Select your vehicle')]");
    private By enterNumberText = By.xpath("//span[contains(text(),'Enter your registration number to quickly identify')]");
    private By stateBox = By.xpath("//span[contains(text(),'NSW')]");
    private By enterRegoText = By.xpath("//input[@placeholder='Enter your rego']");
    private By findMyCarBt = By.xpath("//button[@type='button']");
    private By findCarLink = By.xpath("//u[normalize-space()='Or find your car by make, model and year']");
    private By userIcon = By.xpath("//*[name()='path' and contains(@d,'M20.1212 1')]");
    private By emailText = By.xpath("//input[@id='email']");
    private By passwordText = By.xpath("//input[@id='password']");
    private By loginBt = By.xpath("//button[@type='submit']");
    private By confirmVehicleHeader = By.xpath("//span[contains(text(),'Confirm your vehicle')]");
    private By toyotaVehicle = By.xpath("//div[contains(text(),'TOYOTA LANDCRUISER')]");
    private By regoNum = By.xpath("//div[@class='ant-col tag']");
    private By confirmBt = By.xpath("//body/div[@id='__next']/section[@id='main-layout']/main[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]");
    private By addAnotherVehicleLink = By.xpath("//u[normalize-space()='Add another vehicle']");
    private By orFindYourCarLink = By.xpath("//u[normalize-space()='Or find your car by make, model and year']");
    private By pleaseEnterCarHeader = By.xpath("//span[contains(text(),'Please Enter Your Car Details')]");
    private By searchAgain = By.xpath("//u[normalize-space()='Search Again']");
    private By selectStoreMess = By.xpath("//div[contains(text(),'Please select a store to proceed')]");
    private By vehicleNotfoundMess = By.xpath("//div[contains(text(),'Vehicle Not Found')]");
    private By specialCharMess = By.xpath("//div[@class='ant-col ant-col-24 message']");
    private By regisNumberText = By.xpath("//input[@id='basic_rego']");
    private By state = By.xpath("//span[contains(text(),'NSW')]");
    private By vinText = By.xpath("//input[@id='basic_vin']");
    private By makeDrop = By.xpath("//input[@id='basic_make']");
    private By modelDrop = By.xpath("//input[@id='basic_model']");
    private By bodyType = By.xpath("//input[@id='basic_bodyType']");
    private By variantType = By.xpath("//input[@id='basic_variant']");
    private By searchByRego = By.xpath("//u[contains(text(),'Search by Rego')]");
    private By make_abarth = By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='ABARTH']");
    private By model_595 = By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='595']");
    private By storeSelect = By.xpath("//u[contains(text(),'No store currently selected')]");
    private By viewstoreBt = By.xpath("//span[contains(text(),'View all stores')]");
    private By setStore = By.xpath("//span[contains(text(),'Set As My Store')]");
    private By selectServHeader = By.xpath("//span[contains(text(),'Select Your Services')]");
    private By vehicleStep = By.xpath("//div[@class='ant-steps-item ant-steps-item-finish ant-steps-item-custom']//div[@class='ant-steps-item-title']");
    private By vehicleName = By.xpath("//div[normalize-space()='ABARTH 595']");
    private By vehicleIcon = By.xpath("//strong[normalize-space()='9998']");
    private By regisReqMess = By.xpath("//div[contains(text(),'The Registration Number field is required')]");
    private By regisSpecMess = By.xpath("//div[contains(text(),'Special characters or spaces are not allowed.')]");





    public SearchVehicleManuallyPages(WebDriver driver){
        this.driver= driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void LinkTC(){
        validateHelper.LinkTC("https://siliconstackcomau.sharepoint.com/:x:/r/sites/EasyServ/_layouts/15/Doc.aspx?sourcedoc=%7B61FF8352-C546-4C6D-ABDF-E63C28647572%7D&file=Test%20Case%20Search%20Vehicle%20Manually.xlsx&action=default&mobileredirect=true");
    }

    public void SearchVehicleManually_TC001(){
        LinkTC();
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(addAnotherVehicleLink);
        validateHelper.clickElement(orFindYourCarLink);
    }

    public void SearchVehicleManually_TC002(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(addAnotherVehicleLink);
        validateHelper.clickElement(orFindYourCarLink);
        Assert.assertTrue(VerifyStatusRegisNumber());
        validateHelper.setText(regisNumberText,"123");
    }

    public void SearchVehicleManually_TC003(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(addAnotherVehicleLink);
        validateHelper.clickElement(orFindYourCarLink);
        validateHelper.movetoElement(searchByRego);
        validateHelper.clickElement(searchByRego);
    }

    public void SearchVehicleManually_TC004(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        validateHelper.clickElement(addAnotherVehicleLink);
        validateHelper.clickElement(orFindYourCarLink);
        validateHelper.clickElement(regisNumberText);
        validateHelper.setText(regisNumberText,"9998");
        validateHelper.clickElement(makeDrop);
        validateHelper.clickElement(make_abarth);
        validateHelper.movetoElement(modelDrop);
        validateHelper.clickElement(modelDrop);
        validateHelper.clickElement(model_595);
        validateHelper.clickElement(confirmBt);
        Assert.assertEquals(VerifyServiceHeader(),"SELECT YOUR SERVICES");
        validateHelper.clickElement(vehicleStep);
    }

    public void SearchVehicleManually_TC005(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        validateHelper.clickElement(addAnotherVehicleLink);
        validateHelper.clickElement(orFindYourCarLink);
        validateHelper.clickElement(regisNumberText);
        validateHelper.setText(regisNumberText,"9998");
        validateHelper.clickElement(makeDrop);
        validateHelper.clickElement(make_abarth);
        validateHelper.movetoElement(modelDrop);
        validateHelper.clickElement(modelDrop);
        validateHelper.clickElement(model_595);
        validateHelper.clickElement(confirmBt);
        Assert.assertEquals(VerifyServiceHeader(),"SELECT YOUR SERVICES");
        validateHelper.delay(3);
    }

    public void SearchVehicleManually_TC006(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(addAnotherVehicleLink);
        validateHelper.clickElement(orFindYourCarLink);
        validateHelper.clickElement(regisNumberText);
        validateHelper.setText(regisNumberText,"9998");
        validateHelper.clearText(regisNumberText);
    }

    public void SearchVehicleManually_TC007(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(addAnotherVehicleLink);
        validateHelper.clickElement(orFindYourCarLink);
        validateHelper.clickElement(regisNumberText);
        validateHelper.setText(regisNumberText,"76AH7633736FNY397473H");
    }

    public void SearchVehicleManually_TC008(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(addAnotherVehicleLink);
        validateHelper.clickElement(orFindYourCarLink);
        validateHelper.clickElement(regisNumberText);
        validateHelper.setText(regisNumberText,"%638#$");
    }

    public void SearchVehicleManually_TC009(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(addAnotherVehicleLink);
        validateHelper.clickElement(orFindYourCarLink);
        validateHelper.clickElement(regisNumberText);
        validateHelper.setText(regisNumberText,"123");
        validateHelper.pressSpace(regisNumberText);
    }

    public void SearchVehicleManually_TC010(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(addAnotherVehicleLink);
        validateHelper.clickElement(orFindYourCarLink);
        validateHelper.clickElement(regisNumberText);
        validateHelper.setText(regisNumberText,"9998");
        validateHelper.clickElement(makeDrop);
        validateHelper.clickElement(make_abarth);
        validateHelper.movetoElement(modelDrop);
        validateHelper.clickElement(modelDrop);
        validateHelper.clickElement(model_595);
        validateHelper.clickElement(confirmBt);
    }


    public String VerifySelectStoreMess(){
        String mess = validateHelper.checkText(selectStoreMess);
        return mess;
    }

    public String VerifyRegisSpecMess(){
        String mess = validateHelper.checkText(regisSpecMess);
        return mess;
    }

    public String GetRegisNumValue(){
        String value = validateHelper.getAttribute(regisNumberText);
        return value;
    }

    public String VerifyRegisNumberReqMess(){
        String mess = validateHelper.checkText(regisReqMess);
        return mess;
    }

    public String VerifyVehicleNumberIcon(){
        String text = validateHelper.checkText(vehicleIcon);
        return text;
    }

    public String VerifyVehicleNameTitle(){
        String text = validateHelper.checkText(vehicleName);
        return text;
    }

    public String VerifyServiceHeader(){
        String text = validateHelper.checkText(selectServHeader);
        return text;
    }


    public String VerifyEnterCarDetailHeader(){
        String text = validateHelper.checkText(pleaseEnterCarHeader);
        return text;
    }

    public boolean VerifuStatusRegisNumField(){
        boolean status = validateHelper.enableElement(regisNumberText);
        return status;
    }

    public boolean VerifyStatusStateDrop(){
        boolean status = validateHelper.enableElement(state);
        return status;
    }

    public boolean VerifuStatusMakeDrop(){
        boolean status = validateHelper.enableElement(makeDrop);
        return status;
    }

    public boolean VerifuStatusModelDrop(){
        boolean status = validateHelper.enableElement(modelDrop);
        return status;
    }

    public boolean VerifyStatusConfirmButton(){
        boolean status = validateHelper.enableElement(confirmBt);
        return status;
    }

    public String VerifySearchByRegoLink(){
        String text = validateHelper.checkText(searchByRego);
        return text;
    }

    public boolean VerifyStatusRegisNumber(){
        boolean status = validateHelper.enableElement(regisNumberText);
        return status;
    }

    public String VerifySelectVehicleHeader(){
        String text = validateHelper.checkText(selectVehicleHeader);
        return text;
    }



}

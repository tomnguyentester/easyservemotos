package com.easyserv.pages.Motoserve_BookingApp_UAT;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchVehicleByRegoPages {
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
    private By confirmBt = By.xpath("//span[normalize-space()='Confirm and Proceed']");
    private By addAnotherVehicleLink = By.xpath("//u[normalize-space()='Add another vehicle']");
    private By orFindYourCarLink = By.xpath("//u[normalize-space()='Or find your car by make, model and year']");
    private By pleaseEnterCarHeader = By.xpath("//span[contains(text(),'Please Enter Your Car Details')]");
    private By searchAgain = By.xpath("//u[normalize-space()='Search Again']");
    private By selectStoreMess = By.xpath("//div[contains(text(),'Please select a store to proceed')]");
    private By vehicleNotfoundMess = By.xpath("//div[contains(text(),'Vehicle Not Found')]");
    private By specialCharMess = By.xpath("//div[@class='ant-col ant-col-24 message']");

    public SearchVehicleByRegoPages(WebDriver driver){
        this.driver= driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void LinkTC(){
        validateHelper.LinkTC("https://siliconstackcomau.sharepoint.com/:x:/r/sites/EasyServ/_layouts/15/Doc.aspx?sourcedoc=%7B98EC32EE-AFF3-471C-B30A-6EE2DFEF1FC3%7D&file=Test%20Case%20Search%20Vehicle%20by%20Rego.xlsx&action=default&mobileredirect=true");
    }


    public void SerchVehicleRego_TC001(){
        LinkTC();
        Assert.assertEquals(VerifySelectVehicleHeader(),"SELECT YOUR VEHICLE");
        Assert.assertEquals(VerifyEnterRegisterText(),"Enter your registration number to quickly identify your car");
        Assert.assertEquals(VerifyStateBox(),"NSW");
        Assert.assertFalse(VerifyStatusFindCarButton(),"Fin Car Button Not Avaible");
        Assert.assertTrue(VerifyStatusEnterRegoText(),"Enter Rego Text Not Avaible");
    }

    public void SerchVehicleRego_TC002(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(addAnotherVehicleLink);
        validateHelper.setText(enterRegoText,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.clickElement(toyotaVehicle);
        validateHelper.movetoElement(confirmBt);
    }

    public void SerchVehicleRego_TC003(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(addAnotherVehicleLink);
        Assert.assertEquals(VerifySelectVehicleHeader(),"SELECT YOUR VEHICLE");
        Assert.assertEquals(VerifyEnterRegisterText(),"Enter your registration number to quickly identify your car");
        Assert.assertEquals(VerifyStateBox(),"NSW");
        Assert.assertFalse(VerifyStatusFindCarButton(),"Fin Car Button Not Avaible");
        Assert.assertTrue(VerifyStatusEnterRegoText(),"Enter Rego Text Not Avaible");
    }

    public void SerchVehicleRego_TC004(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(addAnotherVehicleLink);
        validateHelper.clickElement(orFindYourCarLink);
    }

    public void SerchVehicleRego_TC005(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(addAnotherVehicleLink);
        validateHelper.setText(enterRegoText,"1ABC78");
    }

    public void SerchVehicleRego_TC006(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(addAnotherVehicleLink);
        validateHelper.setText(enterRegoText,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.movetoElement(searchAgain);
        validateHelper.clickElement(searchAgain);
    }

    public void SerchVehicleRego_TC007(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(addAnotherVehicleLink);
        validateHelper.setText(enterRegoText,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.movetoElement(confirmBt);
        validateHelper.clickElement(confirmBt);
    }

    public void SerchVehicleRego_TC008(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(addAnotherVehicleLink);
        validateHelper.setText(enterRegoText,"001");
        validateHelper.clickElement(findMyCarBt);
    }

    public void SerchVehicleRego_TC009(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(addAnotherVehicleLink);
        validateHelper.setText(enterRegoText,"6632DS772883HUT8487373ZZ");
    }

    public void SerchVehicleRego_TC010(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(addAnotherVehicleLink);
        validateHelper.setText(enterRegoText,"8%");
    }

    public String VerifySpecialCharMess(){
        String mess = validateHelper.checkText(specialCharMess);
        return mess;
    }

    public String GetRegoValue(){
        String value = validateHelper.getAttribute(enterRegoText);
        return value;
    }

    public String VerifyVehicleNotFoundMess(){
        String mess = validateHelper.checkText(vehicleNotfoundMess);
        return mess;
    }

    public String VerifySelectStoreMess(){
        String mess = validateHelper.checkText(selectStoreMess);
        return mess;
    }

    public String VerifyEnterCarDetailHeader(){
        String text = validateHelper.checkText(pleaseEnterCarHeader);
        return text;
    }
    public boolean VerifyStatusConfirmButton(){
        boolean status = validateHelper.enableElement(confirmBt);
        return status;
    }

    public String VerifyRegoNumber(){
        String text = validateHelper.checkText(regoNum);
        return text;
    }

    public String VerifyVehicleTitle(){
        String text = validateHelper.checkText(toyotaVehicle);
        return text;
    }

    public String VerifyConfirmVehicleHeader(){
        String text = validateHelper.checkText(confirmVehicleHeader);
        return text;
    }

    public boolean VerifyStatusEnterRegoText(){
        boolean status = validateHelper.enableElement(enterRegoText);
        return status;
    }

    public String VerifySelectVehicleHeader(){
        String header = validateHelper.checkText(selectVehicleHeader);
        return header;
    }

    public String VerifyStateBox(){
        String stat = validateHelper.checkText(stateBox);
        return stat;
    }

    public boolean VerifyStatusFindCarButton(){
        boolean finBt = validateHelper.enableElement(findMyCarBt);
        return finBt;
    }

    public String VerifyEnterRegisterText(){
        String text = validateHelper.checkText(enterNumberText);
        return text;
    }


}

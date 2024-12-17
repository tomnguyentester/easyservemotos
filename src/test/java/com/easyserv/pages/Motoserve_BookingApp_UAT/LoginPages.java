package com.easyserv.pages.Motoserve_BookingApp_UAT;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPages {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By userIcon = By.xpath("//*[name()='path' and contains(@d,'M20.1212 1')]");
    private By emailText = By.xpath("//input[@id='email']");
    private By passwordText = By.xpath("//input[@id='password']");
    private By loginBt = By.xpath("//button[@type='submit']");
    private By loginHeader = By.xpath("//span[contains(text(),'Login To Your Account')]");
    private By userLogin = By.xpath("//strong[normalize-space()='TN']");
    private By successNoti = By.xpath("//div[@class='ant-notification ant-notification-topRight']//div");
    private By emailReqMess = By.xpath("//div[contains(text(),'The email field is required')]");
    private By emailValidMess = By.xpath("//div[contains(text(),'The Email field must be a valid email')]");
    private By passReqMess = By.xpath("//div[contains(text(),'The password field is required')]");
    private By fogotPassLink = By.xpath("//a[contains(text(),'Forgot password?')]");
    private By resetPassHeader = By.xpath("//span[@class='ant-typography title']");
    private By combinateMess = By.xpath("//div[@class='ant-notification-notice-message']");
    private By signUpButton = By.xpath("//a[contains(text(),'Sign Up')]");
    private By signUpHeader= By.xpath("//span[contains(text(),'Sign Up TO Motorserve')]");
    private By backBt = By.xpath("//span[contains(text(),'Back')]");
    private By bookServiceHeader = By.xpath("//span[contains(text(),'BOOK A SERVICE')]");
    private By confirmVehicleHeader = By.xpath("//span[contains(text(),'Confirm your vehicle')]");

    public LoginPages(WebDriver driver){
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void LinkTC(){
        validateHelper.LinkTC("https://siliconstackcomau.sharepoint.com/:x:/r/sites/EasyServ/_layouts/15/Doc.aspx?sourcedoc=%7B54970576-E3DB-49C1-8E39-0DE5C989FCEE%7D&file=Test%20Case%20Login.xlsx&action=default&mobileredirect=true");
    }

    public void Login_TC001(){
        validateHelper.clickElement(userIcon);
        validateHelper.waitForPageLoaded();
    }

    public void Login_TC002(){
        validateHelper.clickElement(userIcon);
        validateHelper.waitForPageLoaded();
        Assert.assertTrue(VerifyStatusEmailBox());
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
    }

    public void Login_TC003(){
        validateHelper.clickElement(userIcon);
        validateHelper.waitForPageLoaded();
        Assert.assertTrue(VerifyStatusPasswordBox());
        validateHelper.setText(passwordText,"Testing123@");
    }

    public void Login_TC004(){
        validateHelper.clickElement(userIcon);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
    }

    public void Login_TC005(){
        validateHelper.clickElement(userIcon);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clearText(emailText);
    }

    public void Login_TC006(){
        validateHelper.clickElement(userIcon);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(emailText,"testing@gmail.commmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm2222222");
    }

    public void Login_TC007(){
        validateHelper.clickElement(userIcon);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(emailText,"@gmail");
    }

    public void Login_TC008(){
        validateHelper.clickElement(userIcon);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clearText(passwordText);
    }

    public void Login_TC009(){
        validateHelper.clickElement(userIcon);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@444444444555");
    }


    public void Login_TC010(){
        validateHelper.clickElement(userIcon);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
    }

    public void Login_TC011(String email,String pass){
        validateHelper.clickElement(userIcon);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(emailText,email);
        validateHelper.setText(passwordText,pass);
    }

    public void Login_TC012(){
        validateHelper.clickElement(userIcon);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(fogotPassLink);
    }

    public void Login_TC013(String email,String pass){
        validateHelper.clickElement(userIcon);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(emailText,email);
        validateHelper.setText(passwordText,pass);
        validateHelper.clickElement(loginBt);
        validateHelper.delay(2);
    }

    public void Login_TC014(){
        validateHelper.clickElement(userIcon);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(signUpButton);
    }

    public void Login_TC015(){
        validateHelper.clickElement(userIcon);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(backBt);
    }

    public void Login_TC016(){
        validateHelper.clickElement(userIcon);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
    }

    public String VerifyConfirmVehicleHeader(){
        String header = validateHelper.checkText(confirmVehicleHeader);
        return header;
    }

    public String VerifyBookServiceHeader(){
        String header = validateHelper.checkText(bookServiceHeader);
        return header;
    }

    public String VerifySignUpHeader(){
        String header = validateHelper.checkText(signUpHeader);
        return header;
    }

    public String VerifyCombinaMess(){
        String mess = validateHelper.checkText(combinateMess);
        return mess;
    }

    public String VerifyResetPassHeader(){
        String header = validateHelper.checkText(resetPassHeader);
        return header;
    }

    public String VerifyPassReqMess(){
        String mess = validateHelper.checkText(passReqMess);
        return mess;
    }

    public String GetPasswordValue(){
        String value = validateHelper.getAttribute(passwordText);
        return value;
    }

    public String VerifyEmailValidMess(){
        String mess = validateHelper.checkText(emailValidMess);
        return mess;
    }

    public String GetEmailValue(){
        String value = validateHelper.getAttribute(emailText);
        return value;
    }

    public String VerifyEmailReqMess(){
        String mess = validateHelper.checkText(emailReqMess);
        return mess;
    }

    public String VerifyLoginSuccessMess(){
        String mess = validateHelper.checkText(successNoti);
        return mess;
    }

    public String VerifyLoginHeader(){
        String header = validateHelper.checkText(loginHeader);
        return header;
    }

    public boolean VerifyStatusEmailBox(){
        boolean status = validateHelper.enableElement(emailText);
        return status;
    }

    public boolean VerifyStatusPasswordBox(){
        boolean status = validateHelper.enableElement(passwordText);
        return status;
    }

    public boolean VerifyStatusLoginButton(){
        boolean status = validateHelper.enableElement(loginBt);
        return status;
    }

}

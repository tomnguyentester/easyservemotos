package com.easyserv.pages.Motoserve_BookingApp_UAT;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ForgotPassPages {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By userIcon = By.xpath("//*[name()='path' and contains(@d,'M20.1212 1')]");
    private By forgotLink = By.xpath("//a[contains(text(),'Forgot password?')]");
    private By resetHeader = By.xpath("//span[@class='ant-typography title']");
    private By intruction = By.xpath("//span[@class='ant-typography instruction']");
    private By email = By.xpath("//input[@id='email']");
    private By resetBt = By.xpath("//button[@type='submit']");
    private By signUpLink = By.xpath("//a[@class='ant-typography sign-up']");
    private By checkemailHeader = By.xpath("//span[contains(text(),'CHECK YOUR EMAIL')]");
    private By loginBt = By.xpath("//span[contains(text(),'Login now')]");
    private By tryEmailLink = By.xpath("//span[contains(text(),'try another email address')]");
    private By intrucReset = By.xpath("//span[contains(text(),'We have emailed instructions on how to reset your ')]");
    private By backBt = By.xpath("//span[contains(text(),'Back')]");
    private By loginHeader = By.xpath("//span[contains(text(),'Login To Your Account')]");
    private By signUpHeader = By.xpath("//span[contains(text(),'Sign Up TO Motorserve')]");
    private By cusExitNoti = By.xpath("//div[@class='ant-notification ant-notification-topRight']//div");
    private By emailValidMess = By.xpath("//div[contains(text(),'The Email field must be a valid email')]");
    private By emailReq = By.xpath("//div[contains(text(),'The email field is required')]");
    private By emailEXMess = By.xpath("//div[contains(text(),'Your email must not exceed 50 characters.')]");

    public ForgotPassPages(WebDriver driver){
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void LinkTC(){
        validateHelper.LinkTC("https://siliconstackcomau.sharepoint.com/:x:/r/sites/EasyServ/_layouts/15/Doc.aspx?sourcedoc=%7B4CA361D2-4F72-4969-81B5-EF846B18A19F%7D&file=Test%20Case%20Forgot%20Password.xlsx&action=default&mobileredirect=true");
    }

    public void ForgotPass_TC001(){
        LinkTC();
        validateHelper.clickElement(userIcon);
        validateHelper.clickElement(forgotLink);
    }

    public void ForgotPass_TC002(){
        validateHelper.clickElement(userIcon);
        validateHelper.clickElement(forgotLink);
        validateHelper.setText(email,"nguyentrungdtu@gmail.com");
        validateHelper.clickElement(resetBt);
    }

    public void ForgotPass_TC003(){
        validateHelper.clickElement(userIcon);
        validateHelper.clickElement(forgotLink);
        Assert.assertTrue(VerifyEmailStatus());
        validateHelper.setText(email,"123ad86$$^^");
    }

    public void ForgotPass_TC004(){
        validateHelper.clickElement(userIcon);
        validateHelper.clickElement(forgotLink);
        validateHelper.clickElement(backBt);
    }

    public void ForgotPass_TC005(){
        validateHelper.clickElement(userIcon);
        validateHelper.clickElement(forgotLink);
        validateHelper.clickElement(signUpLink);
    }

    public void ForgotPass_TC006(){
        validateHelper.clickElement(userIcon);
        validateHelper.clickElement(forgotLink);
        validateHelper.setText(email,"nguyentrungdtu@gmail.com");
        validateHelper.clickElement(resetBt);
        validateHelper.clickElement(tryEmailLink);
    }

    public void ForgotPass_TC007(){
        validateHelper.clickElement(userIcon);
        validateHelper.clickElement(forgotLink);
        validateHelper.setText(email,"nguyentrungdtu@gmail.com");
        validateHelper.clickElement(resetBt);
        validateHelper.clickElement(loginBt);
    }

    public void ForgotPass_TC008(){
        validateHelper.clickElement(userIcon);
        validateHelper.clickElement(forgotLink);
        validateHelper.setText(email,"nguyentrungdtu@gmail.com");
        validateHelper.clickElement(resetBt);
        validateHelper.clickElement(backBt);
        validateHelper.delay(2);
    }

    public void ForgotPass_TC009(){
        validateHelper.clickElement(userIcon);
        validateHelper.clickElement(forgotLink);
        validateHelper.setText(email,"tester@gmail.com");
        validateHelper.clickElement(resetBt);
        validateHelper.delay(2);
    }

    public void ForgotPass_TC010(){
        validateHelper.clickElement(userIcon);
        validateHelper.clickElement(forgotLink);
        validateHelper.setText(email,"testergmail.com");
        validateHelper.delay(2);
    }

    public void ForgotPass_TC011(){
        validateHelper.clickElement(userIcon);
        validateHelper.clickElement(forgotLink);
        validateHelper.setText(email,"tester@gmail.com");
        validateHelper.clearText(email);
        validateHelper.delay(2);
    }

    public void ForgotPass_TC012(){
        validateHelper.clickElement(userIcon);
        validateHelper.clickElement(forgotLink);
        validateHelper.setText(email,"nttuyetanh091nttuyetanh091nttuyetanh091nt@gmail.com");
        validateHelper.delay(2);
    }

    public String VerifyEmailEXMess(){
        String mess = validateHelper.checkText(emailEXMess);
        return mess;
    }


    public String VerifyEmailReqMess(){
        String mess = validateHelper.checkText(emailReq);
        return mess;
    }

    public String VerifyEmailValidMess(){
        String mess = validateHelper.checkText(emailValidMess);
        return mess;
    }

    public String VerifyEmailExisted(){
        String mess = validateHelper.checkText(cusExitNoti);
        return mess;
    }


    public String VerifySignUpHeader(){
        String header = validateHelper.checkText(signUpHeader);
        return header;
    }

    public String VerifyLoginHeader(){
        String header = validateHelper.checkText(loginHeader);
        return header;
    }

    public String VerifyCheckEmailHeader(){
        String header = validateHelper.checkText(checkemailHeader);
        return header;
    }

    public String VerifyIntrucEmail(){
        String text = validateHelper.checkText(intrucReset);
        return text;
    }

    public boolean VerifyLoginButton(){
        boolean button = validateHelper.enableElement(loginBt);
        return button;
    }

    public String VerifyResetPassHeader(){
        String header = validateHelper.checkText(resetHeader);
        return header;
    }

    public String VerifyInstructionText(){
        String text = validateHelper.checkText(intruction);
        return text;
    }

    public boolean VerifyEmailStatus(){
        boolean textbox = validateHelper.enableElement(email);
        return textbox;
    }

    public boolean VerifyResetButton(){
        boolean button = validateHelper.enableElement(resetBt);
        return button;
    }

}

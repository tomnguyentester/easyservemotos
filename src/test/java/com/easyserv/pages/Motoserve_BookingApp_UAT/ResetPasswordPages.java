package com.easyserv.pages.Motoserve_BookingApp_UAT;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ResetPasswordPages {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By loginIcon= By.xpath("//*[name()='path' and contains(@d,'M20.1212 1')]");
    private By forgotPassLink = By.xpath("//a[contains(text(),'Forgot password?')]");
    private By resetPassHeader = By.xpath("//span[@class='ant-typography title']");
    private By intrucText = By.xpath("//span[@class='ant-typography instruction']");
    private By email = By.xpath("//input[@id='email']");
    private By resetBt = By.xpath("//button[@type='submit']");
    private By emailReqMess = By.xpath("//div[contains(text(),'The email field is required')]");
    private By emailValidMess = By.xpath("//div[contains(text(),'The Email field must be a valid email')]");
    private By emailEX = By.xpath("//div[contains(text(),'Your email must not exceed 50 characters.')]");
    private By emailNotExisted = By.xpath("//div[@class='ant-notification-notice-message']");
    private By backBt = By.xpath("//span[contains(text(),'Back')]");
    private By loginHeader = By.xpath("//span[contains(text(),'Login To Your Account')]");
    private By signUpLink = By.xpath("//a[contains(text(),'Sign Up')]");
    private By signUpHeader = By.xpath("//span[contains(text(),'Sign Up TO Motorserve')]");
    private By checkEmailHeader = By.xpath("//span[contains(text(),'CHECK YOUR EMAIL')]");
    private By loginnowBt = By.xpath("//span[normalize-space()='Login now']");
    private By tryAnotherEmailLink = By.xpath("//span[contains(text(),'try another email address')]");

    private String urlReset ="https://motorserve-booking-uat.siliconstack.com.au/reset-password?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6Im5ndXllbnRydW5nZHR1QGdtYWlsLmNvbSIsImlzQWRtaW4iOmZhbHNlLCJpYXQiOjE3MjMwMTY1OTYsImV4cCI6MTcyMzAxODM5Nn0.yX9TCHP6Vyv5s0SyEeP7HmBF1YDuBY30Ja8kzZhAjJ0";
    private By ResetPasswordHeader = By.xpath("//span[contains(text(),'RESET PASSWORD')]");
    private By newPassText = By.xpath("//input[@id='newPassword']");
    private By confNewPass = By.xpath("//input[@id='confirmNewPassword']");
    private By saveBt = By.xpath("//button[@type='submit']");
    private By eyeNewPassIcon = By.xpath("//div[@data-label='New Password']//span[@aria-label='eye-invisible']//*[name()='svg']");
    private By newPassReqMess = By.xpath("//div[contains(text(),'The New Password field is required')]");
    private By newPassEXMess = By.xpath("//div[contains(text(),'Your password must not exceed 20 characters.')]");
    private By eyeConfNewPass = By.xpath("//div[@data-label='Confirm New Password']//span[@aria-label='eye-invisible']//*[name()='svg']");
    private By confPassEXMess = By.xpath("//div[normalize-space()='Your password must not exceed 20 characters.']");
    private By confPassNotMatch = By.xpath("//div[contains(text(),'The confirmed password is not matched. Please try ')]");
    private By expirePassMess = By.xpath("//div[@class='ant-notification-notice-message']");


    public ResetPasswordPages(WebDriver driver){
        this.driver= driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void LinkTC(){
        validateHelper.LinkTC("https://siliconstackcomau.sharepoint.com/:x:/r/sites/EasyServ/_layouts/15/Doc.aspx?sourcedoc=%7BF8CED675-27F1-4832-AF43-E1493B5FF4F5%7D&file=Test%20Case%20Reset%20Password.xlsx&action=default&mobileredirect=true");
    }

    public void ResetPassword_TC001(){
        LinkTC();
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(forgotPassLink);
        validateHelper.delay(2);
    }

    public void ResetPassword_TC002(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(forgotPassLink);
        validateHelper.setText(email,"testing123@gmail.com");
        validateHelper.clearText(email);
        validateHelper.delay(2);
    }

    public void ResetPassword_TC003(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(forgotPassLink);
        validateHelper.setText(email,"@gmail.com");
        validateHelper.delay(2);
    }

    public void ResetPassword_TC004(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(forgotPassLink);
        validateHelper.setText(email,"admin@example.commmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        validateHelper.delay(2);
    }

    public void ResetPassword_TC005(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(forgotPassLink);
        validateHelper.setText(email,"testing123@gmail.com");
        validateHelper.delay(2);
    }

    public void ResetPassword_TC006(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(forgotPassLink);
        validateHelper.setText(email,"testing123@gmail.com");
        validateHelper.clickElement(resetBt);
        validateHelper.delay(2);
    }

    public void ResetPassword_TC007(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(forgotPassLink);
        validateHelper.clickElement(backBt);
        validateHelper.delay(2);
    }

    public void ResetPassword_TC008(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(forgotPassLink);
        validateHelper.clickElement(signUpLink);
        validateHelper.delay(2);
    }

    public void ResetPassword_TC009(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(forgotPassLink);
        validateHelper.setText(email,"nguyentrungdtu@gmail.com");
        validateHelper.clickElement(resetBt);
        validateHelper.delay(2);
    }

    public void ResetPassword_TC010(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(forgotPassLink);
        validateHelper.setText(email,"nguyentrungdtu@gmail.com");
        validateHelper.clickElement(resetBt);
        validateHelper.delay(2);
        validateHelper.clickElement(loginnowBt);
    }

    public void ResetPassword_TC011(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(forgotPassLink);
        validateHelper.setText(email,"nguyentrungdtu@gmail.com");
        validateHelper.clickElement(resetBt);
        validateHelper.delay(2);
        validateHelper.clickElement(tryAnotherEmailLink);
    }

    public void ResetPassword_TC012(){
        driver.navigate().to(urlReset);
        validateHelper.waitForPageLoaded();
    }

    public void ResetPassword_TC013(){
        driver.navigate().to(urlReset);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(newPassText,"123456");
        validateHelper.setText(confNewPass,"123456");
        validateHelper.delay(2);
    }

    public void ResetPassword_TC014(){
        driver.navigate().to(urlReset);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(backBt);
        validateHelper.delay(2);
    }

    public void ResetPassword_TC015(String newpass_){
        driver.navigate().to(urlReset);
        validateHelper.waitForPageLoaded();
        Assert.assertTrue(VerifyStatusNewPassText());
        validateHelper.clickElement(eyeNewPassIcon);
        validateHelper.setText(newPassText,newpass_);
    }

    public void ResetPassword_TC016(){
        driver.navigate().to(urlReset);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(eyeNewPassIcon);
        validateHelper.setText(newPassText,"123456");
        validateHelper.clearText(newPassText);
    }

    public void ResetPassword_TC017(){
        driver.navigate().to(urlReset);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(eyeNewPassIcon);
        validateHelper.setText(newPassText,"abc%$#123jue_+7621ddt");
    }

    public void ResetPassword_TC018(String confPass){
        driver.navigate().to(urlReset);
        validateHelper.waitForPageLoaded();
        Assert.assertTrue(VerifyStatusConfirmPassText());
        validateHelper.clickElement(eyeConfNewPass);
        validateHelper.setText(confNewPass,confPass);
    }

    public void ResetPassword_TC019(){
        driver.navigate().to(urlReset);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(newPassText,"abc%$#123jue_+7621dd");
        validateHelper.setText(confNewPass,"abc%$#123jue_+7621ddt");
    }

    public void ResetPassword_TC020(){
        driver.navigate().to(urlReset);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(newPassText,"abc%$#123jue_+7621dd");
        validateHelper.setText(confNewPass,"abc%$#123jue_+7621dd");
        validateHelper.clearText(confNewPass);
    }

    public void ResetPassword_TC021(){
        driver.navigate().to(urlReset);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(newPassText,"abc%$#123jue_+7621dd");
        validateHelper.setText(confNewPass,"abc%$#123jue_+762111");
    }

    public void ResetPassword_TC022(){
        driver.navigate().to(urlReset);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(newPassText,"abc%$#123jue");
        validateHelper.setText(confNewPass,"abc%$#123jue");
        validateHelper.clearText(newPassText);
    }

    public void ResetPassword_TC023(){
        driver.navigate().to(urlReset);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(newPassText,"81283judy876%$&(*^21-32323");
        validateHelper.setText(confNewPass,"123456");
    }

    public void ResetPassword_TC024(){
        driver.navigate().to(urlReset);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(newPassText,"123456");
        validateHelper.setText(confNewPass,"123456");
        validateHelper.clickElement(eyeNewPassIcon);
        validateHelper.clickElement(eyeConfNewPass);
        validateHelper.delay(2);
    }

    public void ResetPassword_TC025(){
        driver.navigate().to(urlReset);
        validateHelper.waitForPageLoaded();
        validateHelper.setText(newPassText,"123456");
        validateHelper.setText(confNewPass,"123456");
        validateHelper.clickElement(saveBt);
        validateHelper.delay(2);
    }

    public String VerifyResetExpiredMess(){
        String mess = validateHelper.checkText(expirePassMess);
        return mess;
    }


    public String VerifyGetValueNewPass(){
        String value = validateHelper.getAttribute(newPassText);
        return value;
    }

    public String VerifyGetValueConfNewPass() {
        String value = validateHelper.getAttribute(confNewPass);
        return value;
    }

    public String VerifyConfNewPassNotMatMess(){
        String mess = validateHelper.checkText(confPassNotMatch);
        return mess;
    }

    public String VerifyConfNewPassEXMess(){
        String mess = validateHelper.checkText(confPassEXMess);
        return mess;
    }

    public String VerifyNewPassEXMess(){
        String mess = validateHelper.checkText(newPassEXMess);
        return mess;
    }

    public String VerifyNewPassReqMess(){
        String mess = validateHelper.checkText(newPassReqMess);
        return mess;
    }

    public String VerifyResetPasswordHeader(){
        String header = validateHelper.checkText(ResetPasswordHeader);
        return header;
    }

    public boolean VerifyStatusNewPassText(){
        boolean textbox = validateHelper.enableElement(newPassText);
        return textbox;
    }

    public boolean VerifyStatusConfirmPassText(){
        boolean textbox = validateHelper.enableElement(confNewPass);
        return textbox;
    }

    public boolean VerifyStatusSaveButton(){
        boolean button = validateHelper.enableElement(saveBt);
        return button;
    }


    public String VerifyCheckEmailHeader(){
        String header = validateHelper.checkText(checkEmailHeader);
        return header;
    }

    public String VerifySignUpHeader(){
        String header = validateHelper.checkText(signUpHeader);
        return header;
    }


    public String VerifyLoginHeader(){
        String header = validateHelper.checkText(loginHeader);
        return header;
    }

    public String VerifyEmailNotExistedNoti(){
        String mess = validateHelper.checkText(emailNotExisted);
        return mess;
    }

    public String VerifyEmailNotExceed(){
        String mess = validateHelper.checkText(emailEX);
        return mess;
    }

    public String VerifyEmailValidMess(){
        String mess = validateHelper.checkText(emailValidMess);
        return mess;
    }


    public String VerifyEmailRequiredMess(){
        String mess = validateHelper.checkText(emailReqMess);
        return mess;
    }

    public String VerifyResetPassHeader(){
        String header = validateHelper.checkText(resetPassHeader);
        return header;
    }

    public String VerifyIntructionText(){
        String text = validateHelper.checkText(intrucText);
        return text;
    }

    public boolean VerifyEmailStatus(){
        boolean textbox = validateHelper.enableElement(email);
        return textbox;
    }

    public boolean VerifyResetButtonStatus(){
        boolean button = validateHelper.enableElement(resetBt);
        return button;
    }

}

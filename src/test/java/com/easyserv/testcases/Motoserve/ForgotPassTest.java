package com.easyserv.testcases.Motoserve;

import com.easyserv.common.BaseSetup;
import com.easyserv.pages.Motoserve_BookingApp_UAT.ForgotPassPages;
import com.easyserv.pages.Motoserve_BookingApp_UAT.LogOutPages;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ForgotPassTest extends BaseSetup {
    private WebDriver driver;
    private ForgotPassPages forgotPassPages;

    @BeforeClass
    public void setup(){
        driver = getDriver();
        forgotPassPages = new ForgotPassPages(driver);
    }

    @Test(priority = 1, description = "Verify UI of \"Forgot password\" screen as the same BRD _001")
    public void ForgotPassTest_TC001() {
        forgotPassPages.ForgotPass_TC001();
        Assert.assertEquals(forgotPassPages.VerifyResetPassHeader(),"RESET PASSWORD");
        Assert.assertEquals(forgotPassPages.VerifyInstructionText(),"Please enter the email associated with your account and we will send you an email to reset your password.");
        Assert.assertTrue(forgotPassPages.VerifyEmailStatus());
        Assert.assertFalse(forgotPassPages.VerifyResetButton());
    }

    @Test(priority = 2, description = "Verify UI of \"Mail confirmation\" screen as the same BRD _002")
    public void ForgotPassTest_TC002() {
        forgotPassPages.ForgotPass_TC002();
        Assert.assertEquals(forgotPassPages.VerifyCheckEmailHeader(),"CHECK YOUR EMAIL");
        Assert.assertEquals(forgotPassPages.VerifyIntrucEmail(),"We have emailed instructions on how to reset your password.");
        Assert.assertTrue(forgotPassPages.VerifyLoginButton());
    }

    @Test(priority = 3, description = "Verify user can enter free-text in the Email field _003")
    public void ForgotPassTest_TC003() {
        forgotPassPages.ForgotPass_TC003();
    }

    @Test(priority = 4, description = "Verify user click <Back> icon on Reset Password screen _004")
    public void ForgotPassTest_TC004() {
        forgotPassPages.ForgotPass_TC004();
        Assert.assertEquals(forgotPassPages.VerifyLoginHeader(),"LOGIN TO YOUR ACCOUNT");
    }

    @Test(priority = 5, description = "Verify user click <Sign up> hyperlink on Reset Password screen _005")
    public void ForgotPassTest_TC005() {
        forgotPassPages.ForgotPass_TC005();
        Assert.assertEquals(forgotPassPages.VerifySignUpHeader(),"SIGN UP TO MOTORSERVE");
    }

    @Test(priority = 6, description = "Verify user click <or try another email address> hyperlink on Check Your Email screen _006")
    public void ForgotPassTest_TC006() {
        forgotPassPages.ForgotPass_TC006();
        Assert.assertEquals(forgotPassPages.VerifyResetPassHeader(),"RESET PASSWORD");
    }

    @Test(priority = 7, description = "Verify user click \"Login now\" button on Check Your Email screen _007")
    public void ForgotPassTest_TC007() {
        forgotPassPages.ForgotPass_TC007();
        Assert.assertEquals(forgotPassPages.VerifyLoginHeader(),"LOGIN TO YOUR ACCOUNT");
    }

    @Test(priority = 8, description = "Verify user click <Back> icon on Check Your Email screen _008")
    public void ForgotPassTest_TC008() {
        forgotPassPages.ForgotPass_TC008();
        Assert.assertEquals(forgotPassPages.VerifyLoginHeader(),"LOGIN TO YOUR ACCOUNT");
    }

    @Test(priority = 9, description = "Verify user enter correct Email field format on \"Reset password\" screen but the entered email doesn't exists on the system _009")
    public void ForgotPassTest_TC009() {
        forgotPassPages.ForgotPass_TC009();
        Assert.assertEquals(forgotPassPages.VerifyEmailExisted(),"The customer doesn't existed.");
    }

    @Test(priority = 10, description = "Verify user enter incorrect Email field format on \"Reset password\" screen _010")
    public void ForgotPassTest_TC010() {
        forgotPassPages.ForgotPass_TC010();
        Assert.assertEquals(forgotPassPages.VerifyEmailValidMess(),"The Email field must be a valid email");
    }

    @Test(priority = 11, description = "Verify user input data on Email field on \"Reset password\" screen after remove all data _011")
    public void ForgotPassTest_TC011() {
        forgotPassPages.ForgotPass_TC011();
        Assert.assertEquals(forgotPassPages.VerifyEmailReqMess(),"The email field is required");
    }

    @Test(priority = 12, description = "Verify user input 51 characters on Email field on \"Reset password\" screen _012")
    public void ForgotPassTest_TC012() {
        forgotPassPages.ForgotPass_TC012();
        Assert.assertEquals(forgotPassPages.VerifyEmailEXMess(),"Your email must not exceed 50 characters.");
    }

}

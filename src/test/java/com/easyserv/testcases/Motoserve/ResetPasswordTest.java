package com.easyserv.testcases.Motoserve;

import com.easyserv.common.BaseSetup;
import com.easyserv.dataprovider.Motoserve.DataResetPassword;
import com.easyserv.pages.Motoserve_BookingApp_UAT.ResetPasswordPages;
import com.easyserv.pages.Motoserve_BookingApp_UAT.SignUpPages;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ResetPasswordTest extends BaseSetup {
    private WebDriver driver;
    private ResetPasswordPages resetPasswordPages;

    @BeforeClass
    public void setup(){
        driver = getDriver();
        resetPasswordPages = new ResetPasswordPages(driver);
    }

    @Test(priority = 1, description = "Verify UI of \"Reset password\" screen as the same Requirement  _001")
    public void ResetPasswordTest_TC001() {
        resetPasswordPages.ResetPassword_TC001();
        Assert.assertEquals(resetPasswordPages.VerifyResetPassHeader(),"RESET PASSWORD");
        Assert.assertEquals(resetPasswordPages.VerifyIntructionText(),"Please enter the email associated with your account and we will send you an email to reset your password.");
        Assert.assertTrue(resetPasswordPages.VerifyEmailStatus());
        Assert.assertFalse(resetPasswordPages.VerifyResetButtonStatus());
    }

    @Test(priority = 2, description = "Verify system in case user clear value of Email  _002")
    public void ResetPasswordTest_TC002() {
        resetPasswordPages.ResetPassword_TC002();
        Assert.assertEquals(resetPasswordPages.VerifyEmailRequiredMess(),"The email field is required");
    }

    @Test(priority = 3, description = "Verify system in case user enter a valid Email  _003")
    public void ResetPasswordTest_TC003() {
        resetPasswordPages.ResetPassword_TC003();
        Assert.assertEquals(resetPasswordPages.VerifyEmailValidMess(),"The Email field must be a valid email");
    }

    @Test(priority = 4, description = "Verify system in case user enter email more than 50Chars  _004")
    public void ResetPasswordTest_TC004() {
        resetPasswordPages.ResetPassword_TC004();
        Assert.assertEquals(resetPasswordPages.VerifyEmailNotExceed(),"Your email must not exceed 50 characters.");
    }

    @Test(priority = 5, description = "Verify status ResetPass Button after user enter a valid email  _005")
    public void ResetPasswordTest_TC005() {
        resetPasswordPages.ResetPassword_TC005();
        Assert.assertTrue(resetPasswordPages.VerifyResetButtonStatus());
    }

    @Test(priority = 6, description = "Verify system in case user enter a customer doesn't existed  _006")
    public void ResetPasswordTest_TC006() {
        resetPasswordPages.ResetPassword_TC006();
        Assert.assertEquals(resetPasswordPages.VerifyEmailNotExistedNoti(),"The customer doesn't existed.");
    }

    @Test(priority = 7, description = "Verify system in case user action with Back button  _007")
    public void ResetPasswordTest_TC007() {
        resetPasswordPages.ResetPassword_TC007();
        Assert.assertEquals(resetPasswordPages.VerifyLoginHeader(),"LOGIN TO YOUR ACCOUNT");
    }

    @Test(priority = 8, description = "Verify that user can jump to Sing Up screen  _008")
    public void ResetPasswordTest_TC008() {
        resetPasswordPages.ResetPassword_TC008();
        Assert.assertEquals(resetPasswordPages.VerifySignUpHeader(),"SIGN UP TO MOTORSERVE");
    }

    @Test(priority = 9, description = "Verify that system will jump to checkEmail screen after user click Reset button  _009")
    public void ResetPasswordTest_TC009() {
        resetPasswordPages.ResetPassword_TC009();
        Assert.assertEquals(resetPasswordPages.VerifyCheckEmailHeader(),"CHECK YOUR EMAIL");
    }

    @Test(priority = 10, description = "Verify that system will back to Login screen after user click LoginNow button  _010")
    public void ResetPasswordTest_TC010() {
        resetPasswordPages.ResetPassword_TC010();
        Assert.assertEquals(resetPasswordPages.VerifyLoginHeader(),"LOGIN TO YOUR ACCOUNT");
    }

    @Test(priority = 11, description = "Verify that system will back to Reset screen after user click try another email  _011")
    public void ResetPasswordTest_TC011() {
        resetPasswordPages.ResetPassword_TC011();
        Assert.assertEquals(resetPasswordPages.VerifyResetPassHeader(),"RESET PASSWORD");
    }

    @Test(priority = 12, description = "Verify UI Reset Change Pass from Your Email  _012")
    public void ResetPasswordTest_TC012() {
        resetPasswordPages.ResetPassword_TC012();
        Assert.assertEquals(resetPasswordPages.VerifyResetPasswordHeader(),"RESET PASSWORD");
        Assert.assertTrue(resetPasswordPages.VerifyStatusNewPassText());
        Assert.assertTrue(resetPasswordPages.VerifyStatusConfirmPassText());
        Assert.assertFalse(resetPasswordPages.VerifyStatusSaveButton());
    }

    @Test(priority = 13, description = "Verify user enter in both 2 textboxs are New Password and Confirm New password on Reset password screen  _013")
    public void ResetPasswordTest_TC013() {
        resetPasswordPages.ResetPassword_TC013();
        Assert.assertTrue(resetPasswordPages.VerifyStatusSaveButton());
    }

    @Test(priority = 14, description = "Verify user click <Back> icon on Reset password screen  _014")
    public void ResetPasswordTest_TC014() {
        resetPasswordPages.ResetPassword_TC014();
        Assert.assertEquals(resetPasswordPages.VerifyLoginHeader(),"LOGIN TO YOUR ACCOUNT");
    }

    @Test(priority = 15, dataProvider = "data_ResetPass",dataProviderClass = DataResetPassword.class,description = "Verify user can enter data within the allowed range in \"New Password\" field  _015")
    public void ResetPasswordTest_TC015(String newpass_) {
        resetPasswordPages.ResetPassword_TC015(newpass_);
    }

    @Test(priority = 16, description = "Verify User remove all data in \"New Password\" field  _015")
    public void ResetPasswordTest_TC016() {
        resetPasswordPages.ResetPassword_TC016();
        Assert.assertEquals(resetPasswordPages.VerifyNewPassReqMess(),"The New Password field is required");
    }

    @Test(priority = 17, description = "User enter 21 characters in \"New Password\" field  _015")
    public void ResetPasswordTest_TC017() {
        resetPasswordPages.ResetPassword_TC017();
        Assert.assertEquals(resetPasswordPages.VerifyNewPassEXMess(),"Your password must not exceed 20 characters.");
    }

    @Test(priority = 18, dataProvider = "data_ConfNewPass",dataProviderClass = DataResetPassword.class,description = "Verify user can enter data within the allowed range in \"Confirm New Password\" field _018")
    public void ResetPasswordTest_TC018(String confPass) {
        resetPasswordPages.ResetPassword_TC018(confPass);
    }

    @Test(priority = 19 ,description = "Verify User enter 21 characters in \"Confirm New Password\" field _019")
    public void ResetPasswordTest_TC019() {
        resetPasswordPages.ResetPassword_TC019();
        Assert.assertEquals(resetPasswordPages.VerifyConfNewPassEXMess(),"Your password must not exceed 20 characters.");
    }

    @Test(priority = 20 ,description = "Verify User enter 21 characters in \"Confirm New Password\" field _019")
    public void ResetPasswordTest_TC020() {
        resetPasswordPages.ResetPassword_TC020();
        Assert.assertEquals(resetPasswordPages.VerifyConfNewPassNotMatMess(),"The confirmed password is not matched. Please try again.");
    }

    @Test(priority = 21 ,description = "Verify User enter \"Confirm New Password\" field is not mathched _021")
    public void ResetPasswordTest_TC021() {
        resetPasswordPages.ResetPassword_TC021();
        Assert.assertEquals(resetPasswordPages.VerifyConfNewPassNotMatMess(),"The confirmed password is not matched. Please try again.");
    }

    @Test(priority = 22 ,description = "Verify User enter newPass&&ConfPass -> Clear newPass  _022")
    public void ResetPasswordTest_TC022() {
        resetPasswordPages.ResetPassword_TC022();
        Assert.assertEquals(resetPasswordPages.VerifyNewPassReqMess(),"The New Password field is required");
        Assert.assertEquals(resetPasswordPages.VerifyConfNewPassNotMatMess(),"The confirmed password is not matched. Please try again.");
    }

    @Test(priority = 23 ,description = "Verify User enter newPass=21Chars && ConfPass = 123456   _022")
    public void ResetPasswordTest_TC023() {
        resetPasswordPages.ResetPassword_TC023();
        Assert.assertEquals(resetPasswordPages.VerifyNewPassEXMess(),"Your password must not exceed 20 characters.");
        Assert.assertEquals(resetPasswordPages.VerifyConfNewPassNotMatMess(),"The confirmed password is not matched. Please try again.");
    }

    @Test(priority = 24 ,description = "Verify User can unmask and view my entered texts in NewPass/ConfPass field  _024")
    public void ResetPasswordTest_TC024() {
        resetPasswordPages.ResetPassword_TC024();
        Assert.assertEquals(resetPasswordPages.VerifyGetValueNewPass(),"123456");
        Assert.assertEquals(resetPasswordPages.VerifyGetValueConfNewPass(),"123456");
    }

    @Test(priority = 25 ,description = "Verify user changes password after receiving email about more than 30 minutes  _025")
    public void ResetPasswordTest_TC025() {
        resetPasswordPages.ResetPassword_TC025();
        Assert.assertEquals(resetPasswordPages.VerifyResetExpiredMess(),"Your request to reset password has expired or the link has already been used.");
    }

}

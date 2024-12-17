package com.easyserv.testcases.Motoserve;

import com.easyserv.common.BaseSetup;
import com.easyserv.dataprovider.Motoserve.DataLogin;
import com.easyserv.pages.Motoserve_BookingApp_UAT.LoginPages;
import com.easyserv.pages.Motoserve_BookingApp_UAT.MyProfilePages;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends BaseSetup {
    private WebDriver driver;
    private MyProfilePages myProfilePages;
    private LoginPages loginPages;

    @BeforeClass
    public void setup(){
        driver = getDriver();
        loginPages = new LoginPages(driver);
    }

    @Test(priority = 1, description = "Verify UI of \"Login\" Screen  _001")
    public void LoginTest_TC001() {
        loginPages.LinkTC();
        loginPages.Login_TC001();
        Assert.assertEquals(loginPages.VerifyLoginHeader(),"LOGIN TO YOUR ACCOUNT");
        Assert.assertTrue(loginPages.VerifyStatusEmailBox());
        Assert.assertTrue(loginPages.VerifyStatusPasswordBox());
        Assert.assertFalse(loginPages.VerifyStatusLoginButton());
    }

    @Test(priority = 2, description = "Verify user can enter user's email in textbox <Email> on \"Log In\" screen  _002")
    public void LoginTest_TC002() {
        loginPages.Login_TC002();
    }

    @Test(priority = 3, description = "Verify user can enter user's password in textbox <Enter your password> on \"Log In\" screen  _003")
    public void LoginTest_TC003() {
        loginPages.Login_TC003();
    }

    @Test(priority = 4, description = "Verify user can click <LOGIN> button on \"Login\" screen  _003")
    public void LoginTest_TC004() {
        loginPages.Login_TC004();
        Assert.assertEquals(loginPages.VerifyLoginSuccessMess(),"Login successful");
    }

    @Test(priority = 5, description = "Verify system in case missing \"email\" field  _005")
    public void LoginTest_TC005() {
        loginPages.Login_TC005();
        Assert.assertEquals(loginPages.VerifyEmailReqMess(),"The email field is required");
    }

    @Test(priority = 6, description = "Verify user can't input more than 50 characters for <Email> textbox on \"Login\" screen  _006")
    public void LoginTest_TC006() {
        loginPages.Login_TC006();
        Assert.assertEquals(loginPages.GetEmailValue(),"testing@gmail.commmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
    }

    @Test(priority = 7, description = "Verify user can't input invalid characters for <Email> textbox on \"Login\" screen  _007")
    public void LoginTest_TC007() {
        loginPages.Login_TC007();
        Assert.assertEquals(loginPages.VerifyEmailValidMess(),"The Email field must be a valid email");
    }

    @Test(priority = 8, description = "Verify system in case missing \"Password\" field  _008")
    public void LoginTest_TC008() {
        loginPages.Login_TC008();
        Assert.assertEquals(loginPages.VerifyPassReqMess(),"The password field is required");
    }

    @Test(priority = 9, description = "Verify user can't input more than 20 character for <Password> textbox on \"Login\" screen  _009")
    public void LoginTest_TC009() {
        loginPages.Login_TC009();
        Assert.assertEquals(loginPages.GetPasswordValue(),"Testing123@444444444");
    }

    @Test(priority = 10, description = "Verify status Login Button after user enter valid email/pass _010")
    public void LoginTest_TC010() {
        loginPages.Login_TC010();
        Assert.assertTrue(loginPages.VerifyStatusLoginButton());
    }

    @Test(priority = 11, dataProvider = "data_Login", dataProviderClass = DataLogin.class,description = "Verify System allow user select \"Login\" button to login _011")
    public void LoginTest_TC011(String email,String pass) {
        loginPages.Login_TC011(email, pass);
        Assert.assertTrue(loginPages.VerifyStatusLoginButton());
    }

    @Test(priority = 12,description = "Verify user can click <Forgot password?> hyperlink on \"Login\" screen _012")
    public void LoginTest_TC012() {
        loginPages.Login_TC012();
        Assert.assertEquals(loginPages.VerifyResetPassHeader(),"RESET PASSWORD");
    }

    @Test(priority = 13,dataProvider = "data_Login_1", dataProviderClass = DataLogin.class, description = "Verify system in case user enter email or pass is invalid _013")
    public void LoginTest_TC013(String email,String pass) {
        loginPages.Login_TC013(email,pass);
        Assert.assertEquals(loginPages.VerifyCombinaMess(),"Your User Name and Password combination is not correct. Please try again");
    }

    @Test(priority = 14, description = "Verify user can click <Sign up> hyperlink on \"Login\" screen _014")
    public void LoginTest_TC014() {
        loginPages.Login_TC014();
        Assert.assertEquals(loginPages.VerifySignUpHeader(),"SIGN UP TO MOTORSERVE");
    }

    @Test(priority = 15, description = "Verify user can click <Back> button on the left top of \"Login\" screen _015")
    public void LoginTest_TC015() {
        loginPages.Login_TC015();
        Assert.assertEquals(loginPages.VerifyBookServiceHeader(),"BOOK A SERVICE");
    }

    @Test(priority = 16, description = "Verify user login success with email/pass _015")
    public void LoginTest_TC016() {
        loginPages.Login_TC016();
        Assert.assertEquals(loginPages.VerifyConfirmVehicleHeader(),"CONFIRM YOUR VEHICLE");
    }

}

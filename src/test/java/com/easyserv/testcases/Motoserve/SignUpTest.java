package com.easyserv.testcases.Motoserve;

import com.easyserv.common.BaseSetup;
import com.easyserv.dataprovider.Motoserve.DataMyProfile;
import com.easyserv.pages.Motoserve_BookingApp_UAT.SearchStorePages;
import com.easyserv.pages.Motoserve_BookingApp_UAT.SignUpPages;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignUpTest extends BaseSetup {
    private WebDriver driver;
    private SignUpPages signUpPages;

    @BeforeClass
    public void setup(){
        driver = getDriver();
        signUpPages = new SignUpPages(driver);
    }

    @Test(priority = 1, description = "Verify user can click on Sign Up hyperlink on the LOGIN TO YOUR ACCOUNT screen  _001")
    public void SignUpTest_TC001() {
        signUpPages.SignUp_TC001();
        Assert.assertEquals(signUpPages.VerifySignUpHeader(),"SIGN UP TO MOTORSERVE");
        Assert.assertTrue(signUpPages.VerifyStatusFirstNameText());
        Assert.assertTrue(signUpPages.VerifyStatusLastNameText());
        Assert.assertTrue(signUpPages.VerifyStatusEmailText());
        Assert.assertTrue(signUpPages.VerifyStatusPasswordText());
    }

    @Test(priority = 2, description = "Verify user can input free-text for First Name textbox on \"Sign Up\" screen  _002")
    public void SignUpTest_TC002() {
        signUpPages.SignUp_TC002();
    }

    @Test(priority = 3, description = "Verify user can input free-text for Last Name textbox on \"Sign Up\" screen  _003")
    public void SignUpTest_TC003() {
        signUpPages.SignUp_TC003();
    }

    @Test(priority = 4, description = "Verify user can input free-text for Email textbox on \"Sign Up\" screen  _004")
    public void SignUpTest_TC004() {
        signUpPages.SignUp_TC004();
    }

    @Test(priority = 5, description = "Verify user can input free-text for Password textbox on \"Sign Up\" screen  _005")
    public void SignUpTest_TC005() {
        signUpPages.SignUp_TC005();
    }

    @Test(priority = 6, description = "Verify user can input free-text for Phone Number textbox on \"Sign Up\" screen  _006")
    public void SignUpTest_TC006() {
        signUpPages.SignUp_TC006();
    }

    @Test(priority = 7, description = "Verify user click on \"Eye Password\" icon on <Password> textbox  _007")
    public void SignUpTest_TC007() {
        signUpPages.SignUp_TC007();
        Assert.assertEquals(signUpPages.GetPassValue(),"Testing123@");
    }

    @Test(priority = 8, description = "Verify user can click on Motorserve Privacy Policy> hyperlink with a label <By clicking Sign Up, you have read and agreed to the> on \"Sign Up\" screen _008")
    public void SignUpTest_TC008() {
        signUpPages.SignUp_TC008();

    }

    @Test(priority = 9, description = "Verify user can click on Google button on \"Sign Up\" screen _009")
    public void SignUpTest_TC009() {
        signUpPages.SignUp_TC009();
    }

    @Test(priority = 10, description = "Verify user can click on Facebook button on \"Sign Up\" screen _010")
    public void SignUpTest_TC010() {
        signUpPages.SignUp_TC010();
    }

    @Test(priority = 11, description = "Verify user can click Log in hyperlink on \"Sign Up\" screen _011")
    public void SignUpTest_TC011() {
        signUpPages.SignUp_TC011();
        Assert.assertEquals(signUpPages.VerifyLoginAccountHeader(), "LOGIN TO YOUR ACCOUNT");
    }

    @Test(priority = 12, description = "Verify user can click Back icon on \"Sign Up\" screen _012")
    public void SignUpTest_TC012() {
        signUpPages.SignUp_TC012();
        Assert.assertEquals(signUpPages.VerifyLoginAccountHeader(), "LOGIN TO YOUR ACCOUNT");
    }

    @Test(priority = 13, description = "Verify user input valid data all field on \"Sign Up\" screen _013")
    public void SignUpTest_TC013() {
        signUpPages.SignUp_TC013();
        Assert.assertEquals(signUpPages.VerifyLoginAccountHeader(), "LOGIN TO YOUR ACCOUNT");
    }

    @Test(priority = 14, description = "Verify user input invalid data for all fields on \"Sign Up\" screen _014")
    public void SignUpTest_TC014() {
        signUpPages.SignUp_TC014();
    }

    @Test(priority = 15, description = "Verify system in case User remove all data with each field \"Sign Up\" screen _015")
    public void SignUpTest_TC015() {
        signUpPages.SignUp_TC015();
    }

    @Test(priority = 16, description = "Verify System will raise an alerting message “Email already exists. Please login or use another email to continue _016")
    public void SignUpTest_TC016() {
        signUpPages.SignUp_TC016();
        Assert.assertEquals(signUpPages.VerifyEmailNoti(),"Email already exists. Please login or use another email to continue.");
    }

    @Test(priority = 17, description = "Verify User input less than 6 characters for <Password> textbox on \"Sign Up\" screen _017")
    public void SignUpTest_TC017() {
        signUpPages.SignUp_TC017();
        Assert.assertEquals(signUpPages.VerifyPassLongerMess(),"The password must be longer than or equal to 6 character");
    }

    @Test(priority = 18, description = "Verify User can't input more than 20 characters on <Password> textbox _017")
    public void SignUpTest_TC018() {
        signUpPages.SignUp_TC018();
        Assert.assertEquals(signUpPages.GetPassValue(),"12345678987654321234");
    }

    @Test(priority = 19, dataProvider = "data_PhoneNum",dataProviderClass = DataMyProfile.class,description = "Verify user input invalid data for <Phone Number> textbox and input data others fields on \"Sign Up\" screen _019")
    public void SignUpTest_TC019(String phoneNum) {
        signUpPages.SignUp_TC019(phoneNum);
        Assert.assertEquals(signUpPages.VerifyPhoneMess(),"Please add valid Phone Number.");
    }

}

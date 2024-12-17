package com.easyserv.testcases.Motoserve;

import com.easyserv.common.BaseSetup;
import com.easyserv.dataprovider.Motoserve.DataMyProfile;
import com.easyserv.pages.Motoserve_BookingApp_UAT.MyProfilePages;
import com.easyserv.pages.Motoserve_BookingApp_UAT.SelectPackagePages;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyProfileTest extends BaseSetup {
    private WebDriver driver;
    private MyProfilePages myProfilePages;

    @BeforeClass
    public void setup(){
        driver = getDriver();
        myProfilePages = new MyProfilePages(driver);
    }

    @Test(priority = 1, description = "Verify UI of \"My Profile\" tab  _001")
    public void MyProfileTest_TC001() {
        myProfilePages.LinkTC();
        myProfilePages.MyProfile_TC001();
        Assert.assertEquals(myProfilePages.VerifyUpComingTitle(),"Upcoming Bookings");
        Assert.assertEquals(myProfilePages.VerifyVehicleTitle(),"Vehicles");
        Assert.assertEquals(myProfilePages.VerifyTotalBookTitle(),"Total Bookings");
    }

    @Test(priority = 2, description = "Verify UI of \"My Vehicle\" tab  _002")
    public void MyProfileTest_TC002() {
        myProfilePages.MyProfile_TC002();
        Assert.assertEquals(myProfilePages.VerifyMyVehicleHeader(),"MY VEHICLE");
        Assert.assertEquals(myProfilePages.VerifyMyBookingsHeader(),"My Bookings");
    }

    @Test(priority = 3, description = "Verify UI of \"Contact Details\" tab as the same Requirement  _003")
    public void MyProfileTest_TC003() {
        myProfilePages.MyProfile_TC003();
        Assert.assertEquals(myProfilePages.VerifyContactDetailHeader(),"CONTACT DETAILS");
        Assert.assertTrue(myProfilePages.VerifyFirstNameStatus(),"FirstName Field is Disable");
        Assert.assertTrue(myProfilePages.VerifyLastNameStatus(),"LastName Field is Disable");
        Assert.assertTrue(myProfilePages.VerifyPhoneNumStatus(),"PhoneNumber Field is Disable");
        Assert.assertTrue(myProfilePages.VerifyEmailStatus(),"Email Field is Disable");
    }

    @Test(priority = 4, description = "Verify UI of \"Password Settings\" tab as the same Requirement  _004")
    public void MyProfileTest_TC004() {
        myProfilePages.MyProfile_TC004();
        Assert.assertEquals(myProfilePages.VerifyPassSetHeader(),"PASSWORD SETTINGS");
    }

    @Test(priority = 5, description = "Verify that user can enter text on Contact Detail form  _005")
    public void MyProfileTest_TC005() {
        myProfilePages.MyProfile_TC005();
    }

    @Test(priority = 6, description = "Verify enter Postcode same as the given list  _006")
    public void MyProfileTest_TC006() {
        myProfilePages.MyProfile_TC006();
        Assert.assertEquals(myProfilePages.VerifyPostCodeResult(),"1139");
        //Assert.assertEquals(myProfilePages.VerifySuburbResult(),"Australia Square");
    }

    @Test(priority = 7, description = "Verify user click \"Cancel\" button  _007")
    public void MyProfileTest_TC007() {
        myProfilePages.MyProfile_TC007();
        Assert.assertEquals(myProfilePages.VerifyConfirmTitle(),"Confirm");
    }

    @Test(priority = 8, description = "Verify user click \"Back\" icon on \"Contact Details\" screen  _008")
    public void MyProfileTest_TC008() {
        myProfilePages.MyProfile_TC008();
        Assert.assertEquals(myProfilePages.VerifyVehicleHeader(),"CONFIRM YOUR VEHICLE");
    }

    @Test(priority = 9, description = "Verify user can enter 19 characters on \"Current Password\" field  _009")
    public void MyProfileTest_TC009() {
        myProfilePages.MyProfile_TC009();
        Assert.assertEquals(myProfilePages.VerifyCurrPassInput(),"678&^%%9idfjdoo023p");
    }

    @Test(priority = 10, description = "Verify user can enter 20 characters on \"Current Password\" field  _010")
    public void MyProfileTest_TC010() {
        myProfilePages.MyProfile_TC010();
        Assert.assertEquals(myProfilePages.VerifyCurrPassInput(),"678&^%%9idfjdoo023pa");
    }

    @Test(priority = 11, description = "Verify user can't enter data after remove all data on \"Current Password\" field  _011")
    public void MyProfileTest_TC011() {
        myProfilePages.MyProfile_TC011();
        Assert.assertEquals(myProfilePages.VerifyCurrPassReqMess(),"The Current Password field is required");
    }

    @Test(priority = 12, description = "Verify user can't enter 21 characters on \"Current Password\" field  _012")
    public void MyProfileTest_TC012() {
        myProfilePages.MyProfile_TC012();
        Assert.assertEquals(myProfilePages.VerifyCurrPassExceedMess(),"Your Current Password must not exceed 20 characters.");
    }

    @Test(priority = 13, description = "Verify user can enter 20 characters on \"New Password\" field  _013")
    public void MyProfileTest_TC013() {
        myProfilePages.MyProfile_TC013();
        Assert.assertEquals(myProfilePages.VerifyNewPassInput(),"678&^%%9idfjdoo023pa");
    }

    @Test(priority = 14, description = "Verify user can't enter data after remove all data on \"New Password\" field  _014")
    public void MyProfileTest_TC014() {
        myProfilePages.MyProfile_TC014();
        Assert.assertEquals(myProfilePages.VerifyNewPassReqMess(),"The New Password field is required");
    }

    @Test(priority = 15, description = "Verify user can't enter 21 characters on \"New Password\" field  _015")
    public void MyProfileTest_TC015() {
        myProfilePages.MyProfile_TC015();
        Assert.assertEquals(myProfilePages.VerifyNewPassExceedMess(),"Your New Password must not exceed 20 characters.");
    }

    @Test(priority = 16, description = "Verify user can enter 20 characters on \"Confirm New Password\" field  _016")
    public void MyProfileTest_TC016() {
        myProfilePages.MyProfile_TC016();
        Assert.assertEquals(myProfilePages.VerifyConfPassInput(),"678&^%%9idfjdoo023pa");
    }

    @Test(priority = 17, description = "Verify user can't enter data after remove all data on \"Confirm New Password\" field  _017")
    public void MyProfileTest_TC017() {
        myProfilePages.MyProfile_TC017();
        Assert.assertEquals(myProfilePages.VerifyConfPassReqMess(),"The Confirm New Password field is required");
    }

    @Test(priority = 18, description = "Verify user can't enter 21 characters on \"Confirm New Password\" field  _018")
    public void MyProfileTest_TC018() {
        myProfilePages.MyProfile_TC018();
        Assert.assertEquals(myProfilePages.VerifyConfPassExceedMess(),"Your Confirm New Password must not exceed 20 characters.");
    }

    @Test(priority = 19, description = "Verify user click \"Cancel\" button  _019")
    public void MyProfileTest_TC019() {
        myProfilePages.MyProfile_TC019();
        Assert.assertEquals(myProfilePages.VerifyConfMess(),"Are you sure you want to discard all changes?");
    }

    @Test(priority = 20, description = "Verify user enter valid data all field on \"Contact Details\" screen  _020")
    public void MyProfileTest_TC020() {
        myProfilePages.MyProfile_TC020();
        Assert.assertEquals(myProfilePages.VerifyUpdateNoti(),"Updates successful");
    }

    @Test(priority = 21, description = "Verify system in case user remove data from \"First Name\" field\n  _021")
    public void MyProfileTest_TC021() {
        myProfilePages.MyProfile_TC021();
        Assert.assertEquals(myProfilePages.VerifyFirstNameReqMess(),"The First Name field is required");
    }

    @Test(priority = 22, description = "Verify system in case User enter 51 characters on \"First Name\" field  _021")
    public void MyProfileTest_TC022() {
        myProfilePages.MyProfile_TC022();
        Assert.assertEquals(myProfilePages.VerifyFirstNameEXMess(),"Your First Name must not exceed 50 characters.");
    }

    @Test(priority = 23, description = "Verify system in case user remove data from \"Last Name\" field\n  _021")
    public void MyProfileTest_TC023() {
        myProfilePages.MyProfile_TC023();
        Assert.assertEquals(myProfilePages.VerifyLastNameReqMess(),"The Last Name field is required");
    }

    @Test(priority = 24, description = "Verify system in case User enter 51 characters on \"Last Name\" field  _021")
    public void MyProfileTest_TC024() {
        myProfilePages.MyProfile_TC024();
        Assert.assertEquals(myProfilePages.VerifyLastNameEXMess(),"Your Last Name must not exceed 50 characters.");
    }

    @Test(priority = 25, description = "Verify system in case Remove all data from \"Phone Number\" field  _025")
    public void MyProfileTest_TC025() {
        myProfilePages.MyProfile_TC025();
        Assert.assertEquals(myProfilePages.VerifyPhoneReqMess(),"The Phone Number field is required");
    }

    @Test(priority = 26, description = "Verify system in case user enter a invalid \"Phone Number\"  _026", dataProvider ="data_PhoneNum" ,dataProviderClass = DataMyProfile.class)
    public void MyProfileTest_TC026(String phone) {
        myProfilePages.MyProfile_TC026(phone);
        Assert.assertEquals(myProfilePages.VerifyPhoneNotiMess(),"Please add valid Phone Number.");
    }

    @Test(priority = 27, description = "Verify system in case User enter 21 characters on \"Phone Number\" field  _027")
    public void MyProfileTest_TC027() {
        myProfilePages.MyProfile_TC027();
        Assert.assertEquals(myProfilePages.VerifyPhoneEXMess(),"Your Phone Number must not exceed 20 characters.");
    }

    @Test(priority = 28, description = "Verify system in case Remove all data from \"Email\" field  _028")
    public void MyProfileTest_TC028() {
        myProfilePages.MyProfile_TC028();
        Assert.assertEquals(myProfilePages.VerifyMailboxReqMess(),"The Email field is required");
    }

    @Test(priority = 29, description = "Verify system in case User enter 51 characters on \"Email\" field  _029")
    public void MyProfileTest_TC029() {
        myProfilePages.MyProfile_TC029();
        Assert.assertEquals(myProfilePages.VerifyMailboxEX(),"Your Email must not exceed 50 characters.");
    }

    @Test(priority = 30, description = "Verify system in case User enter 51 characters on \"Email\" field  _030")
    public void MyProfileTest_TC030() {
        myProfilePages.MyProfile_TC030();
        Assert.assertEquals(myProfilePages.VerifyMailNotiMess(),"The Email field must be a valid email");
    }

    @Test(priority = 31, description = "Verify user can not enter more than 30 characters on \"Address Line 1\" field  _031")
    public void MyProfileTest_TC031() {
        myProfilePages.MyProfile_TC031();
        Assert.assertEquals(myProfilePages.VerifyAddress1EXMess(),"Your Address Line 1 must not exceed 30 characters.");
    }

    @Test(priority = 32, description = "Verify user can not enter more than 20 characters on \"Address Line 2\" field  _032")
    public void MyProfileTest_TC032() {
        myProfilePages.MyProfile_TC032();
        Assert.assertEquals(myProfilePages.VerifyAddress2EXMess(),"Your Address Line 2 must not exceed 20 characters.");
    }

    @Test(priority = 33, description = "Verify user can not enter more than 20 characters on \"NRMA Number No.\" field  _033")
    public void MyProfileTest_TC033() {
        myProfilePages.MyProfile_TC033();
        Assert.assertEquals(myProfilePages.VerifyNRMAEXMess(),"Your NRMA Member No. must not exceed 20 characters.");
    }

    @Test(priority = 34, description = "Verify system in case Data on \"Current Password\" not exist the system  _034")
    public void MyProfileTest_TC034() {
        myProfilePages.MyProfile_TC034();
        Assert.assertEquals(myProfilePages.VerifyCurrPassAlert(),"Your current password is not correct. Please try again");
    }

    @Test(priority = 35, description = "Verify system in case Data on \"Confirm Password\" not the same data on \"New Password\"  _035")
    public void MyProfileTest_TC035() {
        myProfilePages.MyProfile_TC035();
        Assert.assertEquals(myProfilePages.VerifyConPassNotMatched(),"The confirmed password is not matched. Please try again.");
    }

}

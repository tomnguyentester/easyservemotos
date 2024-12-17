package com.easyserv.testcases.Motoserve;

import com.easyserv.common.BaseSetup;
import com.easyserv.dataprovider.Motoserve.DataEnquiries;
import com.easyserv.pages.Motoserve_BookingApp_UAT.EnquiriesPages;
import com.easyserv.pages.Motoserve_BookingApp_UAT.LogOutPages;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EnquiriesTest extends BaseSetup {
    private WebDriver driver;
    private EnquiriesPages enquiriesPages;

    @BeforeClass
    public void setup(){
        driver = getDriver();
        enquiriesPages = new EnquiriesPages(driver);
    }

    @Test(priority = 1, description = "Verify UI of \"General Enquiries\" screen as  the same BR  _001")
    public void EnquiriesTest_TC001() {
        enquiriesPages.Enquiries_TC001();
        Assert.assertEquals(enquiriesPages.VerifyGeneralEnquHeader(),"GENERAL ENQUIRIES");
        Assert.assertTrue(enquiriesPages.verifySelectStore(),"Select Store Not Avaible");
        Assert.assertTrue(enquiriesPages.verifyStatusFirtNameField(),"First Name Not Avaible");
        Assert.assertTrue(enquiriesPages.verifyStatusLastNameField(),"Last Name Not Avaible");
        Assert.assertTrue(enquiriesPages.verifyStatusEmailField(),"Email Not Avaible");
        Assert.assertTrue(enquiriesPages.verifyStatusYourEnquiryField(),"Your Enquiry Not Avaible");
        Assert.assertFalse(enquiriesPages.verifyStatusSendButton(),"Send Button is Avaible");
    }

    @Test(priority = 2, description = "Verify user can click <Motorserve Privacy Policy> hyperlink on \"General Enquiries\" screen  _002")
    public void EnquiriesTest_TC002() {
        enquiriesPages.Enquiries_TC002();
        Assert.assertEquals(enquiriesPages.verifyPrivacyHeader(),"MOTORSERVE PRIVACY POLICY");
    }

    @Test(priority = 3, description = "Verify user can choose value from \"Select Store\" listbox  _003")
    public void EnquiriesTest_TC003() {
        enquiriesPages.Enquiries_TC003();
        Assert.assertEquals(enquiriesPages.VerifySelectStoreValue(),"ARTARMON");
    }

    @Test(priority = 4, description = "Verify user can choose value from \"Suburb\" listbox when I input data for fields \"Postcode\"  _004")
    public void EnquiriesTest_TC004() {
        enquiriesPages.Enquiries_TC004();
        //Assert.assertEquals(enquiriesPages.VerifySelectStoreValue(),"ARTARMON");
    }

    @Test(priority = 5, description = "Verify user can enter all field  _005")
    public void EnquiriesTest_TC005() {
        enquiriesPages.Enquiries_TC005();
    }

    @Test(priority = 6, description = "Verify status \"Send\" button after user input valid data for all fields on \"General Enquiries\" screen  _005")
    public void EnquiriesTest_TC006() {
        enquiriesPages.Enquiries_TC006();
        Assert.assertTrue(enquiriesPages.verifyStatusSendButton(),"Send Button is Avaible");
    }

    @Test(priority = 7, dataProvider = "data_Enquiri", dataProviderClass = DataEnquiries.class ,description = "Verify send \"General Enquiries\" success when input data within the allowed range for all fields on \"General Enquiries\" screen  _007")
    public void EnquiriesTest_TC007(String lastname,String firtname,String phone,String email,String equiMess) {
        enquiriesPages.Enquiries_TC007(lastname, firtname, phone, email, equiMess);
        Assert.assertEquals(enquiriesPages.verifyEnquirySentHeader(),"ENQUIRY SENT");
    }

    @Test(priority = 8, description = "Verify user don't select data from \"Select Store\" dropdownlist on \"General Enquiries\" screen  _008")
    public void EnquiriesTest_TC008() {
        enquiriesPages.Enquiries_TC008();
        Assert.assertFalse(enquiriesPages.verifyStatusSendButton(),"Send Button is Avaible");
    }

    @Test(priority = 9, description = "Verify system in case user remove all data for \"First Name\"  _008")
    public void EnquiriesTest_TC009() {
        enquiriesPages.Enquiries_TC009();
        Assert.assertEquals(enquiriesPages.verifyFirstNameReqMess(),"The First Name field is required");
    }

    @Test(priority = 10, description = "Verify system in case user remove all data for \"Last Name\"  _010")
    public void EnquiriesTest_TC010() {
        enquiriesPages.Enquiries_TC010();
        Assert.assertEquals(enquiriesPages.verifyLastNameReqMess(),"The Last Name field is required");
    }

    @Test(priority = 11, description = "Verify system in case user remove all data for \"Email\"  _011")
    public void EnquiriesTest_TC011() {
        enquiriesPages.Enquiries_TC011();
        Assert.assertEquals(enquiriesPages.verifyEmailReqMess(),"The Email field is required");
    }

    @Test(priority = 12, description = "Verify system in case user remove all data for \"Your Enquiri\"  _012")
    public void EnquiriesTest_TC012() {
        enquiriesPages.Enquiries_TC012();
        Assert.assertEquals(enquiriesPages.verifyEnquiReqMess(),"The enquiries field is required");
    }

    @Test(priority = 13, description = "Verify send \"General Enquiries\" unsuccess when input invalid data for fields \"Email\"  _013")
    public void EnquiriesTest_TC013() {
        enquiriesPages.Enquiries_TC013();
        Assert.assertEquals(enquiriesPages.verifyEmailValidMess(),"The Email field must be a valid email");
    }

    @Test(priority = 14, description = "Verify send \"General Enquiries\" unsuccess when input more than 50 characters for field \"First Name\" _014")
    public void EnquiriesTest_TC014() {
        enquiriesPages.Enquiries_TC014();
        Assert.assertEquals(enquiriesPages.verifyFirstNameEXMess(),"Your First Name must not exceed 50 characters.");
    }

    @Test(priority = 15, description = "Verify send \"General Enquiries\" unsuccess when input more than 50 characters for field \"Last Name\" _015")
    public void EnquiriesTest_TC015() {
        enquiriesPages.Enquiries_TC015();
        Assert.assertEquals(enquiriesPages.verifyLastNameEXMess(),"Your Last Name must not exceed 50 characters.");
    }

    @Test(priority = 16, description = "Verify send \"General Enquiries\" unsuccess when input more than 50 characters for field \"Email\" _016")
    public void EnquiriesTest_TC016() {
        enquiriesPages.Enquiries_TC016();
        Assert.assertEquals(enquiriesPages.verifyEmailEXMess(),"Your Email must not exceed 50 characters.");
    }

    @Test(priority = 17, dataProvider = "data_PhoneNumber",dataProviderClass = DataEnquiries.class ,description = "Verify send \"General Enquiries\" unsuccess when input invalid data for fields \"Phone Number\" _017")
    public void EnquiriesTest_TC017(String phone) {
        enquiriesPages.Enquiries_TC017(phone);
        Assert.assertEquals(enquiriesPages.verifyPhoneValidMess(),"Please add valid Phone Number.");
    }

    @Test(priority = 18, dataProvider = "data_PostCode",dataProviderClass = DataEnquiries.class ,description = "Verify send \"General Enquiries\" unsuccess when input invalid data for fields \"Postcode\" _018")
    public void EnquiriesTest_TC018(String post) {
        enquiriesPages.Enquiries_TC018(post);
        Assert.assertEquals(enquiriesPages.verifyPostCodeValidMess(),"No valid post code found.");
    }

    @Test(priority = 19, description = "Verify send \"General Enquiries\" unsuccess when input data outside the allowed range for field \"Phone Number\" on \"General Enquiries\" screen _019")
    public void EnquiriesTest_TC019() {
        enquiriesPages.Enquiries_TC019();
        Assert.assertEquals(enquiriesPages.verifyPhoneEXMess(),"Your Phone Number must not exceed 20 characters.");
    }



}

package com.easyserv.testcases.Motoserve;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.dataprovider.Motoserve.ContactDetail;
import com.easyserv.pages.Motoserve_BookingApp_UAT.ProvideContactDetailPages;
import com.easyserv.pages.Motoserve_BookingApp_UAT.SearchStorePages;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProvideContactDetailTest extends BaseSetup {
    private WebDriver driver;
    private ProvideContactDetailPages provideContactDetailPages;
    private ValidateHelper validateHelper;

    @BeforeClass
    public void setup(){
        driver = getDriver();
        provideContactDetailPages = new ProvideContactDetailPages(driver);
    }

    @Test(priority = 1, description = "Verify UI of \"Search Store\" screen as the same BR  _001")
    public void ProvideContactTest_TC001() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC001();
        Assert.assertEquals(provideContactDetailPages.VerifyContactDetailHeader(),"CONTACT DETAILS");
        Assert.assertTrue(provideContactDetailPages.VerifyFirstNameStatus());
        Assert.assertTrue(provideContactDetailPages.VerifyLastNameStatus());
        Assert.assertTrue(provideContactDetailPages.VerifyPhoneStatus());
        Assert.assertTrue(provideContactDetailPages.VerifyEmailStatus());
        Assert.assertFalse(provideContactDetailPages.VerifyApplyButtonStatus());
        Assert.assertFalse(provideContactDetailPages.VerifyConfirmButtonStatus());

    }

    @Test(priority = 2, description = "Verify user click on <Motorserve Privacy Policy> hyperlink on \"04. Contact & Book\" screen  _002")
    public void ProvideContactTest_TC002() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC002();
        Assert.assertEquals(provideContactDetailPages.VerifyPrivacyHeader(),"MOTORSERVE PRIVACY POLICY");
    }

    @Test(priority = 3, description = "Verify user click on <Back> button on \"04.Contact & Book\" screen  _003")
    public void ProvideContactTest_TC003() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC003();
        Assert.assertEquals(provideContactDetailPages.VerifySelectAppointHeader(),"SELECT AN APPOINTMENT");
    }

    @Test(priority = 4, description = "Verify user fill info in Contact Detail _004")
    public void ProvideContactTest_TC004() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC004();
    }

    @Test(priority = 5, description = "Verify User enter free-text on \"Promo Code\" box on Booking Summary _005")
    public void ProvideContactTest_TC005() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC005();
    }

    @Test(priority = 6, description = "Verify Apply button status after user enter a valid PromoCode _006")
    public void ProvideContactTest_TC006() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC006();
        Assert.assertTrue(provideContactDetailPages.VerifyApplyButtonStatus());
    }

    @Test(priority = 7, description = "Verify system in case apply a valid PromoCode _007")
    public void ProvideContactTest_TC007() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC007();
        Assert.assertEquals(provideContactDetailPages.VerifyApplyPromoMess(),"This Promo Code is successfully validated.");
    }

    @Test(priority = 8, description = "Verify system in case user choose say No in alert _008")
    public void ProvideContactTest_TC008() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC008();
        Assert.assertEquals(provideContactDetailPages.GetProValue(),"TESTPRO1");
    }

    @Test(priority = 9, description = "Verify system in case user choose say Yes in alert _009")
    public void ProvideContactTest_TC009() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC009();
        Assert.assertEquals(provideContactDetailPages.GetProValue(),"");
        Assert.assertFalse(provideContactDetailPages.VerifyApplyButtonStatus());
    }

    @Test(priority = 10, description = "Verify system in case user enter a promos invaliad _010")
    public void ProvideContactTest_TC010() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC010();
        Assert.assertEquals(provideContactDetailPages.VerifyPromoNotValidMess(),"Sorry, this promo code is not valid.");
    }

    @Test(priority = 11, description = "Verify user can enter a promos with maxlenght=20Chars _010")
    public void ProvideContactTest_TC011() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC011();
        Assert.assertEquals(provideContactDetailPages.GetProValue(),"12344343434343434344");
    }

    @Test(priority = 12, description = "Verify user can enter a promos Expired")
    public void ProvideContactTest_TC012() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC012();
        Assert.assertEquals(provideContactDetailPages.VerifyPromoExpiredMess(),"This Promo Code is no longer valid in this Store. Please try another one.");
    }

    @Test(priority = 13, description = "Verify User remove all data on \"First Name\" field")
    public void ProvideContactTest_TC013() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC013();
        Assert.assertEquals(provideContactDetailPages.VerifyFirstNameReqMess(),"The First Name field is required");
    }

    @Test(priority = 14, description = "Verify User enter 51 characters on \"First Name\" field")
    public void ProvideContactTest_TC014() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC014();
        Assert.assertEquals(provideContactDetailPages.VerifyFirstNameEXMess(),"Your First Name must not exceed 50 characters.");
    }

    @Test(priority = 15, description = "Verify User remove all data on \"Last Name\" field")
    public void ProvideContactTest_TC015() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC015();
        Assert.assertEquals(provideContactDetailPages.VerifyLastNameReqMess(),"The Last Name field is required");
    }

    @Test(priority = 16, description = "Verify User enter 51 characters on \"Last Name\" field")
    public void ProvideContactTest_TC016() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC016();
        Assert.assertEquals(provideContactDetailPages.VerifyLastNameEXMess(),"Your Last Name must not exceed 50 characters.");
    }

    @Test(priority = 17, description = "Verify User remove all data on \"Phone Number\" field")
    public void ProvideContactTest_TC017() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC017();
        Assert.assertEquals(provideContactDetailPages.VerifyPhoneReqMess(),"The Phone Number field is required");
    }

    @Test(priority = 18, description = "Verify User enter a value Invalid on \"Phone Number\" field")
    public void ProvideContactTest_TC018() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC018();
        Assert.assertEquals(provideContactDetailPages.VerifyPhoneValidMess(),"Please add valid Phone Number.");
    }

    @Test(priority = 19, description = "Verify User enter 21 characters on \"Phone Number\" field")
    public void ProvideContactTest_TC019() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC019();
        Assert.assertEquals(provideContactDetailPages.VerifyPhoneMaxMess(),"The Phone Number must be maximum 20 numbers.");
    }

    @Test(priority = 20, dataProvider = "data_ContactPhone",dataProviderClass = ContactDetail.class, description = "Verify user can not enter wrong data format on \"Phone Number\" field")
    public void ProvideContactTest_TC020(String phone_) throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC020(phone_);
        Assert.assertEquals(provideContactDetailPages.VerifyPhoneValidMess(),"Please add valid Phone Number.");
    }

    @Test(priority = 21, description = "Verify User remove all data on \"Email\" field")
    public void ProvideContactTest_TC021() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC021();
        Assert.assertEquals(provideContactDetailPages.VerifyEmailReqMess(),"The Email field is required");
    }

    @Test(priority = 22, description = "Verify User enter 51 characters on \"Email\" field")
    public void ProvideContactTest_TC022() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC022();
        Assert.assertEquals(provideContactDetailPages.VerifyEmailEXMess(),"Your Email must not exceed 50 characters.");
    }

    @Test(priority = 23, description = "Verify User enter  wrong data format and out of range on \"Email\" field")
    public void ProvideContactTest_TC023() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC023();
        Assert.assertEquals(provideContactDetailPages.VerifyEmailInvalidMess(),"The Email field must be a valid email");
    }

    @Test(priority = 24, description = "Verify User enter  more than 30 characters on \"Address Line 1\" field")
    public void ProvideContactTest_TC024() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC024();
        Assert.assertEquals(provideContactDetailPages.VerifyAddress1EXMess(),"Your Address Line 1 must not exceed 30 characters.");
    }

    @Test(priority = 25, description = "Verify User enter  more than 20 characters on \"Address Line 2\" field")
    public void ProvideContactTest_TC025() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC025();
        Assert.assertEquals(provideContactDetailPages.VerifyAddress2EXMess(),"Your Address Line 2 must not exceed 20 characters.");
    }

    @Test(priority = 26, description = "Verify User remove all data on \"Postcode\" field")
    public void ProvideContactTest_TC026() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC026();
        Assert.assertEquals(provideContactDetailPages.VerifyPostCodeReqMess(),"The Postcode field is required");
    }

    @Test(priority = 27, description = "Verify User enter 1 character on \"Postcode\" field")
    public void ProvideContactTest_TC027() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC027();
        Assert.assertEquals(provideContactDetailPages.VerifyPostCodeCharMess(),"The Postcode field must be 4 characters");
    }

    @Test(priority = 28, description = "Verify User enter 3 characters on \"Postcode\" field")
    public void ProvideContactTest_TC028() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC028();
        Assert.assertEquals(provideContactDetailPages.VerifyPostCodeCharMess(),"The Postcode field must be 4 characters");
    }

    @Test(priority = 29, description = "Verify User enter 5 characters on \"Postcode\" field")
    public void ProvideContactTest_TC029() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC029();
        Assert.assertEquals(provideContactDetailPages.GetValuePostCode(),"1234");
    }

    @Test(priority = 30, description = "Verify User enter \"Postcode\" is not found")
    public void ProvideContactTest_TC030() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC030();
        Assert.assertEquals(provideContactDetailPages.VerifyPostCodeNotFound(),"No valid post code found.");
    }

    @Test(priority = 31, description = "Verify user can enter more than 20 characters on \"NRMA Number No.\" field")
    public void ProvideContactTest_TC031() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC031();
    }

    @Test(priority = 32, description = "Verify user can enter more than 100 characters on \"Company Name\" field")
    public void ProvideContactTest_TC032() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC032();
    }

    @Test(priority = 33, description = "Verify user can enter more than 100 characters on \"Note\" field")
    public void ProvideContactTest_TC033() throws Exception{
        provideContactDetailPages.ProvideContactDetail_TC033();
    }

}

package com.easyserv.pages.Motoserve_BookingApp_UAT;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.awt.*;
import java.util.List;

public class ProvideContactDetailPages {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By noStoreLink = By.xpath("//u[contains(text(),'No store currently selected')]");
    private By enterSubText = By.xpath("//input[@placeholder='Enter Suburb or Postcode']");
    private By viewStoreBt = By.xpath("//button[@class='ant-btn ant-btn-round ant-btn-default button']");
    private By searchButton = By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-lg ant-input-search-button']");
    private By enterRego = By.xpath("//input[@placeholder='Enter your rego']");
    private By finMyCarBt = By.xpath("//span[normalize-space()='Find my car']");
    private By confProceedBt = By.xpath("//span[normalize-space()='Confirm and Proceed']");
    private By serviceSection = By.xpath("//div[normalize-space()='Service']");
    private By logBook = By.xpath("//span[normalize-space()='LOGBOOK SERVICE']");
    private By proceedBt = By.xpath("//span[normalize-space()='Choose and Proceed']");
    private By selectTimeTitle = By.xpath("//span[contains(text(),'Select time')]");
    private By nextBt = By.xpath("//div[@class='ant-space ant-space-vertical time-select']//button[@type='button'][normalize-space()='Next']");
    private By contactDetail = By.xpath("//span[contains(text(),'Contact details')]");
    private By firsName = By.xpath("//input[@id='basic_firstName']");
    private By lastName = By.xpath("//input[@id='basic_lastName']");
    private By phoneNum = By.xpath("//input[@id='basic_phoneNumber']");
    private By email = By.xpath("//input[@id='basic_email']");
    private By address1 = By.xpath("//input[@id='basic_addressLine1']");
    private By address2 = By.xpath("//input[@id='basic_addressLine2']");
    private By nrmaNo = By.xpath("//input[@id='basic_memberNo']");
    private By companyName = By.xpath("//input[@id='basic_companyName']");
    private By applyBt = By.xpath("//button[@class='ant-btn ant-btn-round ant-btn-default btn-apply']");
    private By confirmBt = By.xpath("//footer[@class='ant-layout-footer main-footer fixed-bottom']//button[@type='button']");
    private By privacyLink = By.xpath("//a[@class='ant-typography url-privacy']");
    private By privacyHeader = By.xpath("//h1[contains(text(),'Motorserve Privacy Policy')]");
    private By backBt = By.xpath("//footer[@class='ant-layout-footer main-footer fixed-bottom']//span[@class='ant-typography back'][normalize-space()='Back']");
    private By appoHeader = By.xpath("//span[contains(text(),'Select An Appointment')]");
    private By note = By.xpath("//textarea[@id='basic_note']");
    private By promo = By.xpath("//input[@id='basic_promotionCode']");
    private By proMess = By.xpath("//span[contains(text(),'This Promo Code is successfully validated.')]");
    private By removeIcon = By.xpath("//button[@class='close-icon active']");
    private By noBt = By.xpath("//button[@class='ant-btn ant-btn-default']");
    private By yesBt = By.xpath("//span[normalize-space()='Yes']");
    private By promoNoValidMess = By.xpath("//div[contains(text(),'Sorry, this promo code is not valid.')]");
    private By promoExpiredMess = By.xpath("//div[contains(text(),'This Promo Code is no longer valid in this Store. ')]");
    private By firstNameReqMess = By.xpath("//div[contains(text(),'The First Name field is required')]");
    private By firstNameEXMess = By.xpath("//div[contains(text(),'Your First Name must not exceed 50 characters.')]");
    private By lastNameReqMess = By.xpath("//div[contains(text(),'The Last Name field is required')]");
    private By lastNameEXMess = By.xpath("//div[contains(text(),'Your Last Name must not exceed 50 characters.')]");
    private By phoneReqMess = By.xpath("//div[contains(text(),'The Phone Number field is required')]");
    private By phoneValidMess = By.xpath("//div[contains(text(),'Please add valid Phone Number.')]");
    private By phoneMaxMess = By.xpath("//div[contains(text(),'The Phone Number must be maximum 20 numbers.')]");
    private By emailReqMess = By.xpath("//div[contains(text(),'The Email field is required')]");
    private By emailEXMess = By.xpath("//div[contains(text(),'Your Email must not exceed 50 characters.')]");
    private By emailInvalidMess = By.xpath("//div[contains(text(),'The Email field must be a valid email')]");
    private By addres1EXMess = By.xpath("//div[contains(text(),'Your Address Line 1 must not exceed 30 characters.')]");
    private By address2EXMess = By.xpath("//div[contains(text(),'Your Address Line 2 must not exceed 20 characters.')]");
    private By postCode = By.xpath("//input[@id='basic_postCode']");
    private By postCodeReqMess = By.xpath("//div[contains(text(),'The Postcode field is required')]");
    private By postCodeReqCharMess = By.xpath("//div[contains(text(),'The Postcode field must be 4 characters')]");
    private By postCodeValue = By.xpath("//span[contains(text(),'1234')]");
    private By postCodeNotFound = By.xpath("//div[contains(text(),'No valid post code found.')]");


    public ProvideContactDetailPages(WebDriver driver){
        this.driver= driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void LinkTC(){
        validateHelper.LinkTC("https://siliconstackcomau.sharepoint.com/:x:/r/sites/EasyServ/_layouts/15/Doc.aspx?sourcedoc=%7B5AE64958-5BB8-4B4A-8B7D-9A2AD92750FA%7D&file=Test%20Case%20Booking%20Provide%20Contact%20Detail%20(User%20Access%20or%20Not%20Access).xlsx&action=default&mobileredirect=true");
    }

    public void ProvideContactDetail_TC001() throws AWTException {
        LinkTC();
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
    }

    public void ProvideContactDetail_TC002() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(privacyLink);
        validateHelper.clickElement(privacyLink);
        validateHelper.SwitchBrowser();
    }

    public void ProvideContactDetail_TC003() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(backBt);
        validateHelper.clickElement(backBt);
    }

    public void ProvideContactDetail_TC004() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        Assert.assertTrue(VerifyFirstNameStatus());
        validateHelper.setText(firsName,"Tom");
        Assert.assertTrue(VerifyLastNameStatus());
        validateHelper.setText(lastName,"Nguyen");
        Assert.assertTrue(VerifyPhoneStatus());
        validateHelper.setText(phoneNum,"0909789789");
        Assert.assertTrue(VerifyEmailStatus());
        validateHelper.setText(email,"tomnguyen@gmail.com");
        Assert.assertTrue(VerifyNRMAStatus());
        validateHelper.setText(nrmaNo,"NRMA221199");
        Assert.assertTrue(VerifyAddress1Status());
        validateHelper.setText(address1,"364 Cong Hoa");
        Assert.assertTrue(VerifyAddress2Status());
        validateHelper.setText(address1,"222 Phu Nhuan");
        Assert.assertTrue(VerifyCompanyStatus());
        validateHelper.setText(companyName,"SiliconStack Company");
        Assert.assertTrue(VerifyNoteStatus());
        validateHelper.setText(note,"Testing By Tom Nguyen");
    }

    public void ProvideContactDetail_TC005() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(promo);
        Assert.assertTrue(VerifyPromoStatus());
        validateHelper.setText(promo,"ABC 6$#");
    }


    public void ProvideContactDetail_TC006() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(promo);
        Assert.assertTrue(VerifyPromoStatus());
        validateHelper.setText(promo,"TESTPRO1");
        validateHelper.delay(2);
    }

    public void ProvideContactDetail_TC007() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(promo);
        Assert.assertTrue(VerifyPromoStatus());
        validateHelper.setText(promo,"TESTPRO1");
        validateHelper.delay(2);
        validateHelper.clickElement(applyBt);
        validateHelper.delay(2);
    }

    public void ProvideContactDetail_TC008() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(promo);
        Assert.assertTrue(VerifyPromoStatus());
        validateHelper.setText(promo,"TESTPRO1");
        validateHelper.delay(2);
        validateHelper.clickElement(applyBt);
        validateHelper.delay(2);
        validateHelper.clickElement(removeIcon);
        validateHelper.clickElement(noBt);
        validateHelper.delay(2);
    }

    public void ProvideContactDetail_TC009() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(promo);
        Assert.assertTrue(VerifyPromoStatus());
        validateHelper.setText(promo,"TESTPRO1");
        validateHelper.delay(2);
        validateHelper.clickElement(applyBt);
        validateHelper.delay(2);
        validateHelper.clickElement(removeIcon);
        validateHelper.clickElement(yesBt);
        validateHelper.delay(2);
    }

    public void ProvideContactDetail_TC010() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(promo);
        Assert.assertTrue(VerifyPromoStatus());
        validateHelper.setText(promo,"1234");
        validateHelper.delay(2);
        validateHelper.clickElement(applyBt);
        validateHelper.delay(2);
    }

    public void ProvideContactDetail_TC011() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(promo);
        Assert.assertTrue(VerifyPromoStatus());
        validateHelper.setText(promo,"12344343434343434344ZZZ");
    }

    public void ProvideContactDetail_TC012() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(promo);
        Assert.assertTrue(VerifyPromoStatus());
        validateHelper.setText(promo,"TESTPRO02");
        validateHelper.delay(2);
        validateHelper.clickElement(applyBt);
        validateHelper.delay(2);
    }

    public void ProvideContactDetail_TC013() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(firsName);
        validateHelper.setText(firsName,"Tom");
        validateHelper.clearText(firsName);
    }

    public void ProvideContactDetail_TC014() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(firsName);
        validateHelper.setText(firsName,"Tommmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
    }

    public void ProvideContactDetail_TC015() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(lastName);
        validateHelper.setText(lastName,"Nguyen");
        validateHelper.clearText(lastName);
    }

    public void ProvideContactDetail_TC016() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(lastName);
        validateHelper.setText(lastName,"Nguyennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    public void ProvideContactDetail_TC017() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(phoneNum);
        validateHelper.setText(phoneNum,"0909789789");
        validateHelper.clickElement(phoneNum);
        validateHelper.clearText(phoneNum);
    }

    public void ProvideContactDetail_TC018() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(phoneNum);
        validateHelper.setText(phoneNum,"012345678");
    }

    public void ProvideContactDetail_TC019() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(phoneNum);
        validateHelper.setText(phoneNum,"012345678903232323233");
    }

    public void ProvideContactDetail_TC020(String phone_) throws AWTException {
        validateHelper.refreshPage();
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(phoneNum);
        validateHelper.setText(phoneNum,phone_);
    }

    public void ProvideContactDetail_TC021() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(email);
        validateHelper.setText(email,"nguyentrungdtu@gmail.com");
        validateHelper.clearText(email);
    }

    public void ProvideContactDetail_TC022() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(email);
        validateHelper.setText(email,"nguyentrungdtu@gmail.commmmmmmmmmmmmmmmmmmmmmmmmmmm");
    }

    public void ProvideContactDetail_TC023() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(email);
        validateHelper.setText(email,"nguyentrungdtu@gmail");
    }


    public void ProvideContactDetail_TC024() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(address1);
        validateHelper.setText(address1,"222 Cần Thơ 222 Cần Thơ 222 CTh");
    }

    public void ProvideContactDetail_TC025() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(address2);
        validateHelper.setText(address2,"222 Cần Thơ 222 Cần Thơ 222 CTh");
    }

    public void ProvideContactDetail_TC026() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(postCode);
        validateHelper.clickElement(postCode);
        validateHelper.setText(postCode,"1001");
        WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'1001')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(ele).perform();
        WebElement clear = driver.findElement(By.xpath("//body/div[@id='__next']/section[@id='main-layout']/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[8]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/span[2]"));
        actions.moveToElement(clear).click().perform();
    }

    public void ProvideContactDetail_TC027() throws AWTException {
        validateHelper.refreshPage();
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(postCode);
        validateHelper.clickElement(postCode);
        validateHelper.setText(postCode,"1");
    }

    public void ProvideContactDetail_TC028() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(postCode);
        validateHelper.clickElement(postCode);
        validateHelper.setText(postCode,"123");
    }

    public void ProvideContactDetail_TC029() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(postCode);
        validateHelper.clickElement(postCode);
        validateHelper.setText(postCode,"12345");
    }

    public void ProvideContactDetail_TC030() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(postCode);
        validateHelper.clickElement(postCode);
        validateHelper.setText(postCode,"abcd");
    }

    public void ProvideContactDetail_TC031() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(nrmaNo);
        validateHelper.clickElement(nrmaNo);
        Assert.assertTrue(VerifyNRMAStatus());
        validateHelper.setText(nrmaNo,"51AC999951AC999951AC9999");
    }

    public void ProvideContactDetail_TC032() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(companyName);
        validateHelper.clickElement(companyName);
        Assert.assertTrue(VerifyCompanyStatus());
        validateHelper.setText(nrmaNo,"Silicon Stack Silicon Stack Silicon Stack Silicon Stack Silicon Stack Silicon Stack Silicon Stack Silicon Stack");
    }

    public void ProvideContactDetail_TC033() throws AWTException {
        validateHelper.clickElement(noStoreLink);
        validateHelper.closeAlert();
        validateHelper.setText(enterSubText,"Allambie");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.waitForPageLoaded();
        validateHelper.pressTabMany();
        VerifySearchStore("TOMTESTZ1");
        validateHelper.setText(enterRego,"123456");
        validateHelper.clickElement(finMyCarBt);
        validateHelper.clickElement(confProceedBt);
        validateHelper.movetoElement(serviceSection);
        validateHelper.clickElement(serviceSection);
        validateHelper.movetoElement(logBook);
        validateHelper.clickElement(logBook);
        validateHelper.movetoElement(proceedBt);
        validateHelper.clickElement(proceedBt);
        validateHelper.delay(2);
        validateHelper.movetoElement(selectTimeTitle);
        validateHelper.delay(3);
        SelectTimeCarosel();
        validateHelper.clickElement(proceedBt);
        validateHelper.movetoElement(note);
        validateHelper.clickElement(note);
        Assert.assertTrue(VerifyNoteStatus());
        validateHelper.setText(note,"Silicon Stack Silicon Stack Silicon Stack Silicon Stack Silicon Stack Silicon Stack Silicon Stack Silicon Stack");
    }

    public String VerifyPostCodeNotFound(){
        String mess = validateHelper.checkText(postCodeNotFound);
        return mess;
    }

    public String GetValuePostCode(){
        String mess = validateHelper.checkText(postCodeValue);
        return mess;
    }
    public String VerifyPostCodeCharMess(){
        String mess = validateHelper.checkText(postCodeReqCharMess);
        return mess;
    }

    public String VerifyPostCodeReqMess(){
        String mess = validateHelper.checkText(postCodeReqMess);
        return mess;
    }

    public String VerifyAddress2EXMess(){
        String mess = validateHelper.checkText(address2EXMess);
        return mess;
    }

    public String VerifyAddress1EXMess(){
        String mess = validateHelper.checkText(addres1EXMess);
        return mess;
    }

    public String VerifyEmailInvalidMess(){
        String mess = validateHelper.checkText(emailInvalidMess);
        return mess;
    }

    public String VerifyEmailEXMess(){
        String mess = validateHelper.checkText(emailEXMess);
        return mess;
    }

    public String VerifyEmailReqMess(){
        String mess = validateHelper.checkText(emailReqMess);
        return mess;
    }

    public String VerifyPhoneMaxMess(){
        String mess = validateHelper.checkText(phoneMaxMess);
        return mess;
    }

    public String VerifyPhoneValidMess(){
        String mess = validateHelper.checkText(phoneValidMess);
        return mess;
    }

    public String VerifyPhoneReqMess(){
        String mess = validateHelper.checkText(phoneReqMess);
        return mess;
    }

    public String VerifyLastNameEXMess(){
        String mess = validateHelper.checkText(lastNameEXMess);
        return mess;
    }

    public String VerifyLastNameReqMess(){
        String mess = validateHelper.checkText(lastNameReqMess);
        return mess;
    }

    public String VerifyFirstNameEXMess(){
        String mess = validateHelper.checkText(firstNameEXMess);
        return mess;
    }

    public String VerifyFirstNameReqMess(){
        String mess = validateHelper.checkText(firstNameReqMess);
        return mess;
    }

    public String VerifyPromoExpiredMess(){
        String mess = validateHelper.checkText(promoExpiredMess);
        return mess;
    }

    public String VerifyPromoNotValidMess(){
        String mess = validateHelper.checkText(promoNoValidMess);
        return mess;
    }

    public String GetProValue(){
        String value = validateHelper.getAttribute(promo);
        return value;
    }

    public String VerifyApplyPromoMess(){
        String mess = validateHelper.checkText(proMess);
        return mess;
    }


    public boolean VerifyPromoStatus(){
        boolean status = validateHelper.enableElement(promo);
        return status;
    }

    public String VerifySelectAppointHeader(){
        String header = validateHelper.checkText(appoHeader);
        return header;
    }


    public String VerifyPrivacyHeader(){
        String header = validateHelper.checkText(privacyHeader);
        return header;
    }

    public String VerifyContactDetailHeader(){
        String header = validateHelper.checkText(contactDetail);
        return header;
    }

    public boolean VerifyFirstNameStatus(){
        boolean status = validateHelper.enableElement(firsName);
        return status;
    }

    public boolean VerifyLastNameStatus(){
        boolean status = validateHelper.enableElement(lastName);
        return status;
    }

    public boolean VerifyPhoneStatus(){
        boolean status = validateHelper.enableElement(phoneNum);
        return status;
    }

    public boolean VerifyEmailStatus(){
        boolean status = validateHelper.enableElement(email);
        return status;
    }

    public boolean VerifyApplyButtonStatus(){
        boolean status = validateHelper.enableElement(applyBt);
        return status;
    }

    public boolean VerifyConfirmButtonStatus(){
        boolean status = validateHelper.enableElement(confirmBt);
        return status;
    }

    public boolean VerifyAddress1Status(){
        boolean status = validateHelper.enableElement(address1);
        return status;
    }

    public boolean VerifyAddress2Status(){
        boolean status = validateHelper.enableElement(address2);
        return status;
    }

    public boolean VerifyNRMAStatus(){
        boolean status = validateHelper.enableElement(nrmaNo);
        return status;
    }

    public boolean VerifyCompanyStatus(){
        boolean status = validateHelper.enableElement(companyName);
        return status;
    }

    public boolean VerifyNoteStatus(){
        boolean status = validateHelper.enableElement(note);
        return status;
    }





    public void VerifySearchStore(String expected){
        validateHelper.waitForPageLoaded();
        WebElement parentTable = driver.findElement(By.xpath("//div[@class='ant-space ant-space-vertical store-select-list']"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//div[@class='ant-space ant-space-vertical store-select-list']//div[@class='ant-space-item']"));
        for (int i = 1; i < rows.size(); i++) {
            WebElement rowElement = driver.findElement(By.xpath("//div[@class='ant-space ant-space-vertical store-select-list']//div[@class='ant-space-item'][" + i + "]//span"));
            if (rowElement.getText().equals(expected)){
                Assert.assertTrue(rowElement.getText().equals(expected));
                System.out.println("Print Store Name : "+ rowElement.getText());
                WebElement rowSection = driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div["+i+"]/div[1]/div[1]//button"));
                rowSection.click();
                break;
            } else {
                continue;
            }
        }
    }

    public void SelectTimeCarosel(){
        WebElement parent = driver.findElement(By.xpath("//div[@class='ant-space ant-space-vertical time-select']"));
        List<WebElement> rows = parent.findElements(By.xpath("//div[@class='ant-space ant-space-vertical time-select']//div[@class='slick-track']"));
        for (int i=0;i< rows.size();i++){
            WebElement time_above = driver.findElement(By.xpath("//div[@class='ant-space ant-space-vertical time-select']//div[@class='slick-track']//div[@data-index='"+i+"']//div[@class='ant-space-item'][1]//div"));
            WebElement time_below = driver.findElement(By.xpath("//div[@class='ant-space ant-space-vertical time-select']//div[@class='slick-track']//div[@data-index='"+i+"']//div[@class='ant-space-item'][2]//div"));

            if (time_above.getAttribute("class").equals("ant-card ant-card-bordered ant-card-hoverable time-tag")){
                time_above.click();
                break;
            } else if (time_below.getAttribute("class").equals("ant-card ant-card-bordered ant-card-hoverable time-tag")) {
                time_below.click();
                break;
            } else {
                //validateHelper.clickElement(nextBt);

                continue;
            }
        }
    }
}

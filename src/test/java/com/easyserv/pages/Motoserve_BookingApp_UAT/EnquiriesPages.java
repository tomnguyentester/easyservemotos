package com.easyserv.pages.Motoserve_BookingApp_UAT;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnquiriesPages {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By enquiriIcon = By.xpath("//a[@class='ant-typography btn btn-primary']//span[@role='img']//*[name()='svg']");
    private By enquiriHeader = By.xpath("//span[@class='ant-typography login-title']");
    private By enquiriText = By.xpath("//p[contains(text(),'Please provide a brief message and your contact de')]");
    private By selectStoreDrop = By.xpath("//div[@aria-required='true']//div[@class='ant-select-selector']");
    private By firtName = By.xpath("//input[@id='basic_firstName']");
    private By lastName = By.xpath("//input[@id='basic_lastName']");
    private By phoneNumber = By.xpath("//input[@id='basic_mobileNumber']");
    private By Email = By.xpath("//input[@id='basic_email']");
    private By postCode = By.xpath("//body/div[@id='__next']/section[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/input[1]");
    private By yourEnquiry = By.xpath("//textarea[@id='basic_note']");
    private By sendButton = By.xpath("//button[@type='submit']");
    private By backButton = By.xpath("//span[contains(text(),'Back')]");
    private By firtNameEXMess = By.xpath("//div[contains(text(),'Your First Name must not exceed 50 characters.')]");
    private By lastNameEXMess = By.xpath("//div[contains(text(),'Your Last Name must not exceed 50 characters.')]");
    private By phoneEXMess = By.xpath("//div[contains(text(),'Your Phone Number must not exceed 20 characters.')]");
    private By emailEXMess = By.xpath("//div[contains(text(),'Your Email must not exceed 50 characters.')]");
    private By postCodeReqMess = By.xpath("//div[contains(text(),'The postCode field must be 4 characters')]");
    private By phoneMess = By.xpath("//div[contains(text(),'Please add valid Phone Number.')]");
    private By emailMes = By.xpath("//div[contains(text(),'The email field must be a valid email')]");
    private By postCodeMess = By.xpath("//div[contains(text(),'No valid post code found.')]");
    private By yourEnquMess = By.xpath("//div[contains(text(),'The enquiries field is required')]");
    private By artarmonStore = By.xpath("//div[contains(text(),'Artarmon')]");
    private By enquirySend = By.xpath("//p[contains(text(),'ENQUIRY SENT')]");
    private By doneButton = By.xpath("//span[normalize-space()='Done']");
    private By homeHeader = By.xpath("//span[contains(text(),'BOOK A SERVICE')]");
    private By privacyURL = By.xpath("//a[@class='ant-typography url-privacy']");
    private By privacyHeader = By.xpath("//h1[contains(text(),'Motorserve Privacy Policy')]");
    private By selectArtamon = By.xpath("//div[contains(text(),'ARTARMON')]");
    private By artamonValue = By.xpath("//span[@title='ARTARMON']");
    private By suburbDrop = By.xpath("//div[contains(@class,'ant-select ant-select-in-form-item ant-select-status-success ant-select-single ant-select-show-arrow')]//div[contains(@class,'ant-select-selector')]");
    private By subuBecon = By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='Beacon Hill']");
    private By firstNameReqMess = By.xpath("//div[contains(text(),'The First Name field is required')]");
    private By lastNameReqMess = By.xpath("//div[contains(text(),'The Last Name field is required')]");
    private By emailReqMess = By.xpath("//div[contains(text(),'The Email field is required')]");
    private By yourEnquiReqMess = By.xpath("//div[contains(text(),'The enquiries field is required')]");
    private By emailValidMess = By.xpath("//div[contains(text(),'The Email field must be a valid email')]");
    private By phoneValidMess = By.xpath("//div[contains(text(),'Please add valid Phone Number.')]");


    public EnquiriesPages(WebDriver driver){
        this.driver= driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void LinkTC(){
        validateHelper.LinkTC("https://siliconstackcomau.sharepoint.com/:x:/r/sites/EasyServ/_layouts/15/Doc.aspx?sourcedoc=%7B34E9AB5D-B88A-44B2-B7F4-554CC2FC998B%7D&file=Test%20Case%20General%20Enquiries.xlsx&action=default&mobileredirect=true");
    }

    public void Enquiries_TC001(){
        validateHelper.clickElement(enquiriIcon);
    }

    public void Enquiries_TC002(){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.clickElement(privacyURL);
        validateHelper.SwitchBrowser();
    }

    public void Enquiries_TC003(){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.clickElement(selectStoreDrop);
        validateHelper.clickElement(selectArtamon);
    }

    public void Enquiries_TC004(){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.setText(postCode,"2100");
        validateHelper.clickElement(suburbDrop);
        validateHelper.clickElement(subuBecon);
    }

    public void Enquiries_TC005(){
        validateHelper.clickElement(enquiriIcon);
        Assert.assertTrue(verifyStatusFirtNameField(),"First Name Not Avaible");
        validateHelper.setText(firtName,"Tom");
        Assert.assertTrue(verifyStatusLastNameField(),"Last Name Not Avaible");
        validateHelper.setText(lastName,"Nguyen");
        Assert.assertTrue(verifyStatusLastNameField(),"Phone Number Not Avaible");
        validateHelper.setText(phoneNumber,"0909789789");
        Assert.assertTrue(verifyStatusEmailField(),"Email Not Avaible");
        validateHelper.setText(Email,"nguyentrungdtu@gmail.com");
        Assert.assertTrue(VerifyStatusPostCode(),"PostCode Not Avaible");
        validateHelper.setText(postCode,"2100");
        Assert.assertTrue(verifyStatusYourEnquiryField(),"Your Enquiry Not Avaible");
        validateHelper.setText(yourEnquiry,"Help me, please");
    }

    public void Enquiries_TC006(){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.clickElement(selectStoreDrop);
        validateHelper.clickElement(selectArtamon);
        validateHelper.setText(firtName,"Tom");
        validateHelper.setText(lastName,"Nguyen");
        validateHelper.setText(phoneNumber,"0909789789");
        validateHelper.setText(Email,"nguyentrungdtu@gmail.com");
        validateHelper.setText(postCode,"2100");
        validateHelper.setText(yourEnquiry,"Help me, please");
        validateHelper.movetoElement(sendButton);
    }

    public void Enquiries_TC007(String lastname,String firtname,String phone,String email,String equiMess){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.clickElement(selectStoreDrop);
        validateHelper.clickElement(selectArtamon);
        validateHelper.setText(firtName,firtname);
        validateHelper.setText(lastName,lastname);
        validateHelper.setText(phoneNumber,phone);
        validateHelper.setText(Email,email);
        validateHelper.setText(postCode,"2100");
        validateHelper.setText(yourEnquiry,equiMess);
        validateHelper.movetoElement(sendButton);
        validateHelper.clickElement(sendButton);
    }

    public void Enquiries_TC008(){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.setText(firtName,"Tom");
        validateHelper.setText(lastName,"Nguyen");
        validateHelper.setText(phoneNumber,"0909789789");
        validateHelper.setText(Email,"nguyentrungdtu@gmail.com");
        validateHelper.setText(postCode,"2100");
        validateHelper.setText(yourEnquiry,"Help me, please");
        validateHelper.movetoElement(sendButton);
    }

    public void Enquiries_TC009(){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.setText(firtName,"Tom");
        validateHelper.setText(lastName,"Nguyen");
        validateHelper.setText(phoneNumber,"0909789789");
        validateHelper.setText(Email,"nguyentrungdtu@gmail.com");
        validateHelper.setText(postCode,"2100");
        validateHelper.setText(yourEnquiry,"Help me, please");
        validateHelper.clearText(firtName);
        validateHelper.movetoElement(sendButton);
    }

    public void Enquiries_TC010(){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.setText(firtName,"Tom");
        validateHelper.setText(lastName,"Nguyen");
        validateHelper.setText(phoneNumber,"0909789789");
        validateHelper.setText(Email,"nguyentrungdtu@gmail.com");
        validateHelper.setText(postCode,"2100");
        validateHelper.setText(yourEnquiry,"Help me, please");
        validateHelper.clearText(lastName);
        validateHelper.movetoElement(sendButton);
    }

    public void Enquiries_TC011(){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.setText(firtName,"Tom");
        validateHelper.setText(lastName,"Nguyen");
        validateHelper.setText(phoneNumber,"0909789789");
        validateHelper.setText(Email,"nguyentrungdtu@gmail.com");
        validateHelper.setText(postCode,"2100");
        validateHelper.setText(yourEnquiry,"Help me, please");
        validateHelper.clearText(Email);
        validateHelper.movetoElement(sendButton);
    }

    public void Enquiries_TC012(){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.setText(firtName,"Tom");
        validateHelper.setText(lastName,"Nguyen");
        validateHelper.setText(phoneNumber,"0909789789");
        validateHelper.setText(Email,"nguyentrungdtu@gmail.com");
        validateHelper.setText(postCode,"2100");
        validateHelper.setText(yourEnquiry,"Help me, please");
        validateHelper.clearText(yourEnquiry);
        validateHelper.movetoElement(sendButton);
    }

    public void Enquiries_TC013(){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.setText(firtName,"Tom");
        validateHelper.setText(lastName,"Nguyen");
        validateHelper.setText(phoneNumber,"0909789789");
        validateHelper.setText(Email,"@gmail.com");
    }

    public void Enquiries_TC014(){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.setText(firtName,"Tommmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
    }

    public void Enquiries_TC015(){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.setText(lastName,"Nguyennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    public void Enquiries_TC016(){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.setText(Email,"tomnguyen@gmail.commmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
    }

    public void Enquiries_TC017(String phone){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.setText(phoneNumber,phone);
    }

    public void Enquiries_TC018(String post){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.movetoElement(postCode);
        validateHelper.setText(postCode,post);
    }

    public void Enquiries_TC019(){
        validateHelper.clickElement(enquiriIcon);
        validateHelper.setText(phoneNumber,"090978978981982192813");
    }

    public String verifyPhoneEXMess(){
        String mess = validateHelper.checkText(phoneEXMess);
        return mess;
    }

    public String verifyPostCodeValidMess(){
        String mess = validateHelper.checkText(postCodeMess);
        return mess;
    }

    public String verifyPhoneValidMess(){
        String mess = validateHelper.checkText(phoneValidMess);
        return mess;
    }
    public String verifyEmailEXMess(){
        String mess = validateHelper.checkText(emailEXMess);
        return mess;
    }
    public String verifyLastNameEXMess(){
        String mess = validateHelper.checkText(lastNameEXMess);
        return mess;
    }

    public String verifyFirstNameEXMess(){
        String mess = validateHelper.checkText(firtNameEXMess);
        return mess;
    }

    public String verifyEmailValidMess(){
        String mess = validateHelper.checkText(emailValidMess);
        return mess;
    }

    public String verifyEnquiReqMess(){
        String mess = validateHelper.checkText(yourEnquiReqMess);
        return mess;
    }

    public String verifyEmailReqMess(){
        String mess = validateHelper.checkText(emailReqMess);
        return mess;
    }

    public String verifyLastNameReqMess(){
        String mess = validateHelper.checkText(lastNameReqMess);
        return mess;
    }

    public String verifyFirstNameReqMess(){
        String mess = validateHelper.checkText(firstNameReqMess);
        return mess;
    }

    public String verifyEnquirySentHeader(){
        String enqsent = validateHelper.checkText(enquirySend);
        System.out.println("Printer Enquiry Sent Header : " +enqsent);
        return enqsent;
    }
    public boolean VerifyStatusPostCode(){
        boolean post = validateHelper.enableElement(postCode);
        return post;
    }

    public boolean VerifyStatusPhoneNum(){
        boolean phone = validateHelper.enableElement(phoneNumber);
        return phone;
    }
    public String VerifySelectStoreValue(){
        String store = validateHelper.checkText(artamonValue);
        return store;
    }

    public String verifyPrivacyHeader(){
        String priv = validateHelper.checkText(privacyHeader);
        System.out.println("Printer Privacy Header : " +priv);
        return priv;
    }

    public boolean verifyStatusSendButton(){
        boolean sendbt = validateHelper.enableElement(sendButton);
        System.out.println("Printer Status Send Button :" + sendbt);
        return  sendbt;
    }
    public boolean verifyStatusYourEnquiryField(){
        boolean yourEnq = validateHelper.enableElement(yourEnquiry);
        System.out.println("Printer Status Your Enquiry field :" + yourEnq);
        return  yourEnq;
    }

    public boolean verifyStatusEmailField(){
        boolean emailfield = validateHelper.enableElement(Email);
        System.out.println("Printer Status email field :" + emailfield);
        return  emailfield;
    }

    public boolean verifyStatusLastNameField(){
        boolean lastname = validateHelper.enableElement(lastName);
        System.out.println("Printer Status last name :" + lastname);
        return  lastname;
    }

    public boolean verifyStatusFirtNameField(){
        boolean firstname = validateHelper.enableElement(firtName);
        System.out.println("Printer Status first name :" + firstname);
        return  firstname;
    }

    public boolean verifySelectStore(){
        boolean selectStore = validateHelper.enableElement(selectStoreDrop);
        System.out.println("Printer Status Select Store :" +selectStore);
        return  selectStore;
    }

    public String VerifyGeneralEnquHeader(){
        String header = validateHelper.checkText(enquiriHeader);
        return header;
    }
}

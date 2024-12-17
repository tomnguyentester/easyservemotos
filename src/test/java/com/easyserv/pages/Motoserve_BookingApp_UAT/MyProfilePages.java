package com.easyserv.pages.Motoserve_BookingApp_UAT;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyProfilePages {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By userIcon = By.xpath("//*[name()='path' and contains(@d,'M20.1212 1')]");
    private By emailText = By.xpath("//input[@id='email']");
    private By passwordText = By.xpath("//input[@id='password']");
    private By loginBt = By.xpath("//button[@type='submit']");
    private By userLogin = By.xpath("//strong[normalize-space()='TN']");
    private By viewProfile = By.xpath("//span[normalize-space()='View Profile']");
    private By contactDetailHeader = By.xpath("//span[contains(text(),'CONTACT DETAILS')]");
    private By myBooking = By.xpath("//span[contains(text(),'My Bookings')]");
    private By myVehicleHeader = By.xpath("//span[contains(text(),'My Vehicle')]");
    private By myBookingHeader = By.xpath("//strong[contains(text(),'My Bookings')]");
    private By upComingTitle = By.xpath("//span[contains(text(),'Upcoming Bookings')]");
    private By vehicleTitle = By.xpath("//span[contains(text(),'Vehicles')]");
    private By totalBookTitle = By.xpath("//span[contains(text(),'Total Bookings')]");
    private By fistNameText = By.xpath("//input[@id='firstName']");
    private By lastNameText = By.xpath("//input[@id='lastName']");
    private By phoneNumText = By.xpath("//input[@id='phoneNumber']");
    private By emailbox = By.xpath("//input[@id='email']");
    private By updateBt = By.xpath("//span[contains(text(),'Update')]");
    private By address1 = By.xpath("//input[@id='addressLine1']");
    private By passSettingTab = By.xpath("//div[@role='tablist']//div[3]");
    private By passSetHeader = By.xpath("//span[contains(text(),'PASSWORD SETTINGS')]");
    private By nrmaNo = By.xpath("//input[@id='nrma']");
    private By address2 = By.xpath("//input[@id='addressLine2']");
    private By postalAdd = By.xpath("//input[@id='postalAddress']");
    private By Sub = By.xpath("//span[contains(text(),'Sydney')]");
    private By subItem = By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='Australia Square']");
    private By postCode = By.xpath("//span[@title='1139']");
    private By subValue = By.xpath("//span[@title='Australia Square']");
    private By cancelBt = By.xpath("//span[contains(text(),'Cancel')]");
    private By confirmTitle = By.xpath("//span[contains(text(),'Confirm')]");
    private By bookSerBt = By.xpath("//body/div[@id='__next']/section[@id='main-layout']/main[1]/button[1]");
    private By confVehicleTitle = By.xpath("//span[contains(text(),'Confirm your vehicle')]");
    private By currPass = By.xpath("//input[@id='currentPassword']");
    private By newPass = By.xpath("//input[@id='newPassword']");
    private By confPass = By.xpath("//input[@id='confirmNewPassword']");
    private By currPassMess = By.xpath("//div[contains(text(),'The Current Password field is required')]");
    private By eyeIcon = By.xpath("//div[@data-label='Current Password']//span[@aria-label='eye-invisible']//*[name()='svg']");
    private By currPassEx = By.xpath("//div[contains(text(),'Your Current Password must not exceed 20 character')]");
    private By eyeNewIcon = By.xpath("//div[@data-label='New Password']//span[@aria-label='eye-invisible']//*[name()='svg']");
    private By newPassMess = By.xpath("//div[contains(text(),'The New Password field is required')]");
    private By newPassEX = By.xpath("//div[contains(text(),'Your New Password must not exceed 20 characters.')]");
    private By eyeConfIcon = By.xpath("//div[@data-label='Confirm New Password']//span[@aria-label='eye-invisible']//*[name()='svg']");
    private By confPassMess = By.xpath("//div[normalize-space()='The Confirm New Password field is required']");
    private By confPassEX = By.xpath("//div[normalize-space()='Your Confirm New Password must not exceed 20 characters.']");
    private By confMess = By.xpath("//div[contains(text(),'Are you sure you want to discard all changes?')]");
    private By updateNoti = By.xpath("//div[@class='ant-notification-notice-message']");
    private By firstNameReqMess = By.xpath("//div[contains(text(),'The First Name field is required')]");
    private By firstNameEX = By.xpath("//div[contains(text(),'Your First Name must not exceed 50 characters.')]");
    private By lastNameReqMess = By.xpath("//div[contains(text(),'The Last Name field is required')]");
    private By lastNameEX = By.xpath("//div[contains(text(),'Your Last Name must not exceed 50 characters.')]");
    private By phoneReqMess = By.xpath("//div[contains(text(),'The Phone Number field is required')]");
    private By phoneNotiMess = By.xpath("//div[contains(text(),'Please add valid Phone Number.')]");
    private By phoneEX = By.xpath("//div[contains(text(),'Your Phone Number must not exceed 20 characters.')]");
    private By mailReqMess = By.xpath("//div[contains(text(),'The Email field is required')]");
    private By mailboxEX = By.xpath("//div[contains(text(),'Your Email must not exceed 50 characters.')]");
    private By mailNotiMess = By.xpath("//div[contains(text(),'The Email field must be a valid email')]");
    private By address1EX= By.xpath("//div[contains(text(),'Your Address Line 1 must not exceed 30 characters.')]");
    private By address2EX = By.xpath("//div[contains(text(),'Your Address Line 2 must not exceed 20 characters.')]");
    private By nrmaMemberEX = By.xpath("//div[contains(text(),'Your NRMA Member No. must not exceed 20 characters')]");
    private By curPassAlert = By.xpath("//div[@class='ant-notification-notice-message']");
    private By closeAlert = By.xpath("//span[@aria-label='close']//*[name()='svg']");
    private By ConfPassNot = By.xpath("//div[contains(text(),'The confirmed password is not matched. Please try ')]");

    public MyProfilePages(WebDriver driver){
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void LinkTC(){
        validateHelper.LinkTC("https://siliconstackcomau.sharepoint.com/:x:/r/sites/EasyServ/_layouts/15/Doc.aspx?sourcedoc=%7B976F30FC-58A6-4477-BCE6-8338B5985B48%7D&file=Test%20Case%20My%20Profile.xlsx&action=default&mobileredirect=true");
    }

    public void MyProfile_TC001(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(userLogin);
        validateHelper.delay(2);
        validateHelper.clickElement(viewProfile);
    }

    public void MyProfile_TC002(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(myBooking);
    }

    public void MyProfile_TC003(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.movetoElement(lastNameText);
    }

    public void MyProfile_TC004(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clickElement(passSettingTab);
    }

    public void MyProfile_TC005(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        Assert.assertTrue(VerifyFirstNameStatus());
        validateHelper.clearText(fistNameText);
        validateHelper.setText(fistNameText,"Anh123");
        Assert.assertTrue(VerifyLastNameStatus());
        validateHelper.clearText(lastNameText);
        validateHelper.setText(lastNameText,"Nguyễn_546");
        Assert.assertTrue(VerifyPhoneNumStatus());
        validateHelper.clearText(phoneNumText);
        validateHelper.setText(phoneNumText,"08367628");
        Assert.assertTrue(VerifyNRMANoStatus());
        validateHelper.clearText(nrmaNo);
        validateHelper.setText(nrmaNo,"2025");
        Assert.assertTrue(VerifyAddressLine1Status());
        validateHelper.clearText(address1);
        validateHelper.setText(address1,"364 Cong Hoa");
        Assert.assertTrue(VerifyAddressLine2Status());
        validateHelper.clearText(address2);
        validateHelper.setText(address2,"222 Phu Nhuan");
        validateHelper.movetoElement(postalAdd);
        Assert.assertTrue(VerifyPostalAddStatus());
        validateHelper.clearText(postalAdd);
        validateHelper.setText(postalAdd,"123 Aus");
    }

    public void MyProfile_TC006(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.movetoElement(Sub);
        validateHelper.clickElement(Sub);
        validateHelper.delay(2);
        //validateHelper.clickElement(subItem);
    }

    public void MyProfile_TC007(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.movetoElement(cancelBt);
        validateHelper.clickElement(cancelBt);
    }

    public void MyProfile_TC008(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clickElement(bookSerBt);
    }

    public void MyProfile_TC009(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clickElement(passSettingTab);
        validateHelper.clickElement(eyeIcon);
        validateHelper.setText(currPass,"678&^%%9idfjdoo023p");
    }

    public void MyProfile_TC010(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clickElement(passSettingTab);
        validateHelper.clickElement(eyeIcon);
        validateHelper.setText(currPass,"678&^%%9idfjdoo023pa");
    }

    public void MyProfile_TC011(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clickElement(passSettingTab);
        validateHelper.clickElement(eyeIcon);
        validateHelper.setText(currPass,"678&^%%9idfjdoo023pa");
        validateHelper.clearText(currPass);
    }

    public void MyProfile_TC012(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clickElement(passSettingTab);
        validateHelper.clickElement(eyeIcon);
        validateHelper.setText(currPass,"678&^%%9idfjdoo023pa2");
    }

    public void MyProfile_TC013(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clickElement(passSettingTab);
        validateHelper.clickElement(eyeNewIcon);
        validateHelper.setText(newPass,"678&^%%9idfjdoo023pa");
    }

    public void MyProfile_TC014(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clickElement(passSettingTab);
        validateHelper.clickElement(eyeNewIcon);
        validateHelper.setText(newPass,"678&^%%9idfjdoo023pa");
        validateHelper.clearText(newPass);
        validateHelper.delay(2);
    }

    public void MyProfile_TC015(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clickElement(passSettingTab);
        validateHelper.clickElement(eyeNewIcon);
        validateHelper.setText(newPass,"678&^%%9idfjdoo023pa2");
        validateHelper.delay(2);
    }

    public void MyProfile_TC016(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clickElement(passSettingTab);
        validateHelper.clickElement(eyeConfIcon);
        validateHelper.setText(currPass,"678&^%%9idfjdoo023pa");
        validateHelper.setText(newPass,"678&^%%9idfjdoo023pa");
        validateHelper.setText(confPass,"678&^%%9idfjdoo023pa");
    }

    public void MyProfile_TC017(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clickElement(passSettingTab);
        validateHelper.clickElement(eyeConfIcon);
        validateHelper.setText(currPass,"678&^%%9idfjdoo023pa");
        validateHelper.setText(newPass,"678&^%%9idfjdoo023pa");
        validateHelper.setText(confPass,"678&^%%9idfjdoo023pa");
        validateHelper.clearText(confPass);
    }

    public void MyProfile_TC018(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clickElement(passSettingTab);
        validateHelper.clickElement(eyeConfIcon);
        validateHelper.setText(currPass,"678&^%%9idfjdoo023pa");
        validateHelper.setText(newPass,"678&^%%9idfjdoo023pa");
        validateHelper.setText(confPass,"678&^%%9idfjdoo023pa2");
    }

    public void MyProfile_TC019(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clickElement(passSettingTab);
        validateHelper.clickElement(eyeConfIcon);
        validateHelper.setText(currPass,"Testing123@");
        validateHelper.setText(newPass,"123");
        validateHelper.clickElement(cancelBt);
    }

    public void MyProfile_TC020(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clearText(fistNameText);
        validateHelper.setText(fistNameText,"Tom");
        validateHelper.clearText(lastNameText);
        validateHelper.setText(lastNameText,"Nguyen");
        validateHelper.clearText(phoneNumText);
        validateHelper.setText(phoneNumText,"0909789789");
        validateHelper.clearText(emailbox);
        validateHelper.setText(emailbox,"nguyentrungdtu@gmail.com");
        validateHelper.clearText(address2);
        validateHelper.setText(address2,"222 Phu Nhuan");
        validateHelper.movetoElement(updateBt);
        validateHelper.clickElement(updateBt);
        validateHelper.delay(2);
    }

    public void MyProfile_TC021(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clearText(fistNameText);
    }

    public void MyProfile_TC022(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clearText(fistNameText);
        validateHelper.setText(fistNameText,"Tuyết Anh Tuyết Anh Tuyết Anh Tuyết Anh Tuyết Anh A");
    }

    public void MyProfile_TC023(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clearText(lastNameText);
    }

    public void MyProfile_TC024(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clearText(lastNameText);
        validateHelper.setText(lastNameText,"Nguyễn Nguyễn Nguyễn Nguyễn Nguyễn Nguyễn Nguyễn Ng");
    }

    public void MyProfile_TC025(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clearText(phoneNumText);
    }

    public void MyProfile_TC026(String phone){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clearText(phoneNumText);
        validateHelper.setText(phoneNumText,phone);
    }

    public void MyProfile_TC027(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clearText(phoneNumText);
        validateHelper.setText(phoneNumText,"098382766365468823798");
    }

    public void MyProfile_TC028(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clearText(emailbox);
    }

    public void MyProfile_TC029(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clearText(emailbox);
        validateHelper.setText(emailbox,"nttuyetanh091nttuyetanh091nttuyetanh091nt@gmail.com");
    }

    public void MyProfile_TC030(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clearText(emailbox);
        validateHelper.setText(emailbox,"nttuyetanh091.com");
    }

    public void MyProfile_TC031(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clearText(address1);
        validateHelper.setText(address1,"222 Cần Thơ 222 Cần Thơ 222 CTh");
    }

    public void MyProfile_TC032(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clearText(address2);
        validateHelper.setText(address2,"Thành phố Hồ Chí Minh");
    }

    public void MyProfile_TC033(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clearText(nrmaNo);
        validateHelper.setText(nrmaNo,"51AC999951AC999951AC9999");
    }

    public void MyProfile_TC034(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.clickElement(viewProfile);
        validateHelper.clickElement(passSettingTab);
        validateHelper.setText(currPass,"abc");
        validateHelper.setText(newPass,"234");
        validateHelper.setText(confPass,"234");
        validateHelper.clickElement(updateBt);
        validateHelper.clickElement(closeAlert);
        validateHelper.delay(2);
    }

    public void MyProfile_TC035(){
        LoginPage();
        validateHelper.clickElement(userLogin);
        validateHelper.delay(2);
        validateHelper.clickElement(viewProfile);
        validateHelper.clickElement(passSettingTab);
        validateHelper.setText(currPass,"abc");
        validateHelper.setText(newPass,"567");
        validateHelper.setText(confPass,"234");
        validateHelper.clickElement(updateBt);
        validateHelper.clickElement(closeAlert);
        validateHelper.delay(2);
    }

    public String VerifyConPassNotMatched(){
        String mess = validateHelper.checkText(ConfPassNot);
        return mess;
    }


    public String VerifyCurrPassAlert(){
        String mess = validateHelper.checkText(curPassAlert);
        return mess;
    }

    public String VerifyNRMAEXMess(){
        String mess = validateHelper.checkText(nrmaMemberEX);
        return mess;
    }

    public String VerifyAddress2EXMess(){
        String mess = validateHelper.checkText(address2EX);
        return mess;
    }

    public String VerifyAddress1EXMess(){
        String mess = validateHelper.checkText(address1EX);
        return mess;
    }

    public String VerifyMailNotiMess(){
        String mess = validateHelper.checkText(mailNotiMess);
        return mess;
    }

    public String VerifyMailboxEX(){
        String mess = validateHelper.checkText(mailboxEX);
        return mess;
    }

    public String VerifyMailboxReqMess(){
        String mess = validateHelper.checkText(mailReqMess);
        return mess;
    }

    public String VerifyPhoneEXMess(){
        String mess = validateHelper.checkText(phoneEX);
        return mess;
    }

    public String VerifyPhoneNotiMess(){
        String mess = validateHelper.checkText(phoneNotiMess);
        return mess;
    }

    public String VerifyPhoneReqMess(){
        String mess = validateHelper.checkText(phoneReqMess);
        return mess;
    }

    public String VerifyLastNameEXMess(){
        String mess = validateHelper.checkText(lastNameEX);
        return mess;
    }
    public String VerifyLastNameReqMess(){
        String mess = validateHelper.checkText(lastNameReqMess);
        return mess;
    }

    public String VerifyFirstNameEXMess(){
        String mess = validateHelper.checkText(firstNameEX);
        return mess;
    }
    public String VerifyFirstNameReqMess(){
        String mess = validateHelper.checkText(firstNameReqMess);
        return mess;
    }
    public String VerifyUpdateNoti(){
        String noti = validateHelper.checkText(updateNoti);
        System.out.println(noti);
        return noti;
    }

    public String VerifyConfMess(){
        String mess = validateHelper.checkText(confMess);
        return mess;
    }

    public String VerifyConfPassExceedMess(){
        String mess = validateHelper.checkText(confPassEX);
        return mess;
    }

    public String VerifyConfPassReqMess(){
        String mess = validateHelper.checkText(confPassMess);
        return mess;
    }

    public String VerifyConfPassInput(){
        String conPa = validateHelper.getAttribute(confPass);
        System.out.println(conPa);
        return conPa;
    }

    public String VerifyNewPassExceedMess(){
        String mess = validateHelper.checkText(newPassEX);
        return mess;
    }

    public String VerifyNewPassReqMess(){
        String mess = validateHelper.checkText(newPassMess);
        return mess;
    }

    public String VerifyNewPassInput(){
        String newPa = validateHelper.getAttribute(newPass);
        System.out.println(newPa);
        return newPa;
    }
    public String VerifyCurrPassExceedMess(){
        String mess = validateHelper.checkText(currPassEx);
        return mess;
    }

    public String VerifyCurrPassReqMess(){
        String mess = validateHelper.checkText(currPassMess);
        return mess;
    }
    public String VerifyCurrPassInput(){
        String currPa = validateHelper.getAttribute(currPass);
        System.out.println(currPa);
        return currPa;
    }

    public String VerifyVehicleHeader(){
        String vehicle = validateHelper.checkText(confVehicleTitle);
        return vehicle;
    }

    public String VerifyConfirmTitle(){
        String conf = validateHelper.checkText(confirmTitle);
        return conf;
    }

    public String VerifySuburbResult(){
        String sub = validateHelper.checkText(subValue);
        return sub;
    }

    public String VerifyPostCodeResult(){
        String pos = validateHelper.checkText(postCode);
        return pos;
    }

    public boolean VerifyPostalAddStatus(){
        boolean post = validateHelper.enableElement(postalAdd);
        return post;
    }

    public boolean VerifyAddressLine2Status(){
        boolean add2 = validateHelper.enableElement(address2);
        return add2;
    }

    public boolean VerifyAddressLine1Status(){
        boolean add1 = validateHelper.enableElement(address1);
        return add1;
    }

    public boolean VerifyNRMANoStatus(){
        boolean nrma = validateHelper.enableElement(nrmaNo);
        return nrma;
    }

    public String VerifyPassSetHeader(){
        String passSet = validateHelper.checkText(passSetHeader);
        return passSet;
    }

    public boolean VerifyFirstNameStatus(){
        boolean firstName = validateHelper.enableElement(fistNameText);
        return firstName;
    }

    public boolean VerifyLastNameStatus(){
        boolean lastName = validateHelper.enableElement(lastNameText);
        return lastName;
    }

    public boolean VerifyPhoneNumStatus(){
        boolean phoneNum = validateHelper.enableElement(phoneNumText);
        return phoneNum;
    }

    public boolean VerifyEmailStatus(){
        boolean email = validateHelper.enableElement(emailbox);
        return email;
    }

    public String VerifyUpComingTitle(){
        String upcom = validateHelper.checkText(upComingTitle);
        return upcom;
    }

    public String VerifyVehicleTitle(){
        String vehicle = validateHelper.checkText(vehicleTitle);
        return vehicle;
    }

    public String VerifyTotalBookTitle(){
        String total = validateHelper.checkText(totalBookTitle);
        return total;
    }

    public String VerifyContactDetailHeader(){
        String contact = validateHelper.checkText(contactDetailHeader);
        return contact;
    }

    public String VerifyMyVehicleHeader(){
        String myVehicle = validateHelper.checkText(myVehicleHeader);
        return myVehicle;
    }

    public String VerifyMyBookingsHeader(){
        String myBooking = validateHelper.checkText(myBookingHeader);
        return myBooking;
    }

    public void LoginPage(){
        validateHelper.clickElement(userIcon);
        validateHelper.setText(emailText,"nguyentrungdtu@gmail.com");
        validateHelper.setText(passwordText,"Testing123@");
        validateHelper.clickElement(loginBt);
        validateHelper.waitForPageLoaded();
    }


}

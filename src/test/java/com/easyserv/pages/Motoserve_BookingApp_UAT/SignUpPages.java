package com.easyserv.pages.Motoserve_BookingApp_UAT;

import com.easyserv.common.ValidateHelper;
import net.datafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Locale;

public class SignUpPages {
    private WebDriver driver;
    private ValidateHelper validateHelper;
    Faker faker = new Faker(new Locale("AUS"));
    String first_Name = faker.name().firstName();
    String last_Name = faker.name().lastName();
    String pass_ = faker.internet().password();
    String phone_ = "03"+ faker.phoneNumber().subscriberNumber(8);
    String name_ = faker.name().firstName();
    String emailAdd_ = name_.toLowerCase() +"@gmail.com";

    private By loginIcon= By.xpath("//*[name()='path' and contains(@d,'M20.1212 1')]");
    private By signUpLink = By.xpath("//a[contains(text(),'Sign Up')]");
    private By signupHeader = By.xpath("//span[contains(text(),'Sign Up TO Motorserve')]");
    private By firstName = By.xpath("//input[@id='firstName']");
    private By lastName = By.xpath("//input[@id='lastName']");
    private By email = By.xpath("//input[@id='email']");
    private By password = By.xpath("//input[@id='password']");
    private By eyeIcon = By.xpath("//span[@aria-label='eye-invisible']//*[name()='svg']");
    private By phone = By.xpath("//input[@id='phoneNumber']");
    private By signUpBt = By.xpath("//button[@type='submit']");
    private By policyLink = By.xpath("//a[@class='ant-typography policy-link']");
    private By policyHeader = By.xpath("//h1[contains(text(),'Motorserve Privacy Policy')]");
    private By SignIn = By.xpath("//span[contains(text(),'Sign in')]");
    private By googleIcon = By.xpath("//div[@class='S9gUrf-YoZ4jf']");
    private By faceHeader = By.xpath("//h2[@id='homelink']");
    private By facebookIcon = By.xpath("//a[@class='login-facebook-button-class metro']");
    private By loginLink = By.xpath("//a[contains(text(),'Log in')]");
    private By loginAccount = By.xpath("//span[contains(text(),'Login To Your Account')]");
    private By backButton = By.xpath("//span[contains(text(),'Back')]");
    private By fistNameEX = By.xpath("//div[contains(text(),'Your First Name must not exceed 50 characters.')]");
    private By lastNameEX = By.xpath("//div[contains(text(),'Your Last Name must not exceed 50 characters.')]");
    private By emailEX = By.xpath("//div[contains(text(),'The Email field must be a valid email')]");
    private By phoneEX = By.xpath("//div[contains(text(),'Please add valid Phone Number.')]");
    private By firstNameReqMess = By.xpath("//div[contains(text(),'Your First name is required')]");
    private By lastNameReqMess = By.xpath("//div[contains(text(),'Your Last name is required')]");
    private By emailReqMess = By.xpath("//div[contains(text(),'Your Email is required')]");
    private By phoneReqMess = By.xpath("//div[contains(text(),'The password field is required')]");
    private By emailExistNoti = By.xpath("//div[@class='ant-notification-notice-message']");
    private By passLongerMess = By.xpath("//div[contains(text(),'The password must be longer than or equal to 6 cha')]");

    public SignUpPages(WebDriver driver){
        this.driver= driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void LinkTC(){
        validateHelper.LinkTC("https://siliconstackcomau.sharepoint.com/:x:/r/sites/EasyServ/_layouts/15/Doc.aspx?sourcedoc=%7BD338C038-6278-41D4-99D8-7542A84F7FFE%7D&file=Test%20Case%20Sign%20Up.xlsx&action=default&mobileredirect=true");
    }

    public void SignUp_TC001(){
        LinkTC();
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(signUpLink);
    }

    public void SignUp_TC002(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(signUpLink);
        Assert.assertTrue(VerifyStatusFirstNameText());
        validateHelper.setText(firstName,"Tom123@");
    }

    public void SignUp_TC003(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(signUpLink);
        Assert.assertTrue(VerifyStatusLastNameText());
        validateHelper.setText(lastName,"Nguyễn-22&");
    }

    public void SignUp_TC004(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(signUpLink);
        Assert.assertTrue(VerifyStatusEmailText());
        validateHelper.setText(email,"tomnguyen@gmail.com");
    }

    public void SignUp_TC005(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(signUpLink);
        Assert.assertTrue(VerifyStatusPasswordText());
        validateHelper.setText(password,"123*0#");
    }

    public void SignUp_TC006(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(signUpLink);
        Assert.assertTrue(VerifyStatusPhoneText());
        validateHelper.setText(phone,"0652abc%$#");
    }

    public void SignUp_TC007(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(signUpLink);
        validateHelper.clickElement(eyeIcon);
        validateHelper.setText(password,"Testing123@");
    }

    public void SignUp_TC008(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(signUpLink);
        validateHelper.clickElement(policyLink);
        validateHelper.SwitchBrowser();
        Assert.assertEquals(VerifyPolicyHeader(),"MOTORSERVE PRIVACY POLICY");
        driver.close();
        validateHelper.SwitchBrowser0();
    }

    public void SignUp_TC009(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(signUpLink);
        validateHelper.clickElement(googleIcon);
        validateHelper.SwitchBrowser();
        validateHelper.delay(2);
        Assert.assertEquals(VerifySignInHeader(), "Sign in");
        //driver.close();
        //validateHelper.SwitchBrowser0();
    }

    public void SignUp_TC010(){
        driver.close();
        validateHelper.SwitchBrowser0();
        validateHelper.SetURL("https://motorserve-booking.siliconstack.com.au/");
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(signUpLink);
        validateHelper.clickElement(facebookIcon);
        validateHelper.SwitchBrowser();
        validateHelper.delay(2);
        Assert.assertEquals(VerifyFacebookHeader(), "Facebook");
    }

    public void SignUp_TC011(){
        driver.close();
        validateHelper.SwitchBrowser0();
        validateHelper.SetURL("https://motorserve-booking.siliconstack.com.au/");
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(signUpLink);
        validateHelper.clickElement(loginLink);
        validateHelper.delay(2);
    }

    public void SignUp_TC012(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(signUpLink);
        validateHelper.clickElement(backButton);
    }

    public void SignUp_TC013(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(signUpLink);
        validateHelper.setText(firstName,first_Name);
        validateHelper.setText(lastName,last_Name);
        validateHelper.setText(email,emailAdd_);
        validateHelper.setText(password,pass_);
        validateHelper.setText(phone,phone_);
        validateHelper.clickElement(signUpBt);
    }

    public void SignUp_TC014(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(signUpLink);
        validateHelper.setText(firstName,"Tuyet Anh Tuyet Anh Tuyet Anh Tuyet Anh Tuyet Anh Tuyet Anh");
        Assert.assertEquals(VerifyFirstNameEXMess(),"Your First Name must not exceed 50 characters.");
        validateHelper.setText(lastName,"Nguyễn Nguyễn Nguyễn Nguyễn Nguyễn Nguyễn Nguyễn Nguyễn");
        Assert.assertEquals(VerifyLastNameEXMess(),"Your Last Name must not exceed 50 characters.");
        validateHelper.setText(email,"anh@gmail");
        Assert.assertEquals(VerifyEmailMess(),"The Email field must be a valid email");
        validateHelper.setText(phone,"123abc&^%a");
        Assert.assertEquals(VerifyPhoneMess(),"Please add valid Phone Number.");
    }

    public void SignUp_TC015(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(signUpLink);
        validateHelper.setText(firstName,"Tom");
        validateHelper.clearText(firstName);
        Assert.assertEquals(VerifyFirstNameReqMess(),"Your First name is required");
        validateHelper.setText(lastName,"Nguyen");
        validateHelper.clearText(lastName);
        Assert.assertEquals(VerifyLastNameReqMess(),"Your Last name is required");
        validateHelper.setText(email,"tomnguyen@gmail.com");
        validateHelper.clearText(email);
        Assert.assertEquals(VerifyEmailReqMess(),"Your Email is required");
        validateHelper.setText(password,"123456");
        validateHelper.clearText(password);
        Assert.assertEquals(VerifyPhoneReqMess(),"The password field is required");
    }

    public void SignUp_TC016(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(signUpLink);
        validateHelper.setText(firstName,"Tom");
        validateHelper.setText(lastName,"Nguyen");
        validateHelper.setText(email,"nguyentrungdtu@gmail.com");
        validateHelper.setText(password,"123456");
        validateHelper.clickElement(signUpBt);
        validateHelper.delay(2);
    }

    public void SignUp_TC017(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(signUpLink);
        validateHelper.setText(firstName,"Tom");
        validateHelper.setText(lastName,"Nguyen");
        validateHelper.setText(email,"nguyentrungdtu@gmail.com");
        validateHelper.setText(password,"1234");
    }

    public void SignUp_TC018(){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(signUpLink);
        validateHelper.setText(firstName,"Tom");
        validateHelper.setText(lastName,"Nguyen");
        validateHelper.setText(email,"nguyentrungdtu@gmail.com");
        validateHelper.clickElement(eyeIcon);
        validateHelper.setText(password,"12345678987654321234zzzz");
    }

    public void SignUp_TC019(String phoneNum){
        validateHelper.clickElement(loginIcon);
        validateHelper.clickElement(signUpLink);
        validateHelper.movetoElement(phone);
        validateHelper.setText(phone,phoneNum);
    }

    public String getValuePassword(){
        String value = validateHelper.getAttribute(password);
        return value;
    }
    public String VerifyPassLongerMess(){
        String mess = validateHelper.checkText(passLongerMess);
        return mess;
    }

    public String VerifyEmailNoti(){
        String noti = validateHelper.checkText(emailExistNoti);
        return noti;
    }
    public String VerifyPhoneReqMess(){
        String mess = validateHelper.checkText(phoneReqMess);
        return mess;
    }

    public String VerifyEmailReqMess(){
        String mess = validateHelper.checkText(emailReqMess);
        return mess;
    }

    public String VerifyLastNameReqMess(){
        String mess = validateHelper.checkText(lastNameReqMess);
        return mess;
    }

    public String VerifyFirstNameReqMess(){
        String mess = validateHelper.checkText(firstNameReqMess);
        return mess;
    }

    public String VerifyPhoneMess(){
        String mess = validateHelper.checkText(phoneEX);
        return mess;
    }
    public String VerifyEmailMess(){
        String mess = validateHelper.checkText(emailEX);
        return mess;
    }

    public String VerifyLastNameEXMess(){
        String mess = validateHelper.checkText(lastNameEX);
        return mess;
    }

    public String VerifyFirstNameEXMess(){
        String mess = validateHelper.checkText(fistNameEX);
        return mess;
    }

    public String VerifyLoginAccountHeader(){
        String header = validateHelper.checkText(loginAccount);
        return header;
    }

    public String VerifyFacebookHeader(){
        String header = validateHelper.checkText(faceHeader);
        return header;
    }
    public String VerifySignInHeader(){
        String header = validateHelper.checkText(SignIn);
        return header;
    }

    public String VerifyPolicyHeader(){
        String header = validateHelper.checkText(policyHeader);
        return header;
    }

    public String GetPassValue(){
        String pass = validateHelper.getAttribute(password);
        return pass;
    }

    public boolean VerifyStatusPhoneText(){
        boolean status = validateHelper.enableElement(phone);
        return status;
    }

    public String VerifySignUpHeader(){
        String header = validateHelper.checkText(signupHeader);
        return header;
    }

    public boolean VerifyStatusFirstNameText(){
        boolean status = validateHelper.enableElement(firstName);
        return status;
    }

    public boolean VerifyStatusLastNameText(){
        boolean status = validateHelper.enableElement(lastName);
        return status;
    }

    public boolean VerifyStatusEmailText(){
        boolean status = validateHelper.enableElement(email);
        return status;
    }

    public boolean VerifyStatusPasswordText(){
        boolean status = validateHelper.enableElement(password);
        return status;
    }

}

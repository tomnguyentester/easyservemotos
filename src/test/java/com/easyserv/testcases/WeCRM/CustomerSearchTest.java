package com.easyserv.testcases.WeCRM;

import com.easyserv.common.BaseSetup;
import com.easyserv.pages.Motoserve_BookingApp_UAT.SignUpPages;
import com.easyserv.pages.WeCRMPages.CustomerSearchPages;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;

public class CustomerSearchTest extends BaseSetup {
    private WebDriver driver;
    private CustomerSearchPages customerSearchPages;

    @BeforeClass
    public void setup(){
        driver = getDriver();
        customerSearchPages = new CustomerSearchPages(driver);

    }

    @Test(priority = 1, description = "Verify that the all customers list is displayed when the user click search button on the customer page")
    public void CustomerSearchTest_TC001() {
        customerSearchPages.CusSearch_TC001();
        Assert.assertEquals(customerSearchPages.VerifyCustomerCol(),"Customer");
        Assert.assertEquals(customerSearchPages.VerifyDMSCol(),"DMS ID");
    }

    @Test(priority = 2, description = "Verify that the system will return correct data when user search by Name on the customer page")
    public void CustomerSearchTest_TC002() {
        customerSearchPages.CusSearch_TC002();
        Assert.assertEquals(customerSearchPages.VerifyCustomerResult(),"Allan Cox");
    }

    @Test(priority = 3, description = "Verify that the system will return correct data when user search by Email on the customer page")
    public void CustomerSearchTest_TC003() {
        customerSearchPages.CusSearch_TC003();
        Assert.assertEquals(customerSearchPages.VerifyEmailResult(),"Hitech Automotive Centre");
    }

    @Test(priority = 4, description = "Verify that the system will return correct data when user search by Phone on the customer page")
    public void CustomerSearchTest_TC004() {
        customerSearchPages.CusSearch_TC004();
        Assert.assertEquals(customerSearchPages.VerifyPhoneResult(),"Fadz Automotive");
    }

    @Test(priority = 5, description = "Verify that the system will return correct data when user search by DMS ID on the customer page")
    public void CustomerSearchTest_TC005() {
        customerSearchPages.CusSearch_TC005();
        Assert.assertEquals(customerSearchPages.VerifyDMSResult(),"Sydney City Volkswagen");
    }

    @Test(priority = 6, description = "Verify that the system will return correct data when user search by VIN on the customer page")
    public void CustomerSearchTest_TC006() {
        customerSearchPages.CusSearch_TC006();
        Assert.assertEquals(customerSearchPages.VerifyVINResult(),"Raymond Kong");
    }
}

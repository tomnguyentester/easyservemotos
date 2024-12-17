package com.easyserv.testcases.Motoserve;

import com.easyserv.common.BaseSetup;
import com.easyserv.pages.Motoserve_BookingApp_UAT.LogOutPages;
import com.easyserv.pages.Motoserve_BookingApp_UAT.MyProfilePages;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogOutTest extends BaseSetup {
    private WebDriver driver;
    private LogOutPages logOutPages;

    @BeforeClass
    public void setup(){
        driver = getDriver();
        logOutPages = new LogOutPages(driver);
    }

    @Test(priority = 1, description = "Verify UI of \"Log Out\" as the same Requirement _001")
    public void LogOutTest_TC001() {
        logOutPages.LogOut_TC001();
        Assert.assertEquals(logOutPages.VerifyLogOutOption(),"Log out");
    }

    @Test(priority = 2, description = "Verify user is not in the booking process and click Log Out _002")
    public void LogOutTest_TC002() {
        logOutPages.LogOut_TC002();
        Assert.assertEquals(logOutPages.VerifyLoginHeader(),"LOGIN TO YOUR ACCOUNT");
    }

    @Test(priority = 3, description = "Verify user in a booking progress and click [YES] option when log out _003")
    public void LogOutTest_TC003() {
        logOutPages.LogOut_TC003();
        Assert.assertEquals(logOutPages.VerifyLoginHeader(),"LOGIN TO YOUR ACCOUNT");
    }

    @Test(priority = 4, description = "Verify user go to Home Page after login success _004")
    public void LogOutTest_TC004() {
        logOutPages.LogOut_TC004();
        Assert.assertEquals(logOutPages.VerifyVehicleHeader(),"SELECT YOUR VEHICLE");
    }

    @Test(priority = 5, description = "Verify user in a booking progress and click [NO] option when log out _005")
    public void LogOutTest_TC005() {
        logOutPages.LogOut_TC005();
        Assert.assertEquals(logOutPages.VerifySelectServiceHeader(),"SELECT YOUR SERVICES");
    }
}

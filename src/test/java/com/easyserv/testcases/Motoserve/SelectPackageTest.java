package com.easyserv.testcases.Motoserve;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.pages.EasyservEnginePages.LoginEnginePage;
import com.easyserv.pages.Motoserve_BookingApp_UAT.SelectPackagePages;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectPackageTest extends BaseSetup {
    private WebDriver driver;
    private SelectPackagePages selectPackagePages;

    @BeforeClass
    public void setup(){
        driver = getDriver();
        selectPackagePages = new SelectPackagePages(driver);
    }

    @Test(priority = 1, description = "Verify UI of Booking Select packages categories as the same requirement  _001")
    public void SelectPackagePages_TC001() {
        selectPackagePages.LinkTC();
        Assert.assertEquals(selectPackagePages.VerifyBookingHeader(),"BOOK A SERVICE");
        selectPackagePages.SelectPackagePages_TC001();
    }

    @Test(priority = 2, description = "Verify user can click on \"Back\" icon on \"Services\" screen  _002")
    public void SelectPackagePages_TC002() {
        selectPackagePages.SelectPackagePages_TC002();
    }

    @Test(priority = 3, description = "Verify user can click the [+] button  _003")
    public void SelectPackagePages_TC003() {
        selectPackagePages.SelectPackagePages_TC003();
        Assert.assertEquals(selectPackagePages.VerifyRepairsType(),"Repairs");
        Assert.assertEquals(selectPackagePages.VerifyInspecType(),"Inspections");
        Assert.assertEquals(selectPackagePages.VerifyOtherType(),"Others");
    }

    @Test(priority = 4, description = "Verify user select a type of service on \"step2. Services\" screen  _004")
    public void SelectPackagePages_TC004_1() {
        selectPackagePages.SelectPackagePages_TC004_1();
        Assert.assertEquals(selectPackagePages.VerifyServiceTitle(),"Service");
    }

    @Test(priority = 5, description = "Verify user select a type of service on \"step2. Services\" screen  _004")
    public void SelectPackagePages_TC004_2() {
        selectPackagePages.SelectPackagePages_TC004_2();
        Assert.assertEquals(selectPackagePages.VerifyRepairTitle(),"Repairs");
    }

    @Test(priority = 6, description = "Verify user select a type of service on \"step2. Services\" screen  _004")
    public void SelectPackagePages_TC004_3() {
        selectPackagePages.SelectPackagePages_TC004_3();
        Assert.assertEquals(selectPackagePages.VerifyInspecTitle(),"Inspections");
    }

    @Test(priority = 7, description = "Verify user select a type of service on \"step2. Services\" screen  _004")
    public void SelectPackagePages_TC004_4() {
        selectPackagePages.SelectPackagePages_TC004_4();
        Assert.assertEquals(selectPackagePages.VerifyOtherTitle(),"Others");
    }

    @Test(priority = 8, description = "Verify user can enter free-text on <Notes> textbox on \"Services\" screen  _005")
    public void SelectPackagePages_TC005() {
        selectPackagePages.SelectPackagePages_TC005();
        Assert.assertEquals(selectPackagePages.NoteText(),"Hi, %^$986");
    }

    @Test(priority = 9, description = "Verify system enabled <CHOOSE AND PROCEED> button when user select least 1 service on package service on \"Services\" screen  _006")
    public void SelectPackagePages_TC006() {
        selectPackagePages.SelectPackagePages_TC006();
    }

    @Test(priority = 10, description = "Verify user can click on the [-] icon at the top right cornner of a package category on \"Services\" screen  _007_1")
    public void SelectPackagePages_TC007_1() {
        selectPackagePages.SelectPackagePages_TC007_1();
    }

    @Test(priority = 11, description = "Verify user can click on the [-] icon at the top right cornner of a package category on \"Services\" screen  _007_2")
    public void SelectPackagePages_TC007_2() {
        selectPackagePages.SelectPackagePages_TC007_2();
    }

    @Test(priority = 12, description = "Verify user can click on the [-] icon at the top right cornner of a package category on \"Services\" screen  _007_3")
    public void SelectPackagePages_TC007_3() {
        selectPackagePages.SelectPackagePages_TC007_3();
    }

    @Test(priority = 13, description = "Verify user can click on the [-] icon at the top right cornner of a package category on \"Services\" screen  _007_4")
    public void SelectPackagePages_TC007_4() {
        selectPackagePages.SelectPackagePages_TC007_4();
    }

    @Test(priority = 14, description = "Verify user can removed all user categories selection by using the [-] icon at the top right corner on \"Services\" screen  _008")
    public void SelectPackagePages_TC008() {
        selectPackagePages.SelectPackagePages_TC008();
    }

    @Test(priority = 15, description = "Verify user can only select 1 of the 4 items belonging to SERVICE type package  _009")
    public void SelectPackagePages_TC009() {
        selectPackagePages.SelectPackagePages_TC009();
    }

    @Test(priority = 16, description = "Verify user can select multiple items at the same times by tick/un-tick method on REPAIRS type package  _010")
    public void SelectPackagePages_TC010() {
        selectPackagePages.SelectPackagePages_TC010();
    }

    @Test(priority = 17, description = "Verify user can select multiple items at the same times by tick/un-tick method on INSPECTONS type package  _011")
    public void SelectPackagePages_TC011() {
        selectPackagePages.SelectPackagePages_TC011();
    }

    @Test(priority = 18, description = "Verify user can select multiple items at the same times by tick/un-tick method on OTHERS type package   _012")
    public void SelectPackagePages_TC012() {
        selectPackagePages.SelectPackagePages_TC012();
    }

    @Test(priority = 19, description = "Verify user can click on \"Continue\" button after select item of package services _013")
    public void SelectPackagePages_TC013() {
        selectPackagePages.SelectPackagePages_TC013();
        Assert.assertEquals(selectPackagePages.VerifyAppointmentHeader(),"SELECT AN APPOINTMENT");
    }


}

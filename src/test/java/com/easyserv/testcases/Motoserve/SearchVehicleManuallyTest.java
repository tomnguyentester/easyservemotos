package com.easyserv.testcases.Motoserve;

import com.easyserv.common.BaseSetup;
import com.easyserv.pages.Motoserve_BookingApp_UAT.EnquiriesPages;
import com.easyserv.pages.Motoserve_BookingApp_UAT.SearchVehicleByRegoPages;
import com.easyserv.pages.Motoserve_BookingApp_UAT.SearchVehicleManuallyPages;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchVehicleManuallyTest extends BaseSetup {
    private WebDriver driver;
    private SearchVehicleManuallyPages searchVehicleManuallyPages;

    @BeforeClass
    public void setup(){
        driver = getDriver();
        searchVehicleManuallyPages = new SearchVehicleManuallyPages(driver);
    }

    @Test(priority = 1, description = "Verify UI of Search Vehicle Manually as the same requirement  _001")
    public void SearchVehicleManually_TC001() {
        searchVehicleManuallyPages.SearchVehicleManually_TC001();
        Assert.assertEquals(searchVehicleManuallyPages.VerifyEnterCarDetailHeader(),"PLEASE ENTER YOUR CAR DETAILS");
        Assert.assertTrue(searchVehicleManuallyPages.VerifuStatusRegisNumField());
        Assert.assertTrue(searchVehicleManuallyPages.VerifyStatusStateDrop());
        Assert.assertTrue(searchVehicleManuallyPages.VerifuStatusMakeDrop());
        Assert.assertTrue(searchVehicleManuallyPages.VerifuStatusModelDrop());
        Assert.assertEquals(searchVehicleManuallyPages.VerifySearchByRegoLink(),"Search by Rego");
        Assert.assertFalse(searchVehicleManuallyPages.VerifyStatusConfirmButton());
    }

    @Test(priority = 2, description = "Verify user can enter free-text on \"Registration Number\" textbox  _002")
    public void SearchVehicleManually_TC002() {
        searchVehicleManuallyPages.SearchVehicleManually_TC002();
    }

    @Test(priority = 3, description = "Verify user can click on \"Search By Rego\" hyperlink on \"PLEASE ENTER YOUR CAR DETAILS\" screen  _003")
    public void SearchVehicleManually_TC003() {
        searchVehicleManuallyPages.SearchVehicleManually_TC003();
        Assert.assertEquals(searchVehicleManuallyPages.VerifySelectVehicleHeader(),"SELECT YOUR VEHICLE");
    }

    @Test(priority = 4, description = "Verify system will enabled <CONFIRM AND PROCEED> once fill in all required fields on \"PLEASE ENTER YOUR CAR DETAILS\" screen  _004")
    public void SearchVehicleManually_TC004() {
        searchVehicleManuallyPages.SearchVehicleManually_TC004();
        Assert.assertEquals(searchVehicleManuallyPages.VerifyVehicleNameTitle(),"ABARTH 595");
    }

    @Test(priority = 5, description = "Verify user can input valid data on \"Registration Number\" textbox and select data from all fields on \"PLEASE ENTER YOUR CAR DETAILS\" screen  _005")
    public void SearchVehicleManually_TC005() {
        searchVehicleManuallyPages.SearchVehicleManually_TC005();
        Assert.assertEquals(searchVehicleManuallyPages.VerifyVehicleNumberIcon(),"9998");
    }

    @Test(priority = 6, description = "Verify user can't enter data on \"Registration Number\" field after remove all data on field  _006")
    public void SearchVehicleManually_TC006() {
        searchVehicleManuallyPages.SearchVehicleManually_TC006();
        Assert.assertEquals(searchVehicleManuallyPages.VerifyRegisNumberReqMess(),"The Registration Number field is required");
    }

    @Test(priority = 7, description = "Verify user can't enter 15 characters on \"Registration Number\" field  _007")
    public void SearchVehicleManually_TC007() {
        searchVehicleManuallyPages.SearchVehicleManually_TC007();
        Assert.assertEquals(searchVehicleManuallyPages.GetRegisNumValue(),"76AH7633736FNY3");
    }

    @Test(priority = 8, description = "Verify user can't enter special characters on \"Registration Number\" field  _008")
    public void SearchVehicleManually_TC008() {
        searchVehicleManuallyPages.SearchVehicleManually_TC008();
        Assert.assertEquals(searchVehicleManuallyPages.VerifyRegisSpecMess(),"Special characters or spaces are not allowed.");
    }

    @Test(priority = 9, description = "Verify user can't enter space on \"Registration Number\" field  _009")
    public void SearchVehicleManually_TC009() {
        searchVehicleManuallyPages.SearchVehicleManually_TC009();
        Assert.assertEquals(searchVehicleManuallyPages.VerifyRegisSpecMess(),"Special characters or spaces are not allowed.");
    }

    @Test(priority = 10, description = "Verify system will show a message on \"PLEASE ENTER YOUR CAR DETAILS\" screen in case user doesn't any choose Store  _010")
    public void SearchVehicleManually_TC010() {
        searchVehicleManuallyPages.SearchVehicleManually_TC010();
        Assert.assertEquals(searchVehicleManuallyPages.VerifySelectStoreMess(),"Please select a store to proceed");
    }

}

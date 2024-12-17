package com.easyserv.testcases.Motoserve;

import com.easyserv.common.BaseSetup;
import com.easyserv.pages.Motoserve_BookingApp_UAT.EnquiriesPages;
import com.easyserv.pages.Motoserve_BookingApp_UAT.SearchVehicleByRegoPages;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchVehicleByRegoTest extends BaseSetup {
    private WebDriver driver;
    private SearchVehicleByRegoPages searchVehicleByRegoPages;

    @BeforeClass
    public void setup(){
        driver = getDriver();
        searchVehicleByRegoPages = new SearchVehicleByRegoPages(driver);
    }

    @Test(priority = 1, description = "Verify UI of Search Vehicle by Rego as the same Requirement  _001")
    public void SearchVehicleRegoTest_TC001() {
        searchVehicleByRegoPages.SerchVehicleRego_TC001();
    }

    @Test(priority = 2, description = "Verify UI of Select your vehicle on Motorserve as the same Requirement  _002")
    public void SearchVehicleRegoTest_TC002() {
        searchVehicleByRegoPages.SerchVehicleRego_TC002();
        Assert.assertEquals(searchVehicleByRegoPages.VerifyConfirmVehicleHeader(),"CONFIRM YOUR VEHICLE");
        Assert.assertEquals(searchVehicleByRegoPages.VerifyVehicleTitle(),"TOYOTA LANDCRUISER 2003");
        Assert.assertEquals(searchVehicleByRegoPages.VerifyRegoNumber(),"123456");
        Assert.assertTrue(searchVehicleByRegoPages.VerifyStatusConfirmButton());
    }

    @Test(priority = 3, description = "Verify user can click on \"Add another vehicle\"  _003")
    public void SearchVehicleRegoTest_TC003() {
        searchVehicleByRegoPages.SerchVehicleRego_TC003();
    }

    @Test(priority = 4, description = "Verify user can click <Or find your car by make, model and year> hyperlink  _004")
    public void SearchVehicleRegoTest_TC004() {
        searchVehicleByRegoPages.SerchVehicleRego_TC004();
        Assert.assertEquals(searchVehicleByRegoPages.VerifyEnterCarDetailHeader(),"PLEASE ENTER YOUR CAR DETAILS");
    }

    @Test(priority = 5, description = "Verify user can enter free text on <Enter your rego> textbox  _005")
    public void SearchVehicleRegoTest_TC005() {
        searchVehicleByRegoPages.SerchVehicleRego_TC005();
        Assert.assertTrue(searchVehicleByRegoPages.VerifyStatusFindCarButton(),"Fin Car Button Not Avaible");
    }

    @Test(priority = 6, description = "Verify user can click <Search again> hyperlink with a predefined label \"That's not your car?\"  _006")
    public void SearchVehicleRegoTest_TC006() {
        searchVehicleByRegoPages.SerchVehicleRego_TC006();
        Assert.assertEquals(searchVehicleByRegoPages.VerifySelectVehicleHeader(),"SELECT YOUR VEHICLE");
    }

    @Test(priority = 7, description = "Verify user have not select any store for user's booking when click <Confirm and proceed> button  _007")
    public void SearchVehicleRegoTest_TC007() {
        searchVehicleByRegoPages.SerchVehicleRego_TC007();
        Assert.assertEquals(searchVehicleByRegoPages.VerifySelectStoreMess(),"Please select a store to proceed");
    }

    @Test(priority = 8, description = "Verify user can not choose and enter data on  <State> and <Enter your rego>  not exist on SiliconLens Application  _008")
    public void SearchVehicleRegoTest_TC008() {
        searchVehicleByRegoPages.SerchVehicleRego_TC008();
        Assert.assertEquals(searchVehicleByRegoPages.VerifyVehicleNotFoundMess(),"Vehicle Not Found");
    }

    @Test(priority = 9, description = "Verify user can not enter from data more than 15 characters on <Enter your rego>  _009")
    public void SearchVehicleRegoTest_TC009() {
        searchVehicleByRegoPages.SerchVehicleRego_TC009();
        Assert.assertEquals(searchVehicleByRegoPages.GetRegoValue(),"6632DS772883HUT");
    }

    @Test(priority = 10, description = "Verify user can not input special characters on <Enter your rego>  _010")
    public void SearchVehicleRegoTest_TC010() {
        searchVehicleByRegoPages.SerchVehicleRego_TC010();
        Assert.assertEquals(searchVehicleByRegoPages.VerifySpecialCharMess(),"Special characters or spaces are not allowed.");
    }
}

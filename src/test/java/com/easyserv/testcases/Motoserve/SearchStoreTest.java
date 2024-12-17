package com.easyserv.testcases.Motoserve;

import com.easyserv.common.BaseSetup;
import com.easyserv.pages.Motoserve_BookingApp_UAT.SearchStorePages;
import com.easyserv.pages.Motoserve_BookingApp_UAT.SearchVehicleByRegoPages;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchStoreTest extends BaseSetup {
    private WebDriver driver;
    private SearchStorePages searchStorePages;

    @BeforeClass
    public void setup(){
        driver = getDriver();
        searchStorePages = new SearchStorePages(driver);
    }

    @Test(priority = 1, description = "Verify UI of \"Search Store\" screen as the same BR  _001")
    public void SearchStoreTest_TC001() {
        searchStorePages.SearchStore_TC001();
        Assert.assertTrue(searchStorePages.VerifyStatusEnterSubText());
        Assert.assertTrue(searchStorePages.VerifyStatusUseCurrentButton());
        Assert.assertTrue(searchStorePages.VerifyStatusVewAllStoreButton());
    }

    @Test(priority = 2, description = "Verify user can click on the <View All Stores> button  _002")
    public void SearchStoreTest_TC002() {
        searchStorePages.SearchStore_TC002();
        Assert.assertTrue(searchStorePages.VerifyStatusSetMyStoreBt1());
    }

    @Test(priority = 3, description = "Verify UI of \"Change Store\" on \"Search Store\" pop-up screen as the same BR  _003")
    public void SearchStoreTest_TC003() {
        searchStorePages.SearchStore_TC003();
        Assert.assertTrue(searchStorePages.VerifyStatusGetDirection());
        Assert.assertTrue(searchStorePages.VerifyStatusCallNowButton());
        Assert.assertTrue(searchStorePages.VerifyStatusChangeStoreButton());
        Assert.assertEquals(searchStorePages.VerifyOpeningHourTitle(),"Opening Hours");
    }

    @Test(priority = 4, description = "Verify user can input free-text to textbox  \" Enter a Suburb or Postcode\" on  \"Search Store\" pop-up screen  _004")
    public void SearchStoreTest_TC004() {
        searchStorePages.SearchStore_TC004();
        Assert.assertEquals(searchStorePages.VerifyArtarmonTitle(),"ARTARMON");
    }

    @Test(priority = 5, description = "Verify user cannot input 51 characters to textbox  \" Enter a Suburb or Postcode\"   _005")
    public void SearchStoreTest_TC005() {
        searchStorePages.SearchStore_TC005();
        Assert.assertEquals(searchStorePages.VerifyValueSubText(),"Artarmonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    @Test(priority = 6, description = "Verify user can't input 0 characters to textbox  \" Enter a Suburb or Postcode\"   _006")
    public void SearchStoreTest_TC006() {
        searchStorePages.SearchStore_TC006();
        Assert.assertEquals(searchStorePages.VerifyEnterSubReqMess(),"You must enter data to search");
    }

    @Test(priority = 7, description = "Verify user can't click on <Selected> button from \"Stores Information\" row   _007")
    public void SearchStoreTest_TC007() {
        searchStorePages.SearchStore_TC007();
        Assert.assertFalse(searchStorePages.VerifyStatusSelectedButton());
    }

    @Test(priority = 8, description = "Verify user can click <Set as my Stores> button from \"Stores Information\" row   _008")
    public void SearchStoreTest_TC008() {
        searchStorePages.SearchStore_TC008();
        Assert.assertEquals(searchStorePages.VerifyArtarmonLocation(),"ARTARMON");
    }

    @Test(priority = 9, description = "Verify user can click <Back> button from \"Stores Information\" row   _009")
    public void SearchStoreTest_TC009() {
        searchStorePages.SearchStore_TC009();
    }

    @Test(priority = 14, description = "Verify user can click <Call Now> button on \"Store Information\"   _010")
    public void SearchStoreTest_TC010() {
        searchStorePages.SearchStore_TC010();
    }

    @Test(priority = 10, description = "Verify user can click <CHANGE STORE> button on \"Store Information\"   _011")
    public void SearchStoreTest_TC011() {
        searchStorePages.SearchStore_TC011();
        Assert.assertTrue(searchStorePages.VerifyStatusEnterSubText());
    }

    @Test(priority = 11, description = "Verify User can search Store via StoreName  _011")
    public void SearchStoreTest_TC012() {
        searchStorePages.SearchStore_TC012();
        searchStorePages.getListStore();
        searchStorePages.VerifySearchStore("ARTARMON");
    }

    @Test(priority = 12, description = "Verify User can search Store via PostCode  _011")
    public void SearchStoreTest_TC013() {
        searchStorePages.SearchStore_TC013();
        searchStorePages.getListStore();
        searchStorePages.VerifySearchStore("ARTARMON");
    }

    @Test(priority = 13, description = "Verify user can zoom in/zoom out the location inside the map  _014")
    public void SearchStoreTest_TC014() {
        searchStorePages.SearchStore_TC014();
    }

}

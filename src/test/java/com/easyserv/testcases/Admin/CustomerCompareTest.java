package com.easyserv.testcases.Admin;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.helpers.CaptureHelpers;
import com.easyserv.helpers.ExcelHelpers;
import com.easyserv.pages.AdminPortalPages.CustomerManagement.CustomerCompare;
import com.easyserv.pages.Motoserve_BookingApp_UAT.LoginPages;
import com.easyserv.pages.Motoserve_BookingApp_UAT.MyProfilePages;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomerCompareTest extends BaseSetup {
    private WebDriver driver;
    private CustomerCompare customerCompare;
    private ExcelHelpers excelHelpers;
    private ValidateHelper validateHelper;


    @BeforeClass
    public void setup(){
        driver = getDriver();
        customerCompare = new CustomerCompare(driver);
        excelHelpers = new ExcelHelpers();
    }

    @Test(description = "Run_Customer_File")
    public void CustomerCompare_TC001() throws Exception{
        excelHelpers.setExcelFile("resources/datatest/cust_osb.xlsx","Sheet1");
        for (int i=1;i<11;i++){
            customerCompare.CustComp_TC001(excelHelpers.getCellData("email",i));
            if (customerCompare.VerifyFirstName().equals(excelHelpers.getCellData("firstName",i))){
                excelHelpers.setCellDataPass("pass","status_firstName",i);
                //CaptureHelpers.captureScreenshot(driver, "FirstNameResult_Pass_Row" + i);
            } else {
                excelHelpers.setCellDataFail("fail","status_firstName",i);
                CaptureHelpers.captureScreenshot(driver, "FirstNameResult_Fail_Row" + i);
            } if (customerCompare.VerifyLastName().equals(excelHelpers.getCellData("lastName",i))){
                excelHelpers.setCellDataPass("pass","status_lastName",i);
                //CaptureHelpers.captureScreenshot(driver, "LastNameResult_Pass_Row" + i);
            } else {
                excelHelpers.setCellDataFail("fail","status_lastName",i);
                CaptureHelpers.captureScreenshot(driver, "LastNameResult_Fail_Row" + i);
            } if (customerCompare.VerifyPhoneNumber().equals(excelHelpers.getCellData("phoneNumber",i))){
                excelHelpers.setCellDataPass("pass","status_phoneNum",i);
                //CaptureHelpers.captureScreenshot(driver, "PhoneResult_Pass_Row" +i);
            } else {
                excelHelpers.setCellDataFail("fail","status_phoneNum",i);
                CaptureHelpers.captureScreenshot(driver, "PhoneResult_Fail_Row" +i);
            } if (customerCompare.VerifyAddress().equals(excelHelpers.getCellData("address1",i))){
                excelHelpers.setCellDataPass("pass","status_add1",i);
                //CaptureHelpers.captureScreenshot(driver, "AddResult_Pass_Row" +i);
            } else {
                excelHelpers.setCellDataFail("fail","status_add1",i);
                CaptureHelpers.captureScreenshot(driver, "AddResult_Fail_Row "+i);
            }
            customerCompare.logoutPage();
        }

    }
}

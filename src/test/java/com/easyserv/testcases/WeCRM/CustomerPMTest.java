package com.easyserv.testcases.WeCRM;

import com.easyserv.common.BaseSetup;
import com.easyserv.common.ValidateHelper;
import com.easyserv.helpers.CaptureHelpers;
import com.easyserv.helpers.ExcelHelpers;
import com.easyserv.pages.WeCRMPages.CustomerPM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class CustomerPMTest extends BaseSetup {
    private WebDriver driver;
    private CustomerPM customerPM;
    private ExcelHelpers excelHelpers;
    private ValidateHelper validateHelper;


    @BeforeClass
    public void setup() {
        driver = getDriver();
        customerPM = new CustomerPM(driver);
        excelHelpers = new ExcelHelpers();
        validateHelper = new ValidateHelper(driver);
    }


    @Test(description = "Run_Customer_PM_File")
    public void CustomerCompare() throws Exception {
        excelHelpers.setExcelFile("resources/datatest/CUST_PM_09022024_Test.xlsx", "Worksheet");
        for (int i = 1; i < 100; i++) {
            customerPM.CompareDataCus(excelHelpers.getCellData("Customer #", i));
            List<WebElement> record = driver.findElements(By.xpath("//td[@class='ant-table-column-has-actions ant-table-column-has-sorters ant-table-row-cell-break-word']//div[@class='ant-space ant-space-horizontal ant-space-align-center']"));
            if (record.isEmpty()) {
                excelHelpers.setCellDataPass("Record does not exist.", "status_firstName", i);
                customerPM.BackToCusSearch();
                continue;
            } else {
                customerPM.SelectCusDetail();
            }
            if (customerPM.VerifyFirstName().equals(excelHelpers.getCellData("First Name", i))) {
                excelHelpers.setCellDataPass("pass", "status_firstName", i);
                /* WebElement firt_name = driver.findElement(By.xpath("//body/div[@id='single-spa-application:@crm/navbar']/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/span[1]/span[1]/input[1]"));
                validateHelper.HighLightPass(firt_name);
                CaptureHelpers.captureScreenshot(driver, "FirstNameResult_Pass_Row" + i); */
            } else {
                excelHelpers.setCellDataFail("fail", "status_firstName", i);
                WebElement firt_name = driver.findElement(By.xpath("//body/div[@id='single-spa-application:@crm/navbar']/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/span[1]/span[1]/input[1]"));
                validateHelper.HighLightFail(firt_name);
                CaptureHelpers.captureScreenshot(driver, "FirstNameResult_Fail_Row" + i);
            }
            if (customerPM.VerifyLastName().equals(excelHelpers.getCellData("Last Name", i))) {
                excelHelpers.setCellDataPass("pass", "status_lastName", i);
                /*WebElement last_name = driver.findElement(By.xpath("//body/div[@id='single-spa-application:@crm/navbar']/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/span[1]/span[1]/input[1]"));
                validateHelper.HighLightPass(last_name);
                CaptureHelpers.captureScreenshot(driver, "LastNameResult_Pass_Row" + i);*/
            } else {
                excelHelpers.setCellDataFail("fail", "status_lastName", i);
                WebElement last_name = driver.findElement(By.xpath("//body/div[@id='single-spa-application:@crm/navbar']/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/span[1]/span[1]/input[1]"));
                validateHelper.HighLightFail(last_name);
                CaptureHelpers.captureScreenshot(driver, "LastNameResult_Fail_Row" + i);
            }
            if (customerPM.VerifyBusinessName().equals(excelHelpers.getCellData("Business", i))) {
                excelHelpers.setCellDataPass("pass", "status_business", i);
//                WebElement bus_name = driver.findElement(By.xpath("//div[@class='ant-col ant-col-xs-24 ant-col-md-12']//span[@class='ant-input-affix-wrapper']"));
//                validateHelper.HighLightPass(bus_name);
//                CaptureHelpers.captureScreenshot(driver, "BussResult_Pass_Row" + i);
            } else {
                excelHelpers.setCellDataFail("fail", "status_business", i);
                WebElement bus_name = driver.findElement(By.xpath("//div[@class='ant-col ant-col-xs-24 ant-col-md-12']//span[@class='ant-input-affix-wrapper']"));
                validateHelper.HighLightFail(bus_name);
                CaptureHelpers.captureScreenshot(driver, "BussResult_Fail_Row" + i);
            }
            if (customerPM.VerifyAddress1().equals(excelHelpers.getCellData("Address 1", i))) {
                excelHelpers.setCellDataPass("pass", "status_add1", i);
//                WebElement add = driver.findElement(By.xpath("//body/div[@id='single-spa-application:@crm/navbar']/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[15]/div[1]/form[1]/div[1]/div[2]/div[1]/span[1]/span[1]/input[1]"));
//                validateHelper.HighLightPass(add);
//                CaptureHelpers.captureScreenshot(driver, "AddResult_Pass_Row" + i);
            } else {
                excelHelpers.setCellDataFail("fail", "status_add1", i);
                WebElement add = driver.findElement(By.xpath("//body/div[@id='single-spa-application:@crm/navbar']/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[15]/div[1]/form[1]/div[1]/div[2]/div[1]/span[1]/span[1]/input[1]"));
                validateHelper.HighLightFail(add);
                CaptureHelpers.captureScreenshot(driver, "AddResult_Fail_Row " + i);
            }
            customerPM.BackToCusSearch();
        }
    }
}

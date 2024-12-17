package com.easyserv.pages.Motoserve_BookingApp_UAT;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.awt.*;
import java.util.List;

public class SearchStorePages {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By noStoreLink = By.xpath("//u[contains(text(),'No store currently selected')]");
    private By enterSubText = By.xpath("//input[@placeholder='Enter Suburb or Postcode']");
    private By viewStoreBt = By.xpath("//button[@class='ant-btn ant-btn-round ant-btn-default button']");
    private By useLocationBt = By.xpath("//button[@class='ant-btn ant-btn-round ant-btn-default button disabled']");
    private By searchButton = By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-lg ant-input-search-button']");
    private By setMyStoreBt1 = By.xpath("//div[@id='store-select-popup']//div[1]//div[1]//div[1]//div[2]//button[1]");
    private By changeStore = By.xpath("//button[@class='ant-btn ant-btn-round ant-btn-primary main-button btn-branding']");
    private By locationIcon = By.xpath("//span[@aria-label='environment']//*[name()='svg']");
    private By callnowBt = By.xpath("//span[normalize-space()='Call Now']");
    private By getDirecBt = By.xpath("//div[@class='ant-space ant-space-horizontal ant-space-align-center section']//div[1]");
    private By openHourBt = By.xpath("//strong[normalize-space()='Opening Hours']");
    private By Art_Store = By.xpath("//span[@class='ant-typography store-card-title']//strong[contains(text(),'ARTARMON')]");
    private By enterSubMess = By.xpath("//div[contains(text(),'You must enter data to search')]");
    private By selectedBt = By.xpath("//button[@class='ant-btn ant-btn-round ant-btn-default button']");
    private By Art_Location = By.xpath("//span[@class='ant-typography text']//strong[contains(text(),'ARTARMON')]");
    private By backButton = By.xpath("//span[@aria-label='arrow-left']//*[name()='svg']");
    private By map = By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]");



    public SearchStorePages(WebDriver driver){
        this.driver= driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void LinkTC(){
        validateHelper.LinkTC("https://siliconstackcomau.sharepoint.com/:x:/r/sites/EasyServ/_layouts/15/Doc.aspx?sourcedoc=%7BE626E1C5-2054-4A58-BEA0-EE5044B51227%7D&file=Test%20Case%20Search%20Store.xlsx&action=default&mobileredirect=true");
    }

    public void SearchStore_TC001(){
        LinkTC();
        validateHelper.clickElement(noStoreLink);
        validateHelper.delay(3);
    }

    public void SearchStore_TC002(){
        validateHelper.clickElement(noStoreLink);
        validateHelper.clickElement(viewStoreBt);
    }

    public void SearchStore_TC003(){
        validateHelper.clickElement(noStoreLink);
        validateHelper.clickElement(viewStoreBt);
        validateHelper.clickElement(setMyStoreBt1);
        validateHelper.clickElement(locationIcon);
        validateHelper.delay(2);
        validateHelper.movetoElement(changeStore);
    }

    public void SearchStore_TC004(){
        validateHelper.clickElement(noStoreLink);
        validateHelper.clickElement(viewStoreBt);
        validateHelper.setText(enterSubText,"Artar");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(2);
    }

    public void SearchStore_TC005(){
        validateHelper.clickElement(noStoreLink);
        validateHelper.clickElement(viewStoreBt);
        validateHelper.setText(enterSubText,"Artarmonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnzzz");
    }

    public void SearchStore_TC006(){
        validateHelper.clickElement(noStoreLink);
        validateHelper.clickElement(viewStoreBt);
        validateHelper.clickElement(searchButton);
    }

    public void SearchStore_TC007(){
        validateHelper.clickElement(noStoreLink);
        validateHelper.clickElement(viewStoreBt);
        validateHelper.clickElement(setMyStoreBt1);
        validateHelper.clickElement(locationIcon);
        validateHelper.delay(2);
        validateHelper.movetoElement(changeStore);
        validateHelper.clickElement(changeStore);
        validateHelper.setText(enterSubText,"1001");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
    }

    public void SearchStore_TC008(){
        validateHelper.clickElement(noStoreLink);
        validateHelper.clickElement(viewStoreBt);
        validateHelper.setText(enterSubText,"1001");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.clickElement(setMyStoreBt1);
    }

    public void SearchStore_TC009(){
        validateHelper.clickElement(noStoreLink);
        validateHelper.clickElement(viewStoreBt);
        Assert.assertTrue(VerifyStatusBackButton());
        validateHelper.clickElement(backButton);
    }

    public void SearchStore_TC010(){
        validateHelper.clickElement(noStoreLink);
        validateHelper.clickElement(viewStoreBt);
        validateHelper.setText(enterSubText,"1001");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.clickElement(setMyStoreBt1);
        validateHelper.clickElement(locationIcon);
        Assert.assertTrue(VerifyStatusCallNowButton());
        validateHelper.clickElement(callnowBt);
        validateHelper.closeAlert();
    }

    public void SearchStore_TC011(){
        validateHelper.clickElement(noStoreLink);
        validateHelper.clickElement(viewStoreBt);
        validateHelper.setText(enterSubText,"1001");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
        validateHelper.clickElement(setMyStoreBt1);
        validateHelper.clickElement(locationIcon);
        validateHelper.movetoElement(changeStore);
        validateHelper.clickElement(changeStore);
    }

    public void SearchStore_TC012(){
        validateHelper.clickElement(noStoreLink);
        validateHelper.clickElement(viewStoreBt);
        validateHelper.setText(enterSubText,"ARTARMON");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
    }

    public void SearchStore_TC013(){
        validateHelper.clickElement(noStoreLink);
        validateHelper.clickElement(viewStoreBt);
        validateHelper.setText(enterSubText,"1001");
        validateHelper.clickElement(searchButton);
        validateHelper.delay(3);
    }

    public void SearchStore_TC014(){
        validateHelper.clickElement(noStoreLink);
        validateHelper.clickElement(viewStoreBt);
        validateHelper.clickElement(setMyStoreBt1);
        validateHelper.clickElement(locationIcon);
        validateHelper.delay(2);
        Assert.assertTrue(VerifyMapDisplay());
        validateHelper.delay(2);
        validateHelper.clickElement(map);
        validateHelper.delay(2);
    }

    public boolean VerifyMapDisplay(){
        boolean mapLoc = validateHelper.isDiplayedElement(map);
        return mapLoc;
    }

    public void getListStore() {
        validateHelper.waitForPageLoaded();
        WebElement parentTable = driver.findElement(By.xpath("//div[@class='ant-space ant-space-vertical store-select-list']"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//div[@class='ant-space ant-space-vertical store-select-list']//div[@class='ant-space-item']"));
        for (int i = 1; i < rows.size(); i++) {
            WebElement rowElement = driver.findElement(By.xpath("//div[@class='ant-space ant-space-vertical store-select-list']//div[@class='ant-space-item'][" + i + "]//span"));
            System.out.println(rowElement.getText());
        }
    }

    public void VerifySearchStore(String expected){
        validateHelper.waitForPageLoaded();
        WebElement parentTable = driver.findElement(By.xpath("//div[@class='ant-space ant-space-vertical store-select-list']"));
        List<WebElement> rows = parentTable.findElements(By.xpath("//div[@class='ant-space ant-space-vertical store-select-list']//div[@class='ant-space-item']"));
        for (int i = 1; i < rows.size(); i++) {
            WebElement rowElement = driver.findElement(By.xpath("//div[@class='ant-space ant-space-vertical store-select-list']//div[@class='ant-space-item'][" + i + "]//span"));
            if (rowElement.getText().equals(expected)){
                Assert.assertTrue(rowElement.getText().equals(expected));
                System.out.println("Print Store Name : "+ rowElement.getText());
            } else {
                continue;
            }
        }
    }

    public boolean VerifyStatusBackButton(){
        boolean bt = validateHelper.enableElement(backButton);
        return bt;
    }

    public String VerifyArtarmonLocation(){
        String loca = validateHelper.checkText(Art_Location);
        return loca;
    }

    public boolean VerifyStatusSelectedButton(){
        boolean bt = validateHelper.enableElement(selectedBt);
        return bt;
    }

    public String VerifyEnterSubReqMess(){
        String mess = validateHelper.checkText(enterSubMess);
        return mess;
    }

    public String VerifyValueSubText(){
        String text = validateHelper.getAttribute(enterSubText);
        return text;
    }


    public String VerifyArtarmonTitle(){
        String title = validateHelper.checkText(Art_Store);
        return title;
    }

    public String VerifyOpeningHourTitle(){
        String title = validateHelper.checkText(openHourBt);
        return title;
    }

    public boolean VerifyStatusChangeStoreButton(){
        boolean bt = validateHelper.enableElement(changeStore);
        return bt;
    }

    public boolean VerifyStatusCallNowButton(){
        boolean bt = validateHelper.enableElement(callnowBt);
        return bt;
    }

    public boolean VerifyStatusGetDirection(){
        boolean bt = validateHelper.enableElement(getDirecBt);
        return bt;
    }

    public boolean VerifyStatusSetMyStoreBt1(){
        boolean bt = validateHelper.enableElement(setMyStoreBt1);
        return bt;
    }

    public boolean VerifyStatusEnterSubText(){
        boolean text = validateHelper.enableElement(enterSubText);
        return text;
    }

    public boolean VerifyStatusSearchButton(){
        boolean button = validateHelper.enableElement(searchButton);
        return button;
    }

    public boolean VerifyStatusUseCurrentButton(){
        boolean button = validateHelper.isDiplayedElement(useLocationBt);
        return button;
    }

    public boolean VerifyStatusVewAllStoreButton(){
        boolean button = validateHelper.enableElement(viewStoreBt);
        return button;
    }
}

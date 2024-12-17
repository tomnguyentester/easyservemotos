package com.easyserv.pages.Motoserve_BookingApp_UAT;

import com.easyserv.common.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SelectPackagePages {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private By bookserviceheader = By.xpath("//span[contains(text(),'BOOK A SERVICE')]");
    private By location = By.xpath("//div[@class='ant-space-item']//u[normalize-space()='No store currently selected'] ");
    private By vehicleTab = By.xpath("//div[contains(@class,'ant-steps-item ant-steps-item-process ant-steps-item-custom ant-steps-item-active')]//div[contains(@class,'ant-steps-item-title')]");
    private By serviceTab = By.xpath("//body/div[@id='__next']/section[@id='main-layout']/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]");
    private By appointTab = By.xpath("//body/div[@id='__next']/section[@id='main-layout']/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]");
    private By contactTab = By.xpath("//body/div[@id='__next']/section[@id='main-layout']/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[3]/div[1]");
    private By selectvehicleheader = By.xpath("//span[contains(text(),'Select your vehicle')]");
    private By regoTextbox = By.xpath("//input[@placeholder='Enter your rego']");
    private By findcarLink = By.xpath("//u[normalize-space()='Or find your car by make, model and year']");
    private By findMyCarBt = By.xpath("//span[contains(text(),'Find my car')]");
    private By confirmVehicle = By.xpath("//div[contains(text(),'TOYOTA LANDCRUISER')]");
    private By confirmButton = By.xpath("//span[contains(text(),'Confirm and Proceed')]");
    private By storeSelect = By.xpath("//u[contains(text(),'No store currently selected')]");
    private By viewstoreBt = By.xpath("//span[contains(text(),'View all stores')]");
    private By setStore = By.xpath("//span[contains(text(),'Set As My Store')]");
    private By confirmVehicleTitle = By.xpath("//span[contains(text(),'Confirm your vehicle')]");
    private By selectYourService = By.xpath("//span[contains(text(),'Select Your Services')]");
    private By ServiceGroup = By.xpath("//div[normalize-space()='Service']");
    private By RepairsGroup = By.xpath("//div[normalize-space()='Repairs']");
    private By InspecGroup = By.xpath("//div[normalize-space()='Inspections']");
    private By OtherGroup = By.xpath("//div[normalize-space()='Others']");
    private By noteText = By.xpath("//textarea[@placeholder='Leave a note here']");
    private By backButton = By.xpath("//span[contains(text(),'Back')]");
    private By addServiceBt = By.xpath("//div[contains(text(),'Add other services')]");
    private By addRepairs = By.xpath("//div[contains(text(),'Repairs')]");
    private By addInspec = By.xpath("//div[contains(text(),'Inspections')]");
    private By addOthers  = By.xpath("//div[contains(text(),'Others')]");
    private By textNote = By.xpath("//textarea[contains(text(),'Hi, %^$986')]");
    private By logbook = By.xpath("//span[contains(text(),'LOGBOOK SERVICE')]");
    private By chooseProBt = By.xpath("//span[contains(text(),'Choose and Proceed')]");
    private By excludeBt = By.xpath("//span[@aria-label='minus-circle']//*[name()='svg']");

    private By chooseButton = By.xpath("//button[@type='button']");
    private By brakeItem = By.xpath("//span[contains(text(),'Brakes')]");
    private By clutchItem = By.xpath("//span[contains(text(),'Clutch & Transmission Repair')]");
    private By esaItem = By.xpath("//span[contains(text(),'eSafety Inspection (Pink Slip)')]");
    private By comItem = By.xpath("//span[contains(text(),'Comprehensive Safety Inspection')]");
    private By childItem = By.xpath("//span[contains(text(),'Child Restraint Installation')]");
    private By winItem = By.xpath("//span[contains(text(),'Window tinting testing')]");
    private By selectAppHeader = By.xpath("//span[contains(text(),'Select An Appointment')]");


    public SelectPackagePages(WebDriver driver){
        this.driver= driver;
        validateHelper = new ValidateHelper(driver);
    }

    public void LinkTC(){
        validateHelper.LinkTC("https://siliconstackcomau.sharepoint.com/:x:/r/sites/EasyServ/_layouts/15/Doc.aspx?sourcedoc=%7BDFB267EB-1EF4-401F-A4B5-C20179085A5C%7D&file=Test%20Case%20Booking%20Select%20items%20in%20Package%20Categories%20(User%20access%20or%20User%20not%20access).xlsx&action=default&mobileredirect=true&wdsle=0");
    }

    public void SelectPackagePages_TC001() {
        validateHelper.waitForPageLoaded();
        validateHelper.setText(regoTextbox,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        Assert.assertEquals(VerifyConfirmVehicleTitle(),"CONFIRM YOUR VEHICLE");
        validateHelper.clickElement(confirmButton);
        Assert.assertEquals(VerifySelectServiceTitle(),"SELECT YOUR SERVICES");
        Assert.assertEquals(VerifyServiceTitle(),"Service");
        Assert.assertEquals(VerifyRepairTitle(),"Repairs");
        Assert.assertEquals(VerifyInspecTitle(),"Inspections");
        Assert.assertEquals(VerifyOtherTitle(),"Others");
        validateHelper.clickElement(ServiceGroup);
        validateHelper.movetoElement(noteText);
        validateHelper.setText(noteText,"Testing by tom nguyen");
    }

    public void SelectPackagePages_TC002(){
        //validateHelper.waitForPageLoaded();
        validateHelper.setText(regoTextbox,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        Assert.assertEquals(VerifyConfirmVehicleTitle(),"CONFIRM YOUR VEHICLE");
        validateHelper.clickElement(confirmButton);
        Assert.assertEquals(VerifySelectServiceTitle(),"SELECT YOUR SERVICES");
        Assert.assertEquals(VerifyServiceTitle(),"Service");
        Assert.assertEquals(VerifyRepairTitle(),"Repairs");
        Assert.assertEquals(VerifyInspecTitle(),"Inspections");
        Assert.assertEquals(VerifyOtherTitle(),"Others");
        validateHelper.clickElement(backButton);
        Assert.assertEquals(VerifyConfirmVehicleTitle(),"CONFIRM YOUR VEHICLE");
    }

    public void SelectPackagePages_TC003(){
       //validateHelper.waitForPageLoaded();
        validateHelper.setText(regoTextbox,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        validateHelper.clickElement(confirmButton);
        Assert.assertEquals(VerifySelectServiceTitle(),"SELECT YOUR SERVICES");
        validateHelper.clickElement(ServiceGroup);
        validateHelper.clickElement(addServiceBt);
        validateHelper.delay(3);
    }
    public void SelectPackagePages_TC004_1(){
        //validateHelper.waitForPageLoaded();
        validateHelper.setText(regoTextbox,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        validateHelper.clickElement(confirmButton);
        Assert.assertEquals(VerifySelectServiceTitle(),"SELECT YOUR SERVICES");
        validateHelper.clickElement(ServiceGroup);
    }

    public void SelectPackagePages_TC004_2(){
        //validateHelper.waitForPageLoaded();
        validateHelper.setText(regoTextbox,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        validateHelper.clickElement(confirmButton);
        Assert.assertEquals(VerifySelectServiceTitle(),"SELECT YOUR SERVICES");
        validateHelper.clickElement(RepairsGroup);
    }

    public void SelectPackagePages_TC004_3(){
        //validateHelper.waitForPageLoaded();
        validateHelper.setText(regoTextbox,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        validateHelper.clickElement(confirmButton);
        Assert.assertEquals(VerifySelectServiceTitle(),"SELECT YOUR SERVICES");
        validateHelper.clickElement(InspecGroup);
    }

    public void SelectPackagePages_TC004_4(){
        //validateHelper.waitForPageLoaded();
        validateHelper.setText(regoTextbox,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        validateHelper.clickElement(confirmButton);
        Assert.assertEquals(VerifySelectServiceTitle(),"SELECT YOUR SERVICES");
        validateHelper.clickElement(OtherGroup);
    }

    public void SelectPackagePages_TC005() {
        //validateHelper.waitForPageLoaded();
        validateHelper.setText(regoTextbox,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        Assert.assertEquals(VerifyConfirmVehicleTitle(),"CONFIRM YOUR VEHICLE");
        validateHelper.clickElement(confirmButton);
        Assert.assertEquals(VerifySelectServiceTitle(),"SELECT YOUR SERVICES");
        validateHelper.clickElement(ServiceGroup);
        validateHelper.movetoElement(noteText);
        validateHelper.setText(noteText,"Hi, %^$986");
    }

    public void SelectPackagePages_TC006() {
        //validateHelper.waitForPageLoaded();
        validateHelper.setText(regoTextbox,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        validateHelper.clickElement(confirmButton);
        validateHelper.clickElement(ServiceGroup);
        validateHelper.clickElement(logbook);
        validateHelper.movetoElement(chooseProBt);
        Assert.assertTrue(VerifyChooseButton());
        validateHelper.clickElement(chooseProBt);
        validateHelper.refreshPage();
    }

    public void SelectPackagePages_TC007_1() {
        validateHelper.setText(regoTextbox,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        validateHelper.clickElement(confirmButton);
        validateHelper.clickElement(ServiceGroup);
        validateHelper.clickElement(excludeBt);
        Assert.assertEquals(VerifyServiceTitle(),"Service");
    }

    public void SelectPackagePages_TC007_2() {
        //validateHelper.waitForPageLoaded();
        validateHelper.setText(regoTextbox,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        validateHelper.clickElement(confirmButton);
        validateHelper.clickElement(RepairsGroup);
        validateHelper.clickElement(excludeBt);
        Assert.assertEquals(VerifyRepairTitle(),"Repairs");
    }

    public void SelectPackagePages_TC007_3() {
        //validateHelper.waitForPageLoaded();
        validateHelper.setText(regoTextbox,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        validateHelper.clickElement(confirmButton);
        validateHelper.clickElement(InspecGroup);
        validateHelper.clickElement(excludeBt);
        Assert.assertEquals(VerifyInspecTitle(),"Inspections");
    }

    public void SelectPackagePages_TC007_4() {
        //validateHelper.waitForPageLoaded();
        validateHelper.setText(regoTextbox,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        validateHelper.clickElement(confirmButton);
        validateHelper.clickElement(OtherGroup);
        validateHelper.clickElement(excludeBt);
        Assert.assertEquals(VerifyOtherTitle(),"Others");
    }

    public void SelectPackagePages_TC008() {
        //validateHelper.waitForPageLoaded();
        validateHelper.setText(regoTextbox,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        validateHelper.clickElement(confirmButton);
        validateHelper.clickElement(ServiceGroup);
        validateHelper.clickElement(addServiceBt);
        validateHelper.clickElement(RepairsGroup);
        validateHelper.clickElement(addServiceBt);
        validateHelper.clickElement(InspecGroup);
        validateHelper.clickElement(addServiceBt);
        validateHelper.clickElement(OtherGroup);
        validateHelper.clickElement(excludeBt);
        validateHelper.clickElement(excludeBt);
        validateHelper.clickElement(excludeBt);
        validateHelper.clickElement(excludeBt);
        Assert.assertEquals(VerifyServiceTitle(),"Service");
        Assert.assertEquals(VerifyRepairTitle(),"Repairs");
        Assert.assertEquals(VerifyInspecTitle(),"Inspections");
        Assert.assertEquals(VerifyOtherTitle(),"Others");
    }

    public void SelectPackagePages_TC009() {
        //validateHelper.waitForPageLoaded();
        validateHelper.setText(regoTextbox,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        validateHelper.clickElement(confirmButton);
        validateHelper.clickElement(ServiceGroup);
        validateHelper.movetoElement(chooseButton);
        Assert.assertFalse(VerifyChooseButton(),"Choose And Proceed Button is Enable");
        validateHelper.clickElement(logbook);
        validateHelper.movetoElement(chooseProBt);
        Assert.assertTrue(VerifyChooseButton(),"Choose And Proceed Button is Disable");
    }

    public void SelectPackagePages_TC010() {
        //validateHelper.waitForPageLoaded();
        validateHelper.setText(regoTextbox,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        validateHelper.clickElement(confirmButton);
        validateHelper.clickElement(RepairsGroup);
        validateHelper.clickElement(brakeItem);
        validateHelper.movetoElement(clutchItem);
        validateHelper.clickElement(clutchItem);
        validateHelper.movetoElement(chooseProBt);
        Assert.assertTrue(VerifyChooseButton(),"Choose And Proceed Button is Disable");
        validateHelper.clickElement(brakeItem);
        validateHelper.clickElement(clutchItem);
        validateHelper.movetoElement(chooseButton);
        Assert.assertFalse(VerifyChooseButton(),"Choose And Proceed Button is Enable");
    }

    public void SelectPackagePages_TC011() {
        //validateHelper.waitForPageLoaded();
        validateHelper.setText(regoTextbox,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        validateHelper.clickElement(confirmButton);
        validateHelper.clickElement(InspecGroup);
        validateHelper.clickElement(esaItem);
        validateHelper.movetoElement(comItem);
        validateHelper.clickElement(comItem);
        validateHelper.movetoElement(chooseProBt);
        Assert.assertTrue(VerifyChooseButton(),"Choose And Proceed Button is Disable");
        validateHelper.clickElement(comItem);
        validateHelper.clickElement(esaItem);
        validateHelper.movetoElement(chooseButton);
        Assert.assertFalse(VerifyChooseButton(),"Choose And Proceed Button is Enable");
    }

    public void SelectPackagePages_TC012() {
        //validateHelper.waitForPageLoaded();
        validateHelper.setText(regoTextbox,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        validateHelper.clickElement(confirmButton);
        validateHelper.clickElement(OtherGroup);
        validateHelper.clickElement(childItem);
        validateHelper.movetoElement(winItem);
        validateHelper.clickElement(winItem);
        validateHelper.movetoElement(chooseProBt);
        Assert.assertTrue(VerifyChooseButton(),"Choose And Proceed Button is Disable");
        validateHelper.clickElement(winItem);
        validateHelper.clickElement(childItem);
        validateHelper.movetoElement(chooseButton);
        Assert.assertFalse(VerifyChooseButton(),"Choose And Proceed Button is Enable");
    }

    public void SelectPackagePages_TC013() {
        validateHelper.setText(regoTextbox,"123456");
        validateHelper.clickElement(findMyCarBt);
        validateHelper.clickElement(storeSelect);
        validateHelper.clickElement(viewstoreBt);
        validateHelper.clickElement(setStore);
        validateHelper.clickElement(confirmButton);
        validateHelper.clickElement(ServiceGroup);
        validateHelper.clickElement(logbook);
        validateHelper.clickElement(chooseProBt);
    }

    public String VerifyAppointmentHeader(){
        String app = validateHelper.checkText(selectAppHeader);
        return app;
    }


    public String VerifyBookingHeader(){
        String booktitle = validateHelper.checkText(bookserviceheader);
        return booktitle;
    }

    public String VerifyConfirmVehicleTitle(){
        String confVehicle = validateHelper.checkText(confirmVehicleTitle);
        return confVehicle;
    }

    public String VerifySelectServiceTitle(){
        String selectService = validateHelper.checkText(selectYourService);
        return selectService;
    }

    public String VerifyServiceTitle(){
        String selectTitle = validateHelper.checkText(ServiceGroup);
        return selectTitle;
    }

    public String VerifyRepairTitle(){
        String repairTitle = validateHelper.checkText(RepairsGroup);
        return repairTitle;
    }

    public String VerifyInspecTitle(){
        String inspecTitle = validateHelper.checkText(InspecGroup);
        return inspecTitle;
    }

    public String VerifyOtherTitle(){
        String otherTitle = validateHelper.checkText(OtherGroup);
        return otherTitle;
    }

    public String VerifyRepairsType(){
        String addRep = validateHelper.checkText(addRepairs);
        return addRep;
    }

    public String VerifyInspecType(){
        String addInpec = validateHelper.checkText(addInspec);
        return addInpec;
    }

    public String VerifyOtherType(){
        String addOther = validateHelper.checkText(addOthers);
        return addOther;
    }

    public String NoteText(){
        String text = validateHelper.checkText(textNote);
        return text;
    }

    public boolean VerifyChooseButton(){
        boolean chooseBt = validateHelper.enableElement(chooseButton);
        return chooseBt;
    }


}

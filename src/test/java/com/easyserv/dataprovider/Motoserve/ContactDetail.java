package com.easyserv.dataprovider.Motoserve;

import org.testng.annotations.DataProvider;

public class ContactDetail {
    @DataProvider(name = "data_ContactPhone")
    public Object[][] dataPhone() {
        return new Object[][]{
                {
                        "uydjeousyd"
                },
                {
                        "09 826 837"
                },
                {
                        "022*&%)888"
                },
                {
                        "1234567890"
                },
                {
                        "12 4@#67ab"
                },
                {
                        "12 4@#67ab 983idh% odiso"
                }
        };
    }
}

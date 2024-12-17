package com.easyserv.dataprovider.Motoserve;

import org.testng.annotations.DataProvider;

public class DataMyProfile {
    @DataProvider(name = "data_PhoneNum")
    public Object[][] dataInvalidEnquiry() {
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
                        "012345678"
                }
        };
    }
}

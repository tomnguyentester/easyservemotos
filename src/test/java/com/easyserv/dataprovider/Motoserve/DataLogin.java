package com.easyserv.dataprovider.Motoserve;

import org.testng.annotations.DataProvider;

public class DataLogin {
    @DataProvider(name = "data_Login")
    public Object[][] dataLogin() {
        return new Object[][]{
                {
                        "49","12345678"
                },
                {
                        "anh@gmail.com","1234678"
                },
                {
                        "anh@gmail.com","1"
                },
                {
                        "anh@gmail.com","Testing1233333333333"
                },
                {
                        "anh@gmail.com","Testing123333333334"
                }
        };
    }

    @DataProvider(name = "data_Login_1")
    public Object[][] dataLogin1() {
        return new Object[][]{
                {
                        "anh@gmail.com","12345678"
                },
                {
                        "anh@gmail.com","1234567890123456789012"
                },
                {
                        "anh@gmail.com","12345678@"
                },
                {
                        "anh@gmail.com","Testing1233333333333"
                }
        };
    }
}

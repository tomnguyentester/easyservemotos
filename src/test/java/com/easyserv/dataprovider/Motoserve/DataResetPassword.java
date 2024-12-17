package com.easyserv.dataprovider.Motoserve;

import org.testng.annotations.DataProvider;

public class DataResetPassword {
    @DataProvider(name = "data_ResetPass")
    public Object[][] dataValidNewPass() {
        return new Object[][]{
                {
                        "123456"
                },
                {
                        "1234567"
                },
                {
                        "123456789!@#$%gabd32"
                },
                {
                        "abc%$#123jue_+7621d"
                }
        };
    }

    @DataProvider(name = "data_ConfNewPass")
    public Object[][] dataValidConfPass() {
        return new Object[][]{
                {
                        "123456"
                },
                {
                        "1234567"
                },
                {
                        "123456789!@#$%gabd32"
                },
                {
                        "abc%$#123jue_+7621d"
                }
        };
    }
}

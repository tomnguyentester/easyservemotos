package com.easyserv.dataprovider.Motoserve;

import org.testng.annotations.DataProvider;

public class DataEnquiries {

    @DataProvider(name = "data_Enquiri")
    public Object[][] dataInvalidEnquiry() {
        return new Object[][]{
                {
                        "Tom","Nguyễn","0909789789","tom@gmail.com","Help me, please"
                },
                {
                        "Tom","Nguyễn","","tom@gmail.com","Help me, please"
                },
                {
                        "Tommmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm","Nguyễn","0909789789","tom@gmail.com","Help me, please"
                },
                {
                        "Tom","Nguyennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn","0909789789","tom@gmail.com","Help me, please"
                },
                {
                        "Tom","Nguyễn","0909789789","tom@gmail.com","Testing by Tom nguyennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
                }
        };
    }

    @DataProvider(name = "data_PhoneNumber")
    public Object[][] dataPhoneNum() {
        return new Object[][]{
                {
                        "0*#5624391"
                },
                {
                        "01 23 45 6 7"
                },
                {
                        "012abc345d"
                },
                {
                        "1234567890"
                },
                {
                        "0*# 123 0&!"
                },
                {
                        "0abc1230&!"
                },
                {
                        "1230&!78%"
                },
                {
                        "abc 5241 ab"
                },
                {
                        "123%$ 0 %"
                },
                {
                        "123s%$ 0 abc%"
                },
        };
    }

    @DataProvider(name = "data_PostCode")
    public Object[][] dataPostCode() {
        return new Object[][]{
                {
                        "2 0*"
                },
                {
                        "2*a1"
                },
                {
                        "2 *a"
                },
                {
                        "$21x"
                },
                {
                        "2 02"
                },
                {
                        "843+"
                }
        };
    }
}

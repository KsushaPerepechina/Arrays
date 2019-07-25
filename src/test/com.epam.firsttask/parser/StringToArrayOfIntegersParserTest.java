package com.epam.firsttask.parser;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringToArrayOfIntegersParserTest {
    private StringToArrayOfIntegersParser stringToArrayOfIntegersParser;

    @BeforeClass
    public void setUp(){
        stringToArrayOfIntegersParser = new StringToArrayOfIntegersParser();
    }

    @DataProvider(name = "stringToArrayOfIntegersDataProvider")
    public Object[][] stringToArrayOfIntegersData(){
        return new Object[][]{
                {"34 51 18 7 96 66", new int[]{34, 51, 18, 7, 96, 66}},
                {"34  51  18  7 96 66", new int[]{34, 51, 18, 7, 96, 66}}
        };
    }

    @Test(dataProvider = "stringToArrayOfIntegersDataProvider")
    public void transformTest(String inputString, int[] outputArray){
        Assert.assertEquals(stringToArrayOfIntegersParser.transform(inputString), outputArray);
    }
}

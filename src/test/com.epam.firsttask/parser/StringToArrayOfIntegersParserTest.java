package com.epam.firsttask.parser;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StringToArrayOfIntegersParserTest {
    private StringToArrayOfIntegersParser stringToArrayOfIntegersParser;

    @BeforeClass
    public void setUp(){
        stringToArrayOfIntegersParser = new StringToArrayOfIntegersParser();
    }

    @Test
    public void transformTest(){
        String inputString = "34 51 18 7 96 66";
        int[] outputArray = {34, 51, 18, 7, 96, 66};
        Assert.assertEquals(stringToArrayOfIntegersParser.transform(inputString), outputArray);
    }
}

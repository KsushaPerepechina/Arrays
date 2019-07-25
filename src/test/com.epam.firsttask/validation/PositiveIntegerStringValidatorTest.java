package com.epam.firsttask.validation;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PositiveIntegerStringValidatorTest {
    private PositiveIntegersStringValidator positiveIntegersStringValidator;

    @BeforeClass
    public void setUp(){
        positiveIntegersStringValidator = new PositiveIntegersStringValidator();
    }

    @Test
    public void stringOfIntegersSeparatedBySpaceTest(){
        Assert.assertTrue(positiveIntegersStringValidator.isCorrect("34 51 18 7 96 66"));
    }

    @Test
    public void stringOfIntegersSeparatedByOneOrMoreSpacesTest(){
        Assert.assertTrue(positiveIntegersStringValidator.isCorrect("34  51 18 7  96 66"));
    }

    @Test
    public void stringOfIntegersSeparatedByCommaTest(){
        Assert.assertFalse(positiveIntegersStringValidator.isCorrect("34, 51, 18, 7, 96, 66"));
    }

    @Test
    public void stringOfNotOnlyIntegersTest(){
        Assert.assertFalse(positiveIntegersStringValidator.isCorrect("34 51.7 18 7 96 66"));
    }

    @Test
    public void stringOfNotOnlyNumbersTest(){
        Assert.assertFalse(positiveIntegersStringValidator.isCorrect("34 51m 18 7 96/ 66"));
    }

    @Test
    public void stringWithNegativeIntegersTest(){
        Assert.assertFalse(positiveIntegersStringValidator.isCorrect("-34 -51 18 7 96 66"));
    }
}

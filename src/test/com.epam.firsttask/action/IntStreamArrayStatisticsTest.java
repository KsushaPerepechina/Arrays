package com.epam.firsttask.action;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IntStreamArrayStatisticsTest {
    private IntStreamArrayStatistics arrayStatistics;
    private int[] arrayOfIntegers = {34, 51, 18, 7, 96, 66};

    @BeforeClass
    public void setUp(){
        arrayStatistics = new IntStreamArrayStatistics();
    }

    @Test
    public void findMinElementValueTest(){
        Assert.assertEquals(arrayStatistics.findMinElementValue(arrayOfIntegers), 7);
    }

    @Test
    public void findMaxElementValueTest(){
        Assert.assertEquals(arrayStatistics.findMaxElementValue(arrayOfIntegers), 96);
    }

    @Test
    public void findElementsSumTest(){
        Assert.assertEquals(arrayStatistics.findElementsSum(arrayOfIntegers),34 + 51 + 18 + 7 + 96 + 66);
    }

    @Test
    public void findAverageValueTest(){
        Assert.assertEquals(arrayStatistics.findAverageValue(arrayOfIntegers),(double)(34 + 51 + 18 + 7 + 96 + 66)/6);
    }
}

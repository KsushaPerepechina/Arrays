package com.epam.firsttask.creator;

import com.epam.firsttask.action.ArrayStatistics;
import com.epam.firsttask.exception.ArrayInitializationException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RandomArrayInitializerTest {
    private RandomArrayInitializer initializer;
    private int[] initializedArray;

    @BeforeClass
    public void setUp() throws ArrayInitializationException {
        initializer = new RandomArrayInitializer();
        initializedArray = initializer.execute(10, 0, 100);
    }

    @Test
    public void sizeTest(){
        Assert.assertEquals(initializedArray.length, 10);
    }

    @Test
    public void minValueTest(){
        ArrayStatistics arrayStatistics = new ArrayStatistics();
        Assert.assertTrue(arrayStatistics.findMinElementId(initializedArray) >= 0);
    }

    @Test
    public void maxValueTest(){
        ArrayStatistics arrayStatistics = new ArrayStatistics();
        Assert.assertTrue(arrayStatistics.findMaxElementId(initializedArray) <= 100);
    }
}

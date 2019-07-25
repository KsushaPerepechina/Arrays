package com.epam.firsttask.action;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArraySorterTest {
    private ArraySorter arraySorter;

    @BeforeClass
    public void setUp(){
        arraySorter = new ArraySorter();
    }

    @DataProvider(name = "sortedArrayOfIntegersProvider")
    public Object[][] createSortedArrayOfIntegersData(){
        return new Object[][]{
                {new int[]{34, 51, 18, 7, 96, 66}, new int[]{7, 18, 34, 51, 66, 96}},
                {new int[]{37, 84, 4, 72, 15, 0}, new int[]{0, 4, 15, 37, 72, 84}}
        };
    }

    @Test(dataProvider = "sortedArrayOfIntegersProvider")
    public void selectionSortTest(int[] disorderedArrayOfIntegers, int[] sortedArrayOfIntegers){
        Assert.assertEquals(arraySorter.selectionSort(disorderedArrayOfIntegers), sortedArrayOfIntegers);
    }

    @Test(dataProvider = "sortedArrayOfIntegersProvider")
    public void insertionSortTest(int[] disorderedArrayOfIntegers, int[] sortedArrayOfIntegers){
        Assert.assertEquals(arraySorter.insertionSort(disorderedArrayOfIntegers), sortedArrayOfIntegers);
    }

    @Test(dataProvider = "sortedArrayOfIntegersProvider")
    public void bubbleSortTest(int[] disorderedArrayOfIntegers, int[] sortedArrayOfIntegers){
        Assert.assertEquals(arraySorter.bubbleSort(disorderedArrayOfIntegers), sortedArrayOfIntegers);
    }
}

package com.epam.firsttask.action;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArraySorterTest {
    private ArraySorter arraySorter;
    private int[] disorderedArrayOfIntegers = {34, 51, 18, 7, 96, 66};
    private int[] sortedArrayOfIntegers = {7, 18, 34, 51, 66, 96};
    private int[] arrayOfIntegers;

    @BeforeClass
    public void setUp(){
        arraySorter = new ArraySorter();
    }

    @Test
    public void bubbleSortTest(){
        arrayOfIntegers = disorderedArrayOfIntegers.clone();
        arraySorter.bubbleSort(arrayOfIntegers);
        Assert.assertEquals(arrayOfIntegers, sortedArrayOfIntegers);
    }

    @Test
    public void selectionSortTest(){
        arrayOfIntegers = disorderedArrayOfIntegers.clone();
        arraySorter.selectionSort(arrayOfIntegers);
        Assert.assertEquals(arrayOfIntegers, sortedArrayOfIntegers);
    }

    @Test
    public void insertionSortTest(){
        arrayOfIntegers = disorderedArrayOfIntegers.clone();
        arraySorter.insertionSort(arrayOfIntegers);
        Assert.assertEquals(arrayOfIntegers, sortedArrayOfIntegers);
    }
}

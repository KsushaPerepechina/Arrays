package com.epam.firsttask.action;

public class ArrayStatistics {
    public int findMinElementId(final int[] arrayOfIntegers) {
        int minElementId = 0;
        for (int i = 1; i < arrayOfIntegers.length; i++) {
            if (arrayOfIntegers[i] < arrayOfIntegers[minElementId]) {
                minElementId = i;
            }
        }
        return minElementId;
    }

    public int findMinElementValue(final int[] arrayOfIntegers) {
        return arrayOfIntegers[findMinElementId(arrayOfIntegers)];
    }

    public int findMaxElementId(final int[] arrayOfIntegers) {
        int maxElementId = 0;
        for (int i = 1; i < arrayOfIntegers.length; i++) {
            if (arrayOfIntegers[i] > arrayOfIntegers[maxElementId]) {
                maxElementId = i;
            }
        }
        return maxElementId;
    }

    public int findMaxElementValue(final int[] arrayOfIntegers) {
        return arrayOfIntegers[findMaxElementId(arrayOfIntegers)];
    }

    public int findElementsSum(final int[] arrayOfIntegers) {
        int sumOfElements = 0;
        for (int element: arrayOfIntegers) {
            sumOfElements += element;
        }
        return sumOfElements;
    }

    public double findAverageValue(final int[] arrayOfIntegers) {
        return (double) findElementsSum(arrayOfIntegers)/arrayOfIntegers.length;
    }
}

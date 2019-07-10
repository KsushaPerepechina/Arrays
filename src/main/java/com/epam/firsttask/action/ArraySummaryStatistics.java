package com.epam.firsttask.action;

public class ArraySummaryStatistics {
    private final int[] arrayOfIntegers;

    public ArraySummaryStatistics(int[] array){
        this.arrayOfIntegers = array;
    }

    public int getMinElementId(){
        int minElementId = 0;
        for (int i = 1; i < arrayOfIntegers.length; i++) {
            if (arrayOfIntegers[i] < arrayOfIntegers[0]) {
                minElementId = i;
            }
        }
        return minElementId;
    }

    public int getMinElementValue(){
        return arrayOfIntegers[getMinElementId()];
    }

    public int getMaxElementId(){
        int maxElementId = 0;
        for (int i = 1; i < arrayOfIntegers.length; i++) {
            if (arrayOfIntegers[i] > arrayOfIntegers[0]) {
                maxElementId = i;
            }
        }
        return maxElementId;
    }

    public int getMaxElementValue(){
        return arrayOfIntegers[getMaxElementId()];
    }

    public int getElementsSum(){
        int sumOfElements = 0;
        for (int element: arrayOfIntegers) {
            sumOfElements += element;
        }
        return sumOfElements;
    }

    public double getAverageValue() {
        return (double)getElementsSum()/arrayOfIntegers.length;
    }
}

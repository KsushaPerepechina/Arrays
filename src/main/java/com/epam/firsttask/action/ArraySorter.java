package com.epam.firsttask.action;

public class ArraySorter {
    public void bubbleSort(final int[] array) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public  void selectionSort(final int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minElement = array[i];
            int minElementId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < minElement) {
                    minElement = array[j];
                    minElementId = j;
                }
            }
            int temp = array[i];
            array[i] = minElement;
            array[minElementId] = temp;
        }
    }

    public void insertionSort(final int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int j = i - 1;
            while(j >= 0 && currentElement < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = currentElement;
        }
    }
}

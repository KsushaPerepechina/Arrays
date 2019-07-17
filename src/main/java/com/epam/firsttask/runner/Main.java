package com.epam.firsttask.runner;

import com.epam.firsttask.action.ArraySorter;
import com.epam.firsttask.creator.FileArrayInitializer;
import com.epam.firsttask.printer.TextPrinter;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void sort(){
        FileArrayInitializer fileArrayInitializer = new FileArrayInitializer();
        List<int[]> arraysOfIntegers = fileArrayInitializer.execute("data/input_data.txt");

        TextPrinter textPrinter = new TextPrinter();
        ArraySorter arraySorter = new ArraySorter();
        for (int[] array: arraysOfIntegers) {
            textPrinter.writeLine("data/output_data.txt", "Исходный массив: " + Arrays.toString(array) + "\n");
            arraySorter.selectionSort(array);
            textPrinter.writeLine("data/output_data.txt", "Отсортированный массив: " + Arrays.toString(array) + "\n");
        }
    }

    public static void main(String[] args) {
        sort();
    }
}

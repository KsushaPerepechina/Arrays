package com.epam.firsttask.runner;

import com.epam.firsttask.action.ArraySorter;
import com.epam.firsttask.action.ArraySummaryStatistics;
import com.epam.firsttask.init.FileArrayInitializer;
import com.epam.firsttask.init.RandomArrayInitializer;
import com.epam.firsttask.reader.TxtFileReader;
import com.epam.firsttask.writer.TxtFileWriter;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void sort(){
        FileArrayInitializer fileArrayInitializer = new FileArrayInitializer();
        List<int[]> arraysOfIntegers = fileArrayInitializer.perform("data/input_data.txt");

        TxtFileWriter txtFileWriter = new TxtFileWriter("data/output_data.txt");
        ArraySorter arraySorter = new ArraySorter();
        for (int[] array: arraysOfIntegers) {
            txtFileWriter.writeLine("Исходный массив: " + Arrays.toString(array) + "\n");
            arraySorter.selectionSort(array);
            txtFileWriter.writeLine("Отсортированный массив: " + Arrays.toString(array) + "\n");
        }
    }

    public static void main(String[] args) {
        sort();
    }
}

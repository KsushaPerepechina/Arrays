package com.epam.firsttask.runner;

import com.epam.firsttask.action.ArraySorter;
import com.epam.firsttask.action.ArraySummaryStatistics;
import com.epam.firsttask.init.RandomArrayInitializer;
import com.epam.firsttask.reader.TxtFileReader;

public class Main {
    public static void main(String[] args) {
        TxtFileReader txtFileReader = new TxtFileReader("data.txt");
        txtFileReader.process();
    }
}

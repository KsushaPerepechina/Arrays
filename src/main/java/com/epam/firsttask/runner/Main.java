package com.epam.firsttask.runner;

import com.epam.firsttask.action.ArraySorter;
import com.epam.firsttask.exception.InaccessibleFileException;
import com.epam.firsttask.parser.StringToArrayOfIntegersParser;
import com.epam.firsttask.printer.TextPrinter;
import com.epam.firsttask.reader.TextReader;
import com.epam.firsttask.validation.PositiveIntegersStringValidator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final Logger log = LogManager.getLogger(Main.class);


    public static void sort() {
        TextReader textReader = new TextReader();
        List<String> fileContent = null;
        try {
            fileContent = textReader.readAllLines("data/input_data.txt");
        } catch (InaccessibleFileException e) {
            log.error(e.getMessage());
        }

        PositiveIntegersStringValidator positiveIntegersStringValidator = new PositiveIntegersStringValidator();
        StringToArrayOfIntegersParser stringToArrayOfIntegersParser = new StringToArrayOfIntegersParser();
        List<int[]> fileArrays = new ArrayList<>();
        for (String fileLine: fileContent) {
            if(positiveIntegersStringValidator.isCorrect(fileLine)) {
                fileArrays.add(stringToArrayOfIntegersParser.transform(fileLine));
            }
        }

        TextPrinter textPrinter = new TextPrinter();
        ArraySorter arraySorter = new ArraySorter();
        try {
            for (int[] array : fileArrays) {
                textPrinter.writeString("data/output_data.txt", "Исходный массив: " + Arrays.toString(array) + "\n");
                arraySorter.selectionSort(array);
                textPrinter.writeString("data/output_data.txt", "Отсортированный массив: " + Arrays.toString(array) + "\n");
            }
        } catch(InaccessibleFileException e) {
            log.error(e.getMessage());
        }
    }

    public static void main(String[] args) {
        sort();
    }
}

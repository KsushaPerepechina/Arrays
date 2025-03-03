package com.epam.firsttask.reader;

import com.epam.firsttask.exception.InaccessibleFileException;
import com.epam.firsttask.printer.TextPrinter;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextReaderTest {
    private TextReader textReader;
    private TextPrinter textPrinter;
    private static final String STRING_FILE_PATH = "data/test_file.txt";
    private Path FILE_PATH = Paths.get(STRING_FILE_PATH);
    private List<String> inputLines;

    @BeforeClass
    public void setUp() throws IOException {
        textReader = new TextReader();
        textPrinter = new TextPrinter();
        Files.createFile(FILE_PATH);
        inputLines = new ArrayList<>(
                Arrays.asList("Diced tomatoes", "Smashed avocado", "Fresh kale"));
    }

    @AfterClass
    @AfterMethod
    public void deleteTestFile() throws IOException {
        Files.deleteIfExists(FILE_PATH);
    }

    @Test
    public void readAllLinesTest() throws InaccessibleFileException {
        inputLines.forEach(line -> {
            try {
                textPrinter.writeString(STRING_FILE_PATH, line + "\n");
            } catch (InaccessibleFileException e) {
                e.printStackTrace();
            }
        });
        Assert.assertEquals(textReader.readAllLines(STRING_FILE_PATH), inputLines);
    }
}

package com.epam.firsttask.printer;

import com.epam.firsttask.exception.InaccessibleFileException;
import com.epam.firsttask.reader.TextReader;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TextPrinterTest {
    private TextPrinter textPrinter;
    private static final String STRING_FILE_PATH = "data/test_file.txt";
    private Path FILE_PATH = Paths.get(STRING_FILE_PATH);
    private static final String OUTPUT_LINE = "Hello, world!\n";
    private File testFile;

    @BeforeClass
    public void setUp(){
        textPrinter = new TextPrinter();
    }

    @BeforeMethod
    public void createTestFile() throws IOException {
        Files.createFile(FILE_PATH);
        testFile = new File(STRING_FILE_PATH);
    }

    @AfterMethod
    public void deleteTestFile() throws IOException {
       Files.deleteIfExists(FILE_PATH);
    }

    @Test
    public void writeLineTest() throws InaccessibleFileException {
        textPrinter.writeString(STRING_FILE_PATH, OUTPUT_LINE);
        TextReader textReader = new TextReader();
        List<String> fileContent = textReader.readAllLines(STRING_FILE_PATH);
        String fileLastLine = fileContent.get(fileContent.size() - 1) + "\n";
        Assert.assertEquals(fileLastLine, OUTPUT_LINE);
    }

    @Test(expectedExceptions = InaccessibleFileException.class,
            expectedExceptionsMessageRegExp = "File path <" + STRING_FILE_PATH + "ttt" + "> is incorrect.")
    public void writeInFileTest() throws IOException {
        textPrinter.writeString(STRING_FILE_PATH + "ttt", OUTPUT_LINE);

    }

    @Test(expectedExceptions = InaccessibleFileException.class,
            expectedExceptionsMessageRegExp = "File <" + STRING_FILE_PATH + "> does not exist.")
    public void writeInNonexistentFileTest() throws IOException {
        Files.delete(Paths.get(STRING_FILE_PATH));
        textPrinter.writeString(STRING_FILE_PATH, OUTPUT_LINE);
    }

    @Test(expectedExceptions = InaccessibleFileException.class,
            expectedExceptionsMessageRegExp = "Writing to file <" + STRING_FILE_PATH + "> is not allowed.")
    public void writeInReadOnlyFileTest() throws IOException {
        testFile.setWritable(false);
        textPrinter.writeString(STRING_FILE_PATH, OUTPUT_LINE);
    }
}
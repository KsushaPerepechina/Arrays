package com.epam.firsttask.printer;

import com.epam.firsttask.reader.TextReader;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TextPrinter {
    private static final Logger log = LogManager.getLogger(TextReader.class);

    public void writeLine(final String filePath, final String outputLine){
        try{
            Files.write(Paths.get(filePath), outputLine.getBytes(), StandardOpenOption.APPEND);
        } catch(IOException e){
            log.error(e.getMessage());
        }
    }
}
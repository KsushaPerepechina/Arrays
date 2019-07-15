package com.epam.firsttask.writer;

import com.epam.firsttask.reader.TxtFileReader;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TxtFileWriter {
    private static final Logger log = LogManager.getLogger(TxtFileReader.class);
    private final String filePath;

    public TxtFileWriter(String filePath){
        this.filePath = filePath;
    }

    public void writeLine(String outputLine){
        try{
            Files.write(Paths.get(filePath), outputLine.getBytes(), StandardOpenOption.APPEND);
        } catch(IOException e){
            e.printStackTrace();
            log.error(e.getMessage());
        }
    }
}
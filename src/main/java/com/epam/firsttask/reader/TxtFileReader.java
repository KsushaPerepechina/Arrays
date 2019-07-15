package com.epam.firsttask.reader;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TxtFileReader {
    private static final Logger log = LogManager.getLogger(TxtFileReader.class);
    private final String filePath;

    public TxtFileReader(String filePath) {
        this.filePath = filePath;
    }

    public List<String> getAllLines(){
        List<String> fileContent = null;
        try{
            fileContent = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            log.error(e.getMessage());
        }
        return fileContent;
    }
}

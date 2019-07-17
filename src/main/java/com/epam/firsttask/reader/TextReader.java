package com.epam.firsttask.reader;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TextReader {
    private static final Logger log = LogManager.getLogger(TextReader.class);

    public List<String> readAllLines(final String filePath){
        List<String> fileContent = null;
        try{
            fileContent = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            log.error(e.getMessage());
        }
        return fileContent;
    }
}

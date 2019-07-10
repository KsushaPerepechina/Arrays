package com.epam.firsttask.reader;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TxtFileReader {
    private final String fileName;
    private static final Logger log = LogManager.getLogger(TxtFileReader.class);

    public TxtFileReader(String fileName){
        this.fileName = fileName;
    }

    public void process(){
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            log.error(e.getMessage());
        }
    }
}

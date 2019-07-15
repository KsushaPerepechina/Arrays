package com.epam.firsttask.init;

import com.epam.firsttask.parser.StringToArrayOfIntegersParser;
import com.epam.firsttask.reader.TxtFileReader;
import com.epam.firsttask.validation.PositiveIntegersStringValidator;

import java.util.ArrayList;
import java.util.List;

public class FileArrayInitializer{
    public List<int[]> perform(String dataSourceFilePath){
        TxtFileReader txtFileReader = new TxtFileReader(dataSourceFilePath);
        List<String> fileContent = txtFileReader.getAllLines();

        PositiveIntegersStringValidator positiveIntegersStringValidator = new PositiveIntegersStringValidator();
        StringToArrayOfIntegersParser stringToArrayOfIntegersParser = new StringToArrayOfIntegersParser();
        List<int[]> fileArrays = new ArrayList<>();
        for (String fileLine: fileContent){
            if(positiveIntegersStringValidator.isCorrect(fileLine)) {
                fileArrays.add(stringToArrayOfIntegersParser.transform(fileLine));
            }
        }
        return fileArrays;
    }
}

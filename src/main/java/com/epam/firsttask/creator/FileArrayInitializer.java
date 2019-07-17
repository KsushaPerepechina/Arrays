package com.epam.firsttask.creator;

import com.epam.firsttask.parser.StringToArrayOfIntegersParser;
import com.epam.firsttask.reader.TextReader;
import com.epam.firsttask.validation.PositiveIntegersStringValidator;

import java.util.ArrayList;
import java.util.List;

public class FileArrayInitializer{
    public List<int[]> execute(String dataSourceFilePath){
        TextReader textReader = new TextReader();
        List<String> fileContent = textReader.readAllLines(dataSourceFilePath);

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

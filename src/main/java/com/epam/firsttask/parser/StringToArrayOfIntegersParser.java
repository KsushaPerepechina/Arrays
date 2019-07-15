package com.epam.firsttask.parser;

import java.util.Arrays;

public class StringToArrayOfIntegersParser {
    public int[] transform(String inputString){
        return Arrays.stream(inputString.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

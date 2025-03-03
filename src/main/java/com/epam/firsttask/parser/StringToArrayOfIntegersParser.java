package com.epam.firsttask.parser;

import java.util.Arrays;

public class StringToArrayOfIntegersParser {
    public int[] transform(String inputString) {
        return Arrays.stream(inputString.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

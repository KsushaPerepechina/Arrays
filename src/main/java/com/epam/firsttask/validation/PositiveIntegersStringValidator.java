package com.epam.firsttask.validation;

public class PositiveIntegersStringValidator {
    private static final String CORRECT_STRING_REGEX = "[0-9 ]+";

    public boolean isCorrect(String inputString){
        return inputString.matches(CORRECT_STRING_REGEX);
    }
}

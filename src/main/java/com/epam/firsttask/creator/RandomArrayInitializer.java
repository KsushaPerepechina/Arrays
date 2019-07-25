package com.epam.firsttask.creator;

import com.epam.firsttask.exception.ArrayInitializationException;

import java.util.Random;

public class RandomArrayInitializer {
    public int[] execute(int arraySize, int minValue, int maxValue) throws ArrayInitializationException {
        if(arraySize < 0) {
            throw new ArrayInitializationException("Array size can't be negative.");
        }
        if(minValue > maxValue) {
            throw new ArrayInitializationException("The lower bound of the array can't exceed the upper.");
        }
        Random random = new Random();
        return random.ints(arraySize, minValue, maxValue).toArray();
    }
}

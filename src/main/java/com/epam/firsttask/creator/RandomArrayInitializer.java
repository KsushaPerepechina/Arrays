package com.epam.firsttask.creator;

import java.util.Random;

public class RandomArrayInitializer {
    public int[] execute(int arraySize, int minValue, int maxValue){
        Random random = new Random();
        return random.ints(arraySize, minValue,maxValue).toArray();
    }
}

package com.epam.firsttask.init;

import java.util.Random;

public class RandomArrayInitializer {
    public int[] perform(int arraySize, int minValue, int maxValue){
        Random random = new Random();
        return random.ints(arraySize, minValue,maxValue).toArray();
    }
}

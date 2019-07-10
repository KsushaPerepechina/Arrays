package com.epam.firsttask.init;

import java.util.Random;

public class RandomArrayInitializer {
    public int[] init(){
        Random random = new Random();
        return random.ints(10, 0,100).toArray();
    }
}

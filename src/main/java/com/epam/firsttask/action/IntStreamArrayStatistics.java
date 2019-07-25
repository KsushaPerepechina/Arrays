package com.epam.firsttask.action;

import java.util.stream.IntStream;

public class IntStreamArrayStatistics {
    public int findMinElementValue(int[] arrayOfIntegers){
        IntStream stream = IntStream.of(arrayOfIntegers);
        return stream.summaryStatistics().getMin();
    }

    public int findMaxElementValue(int[] arrayOfIntegers){
        IntStream stream = IntStream.of(arrayOfIntegers);
        return stream.summaryStatistics().getMax();
    }

    public int findElementsSum(int[] arrayOfIntegers){
        IntStream stream = IntStream.of(arrayOfIntegers);
        return (int)stream.summaryStatistics().getSum();
    }

    public double findAverageValue(int[] arrayOfIntegers){
        IntStream stream = IntStream.of(arrayOfIntegers);
        return stream.summaryStatistics().getAverage();
    }
}

package com.freeit.anaron.lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// 1 + 2 = 3
// 3 + 4 = 7
// 7 + 8 = 15
// 15 + 16 = 31
// 31 + 32 = 63
// 63 + 64 = 127
// 127 + 128 = 255
// 255 + 256 = 511
class Task3Test {
    Task3 task3 = new Task3();

    @Test
    void positiveInputTwo_resultCalculateTest() {
        Assertions.assertEquals(3, task3.resultCalculate(1, 2));
    }

    @Test
    void positiveInputFour_resultCalculateTest() {
        Assertions.assertEquals(7, task3.resultCalculate(1, 4));
    }

    @Test
    void positiveInputEight_resultCalculateTest() {
        Assertions.assertEquals(15, task3.resultCalculate(1, 8));
    }

    @Test
    void positiveSixteen_resultCalculateTest() {
        Assertions.assertEquals(31, task3.resultCalculate(1, 16));
    }

    @Test
    void positiveThirtyTwo_resultCalculateTest() {
        Assertions.assertEquals(63, task3.resultCalculate(1, 32));
    }

    @Test
    void positiveSixtyFour_resultCalculateTest() {
        Assertions.assertEquals(127, task3.resultCalculate(1, 64));
    }

    @Test
    void positiveOneHundredTwentyEight_resultCalculateTest() {
        Assertions.assertEquals(255, task3.resultCalculate(1, 128));
    }

    @Test
    void positiveTwoHundredFiftySix_resultCalculateTest() {
        Assertions.assertEquals(511, task3.resultCalculate(1, 256));
    }

    @Test
    void positiveOne_resultCalculateTest() {
        Assertions.assertEquals(1, task3.resultCalculate(1, 1));
    }
}
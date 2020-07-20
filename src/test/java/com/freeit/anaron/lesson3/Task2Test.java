package com.freeit.anaron.lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    Task2 task2 = new Task2();

    @Test
    void positiveThreeHour_findCountAmebaTest() {
        Assertions.assertEquals(2, task2.findCountAmeba(3));
    }
    @Test
    void positiveFifteenHour_findCountAmebaTest() {
        Assertions.assertEquals(32, task2.findCountAmeba(15));
    }
    @Test
    void positiveTwentyOneHour_findCountAmebaTest() {
        Assertions.assertEquals(128, task2.findCountAmeba(21));
    }
    @Test
    void negative_findCountAmebaTest() {
        Assertions.assertEquals(-1, task2.findCountAmeba(2));
    }
}
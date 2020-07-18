package com.freeit.anaron.lesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task4Test {
    Task4 task4 = new Task4();

    @Test
    void oneArgument_findPositiveNumberTest() {
        Assertions.assertEquals(1, task4.findPositiveNumber(1, 0, -5));
    }

    @Test
    void twoArgument_findPositiveNumberTest() {
        Assertions.assertEquals(2, task4.findPositiveNumber(1, 5, -5));
    }

    @Test
    void threeArgument_findPositiveNumberTest() {
        Assertions.assertEquals(3, task4.findPositiveNumber(1, 2, 20));
    }

    @Test
    void zeroArgument_findPositiveNumberTest() {
        Assertions.assertEquals(0, task4.findPositiveNumber(-1, -2, -20));
    }
}
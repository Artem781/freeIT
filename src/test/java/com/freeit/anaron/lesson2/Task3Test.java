package com.freeit.anaron.lesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task3Test {
    Task3 task3 = new Task3();

    @Test
    void positiveNumber_actionOnNumberTest() {
        Assertions.assertEquals(3, task3.actionOnNumber(2));
    }

    @Test
    void negativeNumber_actionOnNumberTest() {
        Assertions.assertEquals(-4, task3.actionOnNumber(-2));
    }

    @Test
    void zeroNumber_actionOnNumberTest() {
        Assertions.assertEquals(10, task3.actionOnNumber(0));
    }
}
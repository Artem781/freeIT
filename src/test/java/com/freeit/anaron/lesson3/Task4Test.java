package com.freeit.anaron.lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task4Test {
    Task4 task4 = new Task4();

    @Test
    void multiplicationTest() {
        Assertions.assertEquals(6, task4.multiplication(2, 3));
    }
}
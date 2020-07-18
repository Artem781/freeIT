package com.freeit.anaron.lesson2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task1Test {
    Task1 task1 = new Task1();

    @Test
    void first_isPositiveCountDigitTest() {
        Assertions.assertEquals("positive, 2 digit", task1.isPositiveCountDigit(53));
    }


    @Test
    void second_isPositiveCountDigitTest() {
        Assertions.assertEquals("negative, 3 digit", task1.isPositiveCountDigit(-533));
    }
    @Test
    void inputZero_isPositiveCountDigitTest() {
        Assertions.assertEquals("input: zero", task1.isPositiveCountDigit(0));
    }

}
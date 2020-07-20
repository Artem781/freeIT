package com.freeit.anaron.lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task1Test {
   private Task1 task1 = new Task1();

    @Test
    void findDistanceTest() {
        Assertions.assertEquals(19, task1.findDistance(7));
    }
}
package com.freeit.anaron.lesson2;

//4) Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
public class Task4 {
    public int findPositiveNumber(int a, int b, int c) {
        int count = 0;
        if (a > 0) {
            count++;
        }
        if (b > 0) {
            count++;
        }
        if (c > 0) {
            count++;
        }
        return count;
    }
}

package com.freeit.anaron.lesson3;

//7)Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
public class Task7 {
    public int findSumOddNumber(int from, int to) {
        if (from == to) {
            return to;
        }
        int sum = findSumOddNumber(from + 2, to);
        sum += from;
        return sum;
    }
}

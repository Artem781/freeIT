package com.freeit.anaron.lesson3;

//4)Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
public class Task4 {
    public int multiplication(int a, int b) {
        if (b == 0) {
            return 0;
        }
        int sum = multiplication(a, b - 1);
        sum += a;
        return sum;
    }
}

package com.freeit.anaron.lesson3;
//6)Напишите программу вывода всех четных чисел от 2 до 100 включительно
public class Task6 {
    public static void main(String[] args) {
        printEvenNumbers();
    }
    static void printEvenNumbers(){
        for (int i = 2; i < 101; i += 2) {
            System.out.println(i);
        }
    }
}

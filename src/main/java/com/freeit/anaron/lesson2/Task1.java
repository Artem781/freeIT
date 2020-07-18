package com.freeit.anaron.lesson2;

//1)В переменную записываем число.
// Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//Например, "это однозначное положительное число".
// Достаточно будет определить, является ли число однозначным, "двухзначным или трехзначным и более.
public class Task1 {
    public static void main(String[] args) {
        System.out.println("hi");
    }
    public String isPositiveCountDigit(int inputNumber) {
        if (inputNumber == 0) {
            return "input: zero";
        }
        int counter = 1;
        int divisionByTen = Math.abs(inputNumber / 10);
        while (divisionByTen > 0) {
            divisionByTen /= 10;
            counter++;
        }
        if (inputNumber > 0) {
            return String.format("positive, %d digit", counter);
        } else {
            return String.format("negative, %d digit", counter);
        }
    }
}

package com.freeit.anaron.lesson3;

import static java.lang.Math.ceil;

//5)Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
//для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
public class Task5 {
    public static void main(String[] args) {
        double[] centimetersArr = new double[21];
        for (int i = 0; i < centimetersArr.length; i++) {
            centimetersArr[i] = i * 2.54;
        }
        printArrayA(centimetersArr, 1, initializationChar());
    }

    private static void printArrayA(double[] arr, int column, char[] table) {
        int col = 0;
        int delta = (int) ceil(arr.length * 1.0 / column) * column;
        int index = 0;
        System.out.println("Conversion table for distances from inches to centimeters:");
        printTopLine(table, column);
        for (int i = 0; i < delta; i++) {
            if (index < arr.length) {
                System.out.printf("%s %-2d inch=%-4.1fsm", table[5], i, arr[i]);
            } else {
                System.out.printf("%s%-15s", table[5], "");
            }
            index++;
            col++;
            if (col % column == 0) {
                System.out.println(table[5]);
                if (col < arr.length) {
                    printMiddleLine(table, column);
                }
            }
        }
        printBottomLine(table, column);
    }

    private static char[] initializationChar() {
        char[] table = {9552, //0 - ═
                9580, //1 - ╬
                9556, //2 - ╔
                9559, //3 - ╗
                9562, //4 - ╚
                9553, //5 - ║
                9574, //6 - ╦
                9577, //7 - ╩
                9568, //8 - ╠
                9571, //9 - ╣
                9565  //10 - ╝
        };
        return table;
    }

    private static void printTopLine(char[] table, int column) {
        System.out.print(table[2] + getLine(table[0]));
        for (int i = 0; i < column - 1; i++) {
            System.out.print(table[6] + getLine(table[0]));
        }
        System.out.println(table[3]);
    }

    private static void printMiddleLine(char[] table, int column) {
        System.out.print(table[8] + getLine(table[0]));
        for (int i = 0; i < column - 1; i++) {
            System.out.print(table[1] + getLine(table[0]));
        }
        System.out.println(table[9]);
    }

    private static void printBottomLine(char[] table, int column) {
        System.out.print(table[4] + getLine(table[0]));
        for (int i = 0; i < column - 1; i++) {
            System.out.print(table[7] + getLine(table[0]));
        }
        System.out.println(table[10]);
    }

    private static String getLine(char a) {
        String line = "";
        for (int i = 0; i < 15; i++) {
            line += a;
        }
        return line;
    }
}

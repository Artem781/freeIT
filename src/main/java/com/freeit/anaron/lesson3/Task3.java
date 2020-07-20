package com.freeit.anaron.lesson3;

//3)Вычислить: 1+2+4+8+...+256
// 1 + 2 = 3
// 3 + 4 = 7
// 7 + 8 = 15
// 15 + 16 = 31
// 31 + 32 = 63
// 63 + 64 = 127
// 127 + 128 = 255
// 255 + 256 = 511
public class Task3 {
    public int resultCalculate(int from, int to) {
        if (from == to) {
            return to;
        }
        return resultCalculate(from * 2, to) + from;
    }
}

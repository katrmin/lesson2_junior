package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date t = new Date();
        int count = 0;
        int sumA = 0;
        int sumB = 0;
        int abs = 0;
        for (int a1 = 0; a1 < 10; a1++) {
            for (int a2 = 0; a2 < 10; a2++) {
                sumA = a1 + a2;

                for (int b1 = 0; b1 < 10; b1++) {
                    for (int b2 = 0; b2 < 10; b2++) {
                        sumB = b1 + b2;
                        abs = Math.abs(sumA - sumB);
                        if (abs < 10) {
                            count += 10 - abs;
                        }
                    }
                }
            }
        }
        System.out.println(String.format("Count : %d , time = %d ms", count,new Date().getTime() - t.getTime()));

    }
}

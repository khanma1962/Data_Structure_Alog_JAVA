package com.moe;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TypeCasting
//        int num = (int)(67.98f);
//        System.out.println("Number is  " + num);

        // automatic type promotion in expression
//        int a = 259;
//        byte b = (byte) (a); // 257 % 256 = 1

        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = (a * b) / c;
        System.out.println(d);
        int num = 'a';
        System.out.println(num);


    }
}

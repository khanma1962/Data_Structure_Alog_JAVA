package com.moe;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        System.out.print("Please enter your temperature : ");
        Scanner input = new Scanner(System.in);
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println("Temperature in F is " + tempF);

    }
}

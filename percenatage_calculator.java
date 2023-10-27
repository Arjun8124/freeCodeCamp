package com.company;

import java.util.Scanner;
public class cbse_calculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter your 1st Subject marks:-");
        float a = read.nextFloat();
        System.out.println("Enter your 2nd Subject marks:-");
        float b = read.nextFloat();
        System.out.println("Enter your 3rd Subject marks:-");
        float c = read.nextFloat();
        System.out.println("Enter your 4th Subject marks:-");
        float d = read.nextFloat();
        System.out.println("Enter your 5th Subject marks:-");
        float e = read.nextFloat();
        if (a <= 100 && b <= 100 && c <= 100 && d <= 100 && e <= 100) {
            System.out.println("Your percentage is:-");
            float f = (a + b + c + d + e) / 5;
            System.out.println(f);
        }
        else{
            System.out.println("Your marks cannot be greater than 100.");
        }
    }
}

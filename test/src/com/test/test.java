package com.test;

import java.util.Scanner;

public class test {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("error enter next number");
            return;
        }
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("error enter next number");
            return;
        }
        double num2 = sc.nextDouble();

        double average = (num1 + num2) / 2;
        System.out.println("Average: " + average);
    }
}

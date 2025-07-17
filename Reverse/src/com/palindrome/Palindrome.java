package com.palindrome;

import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        String st = original.toLowerCase();

        String reversed = new StringBuilder(st).reverse().toString();

        if(st.equals(reversed)) 
            System.out.println("The string is a palindrome ");
        else
        	System.out.println("The string is not a palindrome ");

        
    } 	
}
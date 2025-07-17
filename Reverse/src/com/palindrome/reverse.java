package com.palindrome;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
        String original = sc.nextLine();

        StringBuilder sb = new StringBuilder(original);
        String reversed = sb.reverse().toString();

        System.out.println("Reversed string: " + reversed);

	}
	

}
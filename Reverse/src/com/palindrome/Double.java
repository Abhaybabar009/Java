package com.palindrome;
import java.util.Scanner;
public class Double {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements in the first array: ");
        int size1 = sc.nextInt();
        sc.nextLine(); 

        String[] arr1 = new String[size1];
        System.out.println("Enter elements for first array:");
        for(int i = 0; i < size1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr1[i] = sc.nextLine();
        }
        System.out.print("\nEnter number of elements in the second array: ");
        int size2 = sc.nextInt();
        sc.nextLine(); 

        String[] arr2 = new String[size2];
        System.out.println("Enter elements for second array:");
        for(int i = 0; i < size2; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr2[i] = sc.nextLine();
        }
        System.out.println("\nDuplicate strings are:");

        for(int i = 0; i < arr1.length; i++) {
	        for (int j = 0; j < arr2.length; j++) {

	            if (arr1[i].equals(arr2[j])) {
	                System.out.println(arr1[i]);
	                break;
	            }
	        }
        }
	}
}
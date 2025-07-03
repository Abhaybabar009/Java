package com.largestnumber;

public class largestnumber {

	public static void main(String[] args) {
		
		
		        int a = 10, b = 25, c = 15;
		        int largest;

		        if(a > b && a > c)
		            largest = a;
		        else if(b > c)
		            largest = b;
		        else
		            largest = c;

		        System.out.println("Largest number is: " + largest);
		    }
		

	}



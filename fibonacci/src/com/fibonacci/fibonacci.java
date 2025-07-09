package com.fibonacci;
public class fibonacci{
	static void Fibonacci(int n) {
	     int n1 = 0;
	     int n2 = 1;
	     int n3;
	     for(int i = 0; i < n; i++){
	         System.out.print(n1 + " ");
	         n3 = n2 + n1;
	         n1 = n2;
	         n2 = n3;
	     }
	 }
	 public static void main(String args[])
	 {
	     Fibonacci(10);
	  }
}
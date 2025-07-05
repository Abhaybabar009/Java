package com.invoice;

import java.util.Scanner;

public class Invoice {
	private String part_num, decscription;
	private int quantity;
	private double price, total_amount;
	
	public Invoice() {
		// TODO Auto-generated constructor stub
	}
	
	public Invoice(String part_num, String decs, int quantity, double price) {
		this.part_num = part_num;
		this.decscription = decs;
		this.quantity = quantity; 
		this.price = price;
	}
	

	public void setInvoice() {
		Scanner sc  = new Scanner(System.in); 
		System.out.println("Invoice : ");
		System.out.print("Part number : ");
		part_num = sc.nextLine(); 
		System.out.print("Description : ");
		decscription = sc.nextLine(); 
		System.out.print("Quantity : ");
		quantity = sc.nextInt();
		System.out.print("Price : ");
		price = sc.nextDouble();
		
		if(quantity < 0) {
			quantity= 0;
		}
		else if (price < 0) {
			price = 0.0;
		}
		else
			total_amount = quantity * price;
	}
	
	public void getInvoice() {
		
		System.out.println("Total amount = "+ total_amount);
	}

//	public static void main(String[] args) {
//			Invoice i = new Invoice();
//			i.setInvoice();
//			i.getInvoice();
//	}
}

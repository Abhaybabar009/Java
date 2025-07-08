package com.app.fruits;

import java.util.Scanner;
import com.app.fruits.*;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter basket size: ");
        int size = sc.nextInt();
        
        Fruit[] basket = new Fruit[size];
        int count = 0;

        boolean exit = false;
        
        while(!exit) {
        		System.out.println("0. Exit");
        		System.out.println("1. Add Mango ");
        		System.out.println("2. Add Orange ");
        		System.out.println("3. Add Apple");
        		System.out.println("4. Display names of all fruits in the basket");
        		System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket");
        		System.out.println("6. Mark a fruit as stale ");
        		System.out.println("7. Display tastes of all stale(not fresh) fruits in the basket.");
        		System.out.print("Enter choice: ");
                int choice = sc.nextInt();
        			
        		switch(choice) {
        		case 0:
        			exit = true;
        			System.out.println("Exiting...");
        			break;
        			
        		case 1:
        			 if(count < size) {
                         System.out.print("Enter name, weight, color: ");
                         String name = sc.next();
                         double weight = sc.nextDouble();
                         String color = sc.next();
                         basket[count++] = new Mango(name, weight, color);
                         System.out.println("Mango is added");
                     } 
        			 else {
                         System.out.println("Basket is full");
                     }
        			break;
        		case 2:
        			if(count < size) {
                        System.out.print("Enter name, weight, color: ");
                        String name = sc.next();
                        double weight = sc.nextDouble();
                        String color = sc.next();
                        basket[count++] = new Orange(name, weight, color);
                        System.out.println("Orange is added");
                    } 
       			 else {
                        System.out.println("Basket is full");
                    }
        			break;
        		case 3:
        			if(count < size) {
                        System.out.print("Enter name, weight, color: ");
                        String name = sc.next();
                        double weight = sc.nextDouble();
                        String color = sc.next();
                        basket[count++] = new Apple(name, weight, color);
                        System.out.println("Apple is added");
                    } 
       			 else {
                        System.out.println("Basket is full");
                    }
        			break;
        		case 4:
        			for (Fruit f : basket) {
                    if (f != null) {
                        System.out.println(f.getName());
                    }
                }                   
        			break;
        		case 5:
        			for (Fruit f : basket) {
                    if (f != null && f.isFresh()) {
                            System.out.println(f.toString() + ", Taste: " + f.taste());
                        }
                    }
        			break;
        		case 6:
        			System.out.print("Enter index to mark as stale: ");
                int i = sc.nextInt();
                if (i >= 0 && i < count && basket[i] != null) {
                    basket[i].setFresh(false);
                    System.out.println("Fruit marked as stale");
                } else {
                    System.out.println("Invalid index");
                }
        			break;
        		case 7:
        			for(Fruit f : basket) {
        				if(f != null && f.isFresh())
                        System.out.println(f.toString() + ", Taste: " + f.taste());
                }
        			break;
        		}
        }
	        
	}

}

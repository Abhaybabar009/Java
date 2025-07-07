package tester;

import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPointArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of points  ");
        int num = sc.nextInt();

        Point2D[] points = new Point2D[num];

        for(int i = 0; i < num; i++) {
            System.out.print("Enter x & y for point " + i + ": ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            points[i] = new Point2D(x, y);
        }

        boolean exit = false;
        
        while(!exit) {
        	   System.out.println("1. Display details of specific point ");
               System.out.println("2. Display x, y co-ordinates of all points");
               System.out.println("3. Display distance between two points");
               System.out.println("4. Exit");
               System.out.print("select option: ");
               int choice = sc.nextInt();
               
               switch(choice) {
               case 1:
                   System.out.print("enter index of point: ");
                   int i = sc.nextInt();
                   if(i >= 0 && i < num) {
                       System.out.println("Point at index " + i + ": " + points[i].getDetails());
                   } 
                   else {
                       System.out.println("invalid index");
                   }
                   break;

               case 2:
                   System.out.println("x, y co-ordinates of all points:");
                   int j = 0;
                   for(Point2D p : points) {
                       System.out.println("Point " + j++ + ": " + p.getDetails());
                   }
                   break;

               case 3:
                   System.out.print("enter index of start point: ");
                   int i1 = sc.nextInt();
                   System.out.print("enter index of end point: ");
                   int i2 = sc.nextInt();
                   if(i1 >= 0 && i1 < num && i2 >= 0 && i2 < num) {
                       if(points[i1].isEqual(points[i2])) {
                           System.out.println("Points are at the same coordinate");
                       } 
                       else {
                           double dist = points[i1].distance(points[i2]);
                           System.out.println("Distance between 2 points: " + dist);
                       }
                   }
                   else {
                       System.out.println("invalid indices ");
                   }
                   break;

               case 4:
                   System.out.println("exit");
                   exit = true;
                   break;

               default:
                   System.out.println("invalid option");
           }
       }
    }
  }
  
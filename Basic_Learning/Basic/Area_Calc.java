package Basic_Learning.Basic;

import java.util.Scanner;
public class Area_Calc {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);    
    
    double height, base, areaT;
    System.out.print("Enter value of height: ");
    height = sc.nextDouble();
    System.out.print("Enter value of base: ");
    base = sc.nextDouble();
    areaT = .5*height*base;   ///Triangle
    System.out.println("Area: " + areaT + "\n");

    double radius,areaC;
    System.out.print("Enter value of radius: ");
    radius = sc.nextDouble();
    areaC = 3.1416*radius*radius;    ///Circle
    System.out.println("Area: " + areaC + "\n");
    sc.close();
    
    Scanner user = new Scanner (System.in);
    System.out.print("Temperature in Celcius: ");
    double C = user.nextDouble();
    double F = 1.8 * C + 32;    ///C & F convert (Temperature)
    System.out.println("Temperature in Farenhite: " + F );
    user.close();
    
  }
}

    
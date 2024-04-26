import java.util.Scanner;

public class Conditional_Operator {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter two number for comparison.\n");
    System.out.print("1. ");
    double num1 = sc.nextDouble();
    System.out.print("2. ");
    double num2 = sc.nextDouble();
    System.out.print("\n");
    double large = (num1 > num2) ? num1 : num2;
    System.out.println("The large number is " + large);
    sc.close();
  }
}
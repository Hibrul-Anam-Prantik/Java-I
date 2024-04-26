import java.util.Scanner;

public class Math_Clas{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number: ");
    double a= sc.nextDouble();
    System.out.println("Enter another number: ");
    double b = sc.nextDouble();
    double abs = Math.abs(a);
    System.out.println("Enter value for x: ");
    double x = sc.nextDouble();
    System.out.println("Enter value for y: ");
    double y = sc.nextDouble();
    System.out.println("x^y: " + Math.pow(x,y));
    System.out.println("The absolute value of " +a+ " is: "+ abs);
///    System.out.println("Absolute: " + Math.abs(a));
    System.out.println("Max: "+Math.max(a,b));
    System.out.println("Min: " + Math.min(a,b));
    System.out.println("Pi= "+Math.PI);
    System.out.println("e= " +Math.E);
    sc.close();
  }
}
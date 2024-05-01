import java.util.Scanner;
public class Assignment5 {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter your age: ");
    int age = sc.nextInt();
    if (age >= 18) {
      System.out.println("Valid Voter.");
    }
    else {
      System.out.println("Invalid Voter.");
    }
    sc.close();
  }
}
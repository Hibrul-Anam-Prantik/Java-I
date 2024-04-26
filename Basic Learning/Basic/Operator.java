import java.util.Scanner;
public class Operator {
  public static void main(String [] args) {

    int num1, num2, sub, multi, mod;
    Scanner calc = new Scanner (System.in);
    System.out.print("Enter the 1st number: ");
    num1 = calc.nextInt();
    System.out.print("Enter the 2nd number: ");
    num2 = calc.nextInt();
    int sum = num1 + num2;
    sub = num1 - num2;
    multi = num1 * num2;
    double div = (double) num1 / num2;
    mod = num1 % num2;
    System.out.print("Enter the Summation the the numbers: ");
    int usum = calc.nextInt();
    if (usum == sum) {
      System.out.print("Correct Answer.\n");
    }
    else {
      System.out.print("Wrong Answer.\n");
    }
    System.out.print("Summation= " + (num1+num2)*1.0 + "\nSubtraction= " + sub*1.0 + "\nMultiplication: " + multi*1.0 + "\nDivision: " + div + "\nModulus: " + mod + " ");
    calc.close();
  }
}

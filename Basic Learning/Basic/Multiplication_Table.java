import java.util.Scanner;
public class Multiplication_Table{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Multuiplication Table:");
    System.out.print("Enter a number to create a multiplication table");
    int n = sc.nextInt();
    int temp = 1;
    
    for (int i = 1; i<=10; i++){
      temp=n*i;
      System.out.println(n+" X "+i+" = " + temp);
    }
    sc.close();
  }
}
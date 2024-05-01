///factorial on n!

import java.util.Scanner;
public class Loop_Factorial{
  public static void main(String [] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number for factorial calc: ");
    int n = sc.nextInt();
    int fctrl = 1;
    for (int i = 1; i<= n; i+=1){
      fctrl*=i;
    }
    System.out.println("n!= "+ fctrl);
    sc.close();
  }}

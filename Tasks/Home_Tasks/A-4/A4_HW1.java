
///FlowChart
import java.util.Scanner;
public class A4_HW1{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n,sum;
    System.out.print("Input number of terms: ");
    n = sc.nextInt();
    sum = 0;
    System.out.println("The odd numbers are:");
    for (int i = 1; i <= 1+(n-1)*2; i+=2)
    {
      sum+=i;
      System.out.println(i);
    }
    System.out.println("The Sum of odd Natural Numbers up to "+n+" terms is: "+ sum);
    sc.close();
  }
}
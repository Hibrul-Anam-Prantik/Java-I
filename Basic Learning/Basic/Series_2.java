import java.util.Scanner;
public class Series_2{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Summation of n numbers of a series,\n1.5+2.5+3.5+4.5+...+n");
    System.out.print("Last number, n = ");
    double n = sc.nextDouble();
    double sum = 0;
    for (double i = 1.5; i <= n; i++){
      sum+=i;
      System.out.print(i+"  ");
    }
    System.out.println("\nSum = " + sum);
    sc.close();
  }
}
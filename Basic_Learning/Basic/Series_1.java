import java.util.Scanner;
public class Series_1{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Summation of n numbers of a series,\n1+3+5+7+9+...+n");
    System.out.print("Last number, n = ");
    int n = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i+=2){
      sum+=i;
      System.out.print(i+"  ");
    }
    System.out.println("\nSum = " + sum);
    sc.close();
  }
}
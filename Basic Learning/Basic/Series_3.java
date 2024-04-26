import java.util.Scanner;
public class Series_3{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Summation of n numbers of a series,\n1^2+2^2+3^2+4^2+5^2+...+n^2");
    System.out.print("Last number, n = ");
    int n = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++){
      sum += Math.pow(i,2);
      System.out.print(i+"^2  ");
    }
    System.out.println("\nSum = " + sum);
    sc.close();
  }
}
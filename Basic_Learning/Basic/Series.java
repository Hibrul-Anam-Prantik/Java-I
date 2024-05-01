import java.util.Scanner;
public class Series{
  public static void main(String [] args){
    System.out.println("The sum of n numbers of a series,\n1+2+3+4+5+...+n");
    System.out.print("Last number, n = ");
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int sum = 0;
    int i = 1;
    
    while(i<=n){
      System.out.print(i+"  ");
      sum+=i;
      i++;
    }
    System.out.println();
    System.out.println("Sum = "+sum);
    sc.close();
  }
}
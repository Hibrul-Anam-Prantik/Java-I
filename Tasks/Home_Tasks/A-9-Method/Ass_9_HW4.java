import java.util.Scanner;
public class Ass_9_HW4{
  public static void oneToN(int a, int n){
    
    for ( int i = a; i <= n ; i++){
      System.out.print(i+" ");
    }
  }
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.print("N=");
    int N = sc.nextInt();
    oneToN(1,N);
    sc.close();
  }
}
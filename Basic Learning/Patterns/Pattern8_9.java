/*
           * * * * * * *  
             * * * * *  
               * * *  
                 *             */
import java.util.Scanner;
public class Pattern8_9{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int r = n; r >= 1; r--){
      ///printing space
      for ( int s = (n-r); s>=1; s--){
        System.out.print("  ");
      }
      ///printing values of column
      for ( int c = 1; c <= 2*r-1; c++){
        System.out.print("* ");
        ///System.out.print((char)(c+64)+" ");
        ///System.out.print((char)(r+64)+" ");
        ///System.out.print(c+" ");
        ///System.out.print(r+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}
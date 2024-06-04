/*      
               1  
             1 2 1  
           1 2 3 2 1  
         1 2 3 4 3 2 1         */
import java.util.Scanner;
public class Ass_6_2{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for (int r = 1; r <= n; r++){
      
      for ( int s = (n-r); s >= 1; s--){
        System.out.print("  ");  ///double space
      }
      for ( int c = 1; c <= r; c++){
        System.out.print(c+" ");
      }
      for (int c = r-1; c >= 1; c--){
        System.out.print(c+ " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
/*      
                     1  
                   1 2 3  
                 1 2 3 4 5  
               1 2 3 4 5 6 7  
                 1 2 3 4 5  
                   1 2 3  
                     1                    */
import java.util.Scanner;
public class Ass_6_6{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    for (int r = 1; r <= n; r++){
      for (int s = n-r; s >= 1; s--){
        System.out.print("  ");  ///double space
      }
      for (int c = 1; c <= 2*r-1; c++){
        System.out.print(c+" ");
      }
      System.out.println();
    }
    for (int r = n-1; r >= 1; r--){
      for (int s = n-r; s >= 1; s--){
        System.out.print("  ");   ///double space
      }
      for (int c = 1; c <= 2*r-1; c++){
        System.out.print(c+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}
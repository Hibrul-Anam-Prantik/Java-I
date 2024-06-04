/*      
                     1  
                   1   3  
                 1       5  
               1           7  
                 1       5  
                   1   3  
                     1                    */
import java.util.Scanner;
public class Ass_6_7{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    for (int r = 1; r <= n; r++){
      for (int s = n-r; s >= 1; s--){
        System.out.print("  ");  ///double space
      }
      for (int c = 1; c <= 2*r-1; c++){
        if (c == 1 || c == 2*r-1 ){
          System.out.print(c+" ");
        } else{
          System.out.print("  "); ///double space
        }
      }
      System.out.println();
    }
    for (int r = n-1; r >= 1; r--){
      for (int s = n-r; s >= 1; s--){
        System.out.print("  "); ///double space
      }
      for (int c = 1; c <= 2*r-1; c++){
        if (c == 1 || c == 2*r-1 ){
          System.out.print(c+" ");
        } else{
          System.out.print("  "); ///double space
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
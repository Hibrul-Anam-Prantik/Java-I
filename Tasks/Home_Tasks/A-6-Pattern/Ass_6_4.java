/*      
         1  
         1 2  
         1   3  
         1     4  
         1 2 3 4 5         */

import java.util.Scanner;
public class Ass_6_4{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    for (int r = 1; r <= n; r++){
      for(int c = 1; c <= r; c++){
        if(c == 1 || c == r || r == n){
          System.out.print(c+" ");
        }else{
          System.out.print("  ");  ///double space
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
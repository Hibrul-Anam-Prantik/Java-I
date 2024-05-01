/*      
 1 2 3 4 5 6  
 1         6  
 1         6  
 1 2 3 4 5 6          */

import java.util.Scanner;
public class Ass_6_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int l = sc.nextInt();      
    int w = sc.nextInt(); 
    for (int r = 1; r <= w; r++){
      
      for (int c = 1; c <= l; c++){
        if ( r == 1 || r == w || c==1 || c == l ){
          System.out.print(c+" ");
        }
        else{
          System.out.print("  ");   ///double space
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
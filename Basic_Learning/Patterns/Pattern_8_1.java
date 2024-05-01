/*      
            1  
          1 2  
        1 2 3  
          2 1  
            1  
                    */

import java.util.Scanner;
public class Pattern_8_1{
  public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    int r = sc.nextInt();
    for (int i = 1; i<=r; i++){
      for (int j = 1; j<=(r-i); j++){
        System.out.print("  ");
      }
      for (int k = 1; k<=i; k++){
        System.out.print(k+" ");
      }
      System.out.println();
    }
    for(int i = (r-1);i>=1;i--){
      for (int j = 1;j<=(r-i); j++){
        System.out.print("  ");
      }
      for(int k = i;k>=1; k--){
        System.out.print(k+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}
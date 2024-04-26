/*
             * 
           * * * 
         * * * * * 
       * * * * * * *           */

import java.util.Scanner;
public class Pattern_8_7{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int r = sc.nextInt();
    for (int i = 1; i <= r; i++){
      for (int j = 1; j<= (r-i); j++){
        System.out.print("  ");
        ///System.out.print(" ");
      }
      for (int k = 1; k <= i*2-1; k+=1){
        System.out.print( "* ");
        ///System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}
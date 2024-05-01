/*
     1
     1 2
     1 2 3
     1 2 3 4        */

import java.util.Scanner;
public class Pattern_1{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    
    for (int row = 1; row <= n; row++){
      
      for (int col = 1; col <=row; col++){
        System.out.print(" "+ col);
      }
      System.out.println();
    }
    sc.close();
  }
}
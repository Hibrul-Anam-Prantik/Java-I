/*
      1 
      2 4 
      3 6 9 
      4 8 12 16           */

import java.util.Scanner;
public class Pattern_8_6{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int r = sc.nextInt();
    for (int i = 1; i <= r; i++){
      for (int j = 1; j<= i; j++){
        System.out.print(" "+i*j);
        
      }
      System.out.println();
    }
    sc.close();
  }
}
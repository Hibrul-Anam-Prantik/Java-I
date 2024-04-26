/*
        D D D D  
        C C C  
        B B  
        A   
                    */

import java.util.Scanner ;
public class Pattern_7{
  public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    int r = sc.nextInt();
    for (int i = r; i>=1;i--){
      
      for(int j = 1; j<=i; j++){
        System.out.print((char)(i+64)+ " ");
      }
      
      System.out.println();
    }
    sc.close();
  }
}
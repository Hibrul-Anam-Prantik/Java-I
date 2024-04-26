/*
     1
     1 0
     1 0 1
     1 0 1 0        */
import java.util.Scanner;
public class Pattern_3{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    
    for (int row = 1; row <= n; row++){
      
      for (int col = 1; col <=row; col++){
        System.out.print(col%2+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}
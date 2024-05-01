/*
        A
        A B
        A B C
        A B C D  
                    */
import java.util.Scanner;
public class Pattern_5_1{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int r = sc.nextInt();
    for (int i = 1; i<=r; i++){
      for(char j = 1; j <= i; j++){
 ///       char c = (char)(j+64);
 ///       System.out.print(c+ " ");
        System.out.print((char)(j+64)+ " ");
      }
      System.out.println();  
    }
    sc.close();
  }
}
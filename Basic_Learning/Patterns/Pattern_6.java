/*
         0 0 0 0  
         1 1 1  
         0 0  
         1    
                    */
import java.util.Scanner;
public class Pattern_6{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int r = sc.nextInt();
    
    for ( int i = r; i >= 1; i--){
      
      
      for(int j = 1; j <= i; j++){
        System.out.print(i%2+ " ");
      }
      
      System.out.println();
    }
    
    sc.close();
  }
}
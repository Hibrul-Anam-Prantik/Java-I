/*      
        1 
        2 2 
        3 3 3 
        2 2 
        1  
                    */
import java.util.Scanner;
public class Pattern_8_2{
  public static void main(String[]args){
    Scanner sc= new Scanner (System.in);
    int r = sc.nextInt();
    for (int i = 1; i<=r; i++){
      for (int j = 1; j<=i;j++){
        System.out.print(i+" ");
      }
      System.out.println();
    }
    for(int i = (r-1); i >= 1;i--){
      for(int j = i; j >= 1; j--){
        System.out.print(i+ " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
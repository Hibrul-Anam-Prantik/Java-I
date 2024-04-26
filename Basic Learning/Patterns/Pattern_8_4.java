/*      
        A  
        A B  
        A B C  
        A B  
        A  
                  */
import java.util.Scanner;
public class Pattern_8_4{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    for ( int i = 1; i<=r; i++){
      for (int j = 1; j<=i; j++){
        System.out.print((char)(j+64)+ " ");
      }
      System.out.println();
    }
    for (int i = (r-1); i>=1; i--){
      for (int j = 1; j<=i; j++){
        System.out.print((char)(j+64)+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}
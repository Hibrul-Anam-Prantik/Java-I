/*      
         4 3 2 1  
         4 3 2 1  
         4 3 2 1  
         4 3 2 1  
         4 3 2 1           */
import java.util.Scanner;
public class Ass_6_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int c = sc.nextInt();
    int r = sc.nextInt();
    
    for (int i = 1; i <= r; i++){
      
      for (int j = c; j >= 1; j--){
        System.out.print(j+ " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
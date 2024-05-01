/*            *  
             * *  
            *   *  
           *     *  
            *   *  
             * *  
              *            */
import java.util.Scanner;
public class Pattern8_11{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int r = 1; r <= n; r++){
      for(int s = 1; s <= n-r; s++){
        System.out.print(" ");
      }
      for (int c = 1; c <= r; c++){
        if (c==1 || c== r){
          ///
          System.out.print("* ");
          ///System.out.print(r+" ");
          ///System.out.print(c+" ");
          ///System.out.print((char)(r+64)+" ");
          ///System.out.print((char)(c+64)+" ");
        } else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    
    for(int r = n-1; r >= 1; r--){
      for(int s = 1; s <= n-r; s++){
        System.out.print(" ");
      }
      for(int c = 1; c <= r; c++){
        if (c==1 || c== r){
          ///
          System.out.print("* ");
          ///System.out.print(r+" ");
          ///System.out.print(c+" ");
          ///System.out.print((char)(r+64)+" ");
          ///System.out.print((char)(c+64)+" ");
        }else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
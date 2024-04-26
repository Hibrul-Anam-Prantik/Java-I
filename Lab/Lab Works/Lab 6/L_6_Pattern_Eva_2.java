import java.util.Scanner;
public class L_6_Pattern_Eva_2{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int l = sc.nextInt();

    for ( int i = 1; i <= l; i++){
      for ( int j = 1; j <= (l-i); j++){
        System.out.print(" ");
      }
      
      for ( int k = 1; k <= i; k++){ 
      System.out.print(k);
     /// 
      }
      
      System.out.println();
    }
    sc.close();
  }
}
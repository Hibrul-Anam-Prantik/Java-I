import java.util.Scanner;
public class L_6_Pattern_2{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int l = sc.nextInt();
    ///int c = 4;              ///sc.nextInt();
    ///System.out.println("row = "+r);
    ///System.out.println("colum = "+c + "\n");
    
    for ( int i = 1; i <= l; i++){
      for ( int j = 1; j <= l; j++){
        if ( j <= i ){
          System.out.print(j+"  ");
        }
      }
      System.out.println();
      System.out.println();
    }
    sc.close();
  }
}
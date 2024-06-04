import java.util.Scanner;
public class L_6_Pattern_Eva_1{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int l = sc.nextInt();

    for ( int i = 1; i <= l; i++){
      for ( int j = 1; j <= l; j++){
        System.out.print(j+" ");
      }
      System.out.println();
      System.out.println();
    }
    sc.close();
  }
}
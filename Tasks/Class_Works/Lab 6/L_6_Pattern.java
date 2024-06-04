import java.util.Scanner;
public class L_6_Pattern{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int w = sc.nextInt();
    System.out.println("w = "+w);
    int l = sc.nextInt();
    System.out.println("l = "+l + "\n");
    int j;
    for ( int i = 1; i <= l; i++){
      for (  j = 1; j <= w; j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}
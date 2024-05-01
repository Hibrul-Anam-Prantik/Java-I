import java.util.Scanner;
public class Series_Fibonacci{
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Fibonacci Sequesnce:\n0  1  1  2  3  5  8  13  21  34  ...  n\n");
    System.out.print("Enter terms: ");
    int n = sc.nextInt();
    int x,y,z;
    x = 0;
    y = 1;
    
    System.out.print(x + "  " + y + "  ");
    for(int i = 3; i<=n; i ++){
      z = x + y;
      System.out.print(z+"  ");
      x = y;
      y = z;
    }
    sc.close();
  }
}
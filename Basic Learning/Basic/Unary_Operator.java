import java.util.Scanner;
public class Unary_Operator {
  public static void main (String [] args) {
    
    Scanner u = new Scanner (System.in);
    System.out.print("x = ");
    int x = u.nextInt();
    int y;
    y = +x;
    
    System.out.println("y = " + y );
    
    y = -x;
    System.out.println("y = " + y );
    u.close();
  }
}
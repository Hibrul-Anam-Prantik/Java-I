import java.util.Scanner;
public class Increment_Decrement {
  public static void main (String [] args) {
    Scanner xy = new Scanner (System.in);
    int x, y;
    System.out.print("x = ");
    x = xy.nextInt();
    y = ++x;  ///adds 1 first then print x.
    System.out.println("y = " + y );
    y = x++;  ///adds 1 to the next value of x.
    System.out.println("y = " + y );
    y = x--;  ///minuses 1 to the next value of x.
    System.out.println("y = " + y );
    y = --x;  ///minues 1 before printing x.
    System.out.println("y = " + y );
    xy.close();
  }
}
    
    
    
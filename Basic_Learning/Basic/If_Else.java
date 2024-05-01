import java.util.Scanner;
public class If_Else {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    int num;
    System.out.print("Enter a number: ");
    num = sc.nextInt();
    
    if ( num > 0) {
      System.out.println("\"" +num + "\" is a Positive Number.");
    }
    else if (num < 0 ) {
      System.out.println("\""+num+"\" is a Negatibve Number.");
    }
    else {
      System.out.println("Zero.");
    }
                
    sc.close();
  }
}
    
    
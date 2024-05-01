import java.util.Scanner;
public class EvenOdd{
  public static void main(String[] args) {
   
    Scanner user = new Scanner (System.in);
    int num;
    System.out.print("Enter a posiutive integer number: ");
    num = user.nextInt();
    
    if ( num%2 == 0) {
      System.out.println("Even");
    }
    else {
      System.out.println("Odd");
    }
    user.close();
  }
}
    
import java.util.Scanner;

public class rough {
  
  public static boolean evenChecker(int a) {
    if ( a % 2 == 0 ){
      return true;
    }
    return false;   
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean evenodd = evenChecker(n);
    
    if (evenodd) {
      System.out.println("Even!!");
    } else {
      System.out.println("Odd!!");
    }
  }
}
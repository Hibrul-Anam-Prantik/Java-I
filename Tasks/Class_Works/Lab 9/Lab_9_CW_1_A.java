import java.util.Scanner;

public class Lab_9_CW_1_A {
  
  public static boolean evenChecker(int a) {
    if ( a % 2 == 0 ){
      return true;
    } else{
      return false; 
    }   
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
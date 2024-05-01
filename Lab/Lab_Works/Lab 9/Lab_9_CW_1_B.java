import java.util.Scanner;

public class Lab_9_CW_1_B {
  
  public static boolean isEven(int a) {
    if ( a % 2 == 0 ){
      return true;
    } else{
    return false; 
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean result = isEven(n);
    
  //  if (result) {
   //   System.out.println(result);
   // } else {
      System.out.println(result);
   // }
  }
}
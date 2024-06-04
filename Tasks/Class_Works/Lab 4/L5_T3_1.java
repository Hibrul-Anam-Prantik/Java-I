///incomplete

import java.util.Scanner;
public class L5_T3_1 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int start = sc.nextInt();
    int end = sc.nextInt(0);
                         
    for (int n = start; n<=end; n++) {
      int count = 0, temp;
        temp /= 10;
    }
    int temp = start;
    int sum =0;
    while(temp!= 0) { 
      int d = temp%10;
      int exp = 1;
      for (int i = 1; i <= count; i++) {
        exp *= d;
      }
      sum += exp;
      temp /= 10;
      
    }
    if (sum==n){
      System.out.println("N: " +n);
    }
    System.out.println("Count: " +count);
    System.out.println("Sum: " +sum);
    sc.close();
  }
}
import java.util.Scanner;
public class L5_T3 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0, temp = n ;
    while (temp != 0) {
      count ++;
        temp /= 10;
    }
    temp =n;
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
    System.out.println("Count: " +count);
    System.out.println("Sum: " +sum);
    sc.close();
  }
}
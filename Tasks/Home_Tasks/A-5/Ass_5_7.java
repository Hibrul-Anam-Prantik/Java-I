import java.util.Scanner;

public class Ass_5_7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    
    for (int i = n1; i <= n2; i++) {
      int temp = i;
      int product = 1;
      
      while (temp != 0) {
        int digit = temp % 10;
        product *= digit;
        temp /= 10;
      }
      
      if (product % n3 == 0) {
        System.out.print(product + " ");
      }
    }
    
    sc.close();
  }
}

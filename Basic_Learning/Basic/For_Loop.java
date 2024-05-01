import java.util.Scanner;

public class For_Loop{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    ///int i;
    
    for (int i = sc.nextInt() ; i <= 100; i++) {
      System.out.println(i+". I love you");
    }
    sc.close();
    
  }
}
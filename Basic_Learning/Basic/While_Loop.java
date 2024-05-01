import java.util.Scanner;

public class While_Loop {
  public static void main(String [] args) {
    Scanner sc = new Scanner (System.in);
    
    int i = sc.nextInt();
    while(i <=20) {
      if (i==6){
        break;
      }
        System.out.println(i+". Even/Odd");

      i+=2;
      
    }
    sc.close();
  }
}
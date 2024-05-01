import java.util.Scanner;
public class HW2 {
  public static void main(String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter an integer number: ");
    int num = sc.nextInt();
    if ((num % 5 == 0) && (num % 7 == 0))
    {
      System.out.println("Divisible by Both");
    }
    else if (num % 5 == 0) 
    {
      System.out.println("Invalid: Divisible by 5 Only");
    }
    else if (num % 7 == 0) 
    {
      System.out.println("Invalid: Divisible by 7 Only");
    }
    else {
      System.out.println("No");
    }
    sc.close();
  }
}
    
      
    
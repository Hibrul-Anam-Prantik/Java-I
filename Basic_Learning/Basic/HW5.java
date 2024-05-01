import java.util.Scanner;

public class HW5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the payment amount: ");
    int payment = sc.nextInt();
    System.out.println("Enter your age: ");
    int age = sc.nextInt();
    double tax;
    if (age>=18){
      if (payment<10000)
      { 
        tax = 0;
        System.out.println("Your tax amount is "+tax+" Tk");
      }
      else if ((payment>=10000)&&(payment<=20000))
      {
        tax = payment*0.05;
        System.out.println("Your tax amount is "+tax+" Tk");
      } else {
        
        tax = payment*0.1;
        System.out.println("Your tax amount is "+tax+" Tk"); 
      }
    }
    else {
      tax = 0;
      System.out.println("Your tax amount is "+tax+" Tk");
    }
    sc.close();
  }
}


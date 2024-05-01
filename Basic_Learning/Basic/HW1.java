import java.util.Scanner;
public class HW1 {
  public static void main(String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter an integer number: ");
    int num1,num2,sum,sub,mul,div;
    num1 = sc.nextInt();
    System.out.println("Enter another integer number: ");
    num2 = sc.nextInt();

    System.out.println("Enter an operator(+, -, *, /) for calculation: ");
    char operator = sc.next().charAt(0);
    sum = num1+num2;
    sub = num1-num2;
    mul = num1*num2;
    
    
    if ( operator == '+') 
    {
      System.out.println(sum);
    } else if (operator == '-') {
      System.out.println(sub);
    } else if (operator == '*') {
      System.out.println(mul);
    }
    else if (operator == '/' ) {
      if (num2 != 0) {
        div = num1/num2;
        System.out.println(div);
      } else {
        System.out.println("Can't be devided by zero.");
      }
    }
    else {
      System.out.println("Invalid operator.");
    }
    sc.close();
  }
}
package Basic_Learning.Basic;

import java.util.Scanner;

public class User_Input {
  public static void main (String [] args ) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter your name: ");
    String name = sc.nextLine();
    System.out.println("Welcome \"" + name + "\".");
    System.out.print("Please enter your age: ");
    int age1 = sc.nextInt();
    sc.nextLine();
    if (age1 > 0 ) {
      System.out.print("So, you are "+ age1 + " years old, as you mentioned.\n");
    }
    else {
      System.out.println("Please enter your present age i years. [Example given- 18]");
      int age2 = sc.nextInt();
      System.out.print("So, you are "+ age2 + " years old, as18 you mentioned.\n");      
    }
    System.out.println("Type \"true\", if it's correct. Otherwise type \"false\".");
    
    String tf = sc.nextLine();
    if ( tf.equals( "true")) {
      System.out.println("Thanks \"" + name + "\" for cooperating. We've got your response. Have a great day.");
    }
    else {
      System.out.println("Please give us the right information.");
    }
    sc.close();
  }
}

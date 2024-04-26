import java.util.Scanner;
public class Assignment8 {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    char ch, CH;
    System.out.print("Have you conpleted your masters? \n[Type \"N/n\" if No and type \"Y/y\" if Yes]\n =>");
    ch = sc.next().charAt(0);
    
    System.out.print("Are you fluent in English? \n[Type \"N/n\" if No and type \"Y/y\" if Yes]\n =>");    
    CH = sc.next().charAt(0);
    
    if ( (ch == 'Y' || ch == 'y') && (CH == 'Y' || CH == 'y'))
    {
      System.out.println("You are eligible for the job interview.");
    }
    
    else {
      System.out.println("Sorry. you are not eligible for the job interview.");
    }
    sc.close();
  }
}
import java.util.Scanner;
public class CapitalSmallLetter {
  public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any letter: ");
    char ch = sc.next().charAt(0);
    if (ch >= 'a' && ch <= 'z')
    {
      System.out.println("Small Letter.");
    }
    else if (ch>='A' && ch<='Z')
    {
      System.out.println("Capital Letter");
    }
    else{
      System.out.println("Invalid input");
    }
    sc.close();
  }
}
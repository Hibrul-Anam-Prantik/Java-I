import java.util.Scanner;
public class Assignment9 {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    int option;
    System.out.print("Select which language you prefer- 1. Bangla, 2. Hindi, 3. Urdu.]: ");
    option = sc.nextInt();
    switch (option) {
      case 1:
        System.out.println("Selected language is Bangla.");
        break;
      case 2:
        System.out.println("Selected language is Hindi.");
        break;
      case 3:
        System.out.println("Selected language is Urdu.");
        break;
      default:
        System.out.println("Selected language is English.");
    }
    sc.close();
  }
}
        
        
  
import java.util.Scanner;
public class Factorial_of_a_Number{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Formula to get factorial-\n    n! = 1 X 2 X 3 X 4 X ... X (n-1) X n");
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int fctrl = 1;
    
    for ( int i = 1; i <= n; i++){
      fctrl = fctrl*i;
    }
    System.out.println("Caclutaion:\n    "+ n + "! = " + fctrl);
    sc.close();
  }
}
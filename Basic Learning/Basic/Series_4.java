import java.util.Scanner;
public class Series_4{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Multiplying n numbers of a series,\n1 X 2 X 3 X 4 X 5 X ... X 5n");
    System.out.print("Last Number, n = ");
    int n = sc.nextInt();
    int mul = 1; int i = 1;
    
    while( i <= n )
    {
      mul *= i;
      System.out.print(i + "  ");
      i++;
    }
    System.out.println("\nProduct = " + mul);
    sc.close();
  }
}
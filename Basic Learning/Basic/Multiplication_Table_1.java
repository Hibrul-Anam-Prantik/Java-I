import java.util.Scanner;
public class Multiplication_Table_1{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Multuiplication Table for (m-n) numbers:");
    System.out.print("Enter m: ");
    int m = sc.nextInt();
    System.out.print("Enter n: ");
    int n = sc.nextInt();
    int temp;
    
    for(int i = m; i<=n; i++){
      System.out.println("Multuiplication Table for "+i+": ");
      for (int j = 1; j <= 10; j++){
        temp = i*j;
        System.out.println(i+" X "+j+" = "+temp);
        
      }
      System.out.println();
    }
    sc.close();
  }
}
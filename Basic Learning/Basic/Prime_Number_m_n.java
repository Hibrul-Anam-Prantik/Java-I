import java.util.Scanner;
public class Prime_Number_m_n{
  public static void main(String [] args ) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter initial number: ");
    int m = sc.nextInt();
    System.out.print("Enter final number: ");
    int n = sc.nextInt();
   /// System.out.print("Enter a Number to check: ");
   /// int num = sc.nextInt();
    int count = 0;
    int prime_count = 0;
   
    for ( int i = m; i <= n; i++){
      if (i >= 2 ){
      
        for (int j = 2; j < i ; j++) {
          if ( i % j == 0 ){
            count++;
            break;
          }
          
        }
        if (count == 0){
          System.out.print(i + "  ");
          prime_count++;
        }
        count = 0;
      }
    }
    System.out.println("\nThere are "+prime_count+" Prime Numbers from "+m+"-"+n+".");
    sc.close();
  }
}
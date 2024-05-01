import java.util.Scanner;
public class Assignment13_Series_Fibonacci_Nth_term{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of term, you want to find: ");
    int n = sc.nextInt();
    int n1,n2,n3;
    n1 = 0; n2 = 1; n3 = 0;
    System.out.print("Fibonacchi Series:\n     "+n1+"  "+n2+"  ");
    
    
    if(n <= 0){
      System.out.println("\nINVALID DATA. \nPlease enter a valid data.[eg- 1,2,3,4,5,.......]");
    }
    else if(n == 1){
      System.out.println("\nThe "+n+"-th term is : "+ n1);
    }
    else if(n ==2){
      System.out.println("\nThe "+n+"-th term is : "+n2);
    }
    else{
      
      for (int i = 3; i <= n; i++){
        n3 = n1 + n2;
        System.out.print(n3+ "  ");
        n1 = n2;
        n2 = n3;
        
      }
      System.out.println("\n");
      System.out.println("The "+n+"-th term is : "+ n3);
    }
    
    sc.close();
  }
}
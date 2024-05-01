import java.util.Scanner;

///print sum of odd numbers from m-n
public class Assignment11_12{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    int m,n,i,sum;
    sum = 0;
    System.out.print("Starting number(m): ");
    m = sc.nextInt();
    System.out.print("Ending number(n): ");
    n = sc.nextInt();
    
    for (i=m; i<=n; i++){
      if(i%2==1)
        sum+=i;
    }
    System.out.println("Sum= "+sum);
    sc.close();
  }
}
      
      
    
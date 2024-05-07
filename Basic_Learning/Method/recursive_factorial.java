import java.util.Scanner;

public class recursive_factorial 
{
    public static int factorial(int a){
        if (a == 0){
            return 1;
        } else {
            return a * factorial(a-1);
        }
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Factoral of: ");
        int n = sc.nextInt();
        System.out.println(n+"! = "+factorial(n));
        int fac = 1;
        /*for (int i = 1; i <= n; i++){
            fac *= i;
        }
        System.out.println("From the for Loop: "+fac); */    
        sc.close();        
    }
}

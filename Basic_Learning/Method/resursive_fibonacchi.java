import java.util.Scanner;

public class resursive_fibonacchi 
{
    public static void fibo(int n, int a, int b)
    {
        if (n < 3) {        // base case
            return;
        } else {            // recursive case
            int f = a + b;
            a = b; b = f;
            System.out.print(f+" ");
            fibo(n-1, a, b);
        }
    }
    // 0 1 1 2 3 5 8 13 21 34; Fibonacchi Series
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter term: ");
        int n = sc.nextInt();
        System.out.print("Fibonacchi Series: ");
        System.out.print("0 1 ");
        fibo(n, 0, 1);
        sc.close();
    }
}

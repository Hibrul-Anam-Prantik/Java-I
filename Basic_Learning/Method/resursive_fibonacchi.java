public class resursive_fibonacchi 
{
    public static void fibo(int n, int a, int b)
    {
        if (n < 3) {
            return;
        } else {
            int f = a + b;
            a = b; b = f;
            System.out.print(f+" ");
            fibo(n-1, a, b);
        }
    }
    // 0 1 1 2 3 5 8 13 21 34; Fibonacchi Series
    public static void main(String [] args)
    {
        int n = 10;
        System.out.print("0 1 ");
        fibo(n, 0, 1);
    }
}

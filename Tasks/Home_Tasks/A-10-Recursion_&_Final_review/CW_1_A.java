import java.util.Scanner;

public class CW_1_A 
{
    public static void oneToN(int a, int N)        //recursion
    {
        if (a > N){
            return;
        } 
        System.out.print(a+" ");
        oneToN(a+1,N);
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        oneToN(1, N);
        sc.close();
    }
}

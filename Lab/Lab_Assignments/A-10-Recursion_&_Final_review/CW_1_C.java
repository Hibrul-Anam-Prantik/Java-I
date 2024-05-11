import java.util.Scanner;

public class CW_1_C {
    public static void main(String [] args)
    {
        System.out.print("N=");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //recursiveSum(1,N);
        System.out.print(recursiveSum(1,N));
        sc.close();
    }
    public static int recursiveSum(int a, int N)
    {
        if(N < a){
            return 0;
        }
        return a+ recursiveSum(a+1, N);
    }
}

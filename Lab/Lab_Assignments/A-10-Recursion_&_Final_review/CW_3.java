import java.util.Scanner;

public class CW_3 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sumDigits(n);
        System.out.println(x);
        sc.close();
    }

    public static int sumDigits(int a)
    {
        if (a == 0){
            return 0;
        }
        
        return a%10 + sumDigits(a/10);
    }
}

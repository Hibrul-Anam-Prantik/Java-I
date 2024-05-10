import java.util.Scanner;
public class CW_1_B 
{
    public static void nToOne(int a, int N)
    {
        if (N == 0){
            return;
        }
        System.out.print(N+" ");
        nToOne(a, N-1);
    } 
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N=");
        int N = sc.nextInt();
        nToOne(1, N);
        sc.close();
    }  
}

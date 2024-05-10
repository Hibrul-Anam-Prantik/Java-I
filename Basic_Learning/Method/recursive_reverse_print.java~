import java.util.Scanner;

public class recursive_reverse_print 
{
    public static void revPrint(int a)
    {
        int i = a;
        while (i >= 1){
            System.out.print(i+" ");
            i --;
        }
    }
    public static void revPrintR(int a)
    {
        if ( a == 0){
            return;
        } else {
            System.out.print(a+" ");
            revPrintR(a-1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        System.out.println();
        System.out.print("Using revPrint method : ");
        revPrint(n);
        System.out.println();
        System.out.print("Using revPrintR method: ");
        revPrintR(n);
        sc.close();
    }
}

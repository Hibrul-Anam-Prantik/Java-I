import java.util.Scanner;
public class Recursive_method
{
    public static int SumLoop(int a){
        int sum = 0;
        for (int i = 1; i <= a; i++){
            sum += i;
        }
        return sum;
    }
    // n + (n-1) + (n-2) + (n-3) + ...  ...  ... + 3 + 2 + 1
    public static int SumRec(int a){     // Recursive_Method
        if ( a ==1 ){             // base case
            return 1;
        } else{                   // recursive case
            return a + SumRec(a-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of \"n\": ");
        int n = sc.nextInt();
        System.out.println("Summation using \"SumLoop\": "+SumLoop(n));
        System.out.println("Summation using \"SumRec\" : "+SumRec(n));
        sc.close();
    }
}
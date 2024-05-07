import java.util.Scanner;
public class method_1
{
    public static int squareSum(int a, int b)
    {
        int sum = square(a)+square(b);
        return sum;
    }
    public static int square(int a)
    {
        // int sqr= a*a;
        // return sqr;
        return a*a;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        int result = squareSum(num2, num1);
        System.out.println("The Square Sum of The Two Numbers:");
        System.out.println("("+num1+")^2 + ("+num2+")^2\n= "+square(num1)+" + "+square(num2)+"\n= "+result);          
    }
}
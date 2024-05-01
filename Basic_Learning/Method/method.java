import java.util.Scanner;

public class method{
    public static int Sum(int a, int b){
        int result = a + b;
        return result;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println("Summation: "+Sum(num1,num2));
        sc.close();
    }
}
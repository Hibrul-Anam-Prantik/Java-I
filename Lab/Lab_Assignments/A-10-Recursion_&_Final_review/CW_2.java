import java.util.Scanner;
public class CW_2 {
    public static void reverseDigits(int a)
    {
        
        if (a == 0) {
            // Base case: When the number becomes 0, stop recursion
            return;
        } else {
            System.out.println(a % 10); // Print the last digit
            reverseDigits(a / 10); // Recurse with the remaining digits
        }
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        reverseDigits(x);
        sc.close();
    }
    
}

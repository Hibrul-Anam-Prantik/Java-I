import java.util.Scanner;
public class A4_HW5{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
    int num = sc.nextInt();
        // Part 1: Count digits
        int count = 0;
        int x = num;
        while (x != 0) {
            x /= 10;
            count++;
        }

        // Part 2: Calculate 10 to the power (count - 1)
        int power = 1;
        for (int i = 1; i < count; i++) {
            power *= 10;
        }

        for (; power != 0; power /= 10) {
            int digit = num / power;
            System.out.print(digit);
            if (power != 1) {
                System.out.print(", ");
            }
            num %= power;
        }
        sc.close();
    }
}
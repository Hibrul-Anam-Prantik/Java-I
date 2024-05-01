import java.util.Scanner;

public class SumOfOddNumbers {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int digitCount = 0;

        while (number != 0) {
            digitCount++;
            number = number / 10;
        }

        System.out.println("Total digits = " + digitCount);
        scanner.close();
  }
  
}
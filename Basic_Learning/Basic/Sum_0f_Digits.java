import java.util.Scanner;
public class Sum_0f_Digits{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any number: ");
    int num = sc.nextInt();
    int sum = 0;
    int temp = num;
    int n;
    System.out.println("Digits: ");
    
    while(temp != 0){
      n = temp % 10;
      System.out.print(n+"  ");
      sum += n;
      
      temp /= 10;
    }
    System.out.println();
    System.out.println("The sum of the digits of "+num+" : "+sum);
    sc.close();
  }
}
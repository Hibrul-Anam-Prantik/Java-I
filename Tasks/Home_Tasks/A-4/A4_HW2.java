import java.util.Scanner;
public class A4_HW2{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int sum=0;
    int i = 1;
    
    while(i<=10)
    {
      System.out.print("Enter Number: ");
      int num = sc.nextInt();
      sum+=num;
      System.out.println("Sum = "+sum);
      i++;
    }
    sc.close();
  }
}
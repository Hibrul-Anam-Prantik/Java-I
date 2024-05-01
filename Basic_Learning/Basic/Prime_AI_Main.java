import java.util.Scanner;
public class Prime_AI_Main{
  public static void main (String []args){
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter a Number: ");
    int n = sc.nextInt();
    int count = 0;
    
    if ( n >= 2 )
    {
      for (int i = 2; i < n; i++)
      {
        if ( n % i == 0 )
        {
          count++;
          break;
        }
      }
      if (count == 0 )
      {
        System.out.println(n+" is a Prime Number.");
      }
      else{
        System.out.println(n+" is not a Prime Number.");
      }
    }
    else{
      System.out.println(n+" is not a Prime Number.");
    }
    sc.close();
  }
}
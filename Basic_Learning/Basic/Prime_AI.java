import java.util.Scanner;
public class Prime_AI{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Number: ");
    int n = sc.nextInt();
    int count = 0;
    
    for (int i = 2; i < n ; i++){
      
      if (n % i == 0){
        count++;
        break;
      }
    }
    
    if(n == 0 || n == 1){
      System.out.println(n + " is not a Prime Number.");
    }
    else if(count == 0){
      System.out.println(n + " is a Prime Number.");
    } 
    else{
      System.out.println(n + " is not a Prime Number.");
    }
    sc.close();
  }
}
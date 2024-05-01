///checking n number of perfect number, without math library and math functions

import java.util.Scanner;
public class PerfectNumbers{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the terms of number: ");
    int N = sc.nextInt();
    
    int count=1;
    int number = 2;
    while(count <= N){
      int sum=0;
      
      for(int i=1;i<number ;i++){
       
        if(number%i == 0){
          sum+=i;
        }
      }
        if (sum==number){
          System.out.println(number);
          count++;
        }
        number++;
    }
    sc.close();
  }
}

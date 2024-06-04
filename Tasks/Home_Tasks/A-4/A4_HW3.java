///FlowChart
import java.util.Scanner;
public class A4_HW3{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    
    for(int i=0; i<=n; i++){
      if(i%5==0 && i%3!=0){
        
      System.out.println(i);
      }
    }
    sc.close();
  }
}
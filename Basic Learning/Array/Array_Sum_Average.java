import java.util.Arrays;
import java.util.Scanner;
public class Array_Sum_Average{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    double [] num = new double [5];
    
    for ( int i = 0; i < num.length; i++){
      num[i] = sc.nextDouble();
    }
    System.out.println(Arrays.toString(num));
    double sum = 0.0;
    // calc sum
    for ( int i = 0; i < num.length; i++){
      sum += num[i];
    }
    System.out.println("Summation = "+sum);
    // cals average
    System.out.println("Average = "+sum/num.length);
    sc.close();
  }
}
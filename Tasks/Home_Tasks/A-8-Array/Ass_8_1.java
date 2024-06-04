import java.util.Scanner;
public class Ass_8_1{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the length of the array: ");
    int len = sc.nextInt();
    double [] ar = new double [len];
    
    for ( int i = 0; i < len; i++){
      System.out.print("Enter a number: ");
      ar[i] = sc.nextDouble();
    }
    
    double max = ar[0];
    int idx = 0;
    for (int i = 1; i < len; i++){
      if ( ar[i] > max ){
        max = ar[i];
        idx = i;
      }
    }
    System.out.println("Maximum element "+max+" found at index "+idx);    
    
    
    double min = ar[0];
    idx = 0;
    for (int i = 1; i < len; i++){
      if ( ar[i] < min ){
        min = ar[i];
        idx = i;
      }
    }
    System.out.println("Minimum element "+min+" found at index "+idx); 
    
    
    double sum = 0;
    for ( int i = 0; i < len; i++){
      sum += ar[i];
    }
    System.out.println("Summation: "+sum);
    
    double avg = sum/len;
    System.out.printf("Average: %.02f",avg);
    sc.close();
  }
}
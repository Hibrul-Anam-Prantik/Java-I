import java.util.Scanner;
public class L7_CW_3{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the length of the array: ");
    int len = sc.nextInt();
    
    int [] ar1 = new int [len];
    
    for ( int i = 0; i < len; i++){
      System.out.print("Enter a number: ");
      ar1 [i] = sc.nextInt();  
    }
    /// a : reverse using new array
    int ar2 [] = new int [len];
    for( int i = 0; i < len; i++ ){
      ar2[i] = ar1[len-1-i];
    }
    System.out.println("Reversed using a new array:");
    for ( int i = 0; i < len; i++){
      System.out.print( ar2[i]+ " ");
    }
    
    ///b : reverse using the orginal array
    for ( int i = 0; i < len/2; i++){
      int temp = ar1[i];
      ar1[i] = ar1[len-1-i];
      ar1[len-1-i] = temp;
    }
    System.out.println();
    System.out.println("Reversed the original array:");
    for ( int i = 0; i < len; i++){
      System.out.print(ar1[i]+ " ");
    }
    sc.close();
  }
}
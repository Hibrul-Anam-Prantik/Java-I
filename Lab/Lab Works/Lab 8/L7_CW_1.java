import java.util.Scanner;
public class L7_CW_1{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    
    System.out.print("N = ");
    int N = sc.nextInt();
    
    int [] arr = new int [N];
    
    for ( int i = 0; i < N; i++){
      System.out.print("Enter a number: ");
      arr [i] = sc.nextInt();
      
    }
    System.out.print("Enter another number: ");
    int x = sc.nextInt();
    System.out.println("The elements of the array are: ");
    for ( int i = 0; i < N; i++){
      System.out.println(i+": "+arr[i]);
    }
    int arra[] = new int [N+1];
    for( int i = 0; i < N; i++){
      arra[i] = arr[i];
    }
    
    arra[N] = x;
    System.out.println("After resizing the array: ");
    for ( int i = 0; i < N+1; i++){
      System.out.print(arra[i]+" ");
    }
    sc.close();
  }
}
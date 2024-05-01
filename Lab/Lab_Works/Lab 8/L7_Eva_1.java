import java.util.Scanner;
public class L7_Eva_1{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.print("N = ");
    int N = sc.nextInt();
    int ar [] = new int [N];
    for (int i = 0; i < N; i++){
      ar[i] = sc.nextInt();
    }
    System.out.println("Original array:");
    for (int i = 0; i < N; i++){
      System.out.print(ar[i]+ " ");
    }
    for(int i = 0; i < N; i++){
      if ( ar[i] > 0){
        ar[i] = 1;
      } else if ( ar[i] < 0){
        ar[i] = 0;
      } 
    }
    System.out.println("\nAfter modifying:");
    for ( int i = 0; i < N; i++){
     System.out.print(ar[i]+" "); 
    }
    sc.close();
  }
}
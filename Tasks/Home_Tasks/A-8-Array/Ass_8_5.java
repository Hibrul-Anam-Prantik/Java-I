import java.util.Scanner;
public class Ass_8_5{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.print("N = ");
    int N = sc.nextInt();
    int arr[] = new int[N];
    for ( int i = 0; i < N; i++){
      System.out.print("Enter a number: ");
      arr[i] = sc.nextInt();
    }
    //Original Array
    System.out.println("Original Array:");
    for ( int i = 0; i < N; i++ ){
      System.out.print(arr[i]+" ");
    }
    //Selection Sort
    for (int i = 0; i < N; i++){
      int max_index = i;
      for ( int j = i+1; j < N; j++){
        if( arr[j]>arr[max_index]){
          max_index = j;
        }
      }
      int temp = arr[max_index];
      arr[max_index] = arr[i];
      arr[i] = temp;
    }
    //Sorted Array
    System.out.println("\nSorted Array:");
    for(int i = 0; i < N; i++){
      System.out.print(arr[i]+" ");
    }
    sc.close();
  }
}
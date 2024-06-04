public class Ass_8_2{
  public static void main(String [] args){
   
    int arr [] = {23,100,23,56,100};
    
    
    System.out.println("Input array:");
    for ( int i = 0; i < arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println("New array:");
    
    for ( int i = 0; i < arr.length; i++){
      boolean unq = true;
      for ( int j = i-1; j >= 0; j--){
        if ( arr[i] == arr[j]){
          unq = false;
          break;
        }
      }
      if ( unq ){
        System.out.print(arr[i] + " ");
      }
    }
  }
}
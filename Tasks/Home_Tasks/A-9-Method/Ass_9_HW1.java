import java.util.Scanner;
public class Ass_9_HW1{
  //A isPrime
  public static boolean isPrime(int a){ 
    if ( a >= 2 ){
      int count = 0;
      for ( int i = 2; i < a; i++){
        if ( a % i == 0 ){
          count++;
          break;
        }
      }
      if ( count == 0 ){
        return true;
      } else{
        return false;
      }
    } else{
      return false;
    }
  }
  //B isPerfect
  public static boolean isPerfect(int a){
    int sum = 0;
    for ( int i = 1; i < a; i++){
      if ( a % i == 0){
        sum += i;
      }
    }
    if(sum == a){
      return true;
    } else {
      return false;
    }
  }
  //C special_sum
  public static int special_sum(int a){
    int sum = 0;
    for ( int i = 1; i <= a; i++){
      if ( isPrime(i) || isPerfect(i)){
        sum += i; 
      }
    }
    return sum;
  }
  //Main method
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    boolean check = isPrime(7);
    System.out.println(check);
    check = isPrime(15);
    System.out.println(check);
    
    check = isPerfect(6);
    System.out.println(check);
    check = isPerfect(33);
    System.out.println(check);
    
    int n = sc.nextInt();
    int result = special_sum(n);
    System.out.println(result);
    sc.close();
  }
}
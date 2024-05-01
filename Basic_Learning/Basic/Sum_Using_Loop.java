public class Sum_Using_Loop{
  public static void main(String [] args) {
    double sum = 0;
    for(int i=1; i<=10; i+=1){
      sum = sum+i;
      System.out.println(i);
    }
    System.out.println("The sum of the numbers from 1 to 10 is: "+sum);
  }
}
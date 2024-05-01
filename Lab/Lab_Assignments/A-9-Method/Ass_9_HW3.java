import java.util.Scanner;
public class Ass_9_HW3{
  //A calcTax
  public static double calcTax(int age, double sal){
    double tax; 
    if ( age < 18 || sal < 10000){
      tax = 0.0;
    } else if ( age>18 && sal>=10000 && sal<=20000 ){
      tax = sal*0.07;
    } else {
      tax = sal*0.14;
    }
    return tax;
  }
  //B calcYearlyTax
  public static void calcYearlyTax(){
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    double sum = 0.0;
    for ( int i = 1; i <= 12; i++){
      double income = sc.nextDouble();
      double tax = calcTax(age,income);
      if ( income < 10000){
        System.out.printf("Month"+i+" tax: %.00f",tax);
        System.out.println();
      } else {
        System.out.printf("Month"+i+" tax: %.01f",tax);
        System.out.println();
        sum += tax;
      }
    }
    System.out.printf("Total Yearly Tax: %.01f",sum);
    System.out.println();
    sc.close();
  }
  
  //Main 
  public static void main(String [] args){
    double t = calcTax(16,20000);
    System.out.printf("%.01f\n",t);
    t = calcTax(20,18000);
    System.out.printf("%.01f\n",t);
    calcYearlyTax();
  }
}
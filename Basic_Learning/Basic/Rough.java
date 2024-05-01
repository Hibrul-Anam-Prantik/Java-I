import java.util.Scanner;

public class Rough {
  public static double calcTax(int age, int salary) {
    double tax = 0.00;
    if (age > 18 && salary > 10000) {
      if (salary >= 10000 && salary <= 20000) {
        tax = salary * 0.07;
      }
      else if (salary > 20000) {
        tax = salary * 0.14;
      }
      
    }
    return tax;
  }
  
  public static void calcYearlyTax() { 
    Scanner sc = new Scanner(System.in);
    System.out.println("age");
    int age = sc.nextInt();
    
    double totalTax = 0;
    double monthly_tax = 0;
    
    for (int i = 1; i <= 12; i++) {
      System.out.println(" salary of month "+i);
      int salary = sc.nextInt();
      monthly_tax = calcTax(age, salary);
      totalTax += monthly_tax;
      System.out.println("Month" + i + " tax: " + monthly_tax);
      
      
    }
    System.out.println("Total Yearly Tax: " + totalTax);
    
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("age");
    int age = sc.nextInt();
    System.out.println("salary");
    int salary = sc.nextInt();
    if (age > 18 && salary > 10000){
      System.out.println("Here,the age is greater than 18 and is between 10k and 20k so tax is 7% of"+salary+"="+calcTax(age,salary));
    }
    else if(age>18 && salary>20000){
      System.out.println("Here,the age is greater than 18 and is over 20k so tax is 14% of"+salary+"="+calcTax(age,salary));
      
    }
    else{
      System.out.println("age less than 18");
    }
    calcYearlyTax();
    
  }
  
}
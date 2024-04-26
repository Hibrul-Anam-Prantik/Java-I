import java.util.Scanner;
public class Assignment4{
  
  public static void main(String[]args){
    
    Scanner sc=new Scanner(System.in);
    int phonePrice=1800;
    int numberOfInstallment,installmentPerMonth;
    System.out.print("Number of intallment? ");
    numberOfInstallment=sc.nextInt();
    installmentPerMonth=phonePrice/numberOfInstallment;
    System.out.println("Monthly installment amount: "+installmentPerMonth+"euros.");
    sc.close();
  }
}

    
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter BRACU Student ID: ");
        int ID = scanner.nextInt();  ///24101230

        int year = ID / 1000000;
        int session = (ID/100000) % 10;

        if ( session == 1 ) 
        {
          System.out.println("Student Joined BRAC in Spring "+year);
        }
        else if ( session == 2 ) {
            System.out.println("Student Joined BRAC in Fall "+year);
          }
        else if ( session == 3 ) {
            System.out.println("Student Joined BRAC in Summer "+year);
        } else {
            System.out.println("Invalid ID");
        }
        scanner.close();
    }
}

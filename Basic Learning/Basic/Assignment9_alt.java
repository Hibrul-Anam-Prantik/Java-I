import java.util.Scanner;

public class Assignment9_alt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select an option:\n1. Bengali\n2. Hindi\n3. Urdu\nEnter your choice: ");
        int option = sc.nextInt();

        String selectedLanguage;

        switch (option) {
            case 1:
                selectedLanguage = "Bengali";
                break;
            case 2:
                selectedLanguage = "Hindi";
                break;
            case 3:
                selectedLanguage = "Urdu";
                break;
            default:
                selectedLanguage = "English";
                
        }

        System.out.println("Selected language is " + selectedLanguage);

        sc.close();
    }
}

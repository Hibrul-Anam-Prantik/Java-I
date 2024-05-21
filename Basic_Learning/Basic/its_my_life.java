import java.util.Scanner;

public class its_my_life {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();
        String[] names = { "Prantik", "Pallobi", "Shama", "Raj" };
        int[] ages = { 19, 25, 19, 17 };
        boolean name_match = false;
        boolean age_match = false;
        // name check
        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                name_match = true;
                break;
            }
        }
        // age check
        for (int i = 0; i < ages.length; i++) {
            if (age == ages[i]) {
                age_match = true;
                break;
            }
        }
        if (name_match && age_match) {
            System.out.println(
                    "\nHi, " + name
                            + "!\n\nWelcome back!! \nYou are already registered in our server.\nHere's your saved data-\n_____________________________________________________\n1. Name: "
                            + name + "\n2. Age : " + age + "\n3. ID  : " + 12345678);
        } else if ((name_match && !age_match) || (!name_match && age_match)) {
            System.out.print("\nHi, " + name
                    + "!\n\nWe are really SORRY to inform that you are not registered in our server yet.\nKindly share the below information to get registered-\nName: "
                    + name + "\nAge : " + age + "\nID  : ");
            int id = sc.nextInt();
            System.out.println(
                    "\nCongratulations!! You are now registered in your server.\nHere's your data-\n_____________________________________________________\n"
                            + "\n1. Name: " + name + "\n2. Age : " + age + "\n3. ID  : " + id);
        } else {
            System.out.print("\nHi, " + name
                    + "!\n\nWe are really SORRY to inform that you are not registered in our server yet.\nKindly share the below information to get registered-\nName: "
                    + name + "\nAge : " + age + "\nID  : ");
            int id = sc.nextInt();
            System.out.println(
                    "\nCongratulations!! You are now registered in your server.\nHere's your data-\n_____________________________________________________\n"
                            + "\n1. Name: " + name + "\n2. Age : " + age + "\n3. ID  : " + id);
        }
        sc.close();
    }
}

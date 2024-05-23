import java.util.Scanner;

public class Practise_Task_5_BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int decimal = toDecimal(binary);
        System.out.println(decimal);
        String hex = toHex(decimal);
        System.out.println(hex);
        sc.close();
    }

    public static int toDecimal(String binary) {
        // 64 32 16 8 4 2 1
        // 1 0 1 0
        int decimal = 0;
        int add = 1;
        for (int i = binary.length() - 1; i >= 0; i--) {
            char c = binary.charAt(i);
            if (c == '1') {
                decimal += add;
            }
            add *= 2;
        }
        return decimal;
    }

    public static String toHex(int decimal) {
        String hex = "";
        if (decimal >= 0 && decimal <= 9) {
            return hex + decimal;
        } else {
            // 10 - 15
            // A - F
            for (char i = 'A'; i <= 'F'; i++) {
                if ((char) (decimal + 55) == i) {
                    hex = "" + i;
                    break;
                }
            }
            return hex;
        }
    }
}
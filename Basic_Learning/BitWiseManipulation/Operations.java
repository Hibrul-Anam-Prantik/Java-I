public class Operations {
    public static void main(String[] args) {
        evenOdd(0);
        evenOdd(1);
        evenOdd(2);
        evenOdd(3);
        evenOdd(50);
        evenOdd(99);
        evenOdd(100);
    }

    public static void evenOdd (int num) {
        int bitmask = 1;
        if ((num & bitmask) == 1) {
            System.out.println(num + " is an Odd Number.");
        } else { // ((num & bitmask) == 0)
            System.out.println(num + " is an Even Number.");
        }
    }
}

/* Calculation;
 * bitmask, 1    = 00000001
 * any number, 5 = 00000101
 * (5 & 1)       = 00000001 = 1
 * any number, 6 = 00000110
 * (5 & 1)       = 00000000 = 0
 */

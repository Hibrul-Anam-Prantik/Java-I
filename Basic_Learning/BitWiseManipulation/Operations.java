public class Operations {
    public static void main(String[] args) {
        // evenOdd(2);
        // evenOdd(3);
        int n = 10;
        int i = 2;
        System.out.println("The " + i + "-th bit of " + n + " is: " + get_ith_bit(n, i));
        n = 15;
        i = 3;
        System.out.println("The " + i + "-th bit of " + n + " is: " + get_ith_bit(n, i));
    }

    public static void evenOdd (int num) {
        int bitmask = 1;
        if ((num & bitmask) == 1) {
            System.out.println(num + " is an Odd Number.");
        } else { // ((num & bitmask) == 0)
            System.out.println(num + " is an Even Number.");
        }
        /* Calculation;
            * bitmask, 1    = 00000001
            * any number, 5 = 00000101
            * (5 & 1)       = 00000001 = 1
            * any number, 6 = 00000110
            * (5 & 1)       = 00000000 = 0
        */
    }

    public static int get_ith_bit (int num, int i) {
        int bitMask = 1 << i;
        if ((num & bitMask) == 0) {
            return 0;
        } else {      // (num & bitMask) == 1)
            return 1;
        }
        /* Calculation;
            * Let, i = 2
            * bitmask, 1 << i = 00000[1]00
            * any number, 10  = 00001[0]10
            * (10 & bitmask)  = 00000[0]00 = 0
            * i = 3
            * bitmask, 1 << i = 0000[1]000
            * any number, 15  = 0000[1]111
            * (15 & bitmask)  = 0000[1]000 = 1
        */
    }
}



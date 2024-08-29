public class Operations {
    public static void main(String[] args) {
        // evenOdd(2);
        // evenOdd(3);
        int n = 10, i = 2;
        // System.out.println("The " + i + "-th bit of " + n + " is: " + getIthBit(n, i));
        // n = 15; i = 3;
        // System.out.println("The " + i + "-th bit of " + n + " is: " + getIthBit(n, i));
        // setIthBit(10, 2);
        n = 10; i = 1;
        System.out.println("Clearing the " + i + "-th bit of " + n + ", we get: " + clearIthBit(n, i));
        updateIthBit(10, 2, 1);
        clearLastIBits(15, 2);
    }

    public static void evenOdd(int num) {
        int bitmask = 1;
        if ((num & bitmask) == 1) {
            System.out.println(num + " is an Odd Number.");
        } else { // ((num & bitmask) == 0)
            System.out.println(num + " is an Even Number.");
        }
        /*
         * Calculation;
         * bitmask, 1    = 00000001
         * any number, 5 = 00000101
         *       (5 & 1) = 00000001 = 1
         * any number, 6 = 00000110
         *       (5 & 1) = 00000000 = 0
         */
    }

    public static int getIthBit(int num, int i) {
        int bitMask = 1 << i;
        if ((num & bitMask) == 0) {
            return 0;
        } else { // (num & bitMask) == 1)
            return 1;
        }
        /*
         * Calculation;
         * Let, i = 2
         * bitmask, 1 << i = 00000100
         * any number, 10  = 00001010
         * (10 & bitmask)  = 00000000 = 0
         * i = 3
         * bitmask, 1 << i = 00001000
         * any number, 15  = 00001111
         * (15 & bitmask)  = 00001000 = 1
         */
    }

    public static void setIthBit(int num, int i) { // set the i-th bit to 1
        int bitMask = 1 << i;
        System.out.println("Setting the " + i + "-th bit of " + num + " to 1, we get: " + (num | bitMask));
        /*
         * Calculation;
         * Let, i = 2
         * bitmask, 1 << i = 00000100
         * any number, 10  = 00001010
         * (10 | bitmask)  = 00001110 = 14
         */
    }

    public static int clearIthBit(int num, int i) { // set the i-th bit to 0
        int bitMask = ~(1 << i);
        return num & bitMask;
        /*
         * Calculation;
         * Let, i = 1
         * bitmask, ~(1 << i) = ~(00000010)
         * = 11111101
         * any number, 10 = 00001010
         * (10 & bitmask) = 00001000 = 8
         */
    }

    public static void updateIthBit(int num, int i, int newBit) {
        /*  Easiest Way
        if (newBit == 0) {
            clearIthBit(num, i);
        } else {       // (newBit == 1)
            setIthBit(num, i);
        }
        */ 
        // Another way
        int newNum = clearIthBit(num, i);
        int bitMask = newBit << i;
        System.out.println("Updating the " + i + "-th bit of " + num + ", we get: " + (newNum | bitMask));
    }

    public static void clearLastIBits(int num, int i) {
        int bitMask = ~0 << i;
        System.out.println("Clearing the last " + i + " bits of " + num + ", we get: " + (num & bitMask));
        /*
         * Calculation;
         * Let, i = 2
         * ~0 = 11111111 = -1
         * bitmask, ~0 << i = 11111100
         * any number, 15   = 00001111
         * (15 & bitmask)   = 00001100 = 12
         */
    }
}

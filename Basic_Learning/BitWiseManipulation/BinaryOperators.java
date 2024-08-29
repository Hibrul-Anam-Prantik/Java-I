public class BinaryOperators
{
    public static void main(String[] args) {
        // AND
        System.out.println(5 & 6);
        /*     5 = 101
               6 = 110
         (5 & 6) = 100 = 4
         */

        //  OR
        System.out.println(5 | 6);
        /*     5 = 101
               6 = 110
         (5 | 6) = 111 = 7
         */

        // XOR
        System.out.println(5 ^ 6);
        /*     5 = 101
               6 = 110
         (5 ^ 6) = 011 = 3
         */

        // NOT(Binary One's Complement)
        System.out.println(~5); 
        /*     5 = 00000101
              ~5 = 11111010
             as it is negative number as the 1st bit is 1. so we will use "One's Complemenet" & then "Two's Complement"
        One's Complement:
                   11111010
                 = 00000101
        Two's Complement:
                   00000101
                   +      1
                 = 00000110 = 6
        As ~5 was -ve, ans = - 6
         */

        // Left Shift <<
        System.out.println(5 << 2);
        /*     5 = 00000101
        (5 << 2) = [000101]00 = 20
        */
        //  a << b = a * 2^b; (5 << 2) = 5 * 2^2 = 5 * 4 = 20
        
        System.out.println(5 >> 2);
        /*     5 = 00000101
        (5 >> 2) = [000001]00 = 20                
        */
        //  a >> b = a / 2^b; (5 >> 2) = 5 / 2^2 = 5 / 4 = 1
    }
}
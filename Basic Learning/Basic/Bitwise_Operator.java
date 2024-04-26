public class Bitwise_Operator {
  public static void main(String [] args) {
    int a,b;
    a = 32;
    b = 12;
    ///    32  16  8  4  2  1
    /// a = 1   0  0  0  0  0
    /// b = 0   0  1  1  0  0

/// a & b = 0   0  0  0  0  0 = 00; (a*b)
/// a | b = 1   0  1  1  0  0 = 44; (a+b)
/// a ^ b = 1   0  1  1  0  0 = 44; (ab'+a'b)

    int c;
    
    c = a & b;       ///AND
    System.out.println(" a & b = " + c );
    
    c = a | b;       ///OR
    System.out.println(" a | b = " + c );
    
    c = a ^ b;       ///XOR
    System.out.println(" a ^ b = " + c );
    
   /// c = ~ a ;        ///NOT
   /// System.out.println(" ~ a = " + c );
    
    c = a >> 2;      ///RIGHT SHIFT
    System.out.println(" a >> 2 = " + c );
    
    c = a << 2;      ///LEFT SHIFT
    System.out.println(" a << 2 = " + c );
  }
}
    
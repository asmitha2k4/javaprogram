import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        // Read the two large numbers from input
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        
        // Output the sum (a + b)
        System.out.println(a.add(b));
        
        // Output the product (a * b)
        System.out.println(a.multiply(b));
        
        sc.close();
    }
}

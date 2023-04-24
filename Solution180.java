import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution180 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long c=0;
      int len = (int) (Math.log10(n) + 1);  
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(n/len);
    }
}

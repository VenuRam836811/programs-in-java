//// PROBLEM ////


You are given a positive integer in decimal representation. You need to convert this integer to its binary representation, reverse the binary digits, and then convert back to decimal representation.

The binary representation of 13 is 1101. Reversing the binary digits gives 1011, which is 11 in decimal representation. Therefore, the output is 11.
Input
A positive integer N in decimal representation.
Output
A positive integer representing the result of the binary reversal operation.
Constraints
1 ≤ N ≤ 10^9
Example
Input
13
Output
11



  //////  CODE FOR THE PROBLEM ////

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution245 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String str=Integer.toBinaryString(N);
        String str1=new StringBuffer(str).reverse().toString();
         int c=Integer.parseInt(str1,2);

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(c);
    }
}

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution225 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String a=Integer.toBinaryString(N);
        int b=a.length();
        char c=a.charAt(b-1);

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(c);
    }
}

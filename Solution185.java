import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution185 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int d = in.nextInt();
        int c=(s-d)/2;
        int b=(s+d)/2;
        
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(Math.min(c,b));
        System.out.println(Math.max(c,b));
    }
}

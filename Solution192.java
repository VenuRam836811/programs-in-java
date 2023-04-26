import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution192 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int Y = in.nextInt();
        int A=Math.max(X,Y);
        int B=Math.min(X,Y);

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println((long)(A+B)*B);
    }
}

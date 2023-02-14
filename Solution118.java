import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution118 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        long a=X*X;
        long b=(X+1)*(X+1);

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(Math.abs(b-a));
    }
}

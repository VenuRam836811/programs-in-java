import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution112 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e=Math.max(Math.max(a,b),Math.max(c,d));
        int f=Math.min(Math.min(a,b),Math.min(c,d));

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(e-f);
    }
}

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution196 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int D = in.nextInt();
        double a=D*5280;
        double b=a/N;
        double c=a/M;

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(Math.round(Math.abs((b-c))));
    }
}

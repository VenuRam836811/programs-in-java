import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution91 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c=a*a;
        float d=b*b;
        double e=Math.sqrt(c+d);

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.printf("%.2f",e);
    }
}

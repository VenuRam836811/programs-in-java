import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution175 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        double c=Math.sqrt(a*a+b*b);

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.printf("%.2f",c);
    }
}

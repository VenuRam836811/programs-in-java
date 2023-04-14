import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution134 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        double a=Math.abs((x1-x2)*(x1-x2));
        int a1=(int)a;
        double b=Math.abs((y1-y2)*(y1-y2));
        int b1=(int)b;
        double c=Math.sqrt(a1+b1);
        int c1=(int)c;

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(c1);
    }
}

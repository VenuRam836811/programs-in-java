/// PROBLEM ///

Find the Euclidean distance between 2 points of dimension n. The Euclidean distance of two points with coordinates (a1, a2, a3, …) and (b1, b2, b3, …) is computed using the formula: √((a1-b1)² + (a2-b2)² + (a3-b3)² + …)
Input
Line 1: An integer n.
Next 2 lines: Points with n coordinates.
Output
An integer m representing the Euclidean distance between the points, rounded to the nearest integer.
Constraints
0 < n <= 10
Example
Input
1
3
4
Output
1

  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution265 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        int a=0;
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            y[i] = in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            a+=(int)Math.pow(x[i]-y[i],2);
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(Math.round(Math.sqrt(a)));
    }
}

//// PROBLEM /////

INPUT:
3
1 
2
4
OUTPUT:
3

  /// CODE FOR THE PROBLEM ///


  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution253 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0,sum1=0;
        for(int i=1;i<=n+1;i++)
        {
            sum+=i;
        }
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            sum1+=x;
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(sum-sum1);
    }
}

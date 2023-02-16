import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution127 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long a=0;
        long b=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
               a+=i;
            }
             else if(i%2==1)
            {
               b+=i;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(b);
        System.out.println(a);
    }
}

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution107 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long a=0,b=0,c=0;
        for(int i=1;i<=n;i++)
        {
            a=i+a;
            b=i*i+b;
            c=i*i*i+c;
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

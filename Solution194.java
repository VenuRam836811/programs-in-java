import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution194 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum=0,pro=1;
        while(N>0)
        {
            int a=N%10;
            sum+=a;
            pro*=a;
            N=N/10;
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(pro-sum);
    }
}

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution111 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum=0;
    double a=0;
        for(int i=0;i<n;i++)
        {
            a=Math.pow(2,i);
            sum=sum+a;

        }
        int c=(int)sum;


        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(c);
    }
}

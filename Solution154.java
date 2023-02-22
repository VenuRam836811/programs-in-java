import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution154 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x[]=new int[18];
        int y[]=new int[18];
        int sum=0;
        for (int i = 0; i < 18; i++) {
             x[i] = in.nextInt();
        }
        for (int i = 0; i < 18; i++) {
             y[i] = in.nextInt();
        }
for(int i=0;i<18;i++)
{
    sum+=y[i]-x[i];
}
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(sum);
    }
}

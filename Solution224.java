import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution224 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int x[]=new int[N];
        int y[]=new int[N];
        int sum=0;
        for (int i = 0; i < N; i++) {
             x[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
             y[i] = in.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            sum+=x[i]*y[i];
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(sum);
    }
}

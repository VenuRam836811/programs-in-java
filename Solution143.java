import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution143 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int v[]=new int[N];
        for (int i = 0; i < N; i++) {
             v[i] = in.nextInt();
        }
        int i=0;
        for( i=1;i<N;i++)
        {
            System.out.print(v[i]+" ");
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.print(v[0]);
    }
}

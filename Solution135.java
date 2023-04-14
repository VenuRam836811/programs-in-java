import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution135 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if(N>0)
        {
        int A[]=new int[N];
        for (int i = 0; i < N; i++) {
             A[i] = in.nextInt();
        }
        Arrays.sort(A);
        double b=A[0]*A[N-1];
        int c=(int)(Math.sqrt(b));
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(c);
        }
        else
        {
            System.out.print("0");
        }
    }
}

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution168 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int L[]=new int[A];
        for (int i = 0; i < A; i++) {
             L[i] = in.nextInt();
        }
        for(int i=0;i<A;i++)
        {
        int c=L[i];
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.print(L[c]);
        if(i<A-1)
        {
            System.out.print(" ");
        }
        }
    }
}

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution215 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=0,i=0;
        int se[]=new int[n];
        for ( i = 0; i < n; i++) {
            se[i] = in.nextInt();
        
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(se[n-2]+se[n-1]);
    }
}

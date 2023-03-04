import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Linear {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int sum=0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
        sum=a*x+b;
         System.out.println(sum);
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

       
    }
}

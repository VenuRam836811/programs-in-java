import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutiona2 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long N = in.nextInt();
        long a=0;
        for(int i=1;i<=N;i++)
        {
            a+=N*i;
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(a);
    }
}

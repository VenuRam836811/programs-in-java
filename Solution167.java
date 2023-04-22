import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution167 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<=n;i++)
        {
            int a=i*i;
            if(a>=n)
            {
                System.out.print(a);
                break;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

       // System.out.println("answer");
    }
}

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution197 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        int l[]=new int[n];
        for(int i=0;i<n;i++)
        {
         l[i] = in.nextInt();
        }
        int a=0;
        for(int i=0;i<n;i++)
        {
             a+=(int)Math.sqrt(l[i]);

        }
        

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(a);
    }
}

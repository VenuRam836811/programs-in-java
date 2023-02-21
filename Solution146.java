import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution146 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int a=m+n;
        if(a<=7)
        {
            System.out.println(a);
        }
        else if(a>7)
        {
            int b=a-7;
             System.out.println(b);
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

       
    }
}

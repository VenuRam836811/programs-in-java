import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution100 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.print(N);
        for(int i=N-1;i>0;i--)
        {
            if(N%i==0)
            {
                System.out.print(" "+i);
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        //System.out.println("0");
    }
}

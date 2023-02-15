import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution120 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int R = in.nextInt();
        int sum=1;
        for(int i=0;i<N;i++)
        {
            sum=R*i;

            System.out.print(sum);
            if(i!=(N-1))
            {
                System.out.print(" ");
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        
    }
}

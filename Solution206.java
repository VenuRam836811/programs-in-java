import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution205 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long a=0,b=0,c=0;
        for(int i=0;i<=N;i++)
        {
            a+=i;
            b+=i*i;
            c+=i*i*i;
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(a+b+c);
    }
}

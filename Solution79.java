import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution79 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int sum=0;
        for(int i=0;i<line.length();i++)
        {
            char ch=line.charAt(i);
            int a=(int)ch;
            sum=sum+a;

        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println((int)Math.sqrt(sum));
    }
}

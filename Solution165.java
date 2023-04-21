import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution165 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String B = in.next();
        for(int i=0;i<B.length();i++)
        {
            char ch=B.charAt(i);
            if(ch=='1')
            System.out.print("0");
            else
            System.out.print("1");
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        
    }
}

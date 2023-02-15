import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution119 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String N = in.nextLine();
        for(int i=0;i<N.length();i++)
        {
            char ch=N.charAt(i);
            int b=(int)ch;
            System.out.print(b);
            if(i!=N.length()-1)
            System.out.print(" ");
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

       
    }
}

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution115 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String DNA = in.next();
        for(int i=0;i<DNA.length();i++)
        {
            char ch=DNA.charAt(i);
            if(ch=='A')
            {
                 System.out.print("T");
            }
            else if(ch=='T')
            {
                 System.out.print("A");
            }
            else if(ch=='G')
            {
                 System.out.print("C");
            }
            else if(ch=='C')
            {
                 System.out.print("G");
            }

        }
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

       // System.out.println(s);
    }
}

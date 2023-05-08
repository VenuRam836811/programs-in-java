import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution220 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String w = in.nextLine();
        String a=w.toLowerCase();
        int b=0;
        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            if(Character.isLetter(c))
            {
                 b+=(int)c-96;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(b);
    }
}

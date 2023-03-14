import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution83 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int a=0;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
             a=(int)ch;
            for(int j=0;j<word.length();j++)
            {
                char ch1=word.charAt(j);
                int b=(int)ch1;
                if(b>=a)
                {
a=b;
                }
            }
        }


        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(a);
    }
}

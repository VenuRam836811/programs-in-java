import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution201 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String chars = in.nextLine();
        int b=0;
        String s = in.nextLine();
        String toGet = in.nextLine();
        for(int j=0;j<=toGet.length();j++)
        {
        char a=toGet.charAt(j);
        for(int i=0;i<chars.length();i++)
        {
            char ch=chars.charAt(i);
            if(ch==a)
            b=i;
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.print(s.charAt(b));
        }
    }
}

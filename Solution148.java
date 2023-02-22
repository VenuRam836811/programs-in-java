import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution148 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String log = in.nextLine();
        int a=0,b=0;
        for(int i=0;i<log.length();i++)
        {
            char ch=log.charAt(i);
            if(ch=='(')
            {
                a+=1;
            }
            else if(ch==')')
            {
                b+=1;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(a-b);
    }
}

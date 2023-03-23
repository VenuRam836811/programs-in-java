import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Main113 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String ruleset = in.nextLine();
        String rainbow = in.nextLine();
        int count=0;
        for(int i=0;i<rainbow.length();i++)
        {
            char ch=rainbow.charAt(i);
            if(ch=='!')
            {
                count+=1;
            }
        }
        if(count>0)
        {
            System.out.print("Rainbow accepted! 0");
        }
        else
        {
             if(ruleset.length()==rainbow.length())
             {
                System.out.print("Rainbow denied! 2");
             }
             else if(ruleset.length()>rainbow.length())
             {
                System.out.print("Rainbow denied! 0");
             }
             else
             {
                System.out.print("Rainbow denied! 1");
             }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

       // System.out.println("answer");
    }
}

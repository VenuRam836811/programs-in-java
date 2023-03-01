import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution95 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            if(Character.isUpperCase(ch))
            {
            
        System.out.print(ch);

            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
    }
}

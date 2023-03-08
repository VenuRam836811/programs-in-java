import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution88 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            if(Character.isUpperCase(ch))
            {
                System.out.print("-");
            }
            else if(Character.isLowerCase(ch))
            {
                System.out.print("_");
            }
            else
            {
                System.out.print("*");
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        //System.out.println("answer");
    }
}

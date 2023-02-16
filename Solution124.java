import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution124 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        String UpperCase="";
        String LowerCase="";
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            if(Character.isUpperCase(ch))
            {
                UpperCase+=ch;
            }
            else
            {
                LowerCase+=ch;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(UpperCase);
        System.out.println(LowerCase);
    }
}

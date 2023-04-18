import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution156 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String m = in.nextLine();
        int count=0;
        for(int i=0;i<m.length();i++)
        {
            char ch=m.charAt(i);
            int a=(int)ch;
            if(Character.isLetter(ch))
            {
            if(a%2==0)
            {
                count++;
            }
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(count);
    }
}

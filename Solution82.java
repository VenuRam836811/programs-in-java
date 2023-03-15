import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution82 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        int a=0;
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            if(Character.isLowerCase(ch))
            {
                a=a+1;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(a);
    }
}

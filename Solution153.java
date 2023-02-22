import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution153 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();
        int count=0;
        for(int i=0;i<message.length();i++)
        {
            char ch=message.charAt(i);
            if(Character.isLetter(ch))
            {
                count+=1;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(count);
    }
}

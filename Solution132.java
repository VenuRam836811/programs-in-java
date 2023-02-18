import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution132 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int sum=0;
        int a;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            a=(int)ch;
            if(a%2==1)
            {
                sum+=a;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(sum);
    }
}

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution86 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine();
        String line2 = in.nextLine();
        int a=line1.length();
        int count=0;
        for(int i=0;i<a;i++)
        {
            char ch=line1.charAt(i);
            char ch1=line2.charAt(a-1-i);
        if(ch!=ch1)
            {
                count+=1;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(count);
    }
}

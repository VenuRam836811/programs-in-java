import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution179 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine();
        String line = in.nextLine();
        int c=0;
        String line2=new StringBuffer(line).reverse().toString();
        for(int i=0;i<line1.length();i++)
        {
            char ch=line1.charAt(i);
            char ch1=line2.charAt(i);
            if(ch!=ch1)
            c++;
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(c);
    }
}

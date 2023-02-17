import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutiona4 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String M = in.nextLine();
        int a=M.length();
        for(int i=0;i<a;i++)
        {
            char ch=M.charAt(i);
            char ch1=M.charAt(a-i-1);
            System.out.println(ch+" "+ch1);
            //System.out.print(" ");
            
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

       // System.out.println("BANNER");
    }
}

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutions154 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        int c=0;
        for(int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            if(ch=='e' || ch=='E')
            {
                c++;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(c+1);
    }
}

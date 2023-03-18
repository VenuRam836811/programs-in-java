import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution106 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        //System.out.print(name);
        for(int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);
            char ch1=name.charAt(name.length()-1-i);
            System.out.print(ch);
            System.out.print(ch1);
        }


        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        
    }
}

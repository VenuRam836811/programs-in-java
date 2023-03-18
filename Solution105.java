import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution105 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String a="";
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(i%2==0)
            {
               System.out.print(ch);
            }
        }
       

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        
    }
}

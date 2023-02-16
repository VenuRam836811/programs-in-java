import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution125 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String T = in.nextLine();
        String T2 = in.nextLine();
        for(int i=0;i<T.length();i++)
        {
            char ch=T.charAt(i);
            char ch1=T2.charAt(i);
            if(ch=='0' && ch1=='1')
            {
                System.out.print(ch1);
            }
            else if(ch=='1' && ch1=='0')
            {
               System.out.print(ch); 
            }
            else if(ch=='1' && ch1=='1')
            {
               System.out.print(ch); 
            }
            else if(ch=='0' && ch1=='0')
            {
               System.out.print(ch); 
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        
    }
}

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutions140 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String n1 = in.nextLine();
        String n2 = in.nextLine();
        for(int i=0;i<n1.length();i++)
        {
            char ch=n1.charAt(i);
            char ch1=n2.charAt(i);
            if(ch=='0' && ch1=='1')
            {
 System.out.print(ch);
            }
            if(ch=='1' && ch1=='0')
            {
 System.out.print(ch1);
            }
            if(ch=='1' && ch1=='1')
            {
                 System.out.print(ch);
            }
            if(ch=='0' && ch1=='0')
            {
                 System.out.print(ch);
            }

        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

       
    }
}

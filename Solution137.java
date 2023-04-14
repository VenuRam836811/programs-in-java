import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution137 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count=0,count1=0,count2=0,count3=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='A')
            {
                count+=1;
            }
            if(ch=='C')
            {
                count1+=1;
            }
            if(ch=='G')
            {
                count2+=1;
            }
            if(ch=='T')
            {
                count3+=1;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(count+" "+count1+" "+count2+" "+count3);
    }
}

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution100 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c=Math.max(a,b);
        int count=0;
        for(int i=2;i<c;i++)
        {
            if(a%i==0 && b%i==0)
            {
              count+=1;
            }
            
        }
        if(count>0)
        {
System.out.println("false");
        }
        else
        {
            System.out.println("true");
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        
    }
}

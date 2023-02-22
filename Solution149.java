import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution149{

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        String a=Integer.toBinaryString(X);
        int sum=a.length();
        int count=0;
        for(int i=0;i<sum;i++)
        {
            char ch=a.charAt(i);
            if(ch=='1')
            {
                count+=1;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(count);
    }
}

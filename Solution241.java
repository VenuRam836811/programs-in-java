///// PROBLEM /////


There is a road with two lanes and length n. Each character of the two lanes is either - for no coin or c for coin.

You can start on any lane. And at any point, you must move forward on one of the lanes. This means you can only get one coin even if both lanes have coins on the same index.

You are to output the maximum amount of coins possible after completing the run.
Input
Line 1: An integer - n
Line 2: A string of length n (lane 1)
Line 3: A string of length n (lane 2)
Output
Line 1: An integer, the maximum amount of coins possible
Constraints
0 < n <= 200
Example
Input
5
c-c--
-cc-c
Output
4



  //// CODE FOR THE PROBLEM /////


  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution241 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        int c=0,d=0;
        String a = in.nextLine();
        String b = in.nextLine();
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            char ch1=b.charAt(i);
            if(ch==ch1)
            {
                c++;
            }
            if(ch=='c'|| ch1=='c')
            {
                d++;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(d);
    }
}

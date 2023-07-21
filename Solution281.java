////  PROBLEM ///

The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
1 2
.|...
.|...
-+---
.|...
.|...
02 Test 2
Input
Expected output
4 2
....|
....|
----+
....|
....|
03 Test 3
Input
Expected output
0 4
|....
|....
|....
|....
+----
04 Test 4
Input
Expected output
0 0
+----
|....
|....
|....
|....

  //// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution281 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        for(int i=0;i<5;i++)
        {
           for(int j=0;j<5;j++)
           {
            if(i!=y)
            {
            if(j==x)
            {
                System.out.print("|");
            }
            else
            {
                System.out.print(".");
            }
            }
           }
           if(i==y)
            {
                for(int k=0;k<5;k++)
                {
                    if(k==x)
                    {
                        System.out.print("+");
                    }
                    else
                    {
                        System.out.print("-");
                    }
                }
            }
           
           System.out.println();
        }


       
    }
}

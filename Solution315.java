/// PROBLEM ///


The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
3 5
5 6 7
6 7 8
7 8 9
02 Test 2
Input
Expected output
1 2
2
03 Test 3
Input
Expected output
2 1
1 2
2 3
04 Test 4
Input
Expected output
4 9
9 10 11 12
10 11 12 13
11 12 13 14
12 13 14 15
05 Test 5
Input
Expected output
3 0
0 1 2
1 2 3
2 3 4
06 Test 6
Input
Expected output
3 -1
-1 -2 -3
-2 -3 -4
-3 -4 -5


  /// CODE FOR THE PROBLEM ///


import java.util.*;
import java.io.*;
import java.math.*;
class Solution {
      public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        if(q>=0)
        {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(q);
                if(j<n-1)
                {
                    System.out.print(" ");
                }
                q++;
            }
            System.out.println();
            q=q-(n-1);
        }
        }
        else
        {
            for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(q);
                if(j<n-1)
                {
                    System.out.print(" ");
                }
                q--;
            }
            System.out.println();
            q=q+(n-1);
        }
        }  
    }
}

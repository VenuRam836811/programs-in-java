/// PROBLEM ///


The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
1
1
1
02 Test 2
Input
Expected output
5
1 2 3 4 5
1 -1 -4 -8 -13
03 Test 3
Input
Expected output
10
15 75 21 99 23 56 10 48 62 1
15 -60 -81 -180 -203 -259 -269 -317 -379 -380
04 Test 4
Input
Expected output
10
1 1 1 1 1 1 1 1 1 1
1 0 -1 -2 -3 -4 -5 -6 -7 -8



  /// CODE FOR THE PROBLEM ///


import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m[]=new int[n];
        for (int i = 0; i < n; i++) {
            m[i]= in.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                System.out.print(m[i]);
            }
            else
            {c=m[i-1]-m[i];
                System.out.print(" "+c);
                m[i]=c;
            }
        } 
    }
}

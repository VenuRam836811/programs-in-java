/// PROBLEM ///

You must output the greatest prime number out of a list of N numbers.
Input
Line 1: An integer N for the amount of numbers to compare.
Next N lines: An integer x
Output
Line 1 : The greatest prime number.
Constraints
2 ≤ N ≤ 100
2 < x < 10000
Example
Input
2
7
13
Output
13

  /// CODE FOR THE PROBLEM ///

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution0276 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int u=0,c=0;
        int b[]=new int[N];
        for (int i = 0; i < N; i++) {
            int x = in.nextInt();
            if(x==0 || x==1)
            {
                b[u]=x;
                u++;
            }
            else
            {
                c=0;
                for(int j=2;j<=x;j++)
                {
                    if(x%j==0)
                    {
                        c++;
                    }
                }
                if(c==1)
                {
                    b[u]=x;
                    u++;
                }
            }
        }
        Arrays.sort(b);
        int z=b.length;
        System.out.print(b[z-1]);

       
    }
}

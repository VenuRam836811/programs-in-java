///// PROBLEM ////



Count the number of ones in the binary representation of each given integer.
Input
Line 1 : The number of values N to handle.
N next lines : An integer X on each line.
Output
For each integer X, the number of ones in its binary representation.
Constraints
1≤N<10
0≤X<2^32
Example
Input
3
5
2
7
Output
2
1
3



  ///// CODE FOR THE PROGRAM /////



  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution237 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),b=0;
        for (int i = 0; i < n; i++) {
            long x = in.nextLong();
            String a=Long.toBinaryString(x);
            b=0;
            for(int j=0;j<a.length();j++)
            {
                char ch=a.charAt(j);
                if(ch=='1')
                {
                    b++;
                }
            }
            System.out.println(b);
        }

    
    }
}

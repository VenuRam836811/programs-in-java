/// PROBLEM ///

Given two integers m and n, how many positive integers divide exactly one of them?
Input
LIne 1: Two space-separated integers m and n
Output
One integer: The number of exclusive divisors of m and n
Constraints
0<m,n<1000
Example
Input
6 10
Output
4

  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution301 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int a=0,b=0;
        for(int i=1;i<=m;i++)
        {
            if(m%i==0 && n%i!=0)
            {
                a++;
            }
        }
        for(int i=1;i<=n;i++)
        {
            if(n%i==0 && m%i!=0)
            {
                b++;
            }
        }
        System.out.print(a+b);
    }
}

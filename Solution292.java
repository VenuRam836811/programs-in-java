/// PROBLEM ///

Your program should print staircase of binary of numbers from 0 to N like given below
Input
Single Line: An Integer N
Output
Indented Binary Staircase
Constraints
1 ≤ N ≤ 100
Example
Input
10
Output
   0
   1
  10
  11
 100
 101
 110
 111
1000
1001
1010

  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution292 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String n1=Integer.toBinaryString(n);
        int b=n1.length();
        for(int i=0;i<=n;i++)
        {
            String a=Integer.toBinaryString(i);
            int c=a.length();
            if(c==b)
            {
            System.out.println(a);
            }
            else
            {
                for(int j=0;j<b-c;j++)
                {
                    System.out.print(" ");
                }
                System.out.println(a);
            }
        }
    }
}

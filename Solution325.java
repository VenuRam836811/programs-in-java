/// PROBLEM ///



Given an integerN, print the smallest prime number that's strictly bigger than it.
Input
Line 1: An integer N
Output
Line 1: A prime number P, strictly bigger than N
Constraints
0<=N<=2^26-1
Example
Input
1
Output
2


  /// CODE FOR THE PROBLEM ///


  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int b=0;
        int a=(int)Math.pow(2,26);
        for(int i=x+1;i<=a-1;i++)
        {
            b=0;
            for(int j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    b+=1;
                }
            }
                if(b==1)
                {
                    System.out.print(i);
                    break;
                }
            
        }

       
    }
}

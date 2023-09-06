/// PROBLEM ///

Given a number n, your task is to report the number of its divisors but if n is prime print "PRIME"
For example, if n is 16, the correct answer is 5 because its divisors are 1,2,4,8,16.
Input
The input data contains an integer n
Output
You must output the number of n's divisors but if its prime print "PRIME"
Constraints
1≤ n ≤1000000
Example
Input
18
Output
6

  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution299 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a=0;
        for(int i=1;i<N;i++)
        {
            if(N%i==0)
            {
                a++;
            }
        }
        if(a==1)
        System.out.print("PRIME");
        else
        System.out.print(a+1);

    }
}

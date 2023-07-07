/////   PROGRAM ///

There is an integer x. We can express x into a product of some primes like x=p1*p2*p3*...*pk. If all the primes in this product are odd, we call x is Perfect.

Given m integers, check if every integer is Perfect or not. If it is Perfect, output Perfect. Else output Not Perfect.
Input
Line 1: An integer m.
Next m lines:An integer x.
Output
For each number x, if x is Perfect, output Perfect. Else output Not Perfect.
Constraints
1 <= m <=20
1 <= x <= 10^9
Example
Input
3
5
6
7
Output
Perfect
Not Perfect
Perfect


  /// CODE FOR THE PROBLEM /////


  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution250 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int a=1;
        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            if(x%2==0)
            {
                System.out.println("Not Perfect");
            }
            else
            {
                System.out.println("Perfect");
            }
             }
}}

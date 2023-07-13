/// PROBLEM ////


Given 2 integers a,b output if they are amicable numbers.

Two numbers are amicable if the sum of divisors of one number are equal to the other number.

For example:
number 220 has divisors 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110 which sum up to 284
number 284 has divisors 1, 2, 4, 71, 142 which sum up to 220

Therefore numbers 220 and 284 are amicable numbers
Input
Line 1: Integers a and b separated by a space
Output
Line 1: Amicable if they are amicable, Not amicable if they are not
Constraints
0 <= a < 100000
0 <= b < 100000
Example
Input
220 284
Output
Amicable


  /// CODE FOR THE PROBLEM ////


  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution263 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum=0,sum1=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                sum+=i;
            }
        }
        for(int i=1;i<b;i++)
        {
            if(b%i==0)
            {
                sum1+=i;
            }
        }
        if(sum==b && sum1==a)
        {
            System.out.print("Amicable");
        }
        else
        {
             System.out.print("Not amicable");
        }

    }
}

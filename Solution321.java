/// PROBLEM ///  


Output the square of the input if it is a prime number, or the sum of each digit in the square of the input.
Input
Line 1: An integer 1 < n <= 100
Output
Output the square of the input (n) if the input is a prime number. If n is not prime, then print the sum of each digit in the square of n.

For example, 17 is a prime number so your output should be 17 squared = 289.
If your input is 12, not prime, then your output the sum of each digit in 12 squared (144) = 1+4+4 = 9.
Constraints
1 < n <= 100
Example
Input
12
Output
9


  /// CODE FOR THE PROBLEM ///


import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=0,sum=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                a+=1;
            }
        }
        if(a==1)
        System.out.print(n*n);
        else
        {
            while(n>0)
            {
                int b=n%10;
                sum+=b;
                n/=10;
            }
            System.out.print(sum*sum);
        }
    }
}

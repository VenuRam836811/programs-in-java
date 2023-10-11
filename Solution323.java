/// PROBLEM ///


Given a natural number n, for each natural number less than or equal to n, count the occurrences of the digit 1 within it, and then calculate the sum of these counts as the result.

For example, if n=11, we consider the numbers less than or equal to n:
0 contains zero occurrence of the digit 1
1 contains one occurrence of the digit 1
2 contains zero occurrence of the digit 1
...
10 contains one occurrence of the digit 1
11 contains two occurrences of the digit 1

The result to be printed is the sum of these counts: 0+1+...+1+2=4.
Input
One single line of input: a natural number n.
Output
One single line: the sum of number of digit 1 in each natural number less than or equal to n.
Constraints
n<=1000000
Example
Input
11
Output
4


  /// CODE FOR THE PROBLEM ////


import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                count+=1;
            }
            else if(i>9)
            {
                int b=i;
                while(b>0)
                {
                    int a=b%10;
                    if(a==1)
                    {
                        count+=1;
                    }
                    b=b/10;
                }
            }
        }
        System.out.print(count);
    }
}

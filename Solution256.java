//// PROBLEM ///

Let's consider the following manipulation. We start at n = 12. The square of 12 is 144. Reversing the digits of 144 we obtain 441. The square root of 441, m = 21, is, in this example, also an integer.

If the previous manipulation starting at an integer n yields another integer m, then we say that (n, m) is a perfect pair. For example, (12, 21) is a perfect pair.

You will be given a number n and you have to assess if it is the left element of a perfect pair. If it is, give the right member of the pair. If it isn't, output None.
Input
Line 1: A positive integer n.
Output
An integer m such that (n, m) is a perfect pair. If there isn't such m, the string None.
Constraints
1 <= n <= 10 ** 6
Example
Input
12
Output
21


  /// CODE FOR THE PROBLEM ////


  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution256 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),d=0,t=0;
        int a=n*n;
        while(a>0)
        {
            int b=a%10;
            d=d*10+b;
            a/=10;
        }
        int c=(int)Math.sqrt(d);
        int z=c;
        while(c>0)
        {
            int s=c%10;
            t=t*10+s;
            c/=10;
        }
        int m=0;
       if(Math.sqrt(d)==(int)Math.sqrt(d))
        System.out.print(z);
        else
        {
            while(a>0)
        {
            int s=c%10;
            m=m*10+s;
            a/=10;
        }
        System.out.print(m);
        }
       
    }
}

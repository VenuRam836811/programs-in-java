/// PROBLEM ///

You have to compute the sum of all given prime numbers.
Note that only prime numbers must be added up!
Input
Line 1: An integer N.
Next N lines: An integer a that can be prime or not.
Output
The sum of all given prime numbers.
Constraints
0 < N < 15
-10000 < a < 10000
Example
Input
3
5
7
11
Output
23

  //// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;
class Solution279 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(),sum=0,c=0;
        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
           if(a>1)
            {c=0;
                for(int j=2;j<=a;j++)
                {
                    if(a%j==0)
                    {
                        c+=1;
                    }
                }
                if(c==1)
                {
                    sum+=a;
                }
            }
        }
        System.out.println(sum);
    }
}

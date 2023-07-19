### PROBLEM ###

You are in a Mathematics class. The teacher has just taught you how to add, multiply and square. Now, the teacher gives you x numbers n (x is odd) and asks you to find the product of the sum of odd numbers and the sum of even numbers. Furthermore, he wants you to add the square of the middle number to the result. To prevent cheating, he wants you to show your steps in this format:
Sum(even) x Sum(odd) + middle^2 = result

P.S. Please look at the output format.
Input
Line 1: an integer x, the size of the numbers list.
Line 2: x space-separated integers n.
Output
The steps in one line following the required format.
Constraints
x is odd
-100 < n < 100
Example
Input
9
0 1 2 3 4 5 6 7 8
Output
20 x 16 + 4^2 = 336

  ### CODE FOR THE PROBLEM ###


  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution271 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a=0,b=0,c=0,z=0;
        for (int i = 0; i < x; i++) {
            int n = in.nextInt();
            if(n%2==0)
            {
                a+=n;
            }
            if(n%2==1 || n%2==-1)
            {
                b+=n;
            }
            if(x/2==i)
            {
                z=n;
                c=(int)Math.pow(n,2);
            }
            
        }
        int d=a*b+c;

        System.out.println(a+" "+"x"+" "+b+" "+"+"+" "+z+"^"+"2"+" "+"="+" "+d);
    }
}

Write a function that takes an array of numbers and returns the sum of the even numbers in the array.
Input
Line 1: An integer n - count of elements in array.
Line 2: n space-separated integer numbers x_1 .. x_n.
Output
sum of even numbers
Constraints
-100 <= x_i <= 100
Example
Input
4
1 2 3 4
Output
6



////// program for above problem//////



import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution229 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),sum=0;
        int x[]=new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(x[i]%2==0)
            sum+=x[i];
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(sum);
    }
}

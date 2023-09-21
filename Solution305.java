/// PROBLEM ///


Your Task
You are given a list of numbers n, you have to find out whether it's going by a linear pattern or not and output the next number in the sequence according to the pattern, followed by a space and the pattern. or, No pattern found.
Details
The sequence could be either ascending or descending, if it's ascending, the pattern is gonna be a positive value of how much is being added each time, however if it's descending, you do the same but as a negative value, if the sequence does not follow any of the patterns, you have to output No pattern found.
Example
Input: [2,4,6,8]
Output: 10 2
The next number is 10, and the pattern is 2
Input
Line 1: A list of numbers n
Output
Line 1: Output the next number in the sequence followed by a space and the pattern. Otherwise in case of no pattern output No pattern found.
Constraints
1 < length of n < 100
n only contains integers
Example
Input
0 4 8 12 16 20 24 28 32
Output
36 4


  /// CODE FOR THE PROBLEM ///


import java.util.*;
import java.io.*;
import java.math.*;

class Solution305 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        String[] a=n.split(" ");
        int v[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            String b=a[i];
            int c=Integer.parseInt(b);
            v[i]=c;
        }

        int m=v[1]-v[0];
        if(v[3]+m==v[4])
        System.out.print((v[a.length-1]+m)+" "+m);
        else
        System.out.print("No pattern found");
    }
}

/// PROBLEM ///

You must make a subsequence out of the given string by taking the characters present at positions 1,3,6,10,15... and so on. (triangular numbers: A triangular number or triangle number counts objects arranged in an equilateral triangle, obtained by continued summation of the natural numbers 1, 2, 3, 4, 5, etc. ).

[Note: indexes start at 1]
Input
Line 1: A string s.
Output
Line 1: The subsequence of the given string.
Constraints
Length of string is between 1 and 30.
Example
Input
abcdefghijk
Output
acfj

  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution276 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        for(int i=0;i<=S.length();i++)
        {
            char ch=S.charAt(i);
            if(i+1==1 || i+1==3 || i+1==6 || i+1==10 || i+1==15 || i+1==21)
            {
                System.out.print(ch);
            }
        }

      
    }
}

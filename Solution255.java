/// PROGRAM ///

Given an input string consisting of 2 distinct characters, output that string with each occurrence of one character replaced by the other.
Input
A single line, the input string.
Output
The string, with all occurrences of a character a replaced with the character b, and all occurrences of b replaced with a.
Constraints
2 ≤ string length ≤ 25
Example
Input
###*#***#*#
Output
***#*###*#*


  /// CODE FOR THE PROBLEM ////import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution255 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char c=s.charAt(0);
        char c2=0;
        for(int i=0;i<s.length();i++)
        {
            char c1=s.charAt(i);
            if(c1!=c)
             {
                c2=c1;
                break;
             }
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==c)
            {
                System.out.print(c2);
            }
            else
        {
        System.out.print(c);
        }
        }
    }
}

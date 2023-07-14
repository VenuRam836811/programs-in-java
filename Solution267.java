//// PROBLEM ////

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

  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution267 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char ch1=0,ch=0;
        for(int i=0;i<s.length();i++)
        {
             ch=s.charAt(i);
            if(i<s.length())
            {
                ch1=s.charAt(i+1);
            }
            if(ch!=ch1)
            {
                break;
            }
        }
        for(int i=0;i<s.length();i++)
        {
            char ch2=s.charAt(i);
            if(ch2==ch)
            {
                System.out.print(ch1);
            }
            else if(ch2==ch1)
            {
                System.out.print(ch);
            }
        }
    }
}

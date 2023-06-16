///// PROBLEM ///////


Write a script that takes a string and returns string without any characters with the same value next to each other, while preserving the original order of characters.
Input
Line 1: A string x
Output
A string of characters from the input sequence, with no consecutive characters having the same value.
Constraints
Example
Input
AAAABBBCCDAABBB
Output
ABCDAB




///// CODE FOR THE PROGRAM ///////



import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        for(int i=0;i<x.length();i++)
        {
            char c=x.charAt(i);
            if(i<x.length()-1)
            {
            if(x.charAt(i)!=x.charAt(i+1))
            {
            System.out.print(c);
            }
            }
        }
System.out.print(x.charAt(x.length()-1));
       
    }
}

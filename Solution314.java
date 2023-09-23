/// PROBLEM ///


You are given a hexadecimal number (see note) as a string, and are asked to output the sum of all its digits.

NOTE:
A hexadecimal number (also referred to as base 16) is a number which can have anything in terms of 0-1-2-3-4-5-6-7-8-9-A-B-C-D-E-F as a digit where A=10, B=11, C=12, etc.
Input
First line: You will be given a hexadecimal number as a string (h).
Output
First line: A single number representing the sum of all the digits in h
Constraints
0 < string length of h ≤ 256
Example
Input
123A
Output
16

  /// CODE FOR THE PROBLEM ///


  import java.util.*;
class Solution314 {
public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String h = in.nextLine();
        int sum=0;
       for(int i=0;i<h.length();i++)
       {
        char ch=h.charAt(i);
        if(Character.isLetter(ch))
        {
            int a=(int)ch-65+10;
            sum+=a;
        }
        else if(Character.isDigit(ch))
        {
            int a=(int)ch-48;
            sum+=a;
        }
       }
       System.out.print(sum);
    }
}

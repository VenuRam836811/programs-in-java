/// PROBLEM///

Write a program that takes a string S and, for each character prints the following response:
- If the character is an upper-case letter [A-Z] then first print out all the upper-case letters before it. (For example 'C' --> 'ABC', 'E'-->'ABCDE', etc).
- If the character is a lower-case letter [a-z] then first print out all the lower-case letters before it.
- If the character is a digit [0-9], then first print out all the digits before it, starting from 0.
Input
One line: a string S containing alphanumerical characters.
Output
One line: a string containing each character of S, preceeded with the right characters as stated above.
Constraints
- S will be between 0 and 255 characters (inclusive)
- S will only contain alphanumeric characters
Example
Input
B
Output
AB

  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Problem1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            if(Character.isUpperCase(ch))
            {
                int a1=(int)ch-64;
                for(int j=1;j<=a1;j++)
                {
                    System.out.printf("%c",64+j);
                }
            }
             if(Character.isLowerCase(ch))
            {
                int a1=(int)ch-96;
                for(int j=1;j<=a1;j++)
                {
                    System.out.printf("%c",96+j);
                }
            }
            if(Character.isDigit(ch))
            {
                int a1=(int)ch-48;
                for(int j=0;j<=a1;j++)
                {
                    System.out.print(j);
                }
            }

        }

       
    }
}
